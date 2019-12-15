package oj;

public class Test_3 {
    public static void main(String[] args) {
        DoubleLinkedList x = new DoubleLinkedList(null,null,0);
        x.addHead(1);
        x.addLast(2);
        x.addHead(3);
        x.addIndex(0,4);
        x.addIndex(4,0);
        //4-3-1-2-0
        x.addIndex(2,3);
        x.addIndex(3,8);
        x.print();
    }
}
