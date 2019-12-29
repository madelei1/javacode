package oj;
/*课件第9题
编写一个程序，找到两个单链表相交的起始节点。*/
public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode pL = headA;
        ListNode pS = headB;
        //先遍历求出二个脸标的长度
        while (pL != null) {
            lenA ++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB ++;
            pS = pS.next;
        }
        int len = lenA - lenB;
        //确保len为正数，且保证pl为最大长度
        if (len < 0 ){
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        } else {
            pL = headA;
            pS = headB;
        }
        //让pl先走len步，使得他们在同一起点
        for (int i = 0; i < len; i++) {
            pL = pL.next;
        }
        //如果第二个链表或者由一个链表为空，直接返回
        if (pL ==null || pS == null) {
            return null;
        }
        if (pL == pS) {
            return pL;
        }
        while (pL != pS) {
            pL = pL.next;
            pS = pS.next;
            if (pL == pS) {
                return pL;
            }
            if (pL.next==null) {
                return null;
            }
        }
       return null;
    }
}
