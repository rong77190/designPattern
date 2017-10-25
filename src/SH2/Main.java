package SH2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n  = in.nextInt();
            int m = in.nextInt();
            int[] marr = new int[m];
            for(int i= 0; i< m;i++) {
                marr[i] = in.nextInt();
            }
            int[] narr = new int[n];
            for (int i = 0; i < n;i++) {
                narr[i] = i + 1;
            }
            int allSum = 0;
            int index = 0;
            for (int i= 0;i < n;i++) {
                int sum = 0;
                if (!inArr(i+1,marr)) {
                    for (int j = 0;j < m;j++) {
                        sum += Math.abs(marr[j]-narr[i]);
                    }
                    if (sum != 0 && sum < allSum){
                        allSum = sum;
                        index = i+1;
                    }


                }

            }
            System.out.println(index);
        }

    }


    public static boolean inArr(int n,int[] arr){
        boolean flag = true;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == n) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
