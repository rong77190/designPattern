package builder;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class WorkerFactory extends  Factory{
    protected BasePay getBasePay() {
        return new WorkerBasePay();
    }

    protected Assurance getAssurance() {
        return new WorkerAssurance();
    }

    protected Bonus getBonus() {
        return new WorkerBonus();
    }

    protected Tax getTax() {
        return new WorkerTax();
    }
}
