package Practice_01;

public class Solution_876 {
    public ListNode middleNode(ListNode head) {
        /*给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。[OJ
链接](https://leetcode-cn.com/problems/middle-of-the-linked-list/description/*/
   /*遍历二次的方法
        int n = 0;
        ListNode first = head;
        while (first != null) {
            first = first.next;
            n ++;
        }
        first = head;
        for (int i = 0; i < n/2; i++) {
            first = first.next;
        }
        return first;
        */
   //只遍历一次
        if(head == null | head.next == null) {
            return  head;
        }
        ListNode low = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        return  low;
    }
}
