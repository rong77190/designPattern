package adapter;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class Adapter {

    public void Request(){}
    private  Adaptee adaptee;
    public void Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

}
