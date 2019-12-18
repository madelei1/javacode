package DataStructure;

public class Test_Queuearray {
    public static void main(String[] args) {
        Queuearray x = new Queuearray(3);
        x.addQueue(1);
        x.addQueue(2);
        x.addQueue(3);
        x.showQueue();
        System.out.println();
        /*System.out.println(x.isFill());
        System.out.println(x.getQueue());
        System.out.println(x.getQueue());
        System.out.println(x.getQueue());
        System.out.println(x.getQueue());*/
        System.out.println(x.getFront());

    }
}
