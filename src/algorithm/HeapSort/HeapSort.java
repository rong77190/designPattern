package algorithm.HeapSort;

import dataStructure.List.Strategy;

/**
 * Created by Administrator on 2017/3/4/004.
 */
public class HeapSort {
    private Strategy strategy;
    public HeapSort(){}
    public HeapSort(Strategy strategy){
        this.strategy = strategy;
    }

    public  void heapAdjust(Object[] objects,int low ,int high){
        Object temp =  objects[low];
        for(int j = 2 * low;j <= high ;j = j*2){
            if( j < high && strategy.compareTo(objects[j],objects[j + 1])< 0){
                j++;
            }
            if (strategy.compareTo(objects[j],temp)>=0){
                break;
            }
            objects[low] = objects[j];
            low = j;
        }
        objects[low] = temp;
    }
    public  void heapAdjust(int[] a , int low ,int high){
        int temp = a[low];
        for (int i = 2 *low; i < high; i = i * 2){
            if(i < high && a[i]< a[i+1]){
                i++;
            }
            if (a[i] > temp){
                break;
            }
            a[low] = a[i];
            low = i;
        }
        a[low] = temp;
    }

    public void heapSort(int[] a){
        int n = a.length;
        for (int i  = n/2; i >= 1; i--){
            heapAdjust(a,i,n);
        }
        for ( int i = n ;i > 1; i --){
            int temp  = a[1];
            a[1] = a[i];
            a[i] = temp;
            heapAdjust(a,1,i-1);
        }
    }

    public void heapSort(Object[] objects){
        int n = objects.length-1;
        for(int i = n/2; i >= 1;i --){
            heapAdjust(objects,i,n);
        }
        for (int i = n; i > 1 ; i--){
            Object temp = objects[1];
            objects[1] = objects[i];
            objects[i] = temp;
            heapAdjust(objects,1,i-1);
        }


    }




}
