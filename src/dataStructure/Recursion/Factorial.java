package dataStructure.Recursion;

/**
 * 阶乘
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial2(4));
    }

    public static int factorial(int n){
        if (n == 0)return 1;
        else return n * factorial(n-1);
    }
    public static int factorial2(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }


}
