package algorithm;

import java.util.Scanner;

/**
 *
 *
 * 输入一个N维矩阵，判断是否对称。
 输入描述:
 输入第一行包括一个数：N(1<=N<=100)，表示矩阵的维数。
 接下来的N行，每行包括N个数，表示N*N矩阵的元素。


 输出描述:
 可能有多组测试数据，对于每组数据，
 输出"Yes!”表示矩阵为对称矩阵。
 输出"No!”表示矩阵不是对称矩阵。

 输入例子:
 4
 16 19 16 6
 19 16 14 5
 16 14 16 3
 6 5 3 16
 2
 1 2
 3 4

 输出例子:
 Yes!
 No!
 */
public class Maritx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[][] a = null;
        while (scan.hasNext()){

            count = scan.nextInt();
            a = new int[count][count];
            for (int i = 0 ;i <count;i++){
                for (int j = 0; j < count;j++){
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println(test(a));
        }
    }


    public static String test(int[][] a){
        int temp = a[0][0];
        for (int i = 0; i< a.length;i++){
            for (int j= i+1;j < a[i].length;j++){
                if (a[i][j] != a[j][i]){
                    return "No!";
                }
            }
        }
        return "Yes!";
    }
}
