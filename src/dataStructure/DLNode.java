package dataStructure;

/**
 * Created by Administrator on 2017/2/28/028.
 */
public class DLNode implements Node{
    private Object element;
    private DLNode next;
    private DLNode pre;

    public DLNode(){}
    public DLNode(Object element,DLNode pre,DLNode next){

    }
    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public DLNode getPre() {
        return pre;
    }

    public void setPre(DLNode pre) {
        this.pre = pre;
    }

    public Object getData() {
        return element;
    }

    public void setData(Object data) {
        this.element = data;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }
}
