package madelei;
/**
 * 1、数组的每一个元素*2
 * 2、自己写Arrys.toString()
 * 3、数组的每一个元素*2，并且不改变原数组，产生新数组；
 * 4、复制原数组，产生新数组
 * 5、查找整形数组中的最大/最小值
 * 6、求数组的平均值
 * 7、在一个数组中查找指定值，找到返回其索引，没有返回-1；
 * 8、在一个数组中查找指定值，找到返回其索引，没有返回-1；（使用二分查找）
 * 9、数组排序，冒泡排序
 * */
/*1、数组的每一个元素*2，并且不改变原数组，产生新数组；
import java.util.Scanner;
public class Lianxi {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        print(arr);
        System.out.println();
        int[] arry = arrys(arr);
        print(arry);

    }
    public static int[] arrys(int[] arr) {
        int[] newarr = new int [arr.length];
        for(int i=0; i<arr.length; i++) {
            newarr[i] = arr[i] * 2;
        }
        return newarr;

    }
    public static void print(int[] arr) {
        for(int i=0; i<arr.length; i++) {
         System.out.print(arr[i]+" ");
    }
}
}*/
/*
//2、数组的每一个元素*2
public class Lianxi {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        arrys(arr);
        print(arr);
    }
    public static int[] arrys(int arr[]) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
    public static void print(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//3、自己写Arrys.toString()
/*
import java.util.Arrays;
public class Lianxi {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String newArr = Arrays.toString(arr);
        System.out.println(newArr);
    }
}
*/
/*
//4、将数组实现打印[1, 2, 3, 4, 5]
public class  Lianxi {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
}
*/







