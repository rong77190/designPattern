package algorithm.mergeSort;

import dataStructure.List.Strategy;

/**
 * Created by Administrator on 2017/3/4/004.
 */
public class MergeSort   {

    private Strategy strategy;
    public MergeSort(){}
    public MergeSort(Strategy strategy){
        this.strategy = strategy;
    }

    public void merge(Object[] a,int p ,int q,int r){
        Object[] b = new Object[r-p+1];
        int s = p;
        int t = q+1;
        int k = 0;
        while (s <= q && t <= r){
            if (strategy.compareTo(a[s], a[t])< 0 ){
                b[k++] = a[s++];
            }else {
                b[k++] = a[t++];
            }

        }
        while (s <= q){
            b[k++] = a[s++];
        }
        while (t <= r){
            b[k++] = a[t++];
        }
        for (int i = 0; i < b.length; i++){
            a[p+i] = b [i];
        }
    }


    public void mergeSort(Object[] a ,int low ,int high){
        if (low < high){
            mergeSort(a,low,(low+high)/2);
            mergeSort(a,(low+high)/2+1,high);
            merge(a,low,(low+high)/2,high);

        }
    }
}
