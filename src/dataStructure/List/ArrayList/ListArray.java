package dataStructure.List.ArrayList;

import dataStructure.List.*;

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
        size =  0;
        elements = new Object[LEN];
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
        if (i < 0 || i > size){
            throw new OutOfBoundaryException("错误，制定的序号有错误");
        }
        if (size >= elements.length)
            expandSpace();
        for (int j = size; j > i;j --){
            elements[j] = elements[j-1];

        }
        elements[i] = e;
        size =size+1;
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
            return true;
    }

    public boolean insertAfter(Object obj, Object e) {
        int i = indexOf(obj);
        if (i < 0){
            return false;
        }else {
            insert(i+1,e);
            return true;
        }
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
            return true;
        }
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

    public  static  void main(String []args){
        Student[] student ={new Student(1,"zhangsan",11),new Student(2,"lisi",13),new Student(3,"wangwu",12)};
        Strategy strategy = new StudentStrategy();
        ListArray listArray = new ListArray(strategy);
        for (int i = 0; i < student.length; i++){
            listArray.insert(i,student[i]);
        }
        System.out.println("顺序表的大小:"+listArray.getSize());

        System.out.println("顺序表第一个元素："+listArray.get(0));

        System.out.println("张三在哪个位置："+listArray.indexOf(student[0]));

        Student newStudent = new Student(4,"zhaoliu",19);
        Student newStudent2 = new Student(5,"qianba",14);
        System.out.println("后插入成功？"+listArray.insertAfter(student[0],newStudent));
        System.out.println("前插入成功？"+listArray.insertBefore(student[0],newStudent2));

        System.out.println("是否为空："+listArray.isEmpty());

        System.out.println("现在的长度"+listArray.getSize());

        System.out.println("删除第0个并且打印"+listArray.remove(0));

        System.out.println("删除成功？"+listArray.remove(newStudent));

        System.out.println("是否包含zhaoliu? "+listArray.contain(newStudent));

        System.out.println("是否包含zhangsan? "+listArray.contain(student[0]));




    }
}
