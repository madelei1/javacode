package DataStructure;

public class Sparsearray {
    //创建一个11*11的棋盘（数组）；其中第2行，第3列有黑子，第3行，第4列有白子
    //假定黑子为1， 白子为2；
    //要求先构建原先数组，在创建稀疏数组
    public void sparsearray() {
        int sum = 0;
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    sum ++;
                }
            }
        }


        //创建稀疏数组
        int[][] arr1 = new int[sum + 1][3];
        arr1[0][0] = 11;
        arr1[0][1] = 11;
        arr1[0][2] = sum;
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j] != 0) {
                    count ++;
                    arr1[count][0] = i;
                    arr1[count][1] = j;
                    arr1[count][2] = arr[i][j];
                }
            }
        }
        print(arr1);
        System.out.println();
        //由稀疏数组转回一般数组
        int[][] arr3 = new int[arr1[0][0]][arr1[0][1]];
        for (int i = 1; i < arr1.length; i++) {
            arr3[arr1[i][0]][arr1[i][1]] = arr1[i][2];
        }
        print(arr3);

    }
    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d\t",arr[i][j] );
            }
            System.out.println();
        }
    }



}
