package madelei;
  /*
public class Text {

    //将数组实现打印[1, 2, 3, 4, 5]
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
 /* //  5、复制原数组，产生新数组
  public class Text {
      public static void main(String[] args) {
          int[] arr = {1,2,3,4,5};
          int[] newArr = copy(arr);
          print(arr);
          System.out.println();
          newArr[1] = 10;
          print(newArr);

      }
      public static int[] copy(int[] arr) {
          int[] newArr = new int[arr.length];
          for (int i = 0; i <arr.length ; i++) {
              newArr[i] = arr[i];
          }
          return newArr;
      }
      public static void print(int[] arr) {
          for (int i = 0; i <arr.length ; i++) {
              System.out.print(arr[i]+" ");
          }
      }
  }
*/
/*
 //6、查找整形数组中的最大/最小值
 public class Text {
     public static void main(String[] args) {
         int[] arr = {1,5,7,9,8,6};
         int x = max(arr);
         System.out.print(x);
     }
     public static int max(int[] arr) {
         int max = arr[0];
         for (int i = 1; i < arr.length ; i++) {
             if(max < arr[i]) {
                 max = arr[i];
             }
         }
         return max;
     }

  }
*/

//7、求数组的平均值
public class Text {
    public static  void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        double x = avg(arr);
        System.out.println(x);

    }
    public static double avg(int[] arr) {
        int sum =0;
        for (int i = 0; i <arr.length ; i++) {
            sum +=arr[i];
        }
        return sum/arr.length;
    }
  }

