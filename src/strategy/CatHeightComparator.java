package strategy;


/**
 *
 * Comparable & Comparator 都是用来实现集合中元素的比较、排序的，
 * Comparable 是在集合内部定义的方法实现的排序，
 * Comparator 是在集合外部实现的排序，
 * 所以，如想实现排序，就需要在集合外定义 Comparator 接口的方法或在集合内实现 Comparable 接口的方法。

 */
public class CatHeightComparator implements Comparator<Cat> {

	public int compare(Object o1, Object o2) {
		Cat c1 = (Cat)o1;
		Cat c2 = (Cat)o2;
		if(c1.getHeight() > c2.getHeight()) return 1;
		else if(c1.getHeight() < c2.getHeight()) return -1;
		return 0;
	}
}
