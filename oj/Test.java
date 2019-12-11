package oj;

public class Test {
    public static void main(String[] args) {
        List x = new List(null, null, 0);
        x.addHead(1);
        x.addHead(2);
        x.addLast(3);
        //x.traversal();
        x.addIndex(2, 5);
        x.addIndex(4, 4);
        x.addIndex(0, 6);
        //x.traversal();               //  6 2 1 5 3 4
        //System.out.println();
        //System.out.println(x.size());//6
        /*x.remover(6);               //2 1 5 3 4
        x.traversal();
        System.out.println();
        System.out.println(x.size());   */   //5
       /* x.remover(4);           //6 2 1 5 3
        System.out.println(x.size()); //5
        x.traversal();*/
       /*x.remover(1);            //6 2 5 3 4
       x.traversal();
        */

        /*x.addIndex(2,5);
        x.traversal();*/
        x.addIndex(2, 2);    //6 2 2 1 5 2 3 4 6
        x.addIndex(5, 2);
        x.addLast(6);
        /*x.removerAll(2);
        x.traversal();              //6 1 5 3 4 6
    */
        x.removerAll(6);        //2 2 1 5 2 3 4
        x.traversal();
    }
}
