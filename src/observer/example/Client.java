package observer.example;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class Client {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        CustomerBank1 customerBank1 = new CustomerBank1();
        customerBank1.setEmail("18826077190@r163.com");
        CustomerBank2 customerBank2 = new CustomerBank2();
        customerBank2.setPhone("18826077190");
        CustomerBank3 customerBank3 = new CustomerBank3();
        customerBank3.setQq("1234567890");
        bankAccount.add(customerBank1);
        bankAccount.add(customerBank2);
        bankAccount.add(customerBank3);
        bankAccount.setAmt(1000);

    }
}
