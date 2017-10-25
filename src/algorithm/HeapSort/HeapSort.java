package algorithm.HeapSort;

import dataStructure.List.Strategy;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/4/004.
 */
public class HeapSort {
    public  void heapAdjust(int[] a , int i,int n){
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
    public void heapSort(int[] a,int n){
        //建堆
        for (int i = n/2-1 ; i >= 0; i--) {
            heapAdjust(a, i, n);
        }

        for ( int i = n - 1;i >= 3+1; i --){
            int temp  = a[0];
            a[0] = a[i];
            a[i] = temp;
            System.out.println(Arrays.toString(a));
            heapAdjust(a,0,i);
        }
    }


    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] a = {2,3,5,8,1,9,4};
        heapSort.heapSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }



}
