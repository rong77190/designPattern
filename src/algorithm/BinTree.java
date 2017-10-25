package algorithm;

import java.util.Scanner;

/**
 *
 *
 * 题目描述
 输入一系列整数，建立二叉排序数，并进行前序，中序，后序遍历。
 输入描述:
 输入第一行包括一个整数n(1<=n<=100)。
 接下来的一行包括n个整数。


 输出描述:
 可能有多组测试数据，对于每组数据，将题目所给数据建立一个二叉排序树，并对二叉排序树进行前序、中序和后序遍历。
 每种遍历结果输出一行。每行最后一个数据之后有一个空格。

 输入中可能有重复元素，但是输出的二叉树遍历序列中重复元素不用输出。

 输入例子:
 5
 1 6 5 9 8

 输出例子:
 1 6 5 9 8
 1 5 6 8 9
 5 8 9 6 1
 */
public class BinTree  {


    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            Tree[] t =  new Tree[n];
            for (int i =0; i < n;i++){
                t[i] = new Tree();
                t[i].setData(scanner.nextInt());
            }
            for (int i =0; i < n;i++){
                insert(t[i],t[0]);
            }

            pre(t[0]);
            System.out.println();
            mid(t[0]);
            System.out.println();
            post(t[0]);
            System.out.println();
        }


    }
    public static  void insert(Tree t1,Tree t2){
        if (t1.getData() > t2.getData()){
            if (t2.getRight() == null){
                t2.setRight(t1);
            }else {
                insert(t1,t2.getRight());
            }
        }else if (t1.getData() < t2.getData()){
            if (t2.getLeft() == null){
                t2.setLeft(t1);
            }else {
                insert(t1,t2.getLeft());
            }
        }
    }

    public static void pre(Tree t){
        System.out.print(t.getData()+" ");
        if (t.getLeft() != null){
            pre(t.getLeft());
        }
        if (t.getRight() != null){
            pre(t.getRight());
        }
    }

    public static void mid(Tree t){
        if (t.getLeft() != null){
            mid(t.getLeft());
        }
        System.out.print(t.getData()+" ");
        if (t.getRight() != null){
            mid(t.getRight());
        }
    }


    public static void post (Tree t){

        if (t.getLeft() != null){
            post(t.getLeft());
        }
        if (t.getRight() != null){
            post(t.getRight());
        }
        System.out.print(t.getData()+" ");
    }
}

class Tree {
    private int data;
    private Tree left;
    private Tree right;
    public Tree(){
        data = 0;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}