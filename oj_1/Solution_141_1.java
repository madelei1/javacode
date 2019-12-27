package oj;
// 课件第10题

/*
给定一个链表，判断链表中是否有环。
 */
/*
* 思路：使用快慢指针来判断，最好的方式是一个运行一步，一个运行二步（最快），
* 虽然其他方法也可以但是其他方法可能会很慢，也让可能一直碰不到
* fast和slow一直走，肯定会走到一个环中，在环中因为速度不一样也一定会相遇
* */

public class Solution_141 {

    /*
    //创建一个换环
    public void createCycle(ListNode head){
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = head.next.next;
    }*/
    public boolean hacCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
