package iterator;


/**
 * Created by Administrator on 2017/1/25/025.
 */
public interface Collection {
    void add(Object o);
    int size();
    Iterator iterator();
}