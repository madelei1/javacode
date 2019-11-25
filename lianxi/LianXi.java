package lianxi;
//1. 定义类 Test1
//2. 定义 main方法
//3. 控制台输出5行字符串类型常量值
//4. 控制台输出5行字符类型常量值
//  3. 定义2个 byte类型变量,分别赋byte类型范围内最大值和最小值,并输出在控制台.
//  4. 定义2个 short类型变量,分别赋short类型范围内的值,并输出在控制台.
//  5. 定义2个 int类型变量,分别赋int类型范围内的值,并输出在控制台.
//  6. 定义2个 long类型变量,分别赋超过int类型范围的值,并输出在控制台.
//3. 定义5个 char类型变量,分别赋值,并输出在控制台.
//4. 定义2个 boolean类型变量,分别赋值,并输出在控制台.
//交换二个变量的值。

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class LianXi {
    public static void main(String[] args) {
        /*System.out.println("qwer");
        System.out.println("练习");
        System.out.println('c');
        System.out.println(0.1);
        System.out.println(1);
        System.out.println(true);
        byte a = -128;
        byte b = 127;
        System.out.println(a+" " +b);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println("______________________________________________");
        short c = 32767;
        short d = -32768;
        System.out.println(c +" " + d);
        int e = 10 ;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(e);
        System.out.println("______________________________________________");
        long f = 12L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(f);
        System.out.println("______________________________________________");
        float g = 1.0f;
        double h = 1.0;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(g);
        System.out.println("______________________________________________");
        System.out.println(h);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        char j = 'a';
        boolean k = true;
        boolean l = false;
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);*/
       /* int a = 10;
        int b = 20;
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);

*/
       //不使用参数 交换a，b
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a +" "+ b);


    }
}
