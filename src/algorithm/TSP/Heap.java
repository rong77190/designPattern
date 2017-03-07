package algorithm.TSP;

public class Heap {
	private Edge[] heap;
//	private int maxSize;
	private int n;
	
	private void siftdown(int pos){
		while(!isLeaf(pos)){
			int j=leftChild(pos);
			int rc=rightChild(pos);
			
			if(rc<n && heap[rc].smaller(heap[j])){
				j=rc;
			}
			if(heap[pos].smaller(heap[j])){
				return;
			}
			swap(heap,pos,j);
			pos=j;
		}
	}
	
	public Heap(Edge[] h,int num){
		heap=h;
		n=num;
//		maxSize=max;
		buildHeap();
	}
	
	public int size(){
		return n;
	}
	public boolean isLeaf(int pos){
		return (pos>=n/2) && (pos<n);
	}
	public int leftChild(int pos){
		return 2*pos+1;
	}
	public int rightChild(int pos){
		return 2*pos+2;
	}
	public int parent(int pos){
		return (pos-1)/2;
	}
	public void buildHeap(){
		for(int i=n/2-1;i>=0;i--){
			siftdown(i);
		}
	}
	public void insert(Edge it){
		int curr=n++;
		heap[curr]=it;
		while(curr!=0 && heap[curr].smaller(heap[parent(curr)])){
			swap(heap,curr,parent(curr));
			curr=parent(curr);
		}
	}
	
	public Edge removeFirst(){
		swap(heap,0,--n);
		if(n!=0){
			siftdown(0);
		}
		return heap[n];
	}
	
	public Edge remove(int pos){
		if(pos==n-1){
			n--;
		}else{
			swap(heap,pos,--n);
			while(pos!=0 && heap[pos].smaller(heap[parent(pos)])){
				swap(heap,pos,parent(pos));
				pos=parent(pos);
			}
			if(n!=0){
				siftdown(pos);
			}
		}
		return heap[n];
	}
	
	public void swap(Edge[] heap,int i,int j){
		Edge temp=heap[i];
		heap[i]=heap[j];
		heap[j]=temp;
	}
}
