package prototype;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class Client {
    public static void main(String[] args) {
        Product product = new Product();

        product.setNum(1.1);
        product.setPrice(9.99);
        product.setRebate(8.8);
        System.out.println("原来的对象："+product.toString());
        Product newProduct = product;
        newProduct.setNum(2.2);
        newProduct.setPrice(10.01);

        System.out.println("新对象："+newProduct.toString());
    }

}
