package dataStructure.List.LinkList;

import dataStructure.List.*;
import dataStructure.SLNode;

/**
 * Created by Administrator on 2017/2/28/028.
 */
public class LinkList implements List {
    private Strategy strategy;
    private SLNode head;
    private int size;

    public LinkList(){
        head = new SLNode();
        size = 0;
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
            if (strategy.equal(p.getData(),e)){
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

    public static void main(String []args){
        Strategy strategy = new StudentStrategy();
        Student[] student ={new Student(1,"zhangsan",11),new Student(2,"lisi",13),new Student(3,"wangwu",12)};
        LinkList linkList = new LinkList(strategy);

        for (int i = 0; i < student.length ; i ++){
            linkList.insert(i,student[i]);
        }


        System.out.println("链表的大小:"+linkList.getSize());

        System.out.println("链表第一个元素："+linkList.get(0));

        System.out.println("张三在哪个位置："+linkList.indexOf(student[0]));
        System.out.println("sdfasdfasfdsdsfds");
        Student newStudent = new Student(4,"zhaoliu",19);
        Student newStudent2 = new Student(5,"qianba",14);

        System.out.println("后插入成功？"+linkList.insertAfter(student[0],newStudent));
        System.out.println("前插入成功？"+linkList.insertBefore(student[0],newStudent2));
        System.out.println("afsdfad");
        System.out.println("是否为空："+linkList.isEmpty());

        System.out.println("现在的长度"+linkList.getSize());

        System.out.println("删除第0个并且打印"+linkList.remove(0));

        System.out.println("删除成功？"+linkList.remove(newStudent));

        System.out.println("是否包含zhaoliu? "+linkList.contain(newStudent));

        System.out.println("是否包含zhangsan? "+linkList.contain(student[0]));






    }
}
