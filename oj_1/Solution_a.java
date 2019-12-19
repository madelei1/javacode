package oj;
//返回链表的倒数第k个节点(牛客上)
public class Solution_a {
    public ListNode findKthToTail(ListNode head, int k) {
     /*遍历二次求出
     ListNode x = head;
        ListNode y = head;
        int count = 0;
        while (x != null) {
            count ++;
            x = x.next;

        }
        if (k < 0 || k > count) {
            System.out.println("k超出范围");
            return null;
        } else {
            for (int i = 0; i < count - k; i++) {
                y = y.next;
            }
        }
        return  y;*/
     //遍历一次

        ListNode fast = head;
        ListNode slow = head;
        while (k -1 >0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        for (int i = 0; i < k-1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
