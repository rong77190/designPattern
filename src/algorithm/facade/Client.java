package algorithm.facade;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class Client {

    public static void main(String[] args) {
        ComputerSalary computerSalary =  new ComputerSalary();
        System.out.println("1000本月工资是"+computerSalary.doSalary("1000"));
    }
}
