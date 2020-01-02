package Exception;

import java.util.Scanner;

/*
问题：
请使用代码实现
每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定异常
*/
public class Topic_01 {
    String num;
    String name;
    int score = -80;
    public int hint() {
        System.out.println("请输入学生成绩：");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();
        return score;
    }
    public void print(int score) throws NoScoreException {
        if (score > 0) {
            System.out.println(score);
        } else {
            throw new NoScoreException("分数为负数了。");
        }
    }
}
