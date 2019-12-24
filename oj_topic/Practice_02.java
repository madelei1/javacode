package oj_topic;
//查找链表中倒数第k给节点；
public class Practice_02 {
    public ListNode find(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode x = head;
        int count = 0;
        while (x != null) {
            count ++;
            x = x.next;
        }
        ListNode y = head;
        for (int i = 0; i < count - k; i++) {
            y = y.next;
        }
        return y;
    }
}
