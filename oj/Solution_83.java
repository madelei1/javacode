package oj;
/*给定一个排列链表，删除所有重复元素，使得每个元素只出现一次
 * 示例:
 * 输入：1->1->2
 * 输出：1->2
 * 输入：1->1->2->3->3
 * 输出：1->2->3
 * */
public class Solution_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return head;
    }
}
