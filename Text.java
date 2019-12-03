package practice;

  /*1. 定义抽象类A，抽象类B继承A，普通类C继承B
          2. A类中，定义成员变量numa，赋值为10，抽象showA方法。
          3. B类中，定义成员变量numb，赋值为20，抽象showB方法。
          4. C类中，定义成员变量numc，赋值为30，重写showA方法，打印numa，重写showB方法，打印numb，定义showC方法，打印numc。
          5. 测试类中，创建C对象，调用showA方法，showB方法，showC方法。
*/

public class Text {
    public static void main(String[] args) {
       /*
        C x = new C();
        x.showA();
        x.showB();
        x.showC();
    }
}
abstract class A {
    int numa = 10;
    public abstract void showA();

}
abstract class B extends A {
    int numb = 20;
    public abstract void showB();
}
class C extends B {
    int numc = 30;

    @Override
    public void showA() {
        System.out.println(numa);
    }

    @Override
    public void showB() {
        System.out.println(numb);
    }
    public void showC() {
        System.out.println(numc);
        */
     /*1. 模拟农学院动物医疗系统信息。
       2. 定义抽象家禽类(Poultry)
        1. 私有成员变量：动物种类(name)，症状(symptom)，年龄(age)， 病因（illness）
        2. 提供空参和带参构造方法
       3. 成员方法：
        1. 抽象方法症状(showSymptom)
        2. 普通方法基本信息(showMsg)
        3. 提供setXxx和getXxx方法
       3. 定义普通鸭子类(Duck)
        1. 提供空参和带参构造方法
        2. 重写showSymptom方法，打印症状信息。
        */
     /*
     Duck c = new Duck("鸭子",2,"感冒","发烧");
     c.showMsg();
     c.showSymptom();

    }
}
abstract class Poultry {
    private String name;
    private int age;
    private String symptom;
    private String illness;
    public Poultry(){}

    public Poultry(String name, int age, String symptom, String illness) {
        this.name = name;
        this.age = age;
        this.symptom = symptom;
        this.illness = illness;
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

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public abstract void showSymptom();
    public void showMsg() {
        System.out.println("动物种类："+name +"  "+"年龄："+ age+ "岁");
    }
}
class Duck extends Poultry{
    public Duck() {}

    public Duck(String name, int age, String symptom, String illness) {
        super(name, age, symptom, illness);
    }

    public void showSymptom() {
        System.out.println("入院原因："+getSymptom());
        System.out.println("症状为："+getIllness());
        */
        /*
        模拟教学管理系统师生信息。
        2. 定义Person类。
        1. 属性：姓名、年龄
        2. 构造方法：无参构造方法，有参构造方法
        3. 成员方法：getXxx方法，setXxx方法，显示基本信息showMsg方法
        3. 定义Teacher类，继承Person
        1. 属性：学科
        2. 构造方法：无参构造方法，有参构造方法
        3. 成员方法：getXxx方法，setXxx方法，讲课方法
        4. 定义Student类，继承Person
        1. 属性：分数
        2. 构造方法：无参构造方法，有参构造方法
        3. 成员方法：getXxx方法，setXxx方法，考试方法
        */


                Teacher t = new Teacher("王小平", 30, "Java");
                t.teach();
                Student s = new Student("李小乐", 14, 90);
                s.exam();
            }
        }

        class Person {

            private String name;

            private int age;


            public Person() {
            }
            public Person(String name, int age) {
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
        }

        class Teacher extends Person {

            private String course;

            public Teacher() {
            }
            public Teacher(String name,int age, String course) {
                super(name,age);
                this.course = course;
            }
            public String getCourse() {
                return course;
            }
            public void setCourse(String course) {
                this.course = course;
            }

            public void teach() {
                System.out.println(getName() +"老师,讲授"+course +"课");
            }
        }

        class Student extends Person {

            private int score;

            public Student() {
                super();
            }

            public Student(String name, int age,int score) {
                super(name, age);
                this.score = score;
            }
            public int getScore() {
                return score;
            }
            public void setScore(int score) {
                this.score = score;
            }
            public void exam(){
                System.out.println(getName()+"同学,考试得了:"+ score +"分");
            }
        }




