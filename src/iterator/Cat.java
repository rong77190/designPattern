package iterator;

/**
 * Created by Administrator on 2017/1/25/025.
 */
public class Cat {


    private int id;

    public Cat(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                '}';
    }
}
