package oj;

public class List {
    //链表的头节点
    ListNode head;
    //链表的尾节点
    ListNode last;
    //链表开始的长度
    int size;

    public List(ListNode head, ListNode last, int size) {
        this.head = head;
        this.last = last;
        this.size = size;
    }
    //头插
    public void addHead(int val) {
        ListNode node = new ListNode(val,null);
        if(head == null) {
            head = last = node;
            size ++;
            return;
        }
        node.next = head;
        head = node;
        size ++;
    }
    //尾插
    public  void  addLast(int val) {
        ListNode node = new ListNode(val,null);
        if (last == null) {
           last = node;
           head = node;
           size ++;
           return;
        }
        last.next = node;
        last = node;
        size++;
    }
    //任意位置插入
    public void  addIndex(int index,int val) {
        judge(index);
        if (index == 0) {
            addHead(val);
            return;
        }
        if (index == size) {
            addLast(val);
            return;
        }
        ListNode node = new ListNode(val,null);
        //prev是到index的前一个节点
        ListNode prev = traversal(index-1);
        node.next = prev.next;
        prev.next = node;
        size ++;

    }
    //遍历链表
    public void traversal() {
        if (head == null) {
            return ;
        }
        while (head != null) {
            System.out.print(head.val +" ");
            head = head.next;
        }
    }
    //遍历到指定的链表位置，并返回
    public ListNode traversal(int index) {
        judge(index);
        if (head == null) {
            return null;
        }
        ListNode newNode = head;
        for (int i = 0; i < index; i++) {
            newNode = newNode.next;
        }
        return newNode;

    }
    //判断索引是否合法
    public void judge(int index) {
        if (index < 0 && index > size) {
            System.out.println("索引非法");
            return;
        }
    }
    //返回链表的长度
    public int size() {
        return size;
    }
    //查找链表中的值是否存在
    public boolean find(int val) {
        if (head == null) {
            return false;
        }
        while (head != null) {
            if (head.val == val) {
                return true;
            }else {
                head = head.next;
            }
        }
        return false;
    }
    //查找通过链表中的值返回在链表中第几个
    public int find_1(int val) {
        if (head == null) {
            return -1;
        }
        int n = 0;
        while (head != null) {
            if (head.val == val) {
                n ++;
                return n;
            }
            head = head.next;
        }
        return -1;
    }
    //删除链表中的一个给元素
    public void remover(int val) {
        if (head == null) {
            return;
        }
        ListNode newHead = head;
        while (newHead != null) {
            if (newHead.val == val) {
                newHead = newHead.next;
                size --;
                return;
            } else {
                if (newHead.next.val == val) {
                    newHead.next = newHead.next.next;
                    size --;
                    return;
                }
            }
            newHead = newHead.next;
        }
    }
    //删除链表中所有给出那一个的元素
    public void removerAll(int val) {
        //ListNode newHead = head;
        while (head != null && head.val == val) {
                head = head.next;
                size --;
            }
        if (head == null) {
            return;
        } else {
            ListNode x = head;
            while (x.next != null) {
                if (x.next.val == val) {
                    x.next = x.next.next;
                    size --;
                } else {
                    x =x.next;
                }
            }
        }
    }

}
