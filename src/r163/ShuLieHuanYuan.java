package r163;

import dataStructure.List.ListArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述
 牛牛的作业薄上有一个长度为 n 的排列 A，这个排列包含了从1到n的n个数，但是因为一些原因，其中有一些位置（不超过 10 个）看不清了，但是牛牛记得这个数列顺序对的数量是 k，顺序对是指满足 i < j 且 A[i] < A[j] 的对数，请帮助牛牛计算出，符合这个要求的合法排列的数目。
 输入描述:
 每个输入包含一个测试用例。每个测试用例的第一行包含两个整数 n 和 k（1 <= n <= 100, 0 <= k <= 1000000000），接下来的 1 行，包含 n 个数字表示排列 A，其中等于0的项表示看不清的位置（不超过 10 个）。
 输出描述:
 输出一行表示合法的排列数目。
 示例1
 输入

 5 5
 4 0 0 2 0
 输出

 2
 */
public class ShuLieHuanYuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] narr = new int[n];
            for (int i = 0; i < n;i++) {
                narr[i] = in.nextInt();
            }

            int count = fun(narr,k);
            System.out.println(count);

        }
    }

    public static int fun(int[] arr,int k ) {
        List<Integer> list = notInArr(arr);
        Object[] notInArr = list.toArray();
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] != 0) {

            }
        }
        return 0;
    }


    //不在数据组的数
    public static List<Integer> notInArr(int[]  arr){
        List<Integer> list= new ArrayList<Integer>();
        int n = arr.length;

        for (int j = 0; j < arr.length;j++) {
            if (arr[j] != 0 ){
                list.add(arr[j]);
            }
        }
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < n;i++) {
            if (!list.contains(n+1)) {
                resultList.add(n+1);
            }
        }
        return resultList;
    }


    //构造所有可能的数组





}
