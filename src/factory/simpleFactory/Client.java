package factory.simpleFactory;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory1();
        Product p = factory.createFactory("1");
        p.operation();

    }


}
