package r163;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/25/025.
 */
public class Main3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int x = in.nextInt();
            int len = n * 5 + 1;
            int arr[] = new int[len];
            fun(n, arr);
            int allcount = 0;
            int weNeedCount = 0;
            for (int i = 0; i < len; i++) {
                allcount += arr[i];
                System.out.println((n+i)+","+arr[i]);
                if (n+i >= x) {
                    weNeedCount += arr[i];
                }
            }
            int b = zuixiaogongbeishu(allcount,weNeedCount);
            System.out.println(weNeedCount+"/"+allcount);
            System.out.println(b);
            System.out.println(weNeedCount/b+"/"+allcount/b);
        }
    }

    public static int zuixiaogongbeishu(int a ,int b) {
        int m = a % b;
        while (m != 0){
            a = b;
            b = m;
            m = a % b;
        }
        return b;
    }


    public static int fun(int n, int[] arr) {
        if (n < 1)
            return -1;
        arr[0] = arr[1] = arr[2] = arr[3] = arr[4] = arr[5] = 1;
        if (n == 1) return 0;
        for (int i = 2; i <= n; ++i) {
            for (int sum = 6 * i; sum >= i; --sum) {
                int a1 = ((sum - 1 - (i - 1)) >= 0 ? arr[sum - 1 - (i - 1)] : 0);
                int a2 = (sum - 2 - (i - 1) >= 0 ? arr[sum - 2 - (i - 1)] : 0);
                int a3 = (sum - 3 - (i - 1) >= 0 ? arr[sum - 3 - (i - 1)] : 0);
                int a4 = (sum - 4 - (i - 1) >= 0 ? arr[sum - 4 - (i - 1)] : 0);
                int a5 = (sum - 5 - (i - 1) >= 0 ? arr[sum - 5 - (i - 1)] : 0);
                int a6 = (sum - 6 - (i - 1) >= 0 ? arr[sum - 6 - (i - 1)] : 0);
                arr[sum - i] = a1 + a2 + a3 + a4 + a5 + a6;
            }
        }
        return 0;
    }
}
