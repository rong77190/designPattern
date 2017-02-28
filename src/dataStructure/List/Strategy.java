package dataStructure.List;

/**
 * Created by Administrator on 2017/2/28/028.
 */
public interface Strategy {

    //判断是否相等
    public boolean equal(Object obj1, Object obj2);
    /***
     * 比较两个元素的大小
     * obj1 < obj2 return -1;
     * obj1 = obj2 return 0;
     * obj1 > obj2 return 1;
     */
    public int compareTo(Object obj1,Object obj2);
}

