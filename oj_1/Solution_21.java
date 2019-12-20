package oj;
/*
* 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Solution_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        // 此时l1与l2均不为空
        // 遍历l1与l2的节点
        // 产生一个新的链表l3
        // 永远指向新链表的尾部
        ListNode newLast = null;
        // 永远指向新链表l3的头部
        ListNode newHead = newLast;
        // 遍历l1与l2
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode node = new ListNode(l1.val,null);//在 leetcode上ListNode(l1.val)无next值
                // 此时node为l3的第一个节点
                if (newHead == null) {
                    newHead = newLast = node;
                    l1 = l1.next;
                }else {
                    // 将node尾插到l3中
                    newLast.next = node;
                    newLast = node;
                    l1 = l1.next;
                }
            }else {
                ListNode node = new ListNode(l2.val,null);
                if (newHead == null) {
                    newHead = newLast = node;
                    l2 = l2.next;
                }else {
                    newLast.next = node;
                    newLast = node;
                    l2 = l2.next;
                }
            }
        }
        // 查看此时l1与l2谁还有剩余元素,将剩余元素直接尾插到l3尾部
        while (l1 != null) {
            ListNode node = new ListNode(l1.val,null);
            newLast.next = node;
            newLast = node;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode node = new ListNode(l2.val,null);
            newLast.next = node;
            newLast = node;
            l2 = l2.next;
        }
        return newHead;
    }
}
