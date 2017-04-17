package builder;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class ContractFactory  extends  Factory{
    protected BasePay getBasePay() {
        return new ContractBasePay();
    }

    protected Assurance getAssurance() {
        return new ContractAssurance();
    }

    protected Bonus getBonus() {
        return new ContractBonus();
    }

    protected Tax getTax() {
        return new ContractTax();
    }
}
