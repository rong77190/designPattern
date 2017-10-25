import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class A002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0 ; i < n ; i++){
                x[i] = in.nextInt();
            }
            for (int j = 0;j < n ; j ++){
                y[j] = in.nextInt();
            }
            int[] z = new int[n];
            z[0] = 0;
            for (int i = 1; i < n; i++){
                int[] xArr = new int[i];
                int[] yArr = new int[i];
                for (int j = 0 ; j <= i ;j ++){//需要操作的个数  x1,y1为某个点
                    xArr[j] = x[j];
                    yArr[j] = y[j];
                }
                for(int k = 0 ; k <= i; k ++){
                    if (xArr[k] < xArr[k-1]){
                        int xtemp =xArr[k];
                        xArr[i] = xArr[i-1];
                        int ytemp =yArr[k];
                        yArr[i] = yArr[i-1];
                        int j = i-2;
                        for (;j >=0 && xtemp < xArr[j];j--){//记录后移
                            xArr[j+1] = xArr[j];
                            yArr[j+1] = yArr[j];
                        }
                        xArr[j+1] = xtemp;
                        yArr[j+1] = ytemp;
                    }
                }
                z[i] = getMinDistance(xArr,yArr);
            }
            for (int i = 0; i < n-1; i++){
                System.out.print(z[i]+" ");
            }
            System.out.println(z[n-1]);
        }
    }

    public static int getMinDistance(int [] xArr,int [] yArr){
        int x=0,y=0;
        int length=xArr.length;
        for(int i=0;i<length;i++){
            x+=Math.abs(xArr[length/2]-xArr[i]);
            y+=Math.abs(yArr[length/2]-yArr[i]);
        }
        return (x+y);
    }


}