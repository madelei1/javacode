package Practice_01;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 删除链表中等于给定值 val 的所有节点。
 * 示例:
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class Solution {
    public static void main(String[] args) {
        SingLinked x = new SingLinked(null,null,0);
        x.addLast(1);
        x.addLast(2);
        x.addLast(6);
        x.addLast(3);
        x.addLast(4);
        x.addLast(5);
        x.addLast(6);
        x.print();
        System.out.println();
        x.removeAll(6);
        x.print();

    }
}
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class SingLinked {
    ListNode first;
    ListNode last;
    int size;

    public SingLinked(ListNode first, ListNode last, int size) {
        this.first = first;
        this.last = last;
        this.size = size;
    }
    public void addLast(int val) {
        ListNode node = new ListNode(val,null);
        if (first == null) {
            last = first = node;
            size ++;
            return;
        }else {
            last.next = node;
            last = node;
            size ++;
        }
    }
    public void removeAll(int val) {
        ListNode tmp =  first;
        while (first != null && first.val == val) {
            first = first.next;
            size --;
        }
        if (first ==null) {
            return;
        } else {
            while (tmp.next != null) {
                if (tmp.next.val == val) {
                    tmp.next = tmp.next.next;
                    size--;
                }else {
                    tmp = tmp.next;
                }
            }
        }
    }
    public void print() {
        ListNode tmp = first;
        while (tmp !=  null) {
            System.out.print(tmp.val+ " ");
            tmp = tmp.next;
        }
    }

}
