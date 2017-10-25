package factory.abstractFactory;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class ConcreteFactory implements AbstractFactory {


    public AbstractProduct createAbstractProductA() {
        return new ProductA();
    }
}
