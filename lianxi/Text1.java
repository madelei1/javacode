package lianxi;
/*
1. 定义类 Test1
        2. 定义 main方法
        3. 定义两个byte类型变量b1,b2,并分别赋值为10和20.
        4. 定义变量b3,保存b1和b2的和,并输出.
        5. 定义两个short类型变量s1,s2,并分别赋值为1000和2000.
        6. 定义变量s3,保存s1和s2的和,并输出.
        7. 定义一个char类型变量c1赋值为'a',一个int类型变量i1赋值为30.
        8. 定义变量ch3,保存c1和i1的差,并输出.
        System.out.println("-----------------------------------");
        3. 定义 int类型变量i1 和 long类型变量l1
        4. 定义变量add,保存i1和l1的和,并输出.
        5. 定义 long类型变量l2 和 float类型变量f2
        6. 定义变量add2,保存l2和f2的和,并输出.
        7. 定义 int类型变量i3 和 double类型变量d3
        8. 定义变量add3,保存i3和d3的和,并输出.
        9. 定义 float类型变量f4 和 double类型变量d4
        10. 定义变量add4,保存f4和d4的和,并输出.
        */

import java.util.Scanner;
public class Text1 {
    public static void main(String[] args) {
        /*
        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1+b2;
        byte b4 = (byte)(b1+b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println("-----------------------------------");
        short s1 = 1000;
        short s2 = 2000;
        int s3 = s1 + s2 ;
        short s4 = (short)(s1 + s2) ;
        System.out.println(s3+ " "+ s4);
        System.out.println("-----------------------------------");
        char c1 = 'a';
        int i1 = 30;
        int ch3 = c1 - i1 ;
        char ch4 = (char)(c1 - i1);
        System.out.println(ch3+" "+ch4);
*/
        /*int i1 = 10;
        long l1 = 10l;
        long add = i1 +l1 ;
        int add1 = (int)(i1 + l1);
        System.out.println(add+" "+add1);
        System.out.println("-----------------------------------");
        float f1 = 10f;
        float f2 = l1 + f1;
        long l2 = (long)(l1 + f1);
        System.out.println(f2+" "+l2);
        float i = 1.2f;
        double j = 1.2;
        double x = i + j;
        float y =  (float) (i + j);
        System.out.println(x +" "+ y);*/
        /*Scanner  sc = new Scanner(System.in);
        System.out.println("请输入二个数：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int q = add(x,y);
        int j = sub(x,y);
        int w = div(x,y);
        int r = remain(x,y);
        System.out.println(q+" "+j+" "+r+" "+w);



    }
    public static int add(int x,int y) {
        return x+y;
    }
    public static int sub(int x,int y) {
        return x - y;
    }
    public static int div(int x,int y) {
        return x/y ;
    }
    public static  int remain(int x, int y) {
        return x*y;
    }
*/
       /* int a = 20;
        int b = 20;
        //boolean bo =((++a) % 3 ==0) && ((a++) % 7==0);
       // System.out.println(a+" "+ bo);
        boolean bo2 = ((a++) %3 == 0) && ((++a) %7 ==0);
        System.out.println(a+" "+bo2);
*/
       /*printNum();

    }
    public static void printNum() {
        int a = 9;
        int b = 9;
        int num =++a;
        boolean bo = num >= 10 ? true : false;
        System.out.println(bo);
        int num2 =b++;
        boolean bo1 = num2 >= 10? true : false;
        System.out.println(bo1);
    }
}
*/
      /* int a1 = 10;               //判断是不是偶数
       int a2 = 11;              //判断是不是偶数
       int a3 = 12;             //判断是不是奇数
       int a4 = 13;            //判断是不是奇数
       boolean i = (a1 % 2 ==0) ? true : false;
       boolean j = (a2 % 2 ==0) ? true : false;
       System.out.println("a1是不是偶数？"+i);
       System.out.println("a2是不是偶数？"+j);
       boolean k = (a3 % 2 !=0) ? true : false;
       boolean m = (a4 % 2 !=0) ? true : false;
       System.out.println("a3是不是奇数？"+k);
       System.out.println("a4是不是奇数？"+m);
       */
     /*
      char ch = 'J';
      char ch1 = (char) (ch +32);
      System.out.println(ch1);
      char ch2 = 'a';
      ch2 +=-32;
      System.out.println(ch2);
      double d3 =3.5;
      int i3 =100;
      double sum3 = d3 + i3;
      System.out.println(sum3);
      System.out.println("sum3的整数部分："+(int)sum3);
      double d4 = 5.8;
      int i4 = 300;
      int mul4 = (int)(d4*i4);
      System.out.println(mul4);
      */

        printNum();

    }
    public static void printNum() {
        float f1 = 12345.01f;
        float f2 = 12345.00f;
        float var1 = (f1 > f2) ? 123456 : 123456.02f;
        float var2 = var1 +1024;
        System.out.println(var1+" "+var2);
    }
}