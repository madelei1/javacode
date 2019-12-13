package oj;

public class List_head {
    ListNode head;
    ListNode last;
    int size = 0;
    public void addHead(int val) {
        ListNode node = new ListNode(val,null);
        if (head == null) {
            head = last = node;
            size ++;
            return;
        } else {
            node.next = head;
            head = node;
            size ++;
            return;
        }
    }
    public void addLast(int val) {
        ListNode node = new ListNode(val,null);
        if (last == null) {
            last = head = node;
            size ++;
        } else {
            last.next = node;
            last = node;
            size ++;
        }
    }
    public void addIndex(int index, int val) {
        ListNode node = new ListNode(val,null);
        judge(index);
       if (index == 0) {
           addHead(val);
           return;
       } else if (index == size) {
           addLast(val);
           return;
       } else {
           ListNode prev = returnIndex(index-1);
           node.next = prev.next;
           prev.next = node;
           size ++;
       }
    }
    public void remover(int val) {
        while (head != null && head.val ==val) {
            head = head.next;
            size --;
            return;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
                size --;
                return;
            } else {
                prev = prev.next;
            }
        }
    }
    public void removerAll(int val) {
        ListNode dummyHead = new ListNode(val-1,null);
        dummyHead.next = head;
        ListNode x = dummyHead;
        while (x.next != null) {
            if (x.next.val == val) {
                x.next = x.next.next;
                size --;
            } else {
                x = x.next;
            }
        }
        head = dummyHead.next;
    }
    public void judge(int index) {
        if (index < 0 && index > size) {
            System.out.println("索引非法");
            return;
        }
    }
    public ListNode returnIndex(int index) {
        ListNode x = head;
        //1-2-3-4
        //index =2
        //1-2-3-4
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    public void print() {
        ListNode x = head;
        while (x != null) {
            System.out.print(x.val+ " ");
            x = x.next;
        }
    }
}
