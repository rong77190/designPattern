package algorithm;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/12/012.
 */
public class BG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int b = 0;
        int g = 0;
        int bsum = 0;
        int gsum = 0;
        for (int i =0; i < s.length();i++){
            if (s.charAt(i)=='G'){
                gsum += (i-g);
                g++;
                System.out.println(gsum);
            }else if (s.charAt(i)=='B'){
                bsum += (i-b);
                b++;
                System.out.println(bsum);
            }
        }

        System.out.println(Math.min(gsum,bsum));
    }
}
