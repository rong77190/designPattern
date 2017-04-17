package builder;

/**
 * 合同工的薪资计算实现类
 */
public class ContractBasePay  implements BasePay{
    public String doBasePay(String name) {
        return name+"基本工资开始清算";
    }
}
