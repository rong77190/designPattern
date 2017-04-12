package algorithm;

import com.sun.xml.internal.bind.unmarshaller.InfosetScanner;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/12/012.
 */
public class SelectWork {
    public static int num;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            int n = scan.nextInt();
            String[] s = new String[n];
            for (int i =0; i < n;i++){
                s[i] = scan.next();
            }


            fun(s,0,new HashSet<Integer>());
            System.out.println(num);
            scan.close();
        }

    }

    public static void fun(String[] s, int index, HashSet<Integer> set){
        if (index >= s.length){
            num++;
            return;
        }

        String str = s[index];
        for (int i = 0; i < s.length; i++){
            int work = str.charAt(i)-'0';
            if (! set.contains(work)){
                set.add(work);
                fun(s,index+1,set);
                set.remove(work);
            }
        }
    }
}
