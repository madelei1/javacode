// //数组的遍历
// public class Arr {
//     public static void main(String[] args) {
//         int arr[] = {11,22,33,44,55,66,77};
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
// //求数组中最大值
// public class Arr {
//     public static void main(String[] args) {
//         int arr[] = {11,55,22,33,77,99,88};
//         int max = getMax(arr);
//         System.out.print(max);
        
//     }
//     public static int getMax(int arr[]) {
//         int max = 0;
//         max = arr[0];
//         for(int i = 1; i < arr.length; i++) {
//             if(max < arr[i]) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// }
// //数组的反转；
// public class Arr {
//     public static void main(String[] args) {
//         int arr[] = {11,22,33,44,55,66,77};
//         System.out.println("反转前的数组顺序：");
//         print(arr);
//         fanzhuan(arr);
//         System.out.println();
//         System.out.println("反转后的数组顺序：");
//         print(arr);
//     }
//     public static void fanzhuan(int arr[]) {
//         for(int i = 0; i < arr.length/2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[arr.length-1-i];
//             arr[arr.length-1-i] = temp;
//         }
//     }
//     public static void print(int arr[]) {
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//     }
// }
// //获取星期
// import java.util.Scanner;
// public class Arr {
//     public static void main(String[] args) {
//         System.out.println("请输入1-7的天数：");
//         Scanner sc = new Scanner(System.in);
//         int i = sc.nextInt();
//         String arr[] = {" ","一","二","三","四","五","六","日"};
//         System.out.println("星期"+arr[i]);

//     }
// }
// //数组元素查找（查找指定元素第一次在数组中出现的索引）
// import java.util.Scanner;
// public class Arr {
//     public static void main(String[] args) {
//         int arr[] = {11,22,33,44,55,77,66,88,99};
//         System.out.println("请输入一个二位数，且是个位与十位相同的数字：");
//         Scanner sc = new Scanner(System.in);
//         int i = sc.nextInt();
//         for(int x = 0; x < arr.length; x++) {
//             if(i == arr[x]) {
//                 System.out.println(x);
//             }
//         }
//     }
// }
// //二维数组的遍历
// public class Arr {
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5},{7,8,9}};
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j < arr[i].length; j++) {
//                 System .out.print(arr[i][j]+ " ");
//             }
//             System.out.println();
//         }

//     }
// }
//二维数组的求和
public class Arr {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5},{7,8,9}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];

            }
        }
        System.out.println(sum);
    }
}