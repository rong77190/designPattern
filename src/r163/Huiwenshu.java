package r163;

import java.util.Scanner;

public class Huiwenshu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String a = in.nextLine();
            String b = in.nextLine();
            int total = 0;
            for(int i = 0; i < a.length();i++) {
                String s = insert(a,b,i);
                if (isHuiwenshu(s)){
                    total++;
                }
            }
            System.out.println(total);
        }
    }


    public static String insert(String s,String a,int index){
        return s.substring(0,index)+a+s.substring(index);
    }

    public static boolean isHuiwenshu(String s){
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0;i--) {
            sb.append(s.charAt(i));
        }
        String s1 = sb.toString();
        if (s.equals(s1)) {
            return true;
        }else {
            return false;
        }

    }
}
