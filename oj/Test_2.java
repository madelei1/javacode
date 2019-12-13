package oj;

public class Test_2 {
    public static void main(String[] args) {
        List_head y = new List_head();
        y.addHead(3);
        y.addHead(2);
        y.addHead(1);
        y.print();
        System.out.println();
        y.addLast(1);
        y.addLast(2);
        y.print();
        System.out.println();
        y.addIndex(0,5);
        y.print();
        System.out.println();
        y.addIndex(6,7);
        y.print();
        System.out.println();
        y.addIndex(4,3);
        y.print();
        System.out.println();
        /*
        *   1 2 3
            1 2 3 1 2
            5 1 2 3 1 2
            5 1 2 3 1 2 7
            5 1 2 3 3 1 2 7
        * */
        y.remover(5);
        y.print();
        System.out.println();
        y.remover(1);
        y.print();
        System.out.println();
        y.remover(7);
        y.print();
        System.out.println();
        y.removerAll(3);
        y.print();
        System.out.println();
        y.removerAll(2);
        y.print();
        System.out.println();
    }
}
