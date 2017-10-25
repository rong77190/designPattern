package algorithm;

/**
 * Created by Administrator on 2017/4/17/017.
 */
public class BaseExponent {


    public static void main(String[] args) {
        BaseExponent b= new BaseExponent();
        int a = (int) b.Power(0.25,-3);
        System.out.println(a);
    }
    public double Power(double base, int n) {
        double res = 1,curr = base;
        int exponent;
        //指数是否大于0
        if(n>0){
                exponent = n;
        }else if(n<0){//小于0 取绝对值
            if(base==0)
                throw new RuntimeException("分母不能为0");
            exponent = -n;
        }else{// n==0
            return 1;// 0的0次方
        }
        //指数不为0
        while(exponent!=0){
                if( (exponent&1) == 1)
                    res*=curr;
                curr*=curr;// 翻倍
                exponent>>=1;// 右移一位
            }
        return n>=0?res:(1/res);
    }
}
