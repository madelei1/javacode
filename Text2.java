package madelei;
//8、在一个数组中查找指定值，找到返回其索引，没有返回-1；
/*
import java.util.Scanner;
public class Text2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("请输入需要查询的整数：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = find(arr,x);
        System.out.print("他的下标是："+y);
    }
    public static int find(int arr[],int x) {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == x) {
              return i;
            }
        }
    return -1;
    }
}
*/

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
//9、使用二分查找
public class Text2 {
   public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8};
       int x = 9;
       int y = erFen(arr,x);
       System.out.print(y);
   }
   public static int erFen(int[] arr,int x) {
       int left = 0;
       int right = arr.length-1;
       while (right >= left) {
           int mid = (left + right)/2;
           if(arr[mid] > x) {
               right = mid -1;
           }
           else if(arr[mid] < x) {
               left = mid +1;
           }else {
               return mid;
           }
       }
       return -1;
   }
}
*/
//10、数组排序，冒泡排序
public class Text2 {
    public static void main(String[] args) {
        int[] arr = {6,4,7,8,9,1,5,3,2};
        sort(arr);
        print(arr);

    }
    public static int[] sort(int arr[]) {
        for (int j = 0; j <arr.length ; j++) {
            for (int i = arr.length -1; i > j; i--) {

                if(arr[i-1] >= arr[i]) {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}


