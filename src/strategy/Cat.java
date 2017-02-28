package strategy;

public class Cat implements Comparable<Cat> {
	private int height;
	//private Comparator comparator = new CatHeightComparator();
	private Comparator<Cat> comparator = new CatHeightComparator();
	public Comparator getComparator() {
		return comparator;
	}
	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}


	public Cat(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	private int weight;

	public int compareTo(Object o) {
		return comparator.compare(this, o);
	}


	@Override
	public String toString() {
		return "Cat{" +
				"height=" + height +
				", weight=" + weight +
				'}';
	}
}
