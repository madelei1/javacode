package DataStructure.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
* 将中缀表达式转换成后缀表达式*/
public class Convert {
    public static void main(String[] args) {
        /*
        * 说明：
        * 1.1+((2+3)*4)-5 =>转换成1 2 3 + 4 * + 5 -
         * 2.因为直接对str进行操作，不方便，因此先将“1+((2+3)*4)-5”转换成对应的List
         * 即“1+((2+3)*4)-5”=>ArrayList[1,+,(,2,+,3,),*,4,),-,5]
         * 3.将的到的中缀表达式对应的List = > 后缀表达式对应的List
         * */
        String  expression = "1+((2+3)*4)-5";
        List<String> infixExpressionList = toInfixExpressionList(expression);
        System.out.println(infixExpressionList); //ArrayList[1, +, (, (, 2, +, 3, ), *, 4, ), -, 5]
        List<String> suffixExpressionList = parseSuffixExpressionList(infixExpressionList);
        System.out.println("后缀表达式对应的List"+suffixExpressionList);


    }
    //方法：将中缀表达式转换从对应的List
    //s = "1+((2+3)*4)-5" =>转换成1 2 3 + 4 * + 5 -
    public static List<String> toInfixExpressionList(String s) {
        //定义一个List，存放中缀表达式对应的内容
        List<String> ls = new ArrayList<String>();
        int i = 0;//这个是一个指针，用于遍历中缀表达式
        char c;//每一个遍历到的字符就放到c中
        String str;//对多位数的拼接
        do {
            //如果c是一个非数字，就需要加入到ls
            if ((c = s.charAt(i))< 48 ||(c = s.charAt(i)) > 57) {
                ls.add(""+c);
                i ++;//i需要后移
            } else {//如果是一个数，需要考虑多位数
                str = "";//先将str置成""
                while (i < s.length() &&(c = s.charAt(i)) >= 48 && (c = s.charAt(i)) <= 57) {
                    str += c;//拼接
                    i++;
                }
                ls.add(str);
            }
        } while (i < s.length());

        return ls;
    }
    public static List<String> parseSuffixExpressionList(List<String> ls) {
        //定义二个栈
        Stack<String> s1 = new Stack<>();//符号栈
        //说明：因为s2这个栈，在整个转换过程中，没有pop操作，而且后面我们还需要逆序输出
        //因此比较麻烦，这里我们就不用Stack<String>直接使用List<string> s2
        //Stack<String> s2 = new Stack<>();//存储中间结果的栈s2
        List<String> s2 = new ArrayList<>();//存储中间结果List2
        //遍历ls
        for (String item:ls) {
            //如果是一个整数，加入s2
            if (item.matches("\\d+")) {
                s2.add(item);
            } else if (item.equals("(")) {
                s1.push(item);
            } else if (item.equals(")")) {
                //如果是右括号，则依次弹出s1栈顶的运算符，并且压入s2，直到遇到左括号为止，此时将这一对括号丢弃
                while (! s1.peek().equals("(")) {
                    s2.add(s1.pop());
                }
                s1.pop();//!!!!!将（弹出s1栈，消除括号，很重要

            } else {
                //当item的优先级小于等于栈顶元素优先级将s1栈顶的运算符弹出，并且压入到s2中，再次转到（4-1）与s1中新的栈顶运算符比较
                //Operation是一个比较运算符优先级的类
                while (s1.size() != 0 && Operation.getValue(s1.peek()) >= Operation.getValue(item)) {
                    s2.add(s1.pop());
                }
                //还需要将item压入栈
                s1.push(item);
            }
        }
        //将s1中的剩余的运算符依次弹出并压入s2
        while (s1.size() != 0) {
            s2.add(s1.pop());
        }
        return s2;//注意因为s2是List，所以按顺序输出的就是正确的结果，

    }
}
