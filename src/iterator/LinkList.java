package iterator;

/**
 * Created by Administrator on 2017/1/25/025.
 */
public class LinkList implements Collection{

    Node head = null;
    Node tail = null;
    int size = 0;
    public void add(Object o){
        Node node = new Node(o,null);
        if (head == null){
            head = node;
            tail = node;
        }
        tail.setNext(node);
        tail = node;
        size++;
    }
    public int size(){
        return size;
    }

    public Iterator iterator() {
        return null;
    }

//    private class LinkListIterator implements Iterator {
//
////        int
//        @Override
//        public Object next() {
//            return this.next();
//        }
//
//        @Override
//        public boolean hasNext() {
//            if ()
//            return false;
//        }
//    }
}
