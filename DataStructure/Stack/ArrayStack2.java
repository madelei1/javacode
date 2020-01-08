package DataStructure.Stack;

public class ArrayStack2 {
    int maxSize;
    int top;
    int[] arr;
    boolean loop = true;

    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        top = -1;
        arr = new int[maxSize - 1];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize -1;
    }
    public void push(int val) {
        if (isFull()){
            throw new RuntimeException("栈满了~~~");
        }
        top ++;
        arr[top] = val;
    }
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈是空的~~");
        }
        int x = arr[top];
        top --;
        return x;
    }
    public void show() {
        if (isEmpty()) {
            System.out.println("栈是空的~~");
            return;
        }
        for (int i = top; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }
    //比较优先级的大小
    public int priority(int y) {
        if (y =='*' || y == '/') {
            return 1;
        } else if (y == '+' || y== '-') {
            return 0;
        } else {
            return -1;
        }
    }
    //判断接收的是字符还是数字
    public boolean judge(int val) {
        return val =='*' ||val =='+'||val == '-'|| val =='/';
    }
    //进行计算
    public double cal(int num1,int num2,int y) {
        int res = 0;
        switch(y) {
            case '*':
                res = num1*num2;
                break;
            case'/':
                res = num2/num1; //注意运算顺序
                break;
            case'+':
                res = num1+num2;
                break;
            case'-':
                res = num2-num1;//注意运算顺序
                break;
        }
        return res;
    }
}
