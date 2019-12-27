package oj;
//课件第7题
/*
* 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
* 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
* */
public class Solution_c {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead = new ListNode(-1,null);//在网站上运行不需要这个null
        ListNode tmp = newHead;
        ListNode cur = pHead;
        while (cur != null) {
            //代表找到相同节点
            if (cur.next != null && cur.val ==cur.next.val) {
                while (cur.next != null && cur.val ==cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
                tmp.next = cur;
            } else {
                //没有找到相同节点
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }

}
