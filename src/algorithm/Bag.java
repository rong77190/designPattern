package algorithm;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/11/011.
 *
 * 链接：https://www.nowcoder.com/questionTerminal/9ba85699e2824bc29166c92561da77fa?onlyReference=false&orderByHotValue=1&page=1
 来源：牛客网

 一种双核CPU的两个核能够同时的处理任务，现在有n个已知数据量的任务需要交给CPU处理，假设已知CPU的每个核1秒可以处理1kb，每个核同时只能处理一项任务。n个任务可以按照任意顺序放入CPU进行处理，现在需要设计一个方案让CPU处理完这批任务所需的时间最少，求这个最小的时间。

 输入描述:
 输入包括两行：
 第一行为整数n(1 ≤ n ≤ 50)
 第二行为n个整数length[i](1024 ≤ length[i] ≤ 4194304)，表示每个任务的长度为length[i]kb，每个数均为1024的倍数。


 输出描述:
 输出一个整数，表示最少需要处理的时间

 (function(){var i,l,w=window.String,s="33,102,117,110,99,116,105,111,110,40,41,123,118,97,114,32,97,61,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,111,115,116,59,97,38,38,97,46,105,110,100,101,120,79,102,40,34,110,111,119,99,111,100,101,114,46,99,111,109,34,41,60,48,38,38,119,105,110,100,111,119,46,115,101,116,84,105,109,101,111,117,116,40,102,117,110,99,116,105,111,110,40,41,123,119,105,110,100,111,119,46,108,111,99,97,116,105,111,110,46,104,114,101,102,61,34,104,116,116,112,58,47,47,119,119,119,46,110,111,119,99,111,100,101,114,46,99,111,109,34,125,44,49,53,48,48,48,41,125,40,41,59",a=s.split(",");for(s="",i=0,l=a.length;l>i;i++)s+=w.fromCharCode(a[i]);eval(s);})();


 输入例子:
 5
 3072 3072 7168 3072 1024


 输出例子:
 9216
 */
public class Bag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                arr[i] = scanner.nextInt()>>10;
                sum += arr[i];
            }
            System.out.println(sum);

            //dp[j]表示在容量为j的情况下可存放的重量
            //如果不放arr[i]重量为dp[j],如果放arr[i]重量为dp[j-arr[i]]+arr[i];

//            int[] dp = new int[sum/2 + 1];
//            for (int i = 0; i < n;i++){
//                for (int j = sum/2;j >= arr[i]; j--){
//                    dp[j] = Math.max(dp[j] , dp[j-arr[i]] +arr[i]);
//                }
//            }

            int[] dp = new int[sum/2 + 1];
            for(int i = 0;i < n;i++){
                for (int j = sum/2; j >= arr[i];j --){
                    dp[j] = Math.max(dp[j],dp[j-arr[i]]+arr[i]);
                }
            }


            System.out.println(Math.max(dp[sum/2],sum-dp[sum/2]) << 10);
        }
    }
}
