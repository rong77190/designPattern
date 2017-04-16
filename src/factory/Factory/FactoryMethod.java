package factory.Factory;

/**
 * 工厂方法模式，对比简单工厂模式，不实现具体的工厂实现类，而是将抽象的工厂类直接改为具体的类
 */
public class FactoryMethod {

    protected Product factoryMethod(int type){
        if (type == 1){
            return new Product1();
        }else if (type == 2){
            return new Product2();
        }else {
            return null;
        }
    }


    public void opration(int type){
        Product product = factoryMethod(type);
        product.operation();
    }
}
