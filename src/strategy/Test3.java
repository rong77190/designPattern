package strategy;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
//		//int[] a = {9, 5, 3, 7, 1};
//		Cat[] a = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
//		//Dog[] a = {new Dog(5), new Dog(3), new Dog(1)};
//		DataSorter.sort(a);
//        DataSorter.p(a);


		String[] strings = {"123","sdahfhkal","dsfafkh"};
		strings[1]="";
		for (String s:strings){

			System.out.println(s);
		}
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()){
//			Object[] s = new Object[100000];
//			String str = sc.nextLine();
//			char[] ch = str.toCharArray();
//			System.out.println(ch);
//			Arrays.sort(ch);
//			int[] ints = new int[ch.length];
//			System.out.println("ch.length"+ch.length);
//			System.out.println("ints.length"+ints.length);
//			for (int i = 0; i< ints.length;i++){
//				ints[i] = Integer.parseInt(ch[i]+"");
//			}
//			int temp=1;
//			for (int j = 0; j < ints.length-1; j++){
//				temp = g(ints[j],ints[j+1]);
//				System.out.println(temp);
//			}
//
//			if (ints[ints.length-1]==temp){
//				System.out.println("YES");
//			}else {
//				System.out.println("NO");
//			}



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


//	}

	public static int f(int m,int n){
		if(m<n)
		{  int temp=m;
			m=n;
			n=temp;
		}
		int r=m%n;
		while(r!=0)
		{  m=n;
			n=r;
			r=m%n;
		}
		return n;
	}
	public static int g(int m,int n){
		int temp = f(m,n);
		return m*n/temp;
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
