package DataStructure.Stack;

public class ArrayStack {
    int maxSize;
    int top;
    int[] arr;

    //构造方法，初始化值
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        top = -1;
        arr = new int[maxSize];
    }
    //判断栈的情况--栈满--栈空
    //判断栈满
    public boolean isFull() {
        return top == maxSize -1;
    }
    //判断栈空
    public boolean isEmpty() {
        return top == -1;
    }
    //入栈
    public void push(int val) {
        if (isFull()) {
            System.out.println("栈满了。");
            return;
        }
        top ++;
        arr[top] = val;
    }
    //出栈
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈是空的");
        }
        int x = arr[top];
        top --;
        return x;
    }
    //遍历栈，显示栈中的数据
    public void show() {
        if (isEmpty()) {
            System.out.println("栈是空的");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }


}
