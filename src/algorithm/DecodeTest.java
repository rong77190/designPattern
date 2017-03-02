package algorithm;

import dataStructure.List.Strategy;
import dataStructure.List.StudentStrategy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * 十进制               二进制
 * 0-127                0xxxxxxx
 * 129-2047             110xxxxx 10xxxxxx
 * 2048-65535           1110xxxx 10xxxxxx 10xxxxxx
 * 65536-1114111        11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
 */
public class DecodeTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int result = decode(scanner.nextLine().replaceAll(" ", ""));
            System.out.println(result);
        }
    }

    public static int decode(String a){
        if (a.length() == 8){
            String b = a.substring(1);
            return Integer.valueOf(b,2);
        }else if (a.length()==16){
            if (a.substring(0,3).equals("110") && a.substring(8,10).equals("10")){
                String b1 = a.substring(3,8);
                String b2 = a.substring(10,16);
                return Integer.valueOf(b1+b2,2);
            }
        }else if (a.length()== 24){
            if (a.substring(0,4).equals("1110") && a.substring(8,10).equals("10") && a.substring(16,18).equals("10")){
                String c1 = a.substring(4,8);
                String c2 = a.substring(10,16);
                String c3 = a.substring(18,24);
                return Integer.valueOf(c1 + c2 + c3,2);
            }
        }else if (a.length()== 32) {
            if (a.substring(0, 5).equals("11110") && a.substring(8,10).equals("10") && a.substring(16,18).equals("10") && a.substring(24,26).equals("10")) {
                String d1 = a.substring(5, 8);
                String d2 = a.substring(10,16);
                String d3 = a.substring(18,24);
                String d4 = a.substring(26,32);
                return Integer.valueOf(d1 + d2 + d3 + d4 ,2);
            }
        }
        return -1;

    }

}
