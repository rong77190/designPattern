package r163;

import java.util.Scanner;

public class ABC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            String[] strings = fun(str);
            long bg  = System.currentTimeMillis();
            for (String s: strings) {
//                System.out.println(s);
            }
            System.out.println(System.currentTimeMillis() - bg);
        }
    }

    public static void fun1(String in,String s,int start ,int size){
        if (start >= size) {
            System.out.print(s);
        }
    }

    public static String[] fun(String str){
        if (str.length() <= 1) {
            return getStr(str);
        }else {
            return append(fun(str.substring(0,str.length()- 1)),
                    fun(str.charAt(str.length()- 1)+""));
        }
    }

    public static String[] append(String[] arr1,String[] arr2){
        String[] resultStr = new String[arr1.length  * arr2.length];
        for (int i  =0; i < arr1.length;i++) {
            for (int j = 0; j < arr2.length;j++) {
                resultStr[(i * arr2.length) + j] = arr1[i] + arr2[j];
            }
        }
        return resultStr;
    }


    public static String[] getStr(String c){
        String s = "";
        switch (c){
            case "0":
                s = "";
                break;
            case "1":
                s = "";
                break;
            case "2":
                s =  "A,B,C";
                break;
            case "3":
                s = "D,E,F";
                break;
            case "4":
                s = "G,H,I";
                break;
            case "5":
                s = "J,K,L";
                break;  
            case "6":
                s = "M,N,O";
                break;
            case "7":
                s = "P,Q,R,S";
                break;
            case "8":
                s = "T,U,V";
                break;
            case "9":
                s = "W,X,Y,Z";
                break;
            default:
                s = "";
                break;
        }
        String[] result = s.split(",");
        return result;
    }
}
