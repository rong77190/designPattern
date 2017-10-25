package observer.example;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class CustomerBank1 implements BankObserver {

    private String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void update(double amt){
        System.out.println("账户金额发生变动，发送邮件到"+email+",变动后金额为："+amt);
    }
}
