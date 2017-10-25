package meituan;

import java.util.*;

/**
 * Created by Administrator on 2017/10/11/011.
 */
public class Main3 {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<Integer>();


        int[] arr = {4,3,2,4,5,4,6};
        for (int i =arr.length - 1; i >= 0;i--) {
            if (!queue.contains(arr[i])) {
                queue.add(arr[i]);
            }
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());

        }
    }
}
