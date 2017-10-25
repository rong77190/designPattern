package strategy;

public class Test5 {
	public static void main(String[] args) {
//		//int[] a = {9, 5, 3, 7, 1};
//		Cat[] a = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
//		//Dog[] a = {new Dog(5), new Dog(3), new Dog(1)};
//		DataSorter.sort(a);
//        DataSorter.p(a);
		int[] a = {3,3,3,3,1,3,1,3,5,5,5,5};
		System.out.println(getValue(a,12));



	}

	public static int getValue(int[] gifts, int n) {
		// write code here
		int[] count = new int[n];
		for(int i = 0; i < gifts.length;i++){
			if (++count[gifts[i]] > n/2){
				return gifts[i];
			}
		}
		return 0;
	}





//	}
}
