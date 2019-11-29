package lianxi;
/*
* 统计高于平均分的分数有多少个。
        * 定义数组[95, 92, 75, 56, 98, 71, 80, 58, 91, 91]。
        * 定义getAvg方法，获取一个数组中的平均数
*/
public class Text4 {
    public static void main(String[] args) {
        /**
        int[] arr = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        double a = getAvg(arr);
        System.out.println(a);
    }
    public static double getAvg(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum/arr.length;
        */
        //定义sym方法，判断数组中的元素值是否对称.
       /*
        int arr[] = {1,2,3,4,5,5,3,2,1};
        boolean i = sym(arr);
        System.out.println(i);
    }
    public static boolean sym(int[] arr) {
        int count = 0;
        for (int i = 0, j = arr.length-1; i <arr.length/2 ; i++,j--) {
            if(arr[i] ==arr[j]) {
                count ++;
            }
        }
        if(count ==arr.length/2) {
            return true;
        }
        return false;
        */
       //定义equals方法，比较数组内容是否完全一致。
        int[] arr = {456,123,789};
        int[] arr1 = {456,123,779};
        boolean i = equals(arr, arr1);
        System.out.println(i);

    }
    public static boolean equals(int[] arr, int[] arr2) {
        int count = 0;
        if(arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == arr2[i]) {
                    count++;
                }
            }
            if(count == arr.length) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

}

