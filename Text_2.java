public class Text_2 {

    public static void main(String[] args) {
     /*   //教师，学生
     Teacher_2 x = new Teacher_2();
        x.setAge(18);
        x.setName("马德磊");
        x.work();
        Student_2 i =new Student_2("郭少奇",28);
        i.work();
    }
}
abstract class Person_2 {
    private String name;
    private int age;

    public Person_2() {
    }

    public Person_2(String name, int age) {
        this.name = name;
        this.age = age;
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
    public abstract void work();
}
class Teacher_2 extends Person_2 {
    public void  work() {
        System.out.println(getName()+"工作是教书育人"+"年龄"+getAge()+"岁");
    }
}
class  Student_2 extends Person_2 {
    public Student_2(String name, int age) {
        super(name, age);
    }
    public void work() {
        System.out.println(getName()+"工作是学习"+"年龄"+getAge()+"岁");
        */
     //对程序员，经理类进行设计，程序员包括三个属性：姓名，工号，工资，经理在程序员的属性上加一个奖金；

        Coder x = new Coder("郭少奇","0001",50000);
        x.print();
        x.work();
        Manager i = new Manager();
        i.setBonus(20000);
        i.setID("9527");
        i.setName("马德磊");
        i.setSalary(200000);
        i.print();
        i.work();
        Employee y = new Coder("张洁晨","0002",60000);
        y.print();
        y.work();
        Employee m = new Manager();
        m.setName("m");
        m.setID("9528");
        m.setSalary(200);
        ((Manager) m).setBonus(2200);
        m.print();
        m.work();
    }
}
abstract class Employee {
    private String name;
    private String ID;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void work();
    public void print() {
        System.out.println("我的名字是："+getName()+",我的工资是："+getSalary()+",我的工号是："+getID());
    }
}
class Coder extends Employee {
    public Coder(String name, String ID, double salary) {
        super(name, ID, salary);
    }

    public void work() {
        System.out.println("我的工作是：敲代码");
    }
}
class Manager extends Employee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("我的工作是：管理");
    }
    public void print() {
        System.out.println("我的名字是："+getName()+",我的工资是："+getSalary()+",我的工号是："+getID()+",我的奖金是："+getBonus());

    }
}