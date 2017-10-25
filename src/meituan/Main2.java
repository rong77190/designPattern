package meituan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/11/011.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[m];
            for (int i = 0 ; i < m ; i++){
                arr[i] = in.nextInt();
            }
            fun(n,arr);
        }
    }
    public static void fun(int n ,int[] arr){
        String[] narr = new String[n];
        for (int i = 0 ; i < n;i++) {
            narr[i] = (i+1)+"";
        }


        List<String> list = new LinkedList<String>(Arrays.asList(narr));
        for (int i = 0;i < arr.length;i++) {
            list.remove(arr[i]+"");
        }
//        Integer[] integers = (Integer[]) list.toArray();
        for (int i = arr.length - 1;i >= 0;i--){
            System.out.println(arr[i]);
        }
        for (String i : list) {
            System.out.println(i);
        }
    }
}
