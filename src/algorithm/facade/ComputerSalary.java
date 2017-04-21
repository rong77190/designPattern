package algorithm.facade;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class ComputerSalary {
    public double doSalary(String empno){
        Salary salary = new Salary();
        Holiday holiday = new Holiday();
        Tax tax = new Tax();
        double money = salary.getSalary("1000") * holiday.getHoliday("1000") / 30 - tax.getTax("1000");
        return money;
    }


}
