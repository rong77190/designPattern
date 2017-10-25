package observer.example;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class CustomerBank3 implements  BankObserver{
    private String qq;

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void update(double amt) {
        System.out.println("账户余额发生变动，发送qq到"+qq+",变动后余额为："+amt);
    }
}
