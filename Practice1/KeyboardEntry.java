package Exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/*
题目：（要求）
1、键盘录入一个int类型的整数，对其求二进制表示形式，
2、如果录入的整数过大，给与提示，录入的整数过大请重新录入一个整数BingInteger
3、如果录入的是小数，给予提示，录入的是小数，请重新录入一个整数
3、如果录入的是其他字符，给予提示，录入的是非法字符，请重新输入一个整数。

* 分析：
* 1、创建键盘录入对象
* 2、将键盘录入的结果存储在String类型的字符串中，因为如果存储int类型中如果不符合条件直接报错，无法进行后续判断
* 3、键盘录入的结果转换成int的数据，是正确的还上错误的
* 4、正确直接转换
* 5、错误的要进行对应的判断
* */
public class KeyboardEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");

        while (true) {
            String line = sc.nextLine();
            try {
                int num = Integer.parseInt(line);  //将字符串转换成整数，
                System.out.println(Integer.toBinaryString(num)); //将整数转换成二进制数
                break;
            } catch (Exception e) {
                try {
                    new BigInteger(line);
                    System.out.println("录入的是一个过大的整数，请重新输入一个整数：");
                } catch (Exception e1) {
                    try{
                        new BigDecimal(line);
                        System.out.println("录入的是一个小数，请重新输入一个整数：");
                    } catch (Exception e2) {
                        System.out.println("录入的是一个非法字符，请重新输入一个整数：");
                    }
                }
            }
        }
    }
}
