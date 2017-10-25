package meituan;

import com.sun.jmx.remote.internal.ArrayQueue;
import dataStructure.List.LinkList.LinkList;

import java.util.*;

/**
 *对于一个十进制数而言，它的数位和等于将它各位数字相加得到的和。
 * 比如 231 的数位和是 6，3179 的数位和是 20。现在你知道某个十进制数的数位和等于 s，
 * 并且这个数不包含 0，
 * 且任意相邻的数位是不同的，比如 112 或者 102 都是不满足条件的。现在你想知道满足这样的条件的最大的数是多少？
 */
public class Main {
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


        int[] narr = new int[n];
        for (int i = 0 ; i < n;i++) {
            narr[i] = (i+1);
        }
        Queue<Integer> queue =new ArrayDeque<Integer>();
        for (int i =arr.length - 1; i >= 0;i--) {
            if (!queue.contains(arr[i])) {
                queue.add(arr[i]);
            }
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());

        }
        for (int i = arr.length -1; i >= 0;i--) {

        }

        for (int i = 0; i < narr.length;i ++) {
            boolean flag = false;
            for (int j = 0; j < arr.length;j++){
                if (narr[i] == (arr[j])){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(narr[i]);
            }
        }
    }
}
