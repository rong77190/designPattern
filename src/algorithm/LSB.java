package algorithm;

/**
 * Created by Administrator on 2017/4/24/024.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class LSB {
        public static void main(String[] args) {
            LSB  l  = new LSB();
            int[] a =  {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
            l.heapSort(a);
            for (int i:a){
                System.out.print(i+" ");
            }

                Scanner in = new Scanner(System.in);
                while (in.hasNext()) {
                        int size = in.nextInt();
                        for (int i = 0; i < size; i++) {
                                int len = in.nextInt();
                                int[] data = new int[len];
                                for (int j = 0; j < len; j++) {
                                        data[j] = in.nextInt();
                                    }
                                getMaxIncrementSequence(data, len);
                            }
                    }
                in.close();
            }

                public static void getMaxIncrementSequence(int[] data, int len) {
                int[] dp = new int[len];
                dp[0] = 1;
                int max = 1;
                List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
                int index = -1, k = 0;
                ArrayList<Integer> tem = new ArrayList<Integer>();
                tem.add(data[0]);
                res.add(tem);
                for (int i = 1; i < len; i++) {
                        index = -1;
                        tem = new ArrayList<Integer>();
                        for (int j = 0; j < i; j++) {
                                if (data[i] > data[j] && dp[j] > dp[i]) {
                                        dp[i] = dp[j];
                                        index = j;
                                    }
                            }
                        ++dp[i];
                        if (index > -1) {
                                tem.addAll(res.get(index));
                            }
                        tem.add(data[i]);
                        res.add(tem);
                        if (dp[i] > max) {
                                max = dp[i];
                                k = i;
                            }
                    }
                tem = res.get(k);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < tem.size() - 1; i++) {
                        sb.append(tem.get(i));
                        sb.append(" ");
                    }
                sb.append(tem.get(tem.size() - 1));
                System.out.println(sb.toString());
                }



    public void heapAdjust(int[] a,int low ,int high ){
        int temp = a[low];
        for (int i = 2 * low;i <= high;i=i * 2){
            if (i < high && a[i] <= a[i+1]){
                i++;
            }
            if (a[i] <= temp){
                break;
            }
            a[low] = a[i];
            low = i;
        }
        a[low] =  temp;
    }

    public void heapSort(int[] a){
        int n = a.length - 1;
        for (int i = a.length/2-1 ; i >= 0; i--){
            heapAdjust(a,i,n);
        }
        for (int i = n;i > 1;--i){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapAdjust(a,0,i-1);
        }
    }
}
