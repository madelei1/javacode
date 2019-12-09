package Practice_01;

public class List {
    public static void main(String[] args) {
        SingleLinkedList x = new SingleLinkedList(0,null,null);
        x.addFirst(1);
        x.addFirst(2);
        x.addFirst(3);
        /*System.out.println(x.size());
        x.addIndex(3,5);
        x.print();
        System.out.println();
        x.addIndex(2,6);
        x.print();
        System.out.println();
        x.addIndex(0,7);
        System.out.println(x.size());
        x.print();
        System.out.println();
        x.contains(5);
        x.remove(7);
        x.print();
        System.out.println();
        x.remove(5);
        x.print();
        System.out.println();
        x.remove(6);
        x.print();*/
        System.out.println();
        x.addIndex(2,5);
        x.addFirst(5);
        x.addLast(5);
        x.print();
        /*System.out.println();
        x.removeAllKey(5);
        x.print();
        System.out.println();
        x.addLast(6);
        x.print();
*/
    }
}
class Node {
    private  int data;
    private  Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data, Node next) {

        this.data = data;
        this.next = next;
    }
}
// 1、无头单向非循环链表实现
class SingleLinkedList {
    //链表的个数
    private int size;
    //指向头节点
    private Node first;
    //指向末尾
    private Node last;

    public SingleLinkedList(int size, Node first, Node last) {
        this.size = size;
        this.first = first;
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
    public boolean judge() {
        if (first == null && last == null) {
            return true;
        }
        return false;
    }

    //头插法
    public void addFirst(int data) {
        //产生新节点
        Node node = new Node(data,null);
        if(first == null) {
            first = last = node;
            size ++;
            return;
        } else {
            node.setNext(first);
            first = node;
            size ++;
        }
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data,null);
        if (last == null) {
            last = first = node;
            size ++;
            return;
        }
            last.setNext(node);
            last = node;
            size ++;
    }
    //任意位置插入
    public void addIndex(int index, int data) {
        if (index < 0 && index > size) {
            System.out.println("索引非法");
            return;
        }
        else if (index == size){
            addLast(data);

        }else if(index == 0) {
            addFirst(data);

        } else {
            Node node = new Node(data,null);
            ++size ;
            Node prev = getIndexNode(index-1);
            node.setNext(prev.getNext());
            prev.setNext(node);

        }
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node tmp = first;
        while (tmp != null) {
            if (tmp.getData() == key) {
                System.out.println("找到元素了");
                return true;
            }
            tmp = tmp.getNext();
        }
        System.out.println("没有指定元素");
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (first.getData() == key) {
            first = first.getNext();
            size--;
            return;
        }else {
            Node tmp = first;
            while (tmp.getNext() != null) {
                if (tmp.getNext().getData() == key) {
                    tmp.setNext(tmp.getNext().getNext());
                    size --;
                    break;
                }
                tmp = tmp.getNext();
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        while (first != null && first.getData() == key) {
            first = first.getNext();
            size --;
        }
        if (first == null) {
            return;
        } else {
            Node prev = first;
            while (prev.getNext() != null) {
                if (prev.getNext().getData() == key) {
                    prev.setNext(prev.getNext().getNext());
                    size--;
                } else {
                    prev = prev.getNext();
                }
            }
        }
    }
    //得到单链表的长度
    public int size() {
        return size;
    }
    //打印链表
    public void print() {
        Node tmp = first;
        while (tmp !=  null) {
            System.out.print(tmp.getData()+ " ");
            tmp = tmp.getNext();
        }
    }
    private Node getIndexNode(int index) {
        // 从头结点开始走index步找到对应节点
        Node temp = first;
        // 1->2->3
        // index = 2
        for (int i = 0;i < index;i++) {
            temp = temp.getNext();
        }
        return temp;
    }
}
