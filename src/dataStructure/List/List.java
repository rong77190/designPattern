package dataStructure.List;

/**
 * Created by Administrator on 2017/2/28/028.
 * 线性表
 */
public interface List{
    //线性表的大小
    public int getSize();
    //是否为空
    public boolean isEmpty();
    //是否包含数据元素object
    public boolean contain(Object object);
    //查看序号
    public int indexOf(Object e);
    //插入元素e到i位置
    public void insert(int i,Object e)throws OutOfBoundaryException;
    //将数据元素 e 插入到元素 obj 之前
    public boolean insertBefore(Object obj,Object e);
    //将数据元素 e 插入到元素 obj 之后
    public boolean insertAfter(Object obj,Object e);
    //删除线性表中序号为 i 的元素,并返回之
    public Object remove(int i) throws OutOfBoundaryException;
    //删除线性表中第一个与 e 相同的元素
    public boolean remove(Object e);
    //替换线性表中序号为 i 的数据元素为 e，返回原数据元素
    public Object replace(int i, Object e) throws OutOfBoundaryException;
    //返回线性表中序号为 i 的数据元素
    public Object get(int i) throws OutOfBoundaryException;
    



}
