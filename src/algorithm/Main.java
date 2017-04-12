package algorithm;

//import java.util.*;
//public class OnlineCode.SumOfSer{
//    public static void main(String []args){
//        Scanner s = new Scanner(System.in);
//        while(s.hasNext()){
//            String str = s.nextLine();
//            int count = 1;
//            int start = 0;
//
//            for(int i =  0;i <= str.length();i++){
//
//                if(i == str.length() || str.charAt(start)!=str.charAt(i)){
//                    System.out.print(i-start + "" + str.charAt(start));
//                    start = i;
//                }
//            }
//        }
//    }
//}

import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            long n = s.nextLong();
            if (n > 0 && ((n & (n - 1)) == 0 )){
                System.out.println(2+" "+ (int) log(n,2));
            }else {
                List<Integer> list = primeNumber(n);
                for (int i = 0; i < list.size(); i++){
                    long t = log(n,list.get(i));
                    if (t +1==0){
                    }else {
                        System.out.println(list.get(i)+" "+t);
                    }
                }
            }
        }
    }

    public static List primeNumber(long n){
        ArrayList<Long> list = new ArrayList<Long>();
        boolean b;

        for (long i = 1; i < (long) Math.sqrt(n);i++){
            b= true;
            if (i == 2 || i % 2==0){
                for (long j =2; j <= i; j++){
                    if (i % j == 0){
                        b = false;
                        break;
                    }
                }
            }
            if (b){
                list.add(i);
            }
        }
        return list;
    }
    public static long log(double value, double base) {
        double d = Math.log(value) / Math.log(base);
        if(d-Math.round(d) <=0.000000001){
            return  Math.round(d);
        }else {
            return -1L;
        }
    }

}