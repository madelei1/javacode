// //求出100～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
public class Text1{
    public static void main(String[] args){
        int i = 0;
        int a = 0;
        int b = 0;
        int c = 0;
       for(i=100; i<=999; i++){
           a = i/10/10;
           b = i/10%10;
           c = i%10%10;
           if(a*a*a+b*b*b+c*c*c == i) {
               System.out.println(i);
           }
           
       }

        
    }
}

// //10. 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
// import java.util.Scanner;
// public class Text1{
//     public static void main(String[] args){
//         String s = "123456";
//         int i = 0;
//         for(i=1; i<=3; i++){
//             System.out.println("请输入密码：");
//             Scanner sc = new Scanner(System.in);
//              String x = sc.next();
//             if(x.equals(s)){
//                 System.out.println("登陆成功");
//                 break;
//                 }   
//             else{
//                 System.out.println("密码输入错误");
                
//                 }  
//             }
//         if(i==3){
//             System.out.println("您密码输入错误三次，程序已经退出");
           

//         }
        
        
//     }
// }




// 13. 输出一个整数的每一位
// import java.util.*;
// public class Text1{
//     public static void func(int n){
//         if(n>9){
//             func(n/10);
//         }
//         System.out.println(n%10);

//     }
//     public static void main(String[] args){
//         System.out.println("请输入一个整数:");
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         func(x);
//     }
// }