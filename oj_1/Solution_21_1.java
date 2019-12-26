package oj;
/*
课件第5题
* 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
/*
 * 思路：
 * 这个链表是有序的
 * 建立一个新的链表，用if -else 进行判断，如果链表a的一个节点值大于链表b的值一个如何，
 * 否则如何，当一个链表结束将为结束的链表直接尾插到新链表的结尾*/
public class Solution_21_1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1,null);
        ListNode tmp = node;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return  l1;
        }
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            } else {
                tmp.next = l2;
                l2 =l2.next;
                tmp = tmp.next;
            }
        }
        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }
        return node.next;
    }

}
