package practice;



public class Text_1 {
 /*   static {
        System.out.println("我是Text_1类的静态代码块");
    }
    public static void main(String[] args) {
        Students x = new Students();
    }
}
class Students {
    static {
        System.out.println("我是Students类的静态代码块");
        */

 //学生与教师类继承人
 //猫狗继承动物类
    public static void main(String[] args) {
   /*
     Student_1 x = new Student_1(28,"郭少奇","学习");
        x.study();
        x.eat();
        Teacher_1 i = new Teacher_1(18,"马德磊");
        i.eat();
        i.teach();
    }
}
class Person_1{
    private int age;
    private String name;

    public Person_1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void  eat() {
        System.out.println("吃饭");
    }

}
class Student_1 extends Person_1 {
    String work;

    public Student_1(int age, String name, String work) {
        super(age, name);
        this.work = work;
    }
    public void study() {
        System.out.println(getName()+getAge()+"岁"+"在学习");
    }

}
class Teacher_1 extends Person_1 {
    public Teacher_1(int age, String name) {
        super(age, name);
    }
    public void teach() {
        System.out.println(getName()+getAge()+"岁"+"在授课");
    }

    @Override
    public void eat() {
        System.out.println(getName()+"在吃饭");
        */

        Cat x = new Cat("小花",2,"花",4);
        x.work();
        //x.print();
        Dog i = new Dog();
        i.setAge(1);
        i.setColor("黑");
        i.setLeg(4);
        i.setName("旺旺");
        i.work();
        //i.print();
        Pig y = new Pig();
        y.setAge(2);
        y.setColor("花");
        y.setLeg(4);
        y.setName("小胖");
        System.out.println(y.getAge()+" "+y.getLeg()+y.getName()+y.getColor());

    }
}
class Animal {
    private String name;
    private int age;
    private String color;
    private int leg;

    public Animal() {
    }

    public Animal(String name, int age, String color, int leg) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    /*public void print() {
        System.out.println(name+age+color+leg);
    }*/
}
class Cat extends Animal {
    public Cat(String name, int age, String color, int leg) {
        super(name, age, color, leg);
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age, String color, int leg) {
        super(name, age, color, leg);
    }
    public void work() {
        System.out.println("看家");
    }
}
class Pig extends Animal {
    public void work() {
        System.out.println("长胖长肥");
    }
}