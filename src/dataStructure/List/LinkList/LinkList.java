package dataStructure.List.LinkList;

import dataStructure.List.List;
import dataStructure.List.OutOfBoundaryException;
import dataStructure.List.Strategy;
import dataStructure.SLNode;

/**
 * Created by Administrator on 2017/2/28/028.
 */
public class LinkList implements List {
    private Strategy strategy;
    private SLNode head;
    private int size;

    public LinkList(){

    }
    public LinkList(Strategy strategy){
        this.strategy= strategy;
        head = new SLNode();
        size = 0;
    }
    //获取前驱节点
    public SLNode getPreNode(Object e){
        SLNode p = head;
        while (p.getNext() != null){
            if (strategy.equal(p.getNext().getData(),e))return p;
            else p = p.getNext();

        }
        return null;
    }
    //获取序号i的前驱节点
    public SLNode getPreNode(int i){
        SLNode p = head;
        for (;i > 0;i--){
            p = p.getNext();
        }
        return p;
    }

    public SLNode getNode(int i){
        SLNode p = head.getNext();
        for (;i > 0;i --){
            p= p.getNext();
        }
        return p;
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }


    public boolean contain(Object object) {
        SLNode p = head.getNext();
        while (p != null){
            if (strategy.equal(p.getNext().getData(),object)){
                return true;
            }else {
                p = p.getNext();
            }
        }
        return false;
    }

    public int indexOf(Object e) {
        SLNode p = head.getNext();
        int index = 0;
        while (p != null){
            if (strategy.equal(p.getNext().getData(),e)){
                return index;
            }else {
                index++;
                p = p.getNext();
            }
        }
        return -1;
    }

    public void insert(int i, Object e) throws OutOfBoundaryException {
        if (i<0||i>size)
            throw new OutOfBoundaryException("错误，指定的插入序号越界。");
        SLNode p = getPreNode(i);
        SLNode q = new SLNode(e,p.getNext());
        p.setNext(q);
        size++;
        return;
    }

    public boolean insertBefore(Object obj, Object e) {
        SLNode p = getPreNode(obj);
        if (p != null){
            SLNode q = new SLNode(e,p.getNext());
            p.setNext(q);
            size++;
            return true;
        }
        return false;
    }

    public boolean insertAfter(Object obj, Object e) {
        SLNode p = head.getNext();
        while (p != null){
            if (strategy.equal(p.getNext().getData(),e)){
                SLNode q = new SLNode(e,p.getNext());
                p.setNext(q);
                size++;
                return true;

            }
        }
        return false;
    }
    //删除线性表序号i的元素并返回
    public Object remove(int i) throws OutOfBoundaryException {
        if (i<0||i>size)
            throw new OutOfBoundaryException("错误，指定的删除序号越界。");
        SLNode p = getPreNode(i);
        Object object = p.getNext().getData();
        p.setNext(p.getNext().getNext());
        size--;
        return object;
    }

    public boolean remove(Object e) {
        SLNode p = getPreNode(e);
        if (p != null){
            p.setNext(p.getNext().getNext());
            size--;
            return true;
        }
        return false;
    }

    public Object replace(int i, Object e) throws OutOfBoundaryException {
        if (i<0||i>size)
            throw new OutOfBoundaryException("错误，指定的插入序号越界。");
        SLNode p = getNode(i);
        Object o = p.getData();
        p.setData(e);
        return o;
    }

    public Object get(int i) throws OutOfBoundaryException {
        if (i<0||i>size)
            throw new OutOfBoundaryException("错误，指定的插入序号越界。");
        SLNode p = getNode(i);
        return p.getData();
    }
}
