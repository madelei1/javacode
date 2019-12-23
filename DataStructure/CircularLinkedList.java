package DataStructure;

import java.util.Scanner;

public class CircularLinkedList {
    //指向第一个节点
    Node first = null;
    //向环形链表中添加数据
    public void addNode(int val) {
        Node curNode = null;
        if (val < 1) {
            System.out.println("节点个数过少");
            return;
        }
        for (int i = 1; i <= val; i++) {
            Node x = new Node(i,null) ;
            if (first == null) {
                first = x;
                first.next = first;
                curNode = first;
            } else {
                curNode.next = x;
                x.next = first;
                curNode = x;
            }
        }
    }
    //遍历当前环形链表
    public void print() {
        Node cur = first;
        if (cur == null) {
            return;
        } else {
            while (true) {
                System.out.print(cur.val+ " ");

                if (cur.next == first) { //这里表示cur 的下一个为first，循环应该结束
                    break;
                }
                cur = cur.next;
            }
        }
    }
    public void countNode(int start,int step,int val) {
        if (first == null || start < 1 || start >val || step < 1) {
            System.out.println("输入参数有误");
            return;
        }
        //创建辅助指针
        Node cur = first;
        //让辅助指针指向环形链表的最后一个位置
        while (true) {
            if (cur.next == first) {
                break;
            }
            cur = cur.next;
        }
        //让节点到指定的开始位置
        for (int i = 0; i < start-1; i++) {
            cur = cur.next;
            first = first.next;
        }
        //开始按照规定步数移动
        while (true) {
            if (cur == first) {
                break;
            }
            for (int i = 0; i < step - 1; i++) {
                first = first.next;
                cur = cur.next;
            }
            System.out.print(first.val+ " ");
            cur.next = first.next;
            first = cur.next;
        }
        System.out.println("最后一个节点是"+first.val);


    }


}
