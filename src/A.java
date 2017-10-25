import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/26/026.
 */
public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int start = in.nextInt();
            int end = in.nextInt();
            System.out.println(fun(x,y,z,start,end));
        }
    }
    public static int  fun(int x,int y ,int z,int start,int end){
        double payx = x/2;
        int count = 0;
        while (end > start){
            if (end % 4 == 0){
                double payy = y*2/(end);
                if (payx > payy){
                    end = end / 2;
                    count += y;
                }else {
                    end = end - 2;
                    count += x;
                }
            }else {
                end = end - 2;
                count += x;
            }
        }
        return count;
    }


}