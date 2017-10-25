package algorithm;

import java.text.DecimalFormat;

/**
 * 小数点保留问题
 */
public class DecimalFormatTest {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        double a= 123456789.2456788;
        System.out.println(decimalFormat.format(a));
    }

}
