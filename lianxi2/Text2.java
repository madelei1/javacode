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
*/


import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
           /*byte b1 = 10;
           byte b2 = 20;
           int b3 = b1 + b2;
           byte b4 = (byte)(b1 + b2);
            System.out.println(b3);
            System.out.println(b4);
           short s1 = 1000;
           short s2 = 2000;
           int s3 = s1 + s2;
            System.out.println(s3);
           short s4 = (short)(s1 + s2);
            System.out.println(s4);
            char c1 = 'a';
            int i1 = 30;
            int ch3 = i1 - c1;
            char ch4 = (char)(i1 - c1);
            System.out.println(ch3);
            System.out.println(ch4);*/

           /* 1. 定义类 Test2
            2. 定义 main方法
            3. 定义 int类型变量i1 和 long类型变量l1
            4. 定义变量add,保存i1和l1的和,并输出.
            5. 定义 long类型变量l2 和 float类型变量f2
            6. 定义变量add2,保存l2和f2的和,并输出.
            7. 定义 int类型变量i3 和 double类型变量d3
            8. 定义变量add3,保存i3和d3的和,并输出.
            9. 定义 float类型变量f4 和 double类型变量d4
            10. 定义变量add4,保存f4和d4的和,并输出.*/
         /*  int i2 = 10;
           long l1 = 20;
           long add = i2 + l1;
            System.out.println(add);
            long l2 = 30;
            float f2 = 20f;
            long add1 = (long)(l2 + f2);
            float add2 =l2 + f2;
            int i3 = 30;
            double d3 = 3.0;
            double add3 = i3 + d3;
            int add4 = (int)(i3 + d3);
            float f3 = 3.6f;
            double d4 = 3.4;
            double add5 = f3 + d4;
            float add6 = (float)(f3 + d4);*/

            /*1. 定义类 Test1,类中定义 main方法,定义int类型a为10, b为10.
            2. 定义printNum方法,参数为(int iVar, int iVar2),返回值无,输出iVar和iVar2的值
            3. 定义doubling方法,参数为(int r, int p),返回值无,方法内r翻倍,p翻倍,并调用printNum方法,输出r和p的值
            4. 定义doubling方法,参数为(int r),返回值int, 方法内r翻倍,返回r.
            5. main方法中,调用printNum方法,传入a,b
            6. main方法中,调用doubling方法,传入a,b
            7. main方法中,调用printNum方法,传入a,b
            8. main方法中,调用doubling方法,传入a,用a接收返回值
            9. main方法中,调用doubling方法,传入b,用b接收返回值
            10. main方法中,调用printNum方法,传入a,b
            */
            /*int a = 10;
            int b = 10;
            printNum(a,b);
            doubling(a,b);
            printNum(a,b);
            int i = doubling(a);
            int j = doubling(b);
            printNum(a,b);
        System.out.println(i);
        System.out.println(j);

    }
    public static void printNum(int iVar1, int iVar2) {
        System.out.println(iVar1);
        System.out.println(iVar2);
    }
    public static void doubling(int r, int p) {
        r *= 2;
        p *= 2;
        printNum(r,p);
    }
    public static int doubling(int r) {
        return r*2;
    }
*/

        /*1. 定义类 Test2,类中定义 main方法
        2. 定义doCheck方法,参数为(int iVar),返回值boolean类型
        3. doCheck方法内,定义变量boolean flag.
        4. doCheck方法内,判断num是否为偶数.
        5. 如果是偶数,使用for循环,初始化值i为0,i<=20进入循环,步进表达式i++
        6. 循环内,num-=i;
        7. flag赋值为true.
        8. 否则是奇数,使用for循环,初始化值i为0,i<=20进入循环,步进表达式i++
        9. 循环内,num+=i;
        10. flag赋值为false.
        11. 输出num的值
        12. 返回flag
        13. 调用doCheck方法,传入2,保存返回值,并输出
        14. 调用doCheck方法,传入3,保存返回值,并输出

*/
       /* boolean i = doCheck(2);
        boolean j = doCheck(3);
        System.out.println(i);
        System.out.println(j);
    }
    public static boolean doCheck(int iVar) {
       *//* if (iVar % 2 == 0) {
            return true;
        }
        return false;*//*
        boolean flag = true;
       if (iVar %2 ==0) {
           for (int i = 0; i <= 20 ; i++) {
               iVar -=i;
               flag = true;
           }
       }else {

           for (int j = 0; j <=20 ; j++) {
               iVar += j;
             flag =false;

           }
       }
        System.out.println(iVar);
        return flag;
    }*/
        //定义showColor方法，根据英文单词，输出对应的颜色
    /*    showColor("red");
    }
    public static void showColor (String i) {
        switch(i) {
            case "red" : {
                System.out.println("是红色："+i);
            break;
            }
            case "black" : {
                System.out.println("是黑色："+i);
                break;
            }
            case "blue" : {
                System.out.println("是蓝色："+i);
                break;
            }
            default:
                System.out.println("没有该颜色：");
                break;

        }
*/
    /*// 定义getValue方法，获取三个数中的最值，能够通过字符串，指定获取最大值或者最小值。
        int i = getValue("a",1,2,3);
        System.out.println(i);
    }
    public static int  getValue(String i, int a, int b, int c) {
        int t = 0;
        if(i == "max") {
            if(a > b) {
                if(a > c) {
                    t = a;
                }else{
                    t = c;
                }
            }else {
                if(b > c) {
                    t = b;
                }else  {
                    t = c;
                }
            }
        } else {
            if (a > b) {
                if(c > b) {
                    t = b;
                }else {
                    t = c;
                }
            }else {
                if(a > c){
                    t = c;
                }else {
                    t = a;
                }
            }
        }
          return t;*/

        /*int i = getValue("max",1,2,3);
        System.out.println(i);
    }
    public static int getValue(String i, int a, int b, int c) {
        int t = 0;
        if(i == "max") {
            t = a > b ? (a > c ? a : c) : (b > c ? b : c);
        }else {
            t = a > b ? (b > c ? c : b) : (a > c ? c : a);
        }
        return t;*/


    /*// 定义round方法，接收一位小数，实现四舍五入运算，并返回结果。
        double i =round(1.4);
        System.out.println(i);

    }
    public static double round(double i) {
        double j = 0.0;
        j = i - (int)i;
        if(10*j >= 5) {
            i = (int) i +1;
        }else {
            i = (int) i;
        }
        return i;*/
  /*  //方法二：

        double j = round(1.6);
        System.out.println(j);
    }
    public static double round(double i) {
        return (int)(i + 0.5);*/


   //打印一个x，并且x是有数字0构成，其他区域是由*构成10*10的图形
        print(10);

    }
    public static void print(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == i || i + j == m + 1) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}



