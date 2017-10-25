package r163;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/25/025.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            int[] arr = new int[n];
            String str = "";
            for (int i = 0; i < n;i++) {
                arr[i] = in.nextInt();
            }

            for (int i = 0; i < n ;i ++) {

                String flag = fun(arr[i]+"",str.length());
                if (flag != null && flag.equals("flag")) {
                    System.out.println("Possible");
                }else {
                    System.out.println("Impossible");
                }
            }


        }
    }

    public static String fun (String str,int length) {
        if (length == 1){
            return str;
        }else {
            for (int i = 0; i < length; i++) {
                StringBuffer stringBuffer = new StringBuffer(str);
                stringBuffer.deleteCharAt(i);
                String newStr = stringBuffer.toString();
                if (isTrue(Integer.parseInt(String.valueOf(str.charAt(i) + fun(newStr, newStr.length()))),Integer.parseInt(str))) {
                    return "flag";
                }else {
                    System.out.println();
                }
            }
            return null;
        }

    }


    public static boolean isTrue(int a,int b){
        if (a % b == 0) {
            return true;
        }else {
            return false;
        }
    }
}
