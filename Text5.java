
package lianxi;
//编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘 除四种运算.
public class Text5 {
    public static void main(String[] args) {
      /*  //Calculator x =  new Calculator(10,20);
        Calculator x = new Calculator();
       // int i = x.add(10,20);
        x.setNum1(10);
        x.setNum2(20);
        int i = x.add(10,20);
        System.out.println(i);

    }
}
class Calculator {
    private int num1;
    private int num2;

*//*
public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
*//*


 public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a-b;
    }
    public int chen(int a,int b) {
        return a*b;
    }
    public double div(int a,int b) {
        return a/b;
    }*/
/*
        Test x = new Test();
        x.setAge(38);
        x.setName("郭少奇");
        x.setId("161054");
        x.print();
        x.hHang();
        Test i = new Test(18);
        i.setId("161059");
        i.setName("马德磊");
        i.print();
        i.hHang();
        Test j = new Test(28,"张洁晨");
        j.setId("161076");
        j.print();
        j.hHang();
        Test f = new Test(25,"王昀升","161000");
        f.print();


    }
}

class Test {

    private int age;
    private String name;
    private  String Id;

    public Test() {}

    public Test(int age) {
        this.age = age;
    }

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Test(int age, String name, String id) {
        this.age = age;
        this.name = name;
        Id = id;
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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    public void print(){
        System.out.print("我的名字是"+name+",我的年龄是"+age+",我的学号是"+Id);

    }
    public void hHang() {
        System.out.println();
        */
/* 定义一个圆形Circle类。
  * 属性：
    * r：半径
                * 构造方法：
    * 无参构造方法
                * 满参构造方法
                * 成员方法：
    * get/set方法
                * showArea方法：打印圆形面积
                * showPerimeter方法：打印圆形周长
                * 定义测试类，创建Circle对象，并测试。*/
       /* Circle x = new Circle();
        x.setR(3);
        x.showArea();
        x.showPerimeter();
        Circle y = new Circle(3);
        y.showArea();
        y.showPerimeter();
    }
}
class Circle {
   private double r;
   double i =Math.PI;
    public Circle(){}
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void showArea(){
        System.out.println(r*r*i);
    }
    public void showPerimeter() {
        System.out.println(2*r*Math.PI);*/

        /*定义一个日期MyDate类。
        - 属性：
        - year：年
                - month：月
                - day：日
                - 构造方法：
        - 满参构造方法
                - 成员方法：
        - get/set方法
                - showDate方法：打印日期。
        - isBi方法：判断当前日期是否是闰年
                * 定义测试类，创建MyDate对象，并测试。*/

       /* MyDate x = new MyDate(1800,12,1);
        x.isBi();
        x.showData();

    }
}
class MyDate{
    int year;
    int month;
    int day;
    public MyDate(){}

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void showData(){
        System.out.println(year+"."+month+"."+day);
    }
    public void isBi() {
        if(year % 400 ==0){
            System.out.println(+year+"是闰年");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");

        }*/
        /*定义一个扑克Card类。
        - 属性：
        - 花色
                - 点数
                - 构造方法：
        - 满参构造方法
                - 成员方法：
        - showCard方法：打印牌面信息
                - 定义测试类，创建Card对象，调用showCard方法。*/
        /*
        Card x = new Card();
        x.setColor("黑桃");
        x.setPoint("A");
        x.showCard();
        Card y = new Card("黑桃","K");
        y.showCard();
    }
}
class Card {
    private String color;
    private String point;
    public Card() {}
    public Card(String color,String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }
    public void showCard(){
        System.out.println(color+point);
        */

        /*定义两个类，经理类Manager，程序员类Coder
                * Coder类：
        - 属性：姓名，工号，薪资
                - 构造方法：无参构造方法，满参构造方法
                - 成员方法：
        - get/set方法
                - intro方法：打印姓名，工号信息
                - showSalary方法：打印薪资信息
                - work方法：打印工作信息
                * Manager类：
        - 属性：姓名，工号，薪资
                - 经理的薪资有两部分组成：基本工资+奖金
                - 构造方法：无参构造方法，满参构造方法
                - 成员方法：
        - get/set方法
                - intro方法：打印姓名，工号信息
                - showSalary方法：打印薪资信息
                - work方法：打印工作信息
                * 定义测试类，创建Manager对象，创建Coder对象，并测试。*/
        /*Manager ma = new Manager("马德磊","9527",500000,100000);
        ma.intro();
        ma.showSalary();
        ma.work();
        System.out.println();
        Coder g = new Coder("郭少奇","0001",500);
        g.intro();
        g.showSalary();
        g.work();
    }
}
class Manager {
    private String name;
    private String Id;
    private double salary;
    private double bonus;
    public Manager(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, String id, double salary, double bonus) {
        this.name = name;
        Id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    public void intro() {
        System.out.println("经理："+name+" " +Id);
    }
    public void showSalary(){
        double i = salary + bonus;
        System.out.println("总工资"+i+"元");
    }
    public void work() {
        System.out.println("工作内容：查询员工工作情况");
    }

}
class Coder {
    private String name;
    private String Id;
    private double salary;
    public Coder(){}

    public Coder(String name, String id, double salary) {
        this.name = name;
        Id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work() {
        System.out.println("工作内容：每天敲代码/改bug-18个小时");
    }
    public void intro() {
        System.out.println("码农："+name +" "+ Id);
    }
    public void showSalary() {
        System.out.println("总工资"+salary+"元");
        */
        /** 老师类Teacher

                * 属性：姓名name，年龄age，讲课内容content
                * 成员方法：吃饭eat方法，讲课teach方法

                * 学生类Student

                * 属性：姓名name，年龄age，学习内容content
        行为：吃饭eat方法，	学习study方法

                * 代码实现，效果如图所示：*/
        Teacher m = new Teacher();
        m.setAge(38);
        m.setName("李青");
        m.setContent("如何设计一个网站");
        m.print();
        m.eat();
        m.teach();
        System.out.println();
        Student i = new Student("ma","学习如何制作一个网站",18);
        i.print();
        i.eat();
        i.study();
    }
}
class Teacher {
    private String name;
    private int age;
    private String content;
    public Teacher(){}
    public Teacher(String name, int age, String content) {
        this.age = age;
        this.content = content;
        this.name = name;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat() {
        System.out.println("老师吃饭");
    }
    public void teach() {
        System.out.println("老师上课");
    }
    public void print() {
        System.out.println(name+ " " +age+" " +content);
    }

}
class Student {
    private String name;
    private String content;
    private int age;
    public Student(){}
    public Student(String name, String content, int age) {
        this.age = age;
        this. name = name;
        this.content =content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat() {
        System.out.println("学生吃饭");
    }
    public void study() {
        System.out.println("学生学习");
    }
    public void print() {
        System.out.println(name+ " " +age+" " +content);
    }

}



