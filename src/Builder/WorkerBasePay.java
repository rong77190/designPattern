package builder;

/**
 * 劳务工的薪资计算实现类
 */
public class WorkerBasePay implements BasePay{
    public String doBasePay(String name) {
        return name+"基本工资开始清算";
    }
}
