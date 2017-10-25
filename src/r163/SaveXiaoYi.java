package r163;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 */
public class SaveXiaoYi {

    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            int n = in.nextInt();

            int[] xarr = new int[n];
            int[] yarr = new int[n];

            for (int i = 0; i < n;i++) {
                xarr[i] = in.nextInt();
            }
            for (int i = 0;i < n;i++)
                yarr[i] = in.nextInt();


            int sum = Integer.MAX_VALUE;

            for (int i = 0;i < n;i++) {

                sum = Math.min(sum,xarr[i] + yarr[i]);

            }

            System.out.println(sum - 2);

        }



    }
}
