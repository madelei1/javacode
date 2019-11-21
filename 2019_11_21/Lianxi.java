// import java.util.Scanner;
// public class Lianxi {
//     // 写一个函数返回参数二进制中 1 的个数
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数字:");
//         while(sc.hasNextInt()) {
//             int num = sc.nextInt();
//             int ret = getNumBinCount(num);
//             System.out.println("num为"+num+",其二进制中1的个数为:"
//             +getNumBinCount(num));
//             System.out.println("请输入一个数字:");
//         }
//     }
//     // 写一个函数返回参数二进制中 1 的个数
//     public static int getNumBinCount(int n) {
        
//         int count = 0;
//         while(n > 0) {
//             count ++;
//             n = n & (n-1); //按位与二个都是1才为1，否则为0；
//         }
//         return count;
//     }
// }

// //写一个递归方法，输入一个非负整数，返回组成它的数字之和
// // sum(n) -> 求出此整数的各个位数之和
// public class Lianxi {
//     public static void main(String[] args) {
//         int n = 12304;
//         int ret = sum(n);
//         System.out.println(ret);
//     }

    
//     public static int sum(int n) {
//         if(n < 10) {
//             return n;
//         }
//         return n % 10 + sum(n / 10);
//     }
// }

//  //2、用递归求n！
//  import java.util.Scanner;
//  public class Lianxi {
//      public static void main(String[] args) {
//          System.out.println("请输入一个需要求的整数：");
//          Scanner sc = new Scanner(System.in);
//          int i = sc.nextInt();
//          int y = jiechen(i);
//          System.out.println(y);

//      }
//      public static int jiechen(int x) {
//          if (x == 1) {
//              return 1;
//          }
//          else{
//              return x*jiechen(x-1);
//          }
//      }
//  }
// //3. 实现代码: 递归求 1 + 2 + 3 + ... + 10
// import java.util.Scanner;
// public class Lianxi {
//     public static void main(String[] args) {
//         System.out.println("请输入要求到的和的最大值：");
//         Scanner sc = new Scanner(System.in);
//         int i = sc.nextInt();
//         int y = add(i);
//         System.out.println(y);
//     }
//     public static int add(int n ) {
//         int sum = 0;
//         if(n == 1) {
//             return 1;
//         }
//         else {
//            return n + add(n-1);
//         }
//     }
// }
//4. 实现代码: 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
import java.util.Scanner;
public class Lianxi {
    public static void main(String[] args) {
         System.out.println("请输入一个数：");
         Scanner sc = new Scanner(System.in);
         int i = sc.nextInt();
         shuchu(i);
    }

    public static void shuchu(int x) {
        if(x > 10) {
             shuchu(x/10);
        }
        System.out.print(x%10 +" ");
    } 
}
