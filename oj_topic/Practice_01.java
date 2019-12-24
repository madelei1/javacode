package oj_topic;
//求一个链表中节点的个数（相当于遍历一个链表）
public class Practice_01 {
    public int print(ListNode head) {
        if (head ==null) {
            return 0;
        }
        int count = 0;
        ListNode x = head;
        while (head != null) {
            head = head.next;
            count ++;
        }
        return count;

    }
}
