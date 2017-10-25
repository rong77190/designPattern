package prototype;


/**
 * Created by Administrator on 2017/4/16/016.
 */
public class Product implements Cloneable{

    private double num;
    private double rebate;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getRebate() {
        return rebate;
    }

    public void setRebate(double rebate) {
        this.rebate = rebate;
    }

    public Object clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        return object;

    }

    @Override
    public String toString() {
        return "Product{" +
                "num=" + num +
                ", rebate=" + rebate +
                ", price=" + price +
                '}';
    }
}
