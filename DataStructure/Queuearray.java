package DataStructure;

public class Queuearray {
    //最大数组长度
    private int maxSize;
    //创建队列数组
    private int[] arr;
    //指向队列头
    private int front;
    //指向队列尾
    private int rear;

    public Queuearray(int x) {
        maxSize = x;
        front = 0;
        rear = 0;
        arr = new int[maxSize];
    }
    //判断队列是否为满
    public boolean isFill() {
        return rear == maxSize;
    }
    //判断队列是否为null
    public boolean isNull() {
        return rear == front;
    }
    //添加数据到队列
    public void addQueue(int val) {
        if (isNull()) {
            arr[0] = val;
            rear ++;
            return;
        } else if (isFill()) {
            System.out.println("队列已满！");
            return;
        } else {
            arr[rear] = val;
            rear ++;
        }
    }
    //从队列中取出数据
    public int getQueue() {
        if (isNull()) {
            System.out.println("队列为空！");
            return -1;
        }
        int x;
        x = arr[front];
        front ++;
        return  x;
    }
    //显示所有数据
    public void showQueue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    //显示队列头数据
    public int getFront() {
        if (isNull()) {
            System.out.println("队列为空！");
        }
        return arr[front];
    }
}
