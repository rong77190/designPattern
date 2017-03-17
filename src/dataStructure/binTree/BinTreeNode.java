package dataStructure.binTree;

import dataStructure.List.LinkList.LinkedList;
import dataStructure.List.LinkList.LinkedListDLNode;
import dataStructure.Node;
import dataStructure.StackAndQueue.stack.StackSLinked;
import jdk.nashorn.internal.ir.BinaryNode;

import java.util.Stack;

/**
 * Created by Administrator on 2017/3/15/015.
 */
public class BinTreeNode  implements Node {

    private Object data;
    private BinTreeNode lChild;
    private BinTreeNode rChild;
    private BinTreeNode parent;
    private int height;
    private int size;

    public BinTreeNode(){
        this(null);
    }

    public BinTreeNode(Object o){
        data = o ;
        height = 0;
        size = 0;
        parent = lChild = rChild = null;
    }

    /******Node 接口方法******/
    public Object getData() { return data; }
    public void setData(Object obj) { data = obj;}
    /******辅助方法,判断当前结点位置情况******/
//判断是否有父亲
    public boolean hasParent(){ return parent!=null;}
    //判断是否有左孩子
    public boolean hasLChild(){ return lChild!=null;}
    //判断是否有右孩子
    public boolean hasRChild(){ return rChild!=null;}
    //判断是否为叶子结点
    public boolean isLeaf(){ return !hasLChild()&&!hasRChild();}
    //判断是否为某结点的左孩子
    public boolean isLChild(){ return (hasParent()&&this==parent.lChild);}
    //判断是否为某结点的右孩子
    public boolean isRChild(){ return (hasParent()&&this==parent.rChild);}
    /******与 height 相关的方法******/
    //取结点的高度,即以该结点为根的树的高度
    public int getHeight() { return height; }
    //更新当前结点及其祖先的高度
    public void updateHeight(){
        int newH = 0;//新高度初始化为 0,高度等于左右子树高度加 1 中的大者
        if (hasLChild()) newH = Math.max(newH,1+getLChild().getHeight());
        if (hasRChild()) newH = Math.max(newH,1+getRChild().getHeight());
        if (newH==height) return;  //高度没有发生变化则直接返回
        height = newH;  //否则更新高度
        if (hasParent()) getParent().updateHeight(); //递归更新祖先的高度
    }
    /******与 size 相关的方法******/
    //取以该结点为根的树的结点数
    public int getSize() { return size; }
    //更新当前结点及其祖先的子孙数
    public void updateSize(){
        size = 1; //初始化为 1,结点本身
        if (hasLChild()) size += getLChild().getSize();  //加上左子树规模
        if (hasRChild()) size += getRChild().getSize();  //加上右子树规模
        if (hasParent()) getParent().updateSize();  //递归更新祖先的规模
    }
    /******与 parent 相关的方法******/
//取父结点
    public BinTreeNode getParent() { return parent; }
    //断开与父亲的关系
    public void sever(){
        if (!hasParent()) return;
        if (isLChild()) parent.lChild = null;
        else parent.rChild = null;
        parent.updateHeight(); //更新父结点及其祖先高度
        parent.updateSize();  //更新父结点及其祖先规模
        parent = null;
    }
    /******与 lChild 相关的方法******/
    //取左孩子
    public BinTreeNode getLChild() { return lChild; }
    //设置当前结点的左孩子,返回原左孩子
    public BinTreeNode setLChild(BinTreeNode lc){
        BinTreeNode oldLC = this.lChild;
        if (hasLChild()) { lChild.sever();} //断开当前左孩子与结点的关系
        if (lc!=null){
            lc.sever();  //断开 lc 与其父结点的关系
            this.lChild = lc;  //确定父子关系
            lc.parent = this;
            this.updateHeight();  //更新当前结点及其祖先高度
            this.updateSize(); //更新当前结点及其祖先规模
        }
        return oldLC; //返回原左孩子
    }
    /******与 rChild 相关的方法******/
    //取右孩子
    public BinTreeNode getRChild() { return rChild; }
    //设置当前结点的右孩子,返回原右孩子
    public BinTreeNode setRChild(BinTreeNode rc){
        BinTreeNode oldRC = this.rChild;
        if (hasRChild()) { rChild.sever();} //断开当前右孩子与结点的关系
        if (rc!=null){
            rc.sever();  //断开 lc 与其父结点的关系
            this.rChild = rc;  //确定父子关系
            rc.parent = this;
            this.updateHeight();  //更新当前结点及其祖先高度
            this.updateSize(); //更新当前结点及其祖先规模
        }
        return oldRC; //返回原右孩子
    }


//    //先序遍历二叉树
//    public  Iterable preOrder(){
//        LinkedList linkedList  = new LinkedListDLNode();
//        preOrderRecursion(this.root,linkedList);
//    }

//    private void preOrderReverse(BinTreeNode binTreeNode,LinkedList linkedList){
//        if (binTreeNode == null)return;
//        BinaryNode p = binTreeNode;
//        Stack stack = new StackSLinked();
//        while (p != null)
//    }
}
