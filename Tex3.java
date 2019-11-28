package lianxi;
//数组的遍历
public class Tex3 {
   /* public static void main(String [] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        print(arr);
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }*/
 /*
   public static void main(String[] args) {
       String[] arr = {"黑桃","红心","梅花","方块"};
       String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
       print(arr,arr2);
   }
   public static void print(String[] arr,String[] arr2) {
       for (int i = 0; i <arr.length ; i++) {
           for (int j = 0; j <arr2.length ; j++) {
               System.out.print(arr[i] +arr2[j] +" ");
           }
           System.out.println();
       }
      */
       /* // 模拟在一副牌中，抽取第1张，第5张，第50张扑克牌。
    public static void main(String[] args) {
        int i = 1;
        int j = 5;
        int k = 50;
        String[] arr = {"黑桃","红心","梅花","方块"};
        String[] arr2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] arr4 = print(arr,arr2);
        String q = arr4[i];
        String w = arr4[j];
        String e = arr4[k];
        System.out.println(q+" "+w+" "+e);
    }
    public static String[]  print(String[] arr,String[] arr2) {
        String[] arr3 = new String[arr.length*arr2.length];
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                    arr3[x] = arr[i] + arr2[j];
                    x++;
                }
            }
        return arr3;*/
        // 统计字符
        //  * 字符数组：{'a','l','f','m','f','o','b','b','s','n'}
        //  * 定义printCount方法，统计每个字符出现的次数并打印到控制台。
       public static void main(String[] args) {
           char[] arr = {'a','l','f','m','f','o','b','b','s','n'};
           printCount(arr);
       }
       public static void printCount(char[] arr) {
           int[] count = new int[26];
           for (int i = 0; i < arr.length ; i++) {
               int c = arr[i];
               count[c - 97]++;
           }
           for (int j = 0 ,ch = 97; j < count.length ; j++,ch++) {
               if(count[j] != 0) {
                   System.out.print((char)ch +" "+count[j]+"次"+"  ");
               }
           }
       }

}
