package algorithm.selectSort;

import dataStructure.List.Strategy;

/**
 * Created by Administrator on 2017/3/2/002.
 */
public class SelectSort {
    private Strategy strategy;
    public SelectSort(){}
    public SelectSort(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 简单选择排序
     *
     * @param objects
     * @param low
     * @param high
     */
    public void selectSort(Object[] objects,int low ,int high){
        for (int k = low; k < high - 1;k++){
            int min = k;
            for (int i = min + 1; i <= high;i++){
                if (strategy.compareTo(objects[i],objects[min])  < 0){
                    min = i;
                }
            }
            if (k != min){
                Object temp = objects[k];
                objects[k] = objects[min];
                objects[min] = temp;
            }

        }
    }
}
