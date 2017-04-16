package dataStructure.Recursion;

/**
 * 幂函数
 */
public class Power {
    public static void main(String[] args) {

    }

    public static int power(int x,int n){
        int y;
        if (n == 0){
            y = 1;
        }else {
            y = power(x,n/2);
            y = y * y;
            if (n % 2 == 1){
                y = y * x;
            }
        }
        return y;

    }

}
