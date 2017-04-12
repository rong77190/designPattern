package algorithm;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/11/011.
 */
public class Horse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            double result = 0.0000;
            for (int i = 1; i <= n; i++){
                result += 1.0000/i;
            }
            String str = String.format("%.4f",result);
            System.out.println(str);
        }
    }
}
