package observer.example;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class BankAccount {
    private String name;
    private double amt;
    List<BankObserver> list = new ArrayList<BankObserver>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmt() {
        return amt;
    }

    public void add(BankObserver bankObserver){
        list.add(bankObserver);
    }

    public void remove(BankObserver bankObserver){
        list.remove(bankObserver);
    }

    public void notifyAmt(){
        for (int i =0; i < list.size();i++){
            BankObserver bankObserver = (BankObserver)list.get(i);
            bankObserver.update(amt);
        }

    }

    public void setAmt(double amt) {
        this.amt = amt;
        notifyAmt();
    }


}
