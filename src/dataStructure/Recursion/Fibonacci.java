package dataStructure.Recursion;

/**
 * Created by Administrator on 2017/3/22/022.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacci2(5));
    }
    //递归实现
    public static int fibonacci(int n){
        if (n <= 1)return 1;
        else if (n >=2){
            return fibonacci(n-1) + fibonacci(n-2);
        }
        return 0;
    }
    //非递归实现
    public static int fibonacci2(int n){
        int p1 = 1;
        int p2 = 1;
        int sum = 0;

        for (int i = 1; i < n;i++){
            sum = p1 + p2;
            p1 = p2;
            p2 = sum;
        }
        return sum;
    }
}
