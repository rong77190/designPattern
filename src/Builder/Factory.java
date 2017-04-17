package builder;

/**
 * 抽象工厂类
 */
public abstract class Factory {
    protected abstract BasePay getBasePay();
    protected abstract Assurance getAssurance();
    protected abstract Bonus getBonus();
    protected abstract Tax getTax();




}
