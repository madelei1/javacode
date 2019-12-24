package oj_topic;

import oj.List;

//单链表的反转
//思路：产生一个新的单链表，将原链表使用头插法插入到新链表中
public class Practice_03 {
    public ListNode reversal(ListNode head) {
     /*   if (head ==null || head.next == null) {
            return head;
        }
        ListNode x = null;
        ListNode z = null;
        while (head.next != null) {
            head.next = x;
            x = head;
            head = z;
            z = head.next;
        }
        return  x;
    }*/

       if (head == null || head.next == null) {
            // 此时链表为空或只有一个节点
            return head;
        }
        // 产生一个新的链表
        ListNode newHead = new ListNode(head.val,null);
        // 遍历原链表
        while (head.next != null) {
            ListNode node = new ListNode(head.next.val,null);
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }


}
