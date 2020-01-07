package DataStructure.Stack;

import java.util.Scanner;

public class Test_ArrayStack {
    public static void main(String[] args) {
        ArrayStack x = new ArrayStack(5);
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        String key = "";
        while (loop) {
            System.out.println();
            System.out.println("show:打印栈中全部元素");
            System.out.println("push:添加元素图栈");
            System.out.println("pop:元素出栈");
            System.out.println("exit:程序退出");
            System.out.println("请输入你的选择");
            key = sc.next();
            switch(key) {
                case "show":
                    x.show();
                    break;
                case "push":
                    int val = sc.nextInt();
                    x.push(val);
                    break;
                case "pop":
                    try {
                        int value = x.pop();
                        System.out.println("出栈的数据值是："+value);
                    } catch (Exception p){
                        System.out.println(p.getMessage());
                    }
                    break;
                case "exit":
                    loop =false;
                    break;
            }
        }
        System.out.println("程序退出");
    }
}
