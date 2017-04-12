package algorithm;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/11/011.
 *
 * 给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。比如字符串AAAABCCDAA会被编码成4A1B2C1D2A。
 输入描述:
 每个测试输入包含1个测试用例
 每个测试用例输入只有一行字符串，字符串只包括大写英文字母，长度不超过10000。

 输出描述:
 输出编码后的字符串

 输入例子:
 AAAABCCDAA

 输出例子:
 4A1B2C1D2A
 */
public class StringReNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            System.out.println(GetReNum(str));
        }


    }

    public static String GetReNum(String str){
        StringBuffer sb = new StringBuffer();
        int num = 1;
        for (int i = 0; i < str.length()-1; i ++){

            if(str.charAt(i)==str.charAt(i+1)){
                num++;
            }else {
                sb.append(String.valueOf(num)+str.charAt(i));
                num = 1;
            }

        }
        sb.append(String.valueOf(num)+str.charAt(str.length()-1));
        return sb.toString();
    }
}
