package DataStructure.Recursion;

public class Queen8 {
    //定义一个max表示一共有多少给皇后
    int max = 8;
    //定义数组array，保存皇后放置的结果，比如arr ={0，4，7，5，2，6，1，3}
    int[] array = new int[max];
    static int count = 0;
    static int judgeCount = 0;
    public static void main(String[] args) {
        //测试，一共有92种
        Queen8 queen8 = new Queen8();
        queen8.check(0);
        System.out.println("一共有"+count+"解法");
        System.out.println("一共判断冲突的次数"+judgeCount);
    }
    //编写一共方法，放置第n给皇后
    //特别注意：check是每一次递归时，进入到check中都有for(int i = 0; i<max; i++),因此会有回溯
    private void check(int n) {//n = 8,其实8个皇后就已然放好
        if(n == max) {
            print();
            return;
        }
        //依次放入皇后，并且判断是否冲突
        for (int i = 0; i<max; i++) {
            //先把当前这个皇后n，放到该行的第1列
            array[n] = i;
            //判断放置第n给皇后到第i列是否冲突
            if (judge(n)) {//不冲突
                //接着放n+1给皇后，即开始递归
                check(n+1);
            }
            //如果冲突，就继续执行array[n] = i;即将第n给皇后，放之在本行的皇后后移一个位置
        }

    }
    //查看当我们放置第n个皇后，检测是否与前面的皇后冲突
    private boolean judge(int n) {
        judgeCount ++;
        for (int i = 0; i < n;i++) {
            // 说明
            //1. array[i] == array[n]  表示判断 第n个皇后是否和前面的n-1个皇后在同一列
            //2. Math.abs(n-i) == Math.abs(array[n] - array[i]) 表示判断第n个皇后是否和第i皇后是否在同一斜线
            // n = 1  放置第 2列 1 n = 1 array[1] = 1
            // Math.abs(1-0) == 1  Math.abs(array[n] - array[i]) = Math.abs(1-0) = 1
            //3. 判断是否在同一行, 没有必要，n 每次都在递增
            if (array[i] ==array[n] || Math.abs(array[n]-array[i]) == Math.abs(n-i)) {
                return false;
            }
        }
        return true;
    }
    //将皇后摆放的位置输出
    private void print() {
        count ++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
