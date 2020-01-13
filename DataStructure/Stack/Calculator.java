package DataStructure.Stack;

public class Calculator {
    public static void main(String[] args) {
        String expression = "70*2*2-5+1-5+3-4";
        //创建二个栈，分别用来存放数字和运算符
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack2 opStack = new ArrayStack2(10);
        //需要定义的变量
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int ret = 0;
        int y = 0;
        char ch = ' ';//将每次扫描到打char保存到ch中
        String keepNum = "";//用于拼接多位数
        //开始while循环的扫描expression
        while(true) {
            //依次得到expression的每一个字符
            ch = expression.substring(index,index+1).charAt(0);
            //判断ch是什么，然后做出相应的处理
            if (opStack.judge(ch)) {//如果是运算符
                //判断当前符号栈是否为空
                if(!opStack.isEmpty()) {
                    //如果符号栈有操作符，就进行比较，如果当前的操作符的有先级小于或者等于栈中的操作符
                    //就需要从数栈中pop出二个数，在从符号栈中pop一个符号，进行运算结果，入数栈，然后将当前的操作数入符号栈
                    if (opStack.priority(ch) <= opStack.priority(opStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        y = opStack.pop();
                        ret = numStack.cal(num1,num2,y);
                        //把运算结果入数据栈
                        numStack.push(ret);
                        //然后将当前的操作符入符号栈
                        opStack.push(ch);
                    } else {
                        //如果为空直接入栈……
                        opStack.push(ch);
                    }
                } else {
                    //如果为空直接入符号栈..
                    opStack.push(ch);//1+3
                }

            } else {
                //如果是数据直接入数栈
                //numStack.push(ch-48);//ch是字符，减去四十八才会变为对应的数字（字符1对应的ASCII表的值是49，字符3对应的ASCII表的值是51，减去四十八对应的是它的值）
                //分析思路：
                //1、当处理多位数时候，不能发现是一个数就立即入栈，因为啊可能是多位数
                //2、在处理，需要向expression的表达式的index，后在看一位，如果是数就进行扫描，如果是符号才入栈
                //3、因此我们需要定义一个变量，用于拼接
                //处理多位数
                keepNum += ch;
                //如果ch是expression的最后一位，就直接入栈
                if (index == expression.length() -1) {
                    numStack.push(Integer.parseInt(keepNum));
                } else {
                    //判断下一个字符是不是数字，如果是数字就继续扫描，如果是运算符就入栈
                    if (opStack.judge(expression.substring(index+1,index+2).charAt(0))) {
                        //如果后一位是运算符，则入栈keepNum = "1"或者"123"
                        numStack.push(Integer.parseInt(keepNum));
                        //重要的！！！，keepNum清空
                        keepNum = "";
                    }
                }
            }
            //让index+1，并且判断是否扫描到expression最后。
            index++;
            if (index >= expression.length()) {
                break;
            }
        }
        //当表达式扫描完毕，就顺序的从数栈和符号栈中pop出相应的数和符号，并且运行。
        while (true) {
            //如果符号栈为空，则计算到最后结果，数栈中只有一个数字（结果）
            if (opStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            y = opStack.pop();
            ret = numStack.cal(num1,num2,y);
            numStack.push(ret);//入栈
        }
        System.out.println("计算结果为："+numStack.pop());
    }

}
