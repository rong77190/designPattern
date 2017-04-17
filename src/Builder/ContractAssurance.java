package builder;

/**
 * 合同工的保险计算实现类
 */
public class ContractAssurance implements Assurance {
    public String doAssurance(String name) {
        return name+"保险开始计算";
    }
}
