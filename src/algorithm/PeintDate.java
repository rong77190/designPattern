package algorithm;

import java.util.Scanner;

/**
 * 给出年分m和一年中的第n天，算出第n天是几月几号。
 输入描述:
 输入包括两个整数y(1<=y<=3000)，n(1<=n<=366)。


 输出描述:
 可能有多组测试数据，对于每组数据，
 按 yyyy-mm-dd的格式将输入中对应的日期打印出来。

 输入例子:
 2000 3
 2000 31
 2000 40
 2000 60
 2000 61
 2001 60

 输出例子:
 2000-01-03
 2000-01-31
 2000-02-09
 2000-02-29
 2000-03-01
 2001-03-01
 */
public class PeintDate {

    static int[] M = {31,28,31,30,31,30,31,31,30,31,30,31};
    static int[] N = {31,29,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int day = 0;


        while (scanner.hasNext()){
            year = scanner.nextInt();
            day = scanner.nextInt();
            getDate(year,day);

        }
    }

    public static void getDate(int year,int day){
        if (year < 1 || year > 3000){
            return;
        }
        if (day < 1 ||day > 366){
            return;
        }

        System.out.print(year+"-");
        if (isRunNian(year)){
            getMonthAndDay(day,N);
        }else {
            getMonthAndDay(day,M);
        }
    }

    public static void getMonthAndDay(int day,int[] a){
        int temp = day;
        for (int i= 0; i < a.length;i++){
            if (a[i] < temp){
                temp -= a[i];
            }else {
                System.out.println(toTwoNum(i+1)+"-"+toTwoNum(temp));
                break;
            }
        }
    }

    public static String toTwoNum(int a){
        return a<10?"0"+a:String.valueOf(a);
    }
    public static boolean isRunNian(int year){
        boolean result = false;
        if (year % 4 == 0){
            if (year % 400 != 0 && year % 100 == 0){
                result = false;
            }else {
                result = true;
            }
        }else {
            result = false;
        }
        return result;
    }
}
