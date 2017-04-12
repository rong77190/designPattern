package algorithm;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/11/011.
 */
public class GetMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            int[][] a  = new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    a[i][j] = scanner.nextInt();
                }
            }

            System.out.println(getMax(n,d,a));



        }

    }

    public static int getMax(int n,int d,int[][] a){
        int result = 0;
        for (int i = 0; i <= n-d;i++){
            for (int j = 0; j <= n-d;j++){
                result =  Math.max(result,getSum(i,j,d,a));
            }
        }
        return result;
    }

    public static int getSum(int i, int j ,int d,int[][] a){
        int result = 0;

        int left_top = 0;
        int right_top = 0;
        int horizon = 0;
        int vetical = 0;

        for (int x = i,y = j, y2 = j + d -1;x < i + d;x++,y++,y2--){
            left_top += a[x][y];
            right_top += a[x][y2];
        }


        for (int x = i; x < i +d;x++){
            int local_vetical = 0;
            for (int y = j; y < j + d;y++){
                local_vetical += a[x][y];
            }
            vetical = Math.max(vetical,local_vetical);
        }

        for (int y = j ; y < j + d; y++){
            int local_horizon = 0;
            for (int x = i; x < i + d; x++){
                local_horizon += a[x][y];
            }
            horizon = Math.max(horizon,local_horizon);
        }

        result = Math.max(Math.max(right_top,left_top),Math.max(vetical,horizon));
        return result;

    }
}
