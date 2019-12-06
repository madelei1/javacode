import Practice1.Demo_1;


public class Demo_2 {
    public static void main(String[] args) {
        Demo_1 myArray = new Demo_1(3);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        // {1,10,2,3,4,0}
        myArray.add(1, 10);
        myArray.remove(4);
        myArray.print();
    }
}
