package iterator;

/**
 * Created by Administrator on 2017/1/25/025.
 */
public class Test1 {

    public static void main(String[] args) {
        Collection collection = new ArrayList();
        for (int i = 0; i < 15 ; i++){
            collection.add(new Cat(i));
        }
        System.out.println(collection.size());

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object o  =iterator.next();
            System.out.println(o+"");
        }

        LinkList linkList = new LinkList();
        for (int i = 0; i < 15 ; i++){
            linkList.add(new Cat(i));
        }
        System.out.println(linkList.size);
    }

}
