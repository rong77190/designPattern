package algorithm.Bubble;

import dataStructure.List.Strategy;

/**
 * Created by Administrator on 2017/3/2/002.
 */
public class BubbleSort {
    private Strategy strategy;
    public BubbleSort(){}
    public BubbleSort(Strategy strategy){
        this.strategy = strategy;
    }

    public void bubbleSort(Object[] objects, int low ,int high){
        for (int i = high; i >= low + 1; i--){//
            for (int  j  = low; j <= i-1;j++){
                if (strategy.compareTo(objects[j],objects[j+1]) > 0){
                    Object temp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }
            }
        }
    }
    public static void bubbleSort(int[] a, int low ,int high){
        for (int i = high; i >= low + 1; i--){//
            for (int  j  = low; j <= i-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }




    public static void main(String[] args) {
        int[] a = {8,3,5,7,2,4,9,0,1,6};
        bubbleSort(a,0,9);
        for (int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
