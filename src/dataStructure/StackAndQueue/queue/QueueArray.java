package dataStructure.StackAndQueue.queue;

/**
 * Created by Administrator on 2017/3/5/005.
 */
public class QueueArray {

    private static  final int CAP = 8;
    private  Object[] elements;
    private int capacity;
    private int front;
    private int rear;
    public QueueArray() {
        this(CAP);
    }
    public QueueArray(int cap){
        capacity = cap + 1;
        elements = new Object[capacity];
        front = rear = 0;
    }
//返回队列的大小
    public int getSize() {
        return (rear -front+ capacity)%capacity;
    }
    //判断队列是否为空
    public boolean isEmpty() {
        return front==rear;
    }
    //数据元素 e 入队
    public void enqueue(Object e) {
        if (getSize()==capacity-1) expandSpace();
        elements[rear] = e;
        rear = (rear+1)%capacity;
    }
    private void expandSpace(){
        Object[] a = new Object[elements.length*2];
        int i = front;  int j = 0;
        while (i!=rear){ //将从 front 开始到 rear 前一个存储单元的元素复制到新数组
            a[j++] = elements[i];
            i = (i+1)%capacity;
        }
        elements = a;
        capacity = elements.length;
        front = 0; rear = j; //设置新的队首、队尾指针
    }
    //队首元素出队
    public Object dequeue() throws QueueEmptyException {
        if (isEmpty())
            throw new QueueEmptyException("错误：队列为空");
        Object obj = elements[front];
        elements[front] = null;
        front = (front+1)%capacity;
        return obj;
    }
    //取队首元素
    public Object peek() throws QueueEmptyException {
        if (isEmpty())
            throw new QueueEmptyException("错误：队列为空");
        return elements[front];
    }
}
