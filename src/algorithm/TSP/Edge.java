package algorithm.TSP;

public class Edge{
	private int begin;
	private int end;
	private double length;
	
	public Edge(int i,int j,double z){
		begin=i;
		end=j;
		length=z;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean smaller(Edge o) {
		if(this.getLength()<o.getLength()){
			return true;
		}else{
			return false;
		}
	}
	
}
