package factory.Factory;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class Client {


    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();

        Product product = factoryMethod.factoryMethod(1);

        product.operation();
    }
}
