package algorithm;

import java.util.Scanner;

/**
 *
 *
 * 题目描述
 给定两个整数A和B，其表示形式是：从个位开始，每三位数用逗号","隔开。 现在请计算A+B的结果，并以正常形式输出。
 输入描述:
 输入包含多组数据数据，每组数据占一行，由两个整数A和B组成（-10^9 < A,B < 10^9）。


 输出描述:
 请计算A+B的结果，并以正常形式输出，每组数据占一行。

 输入例子:
 -234,567,890 123,456,789
 1,234 2,345,678

 输出例子:
 -111111101
 2346912
 */
public class AaddB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        while (scanner.hasNext()){
            str = scanner.nextLine();
            fun(str);
        }
    }
    public static void fun(String str){
        StringBuffer sa = null;
        StringBuffer sb = null;
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == ' '){
                sa = new StringBuffer(str.substring(0,i));
                sb = new StringBuffer(str.substring(i+1));
                break;
            }
        }


        for (int i = 0; i< sa.length();i++){
            if (sa.charAt(i) == ','){
                sa.deleteCharAt(i);
            }
        }

        for (int i = 0; i< sb.length();i++){
            if (sb.charAt(i) == ','){
                sb.deleteCharAt(i);
            }
        }

        System.out.println(Long.valueOf(sa.toString()) + Long.valueOf(sb.toString()));
    }

}
