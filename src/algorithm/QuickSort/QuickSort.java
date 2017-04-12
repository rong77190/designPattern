package algorithm.QuickSort;

import com.sun.javafx.scene.text.HitInfo;
import dataStructure.List.Strategy;

/**
 * Created by Administrator on 2017/3/2/002.
 */
public class QuickSort {
    private Strategy strategy;
    public QuickSort(){

    }
    public QuickSort(Strategy strategy){
        strategy = strategy;
    }

    private int partition(Object[] objects,int low ,int high){
        Object pivot = objects[low];//第一个作为轴
        while (low < high){//从两端向内扫描
            while (low < high && strategy.compareTo(objects[high],pivot) < 0)high--;
            objects[low] = objects[high];//比pivot小的移到低端
            while (low < high && strategy.compareTo(objects[low],pivot) < 0) low++;
            objects[high] = objects[low];//比pivot大的移到高端
        }
        objects[low] = pivot;//设置轴
        return low;//返回轴位置
    }
    public void quickSort(Object[] objects,int low ,int high){
        if (low < high){
            int pa = partition(objects,low,high);
            quickSort(objects,low,pa-1);
            quickSort(objects,pa+1,high);
        }
    }



    private static int partition(int[] objects,int low ,int high){
        int pivot = objects[low];//第一个作为轴
        while (low < high){//从两端向内扫描
            while (low < high && objects[high]<pivot)
                high--;
            objects[low] = objects[high];//比pivot小的移到低端
            while (low < high && objects[low]<pivot)
                low++;
            objects[high] = objects[low];//比pivot大的移到高端
        }
        objects[low] = pivot;//设置轴
        return low;//返回轴位置
    }
    public static void quickSort(int[] objects,int low ,int high){
        if (low < high){
            int pa = partition(objects,low,high);
            quickSort(objects,low,pa-1);
            quickSort(objects,pa+1,high);
        }
    }

    public static void main(String[] args) {
        int[] a = {8,3,5,7,2,4,9,0,1,6};

        quick(a,0,9);
        for (int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }

    }



    public static int p(int[] a, int low ,int high){
        int p = a[low];
        while (low < high){
            while (low < high && a[high] > p)
                high--;
            a[low] = a[high];
            while (low < high && a[low] < p)
                low++;
            a[high] = a[low];

        }
        a[low] = p;
        return low;
    }

    public static void quick(int[] a,int low,int high){
        if (low < high){
            for (int i = 0;i < a.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();

            int pa = p(a,low,high);
            quick(a,low,pa-1);
            quick(a,pa+1,high);
        }
    }


}
