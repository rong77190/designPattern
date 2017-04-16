package factory.simpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class SpringTest {

    public Product getProduct(){
        Product product = null;
        try {
            Properties p = new Properties();
            InputStream in = null;

            try {
                in = Factory1.class.getResourceAsStream("class.properties");
                p.load(in);
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            product = (Product)Class.forName(p.getProperty("class")).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }
}
