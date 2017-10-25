package strategy;

import java.lang.*;

public class Dog implements java.lang.Comparable {
	public Dog(int food) {
		super();
		this.food = food;
	}

	private int food;

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int compareTo(Object o) {
		Dog d = (Dog)o;
		if(this.food > d.getFood()) return 1;
		else if(this.food < d.getFood()) return -1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return this.food + "";
	}
}
