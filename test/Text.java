// //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
// public class Text{
//     public static void main(String[] args){
//         int i = 25;
//         if(i < 18){
//             System.out.println("少年");

//         }
//         else if(i < 28){
//             System.out.println("青年");

//         }
//         else if(i < 55){
//             System.out.println("中年");

//         }
//         else if (i >= 56){
//             System.out.println("老年");
//         }
//     }
// }

// //2. 判定1-100间数字素数
// public class Text{
//     public static void main(String[] args){
//         int i = 100;
//         int x = 0;
//         for(x=2; x<i; x++){
//             if(i%x == 0){
//                 System.out.println(x+"不是素数");
//             }
//             else{
//                 System.out.println(x+"是素数");
//             }
//         }
        
//     }
// }
// import java.util.Scanner; 
// public class Text{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入需要查询的数字");
//         int i = sc.nextInt();
//         int x = 2;
//         for(x=2; x<i; x++){
//             if(i%x == 0){
//                 System.out.println(i+"不是素数");
//                 break;
//             }
//             else{
//                 System.out.println(i+"是素数");
//                 break;
//             }
//         }

//     }
// }
// //4. 输出 1000 - 2000 之间所有的闰年 
// public class Text{
//     public static void main(String[] args){
//         int i = 0;
//         for(i=1000; i<=2000; i++){
//             if((i%4==0 && i%100 !=0) || i%400 ==0){
//                 System.out.println(i+"是闰年");
//             }
//             else{
//                 System.out.println(i+"不是闰年");
//             }
//         }
//     } 
// }
// //5. 输出乘法口诀表 
// public class Text{
//     public static void main(String[] args){
//         int i = 0;
//         int j = 0;
//         int ch = 0;
//         for(i=1; i<=9; i++){
//             for(j=1; j<=i; j++){
//                 ch = i * j;
//                 System.out.print(i+"*"+j +"=" " "+ch);

//             }
//             System.out.println("");
//         }
//     }
// }

// //6. 求两个正整数的最大公约数 
// public class Text{
//     public static void main(String[] args){
//         int i = 12;
//         int j = 9;
//         int min = 0;
//         int max = 0;
//         int x =0;
//         if(i>j){
//             min = j;
//             max = i;
//         }
//         else{
//             min = i;
//             max = j;
//         }
//         for(x=min; x>0; x--){
//             if(min%x == 0){
//                     if(max%x == 0){
//                     System.out.println(x+"是他们的最大公约数");
//                     break;
//                 }
//             }
//         }
//     }
// }
// //7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 
// public class Text{
//     public static void main(String[] args){
//         double i = 0;
//         double x = 0;
//         double y = 0;
//         double num = 0;
//         for(i=1; i<=100; i++){
//             x = 1/i;
//             if(i%2 != 0){
//                 num += x;
//             }
//             else{
//                 num -= x;
//             }
            
//         }
//         System.out.println(num);
//     }
// }
//8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。
public class Text{
    public static void main(String[] args){
        int i = 0;
        int count =0;
        
        for(i=1; i<=100; i++){
            if(i/10 == 9){
                count++;
            }
            if(i%10 == 9){
                count++;
            }
        }
        System.out.println(count);


    }
}
