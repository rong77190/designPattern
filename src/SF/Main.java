package SF;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static int solve(int[] num, int m) {
        int max = 0;
        for (int i = 0; i <= num.length - m;i++) {
            int sum =0;
            for (int j =i; j < i+m;j++) {
                sum += num[j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
/******************************结束写代码******************************/

        public static void heapSort(int[] a,int n,int m){
            //建堆
            for (int i = n/2-1 ; i >= 0; i--) {
                heapAdjust(a, i, n);
            }

            for ( int i = n - 1;i >=m + 1; i --){

                int temp  = a[0];
                a[0] = a[i];
                a[i] = temp;
                heapAdjust(a,0,i);
            }
        }

    public static   void heapAdjust(int[] a , int i,int n){
        int largest;
        int leftIndex = 2 * i + 1;
        int rightIndex = leftIndex + 1;
        if (leftIndex < n && a[leftIndex] > a[i]) {
            largest = leftIndex;
        }else {
            largest = i;
        }
        if (rightIndex < n && a[rightIndex] > a[largest]) {
            largest = rightIndex;
        }
        if (largest != i){
            int t = a[i];
            a[i] = a[largest];
            a[largest] = t;
            heapAdjust(a,largest,n);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        int _num_size = 0;
        _num_size = Integer.parseInt(in.nextLine().trim());
        int[] _num = new int[_num_size];
        int _num_item;
        for(int _num_i = 0; _num_i < _num_size; _num_i++) {
            _num_item = Integer.parseInt(in.nextLine().trim());
            _num[_num_i] = _num_item;
        }
        
        int _m;
        _m = Integer.parseInt(in.nextLine().trim());
  
        res = solve(_num, _m);
        System.out.println(String.valueOf(res));    

    }


    public static int get(int[] arr,int n){

        int max = 0;
        for (int i = 0; i<arr.length - n;i++) {
            int sum =0;
            for (int j =i; j < i+n;j++) {
                sum += arr[j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;

    }
}
