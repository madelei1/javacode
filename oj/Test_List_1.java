package oj;

public class Test_List_1 {
    public static void main(String[] args) {
        List_1 x = new List_1();
        x.addHead(2);
        x.addHead(1);
        x.addLast(3);
        x.print();
        System.out.println();
        x.addIndex(2,4);
        x.print();
        System.out.println();
        System.out.println(x.returnVal(2));
        System.out.println(x.size());
        x.addIndex(4,2);
        x.print();
        System.out.println();
        // x.removeVal(3);
        //x.print();
        //1 2 4 3 2
        x.removeAllVal(2);
        x.print();

    }
}
