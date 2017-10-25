package observer.example;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class CustomerBank2 implements  BankObserver{

    private  String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void update(double amt){
        System.out.println("账户余额发生变动，发送短信到"+phone+",变动后余额为："+amt);
    }
}
