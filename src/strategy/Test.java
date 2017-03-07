package strategy;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//int[] a = {9, 5, 3, 7, 1};
		Cat[] a = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
		//Dog[] a = {new Dog(5), new Dog(3), new Dog(1)};
		DataSorter.sort(a);
        DataSorter.p(a);




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
