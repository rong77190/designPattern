import java.util.Scanner;

/**
 * x：每天房租
 * f: 当前拥有水果个数
 * d: 当前拥有金钱
 * p: 每个水果单价
 * 输出:能够生活多少天  n
 */
public class A001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int x = in.nextInt();
            int f = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            int m = d + p * f;
            int n = 0;
            while (d >= (p+x) || (d >= x && f > 0) ){

                if(f > 0){
                    f--;
                    d -= x;
                    n++;
                }else {
                    d = d - x;
                    d = d - p;
                    n ++;
                }

            }
            System.out.println(n);

        }
    }
}