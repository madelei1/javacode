//1、声明一个新的方法来求1!+2!+3!+4!+5!....n的阶乘；（和不用方法写的方法）     
// public class Example {
//     public static void main(String[] args) {
//         int i = 0;
//         int j = 0;
//         int sum = 0;
//         for(i=1; i<=5; i++) {
//             int z = 1;
//             for(j=1; j<=i; j++) {
//                 z = z*j;
//             }
//             sum = sum + z;
//         }
//         System.out.println(sum);
//     }
// }
// import java.util.Scanner;
// public class Example{
//     public static int fie(int x) {
//         int sum = 0;
//         for(int i=1; i<=x; i++) {
//             int z = 1;
//             for(int j=1; j<=i; j++) {
//                 z = z*j;
//             }
//             sum = sum + z;
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         System.out.println("请输入要计算的数：");
//         Scanner sc = new Scanner(System.in);
//         int i = sc.nextInt();
//         int x = fie(i);
//         System.out.println(x);

//     }
// }

//2、return   1、2 、3 
// import java.util.Scanner;
// public class Example {
//     public static void main(String[] args) {
//         System.out.println("请输入需要计算的二个数：");
//          Scanner sc = new Scanner(System.in);
//          int i = sc.nextInt();
//          int j = sc.nextInt();
//          int x = add(i,j);
//          System.out.println(x);
//     }
//     public static int add(int x, int y) {

//         System.out.println("return-1");
//         return x+y;

//     }
// }
  
// //3、方法重载；练习举例；
// import java.util.*;
// public class Example {
//     public static void main(String[] args) {
//         System.out.println("请输入需要计算的二个数：");
//          Scanner sc = new Scanner(System.in);
//          double i = sc.nextDouble();
//          double j = sc.nextDouble();
//          double x = add(i,j);
//          System.out.println(x);
//     }
//     public static int add(int x, int y) {

//         return x+y;

//     }
//     public static double add(double x, double y) {

//         return x+y;
//     }
// }

//4、java这素数的查询
// public class Example {
//     public static void main(String[] args) {
//                 for(int i = 2;i <= 100;i++) {
//             boolean isPar = true;
//             // 判断从i - i-1中有没有i的因子
//             for(int j = 2;j < i;j++) {
//                 if(i % j == 0) {
//                     // 不是素数
//                     isPar = false;
//                     break;
//                 }
//             }
//             if(isPar) {
//                 System.out.print(i+" ");
//             }else {
//                 continue;
//             }
//         }

//     }
// }

//猜数字小游戏
import java.util.Random;
import java.util.Scanner;
public class Example {
    public static void main(String[] args){
        Random random = new Random();
        int guess = random.nextInt(100);
        while(true) {
             Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if(x > guess) {
                System.out.println("猜大了");
            }
            else if(x < guess) {
                System.out.println("猜小了");
            }
            else {
                System.out.println("猜对了");
                break;
            }

        }
       
    }
}
