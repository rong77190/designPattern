package strategy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		//int[] a = {9, 5, 3, 7, 1};
//		Cat[] a = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
//		//Dog[] a = {new Dog(5), new Dog(3), new Dog(1)};
//		DataSorter.sort(a);
//        DataSorter.p(a);
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			String[] str = new String[n];
			HashSet set = new HashSet();
			for (int i = 0;i < n; i++){
				str[i] = sc.nextLine();
				char[] ch = str[i].toCharArray();
				Arrays.sort(ch);
				set.add(ch);
			}
			System.out.println(set.size());



//			Arrays.sort(ch);
//			int[] i = new int[N];
//			String str2 = new StringBuffer(str).reverse().toString();
//			if (str.equals(str2)){
//				System.out.println("YES");
//			}else {
//				char[] ch = str.toCharArray();
//				Arrays.sort(ch);
//
//				for (int i = 0; i < ch.length-1; i++){
//					temp *= Integer.parseInt(ch[i]+"");
//				}
//				if(temp== ch[ch.length-1]){
//					System.out.println("YES");
//				}else {
//					System.out.println("NO");
//				}
//			}
		}


	}
	public static boolean Test(String  s){
		char[] c = s.toCharArray();

		Arrays.sort(c);
		for (int i =0; i < c.length-1;i ++){
			if (c[i]==c[i++]){
				return false;
			}
		}
		return true;
	}
}
