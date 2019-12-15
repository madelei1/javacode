package oj;

public class DoubleLinkedList {
    DoubleNode head;
    DoubleNode last;
    int size = 0;

    public DoubleLinkedList(DoubleNode head, DoubleNode last, int size) {
        this.head = head;
        this.last = last;
        this.size = size;
    }

    //头插
    public void addHead(int val) {
        DoubleNode node = new DoubleNode(null,val,null);
        if (head == null) {
            head = last = node;
            size ++;
            return;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            size ++;
        }
    }
    //尾插
    public void addLast(int val) {
        DoubleNode node = new DoubleNode(null,val,null);
        if (last == null) {
            last = head = node;
            size ++;
            return;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
            size ++;
        }
    }
    //任意位置插入
    public void addIndex(int index, int val) {
        DoubleNode node = new DoubleNode(null, val, null);
        if (index < 0 && index > size) {
            System.out.println("索引非法！");
            return;
        } else if (index == 0) {
            addHead(val);
        } else if (index == size) {
            addLast(val);
        } else {
            DoubleNode x = judge(index - 1);
            x.next.prev = node;
            node.prev = x;
            node.next = x.next;
            x.next = node;
            size ++;
        }
    }
    // 1-2-3-4-5
    // 0-1-2-3-4
    //index = 2
    //返回index 位置的链表节点
    public DoubleNode judge(int index) {
        if (index < (size >> 1)) {
            // 从头向后遍历
            DoubleNode x = head;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        }else {
            // 从后向前遍历
            DoubleNode x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }
    //得到index位置的值
    public int getIndex(int index) {
        if (judgeIndex(index)) {
            return judge(index).val;
        }
        return -1;
    }
    //返回size长度
    public int getSize() {
        return size;
    }
    //判断索引
    public boolean judgeIndex(int index) {
        if (index < size && index > 0) {
        System.out.println("索引非法！");
            return false;
        } else {
            return true;
        }
    }
    //遍历链表
    public void print() {
        DoubleNode x = head;
        while (x != null) {
            System.out.print(x.val + " ");
            x = x.next;
        }
    }
}
