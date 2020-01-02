package Exception;

public class Test_01 {
    public static void main(String[] args) {
        /*Topic_01 x = new Topic_01();
        int y = x.hint();
        x.print(y);*/
        Student x = new Student();
        x.setName("张三");
        x.setScore(70);
        x.print();
    }
}
