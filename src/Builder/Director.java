package builder;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class Director {

    
    private Factory factory;

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    /**
     * 薪资计算过程
     */
    public String doSalary(String name){
        BasePay basePay = factory.getBasePay();
        Assurance assurance = factory.getAssurance();
        Bonus bonus = factory.getBonus();
        Tax tax = factory.getTax();
        return basePay.doBasePay(name)+"---"+
                assurance.doAssurance(name)+"---"+
                bonus.doBonus(name)+"---"+
                tax.doTax(name);
    }

}
