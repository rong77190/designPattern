package algorithm;

import java.util.Scanner;

/**
 *题目描述
 编写一个程序输入一个mXn的矩阵存储并输出，并且求出每行的最大值和每行的总和。 要求把每行总和放入每行最大值的位置，如果有多个最大值，取下标值最小的那一个作为最大值。 最后将结果矩阵输出。
 输入描述:
 输入的第一行包括两个整数m和n(1<=m,n<=100)，分别代表矩阵的行和列的维数。
 接下来的m行每行有n个数，代表矩阵的元素。


 输出描述:
 可能有多组测试数据，对于每组数据，输出按题目要求执行后的矩阵。

 输入例子:
 3 3
 1 1 1
 1 1 1
 1 1 1
 3 3
 3 2 3
 2 3 2
 3 2 3

 输出例子:
 3 1 1
 3 1 1
 3 1 1
 8 2 3
 2 7 2
 8 2 3

 */
public class MaxMatrix {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n;i++){
                for (int j= 0; j < m;j++){
                    a[i][j] = scanner.nextInt();
                }
            }
            a = toMaxMatrix(a);
            for (int i = 0; i < n;i++){
                for (int j= 0; j < m;j++){
                    if (j == m-1){
                        System.out.print(a[i][j]);
                    }else {
                        System.out.print(a[i][j]+" ");
                    }

                }
                System.out.println();
            }
        }
    }

    public static int[][] toMaxMatrix(int[][] a){
        for (int i = 0; i < a.length;i++){
            int max = a[i][0];
            int pos = 0;
            int sum = 0;
            for (int j= 0; j < a[i].length;j++){
                sum += a[i][j];
                if (a[i][j] > max){
                    pos = j;
                    max = a[i][j];
                }
            }
            a[i][pos] = sum;
        }
        return a;
    }

}
