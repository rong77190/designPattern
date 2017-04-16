package factory.simpleFactory;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class Factory1 implements Factory{


    public Product createFactory(String name) {
        if ("1".equals(name)){
            return new Product1();
        }else if ("2".equals(name)){
            return new Product2();
        }
        return null;
    }
}
