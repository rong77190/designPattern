package dataStructure;

/**
 * Created by Administrator on 2017/2/28/028.
 */
public class SLNode implements Node{
    private Object element;
    private SLNode next;

    public SLNode(){
        this(null,null);
    }
    public SLNode(Object o,SLNode next){
        this.element = o;
        this.next = next;
    }


    public Object getData() {
        return element;
    }

    public void setData(Object data) {
        this.element = data;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }
}
