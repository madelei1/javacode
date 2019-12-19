package oj;

public class Solution_b {
    public ListNode partition(ListNode pHead, int x) {
        //beforeStart（头） 与beforeEnd（尾）是表示前半部分，前半部分表示的是小于指定的数小的
        //afterStart（头） 与afterEnd（尾）是表示前半部分，前半部分表示的是小于指定的数小的

        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        ListNode node = pHead;
        while(node != null) {
            ListNode nodeNext = node.next;//
            node.next = null;//这二行代码是打乱原链表
            if(node.val < x) {
                if (beforeStart ==null) {
                    beforeStart = node;
                    beforeEnd = node;
                } else {

                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = node;
                } else {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = nodeNext;//14.15行引起的
        }
        //如果第一个阶段没有数据，就是没有比基准小的数据
        if(beforeStart == null) {
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
