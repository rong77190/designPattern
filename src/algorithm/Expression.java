package algorithm;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/12/012.
 */
public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            int tmp = str.charAt(0)-'0';
            for (int i = 1; i < str.length()-1;i++){
                char op = str.charAt(i);
                i++;
                StringBuffer sb = new StringBuffer();
                while (i < str.length() && str.charAt(i)>= '0' && str.charAt(i) <= '9'){
                    sb.append(str.charAt(i));
                    i++;
                }
                int r= Integer.valueOf(sb.toString());
                switch (op) {
                    case '+':
                        tmp = tmp + r;break;
                    case '-':
                        tmp = tmp - r;break;
                    case '*':
                        tmp = tmp * r;break;
                    case '/':
                        tmp = tmp / r;break;
                }
            }
            System.out.println(tmp);
        }
    }
}
