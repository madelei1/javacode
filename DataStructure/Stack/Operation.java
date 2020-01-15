package DataStructure.Stack;
/*
* 比较运算符的优先级*/

public class Operation {
    private static  int ADD = 1;
    private static  int SUB = 1;
    private static  int MUL = 2;
    private static  int DIV = 2;
    //写一个方法，返回对应的优先级数字
    public static int getValue(String operation) {
        int result = 0;
        switch(operation) {
            case"+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case"*":
                result = MUL;
                break;
            case"/":
                result = DIV;
                break;
                default:
                    System.out.println("不存在整个运算符");
                    break;
        }
        return result;
    }
}
