package algorithm;

import java.util.*;

/**
 * 题目描述
 职工有职工号，姓名，年龄.输入n个职工的信息，找出3个年龄最小的职工打印出来。
 输入描述:
 输入第一行包括1个整数N，1<=N<=30，代表输入数据的个数。
 接下来的N行有N个职工的信息：
 包括职工号(整数)， 姓名(字符串，长度不超过10)， 年龄(1<=age<=100)。


 输出描述:
 可能有多组测试数据，对于每组数据，
 输出结果行数为N和3的较小值，分别为年龄最小的职工的信息。
 关键字顺序：年龄>工号>姓名，从小到大。

 输入例子:
 5
 501 Jack 6
 102 Nathon 100
 599 Lily 79
 923 Lucy 15
 814 Mickle 65

 输出例子:
 501 Jack 6
 923 Lucy 15
 814 Mickle 65
 */
public class MinAge3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        People p = null;
        Map<People,Object> map = null;
        while (s.hasNext()){
            count = s.nextInt();
            map = new TreeMap<People, Object>();
            for (int i = 0; i < count;i++){
                p = new People();
                p.id = s.nextInt();
                p.name = s.next();
                p.age = s.nextInt();
                map.put(p,null);
            }
            int j = 0;
            Set<Map.Entry<People,Object>> set = map.entrySet();
            Iterator<Map.Entry<People,Object>> iterator = set.iterator();
            while (iterator.hasNext() && j++ < 3){
                People pp = iterator.next().getKey();
                System.out.println(pp.id+" "+pp.name+" "+pp.age);
            }
        }
    }



}


class People implements Comparable<People>{
    int id;;
    String name;
    int age;

    public int compareTo(People people) {
        int result = this.age - people.age;
        if(result == 0){
            result = this.id - people.id;
        }
        return result;
    }

}