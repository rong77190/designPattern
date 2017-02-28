package dataStructure.List;

/**
 * Created by Administrator on 2017/2/28/028.
 * 顺序表
 */

public class ListArray implements List {
    private  final int LEN = 8;
    private Strategy strategy;
    private  int size;
    private Object[] elements;
    //构造方法
    public ListArray(){
    }

    public ListArray(Strategy strategy){
        this.strategy = strategy;
        size = 0;
        elements = new Object[LEN];
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contain(Object object) {
        for (int i = 0; i < size; i++){
            if (strategy.equal(object,elements[i])){
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < size; i ++){
            if (e.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    public void insert(int i, Object e) throws OutOfBoundaryException {
        if (i < 0 || i >= size){
            throw new OutOfBoundaryException("错误，制定的序号有错误");
        }
        if (size >= elements.length)
            expandSpace();
        for (int j = size; j > i;j --){
            elements[j] = elements[j-1];
            elements[i] = e;
            size++;
            return;
        }
    }

    private void expandSpace() {
        Object[] objects = new Object[elements.length*2];
        for (int i = 0;i < elements.length; i++) {
            objects[i] = elements[i];
        }
        elements = objects;
    }

    public boolean insertBefore(Object obj, Object e) {
        int i = indexOf(obj);
        if (i < 0)
            return false;
        else
            insert(i,e);
        return false;
    }

    public boolean insertAfter(Object obj, Object e) {
        int i = indexOf(obj);
        if (i < 0){
            return false;
        }else {
            insert(i+1,e);
        }
        return false;
    }

    public Object remove(int i) throws OutOfBoundaryException {
        if (i < 0 || i >= size){
            throw new OutOfBoundaryException("错误，指定的删除序号有错误");
        }
        Object o = elements[i];
        for (int j = i; j < size-1; j ++){
            elements[j] = elements[j+1];
        }
        elements[--size] = null;
        return o;
    }

    public boolean remove(Object e) {
        int i = indexOf(e);
        if (i < 0){
            return false;
        }else {
            remove(i);
        }
        return false;
    }

    public Object replace(int i, Object e) throws OutOfBoundaryException {
        if (i < 0 || i >= size){
            throw new OutOfBoundaryException("错误，指定的序号有错误");
        }
        Object o = elements[i];
        elements[i] = e;
        return o;
    }

    public Object get(int i) throws OutOfBoundaryException {
        if (i < 0 || i >= size){
            throw new OutOfBoundaryException("错误，指定的序号越界");
        }
        return elements[i];
    }
}
