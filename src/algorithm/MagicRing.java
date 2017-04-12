package algorithm;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/12/012.
 */
public class MagicRing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i =0; i < n; i++){
                a[i] = scan.nextInt();
            }
            int[] array = core(a,k);
            for (int i =0; i < array.length;i++){
                System.out.print(array[i]+" ");
            }
        }
    }


    public static int[] core(int[] a,int k){
        int[] b = new int[a.length];
        while (k > 0){
            for (int i = 0; i < a.length;i++){
                b[i] = a[i]+a[((i+1)%(a.length))];
            }
            k--;
            for (int j = 0;j < a.length;j++){
                a[j] = b[j]%100;
            }
        }
        return a;
    }
}
