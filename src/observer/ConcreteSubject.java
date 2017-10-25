package observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class ConcreteSubject implements Subject{

    private Vector observersVector = new Vector();
    public void attach(Observer observer) {
        observersVector.addElement(observer);
    }

    public void detach(Observer observer) {
        observersVector.removeElement(observer);
    }

    public void Notify() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()){
            ((Observer)enumeration.nextElement()).update();
        }
    }

    public Enumeration observers(){
        return ((Vector) observersVector.clone()).elements();
    }

}
