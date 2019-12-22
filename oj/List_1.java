package oj;

public class List_1 {
    ListNode_1 head;
    ListNode_1 last;
    int size = 0;

    //在链表的头部插入
    public void addHead(int val) {
        ListNode_1 node_1 = new ListNode_1(val,null);
        if (head == null) {
            head = node_1;
            last = node_1;
            size ++;
            return;
        } else {
            node_1.next = head;
            head = node_1;
            size ++;
        }
    }
    //在尾部插入
    public void addLast(int val) {
        ListNode_1 node_1 = new ListNode_1(val,null);
        if (last == null) {
            last = node_1;
            size ++;
            return;
        } else {
            last.next = node_1;
            last = node_1;
            size ++;
        }
    }
    //在任意位置插入节点
    public void addIndex(int index, int val) {
        judge(index);
        ListNode_1 node_1 = new ListNode_1(val,null);
        if (index == 0) {
            addHead(val);
        } else if (index == size) {
            addLast(val);
        } else {
            ListNode_1 x = returnIndex(index-1);
            node_1.next = x.next;
            x.next = node_1;
            size ++;
        }
    }
    //删除一个指定的值对应的链表节点
    public void removeVal(int val) {
        ListNode_1 x = head;
        while (x.val == val) {
            x = x.next;
            size --;
            return;
        }
        while (x.next != null) {
            if (x.next.val == val) {
                x.next = x.next.next;
                size --;
                return;
            } else {
                x = x.next;
            }
        }
    }
    //删除所有节点值为val的节点
    public void removeAllVal(int val) {
        ListNode_1 x = head;
        while (x != null && x.val == val) {
            x = x.next;
            size --;
        }
        if (x  == null) {
            return;
        }
        while ( x.next != null) {
            if (x.next.val == val) {
                x.next = x.next.next;
                size --;
            } else {
                x = x.next;
            }

        }
    }
    //返回给出索引的值
    public int returnVal(int index) {
        return returnIndex(index).val;
    }
    //遍历链表
    public void print() {
        ListNode_1 x = head;
        while (x != null) {
            System.out.print(x.val+" ");
            x = x.next;
        }
    }
    //返回指定位置的节点
    public ListNode_1 returnIndex(int index) {
        judge(index);
        ListNode_1 x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    //判断index是否合法
    public void judge(int index) {
        if (index < 0 || index > size) {
            System.out.println("索引非法！");
            return;
        }
    }
    //返回链表的长度
    public int size() {
        return size;
    }
}
