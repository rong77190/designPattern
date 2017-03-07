package dataStructure.StackAndQueue.queue;

/**
 * Created by Administrator on 2017/3/5/005.
 */
public interface Queue {

    public int getSize();
    public boolean isEmpty();
    public void enQueue(Object e);
    public Object deQueue();
    public Object peek()throws QueueEmptyException;
}
