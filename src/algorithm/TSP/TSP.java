package algorithm.TSP;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class TSP {
	public  int N;//数量
	public  int[] degrees;//每个点的度数
	public  Heap heap;
	public int[] tail;//每个点的另一端点
	public static  double[] vector;//记录由TDM得到的向量pi
	public double[][]data;
	public Edge[] heapEdges;
	public ArrayList<Edge> currentPath;
	public static ArrayList<Integer> remain;
	//返回最近点
	public int NN(int i){
		double min=Double.MAX_VALUE;
		int result=0;
		for(int j=0;j<remain.size();j++){
			int temp=remain.get(j)+1;
			double distance=distance(i,temp);
			if(distance<min && degrees[temp-1]<2 && tail[i-1]!=temp-1){
				result=temp;
				min=distance;
			}
		}
		return result;
	}
	public  double distance(int i,int j){
		if(i==j){
			return Double.MAX_VALUE;
		}else{
			double d= Math.sqrt(Math.pow(data[i-1][0]-data[j-1][0],2)+Math.pow(data[i-1][1]-data[j-1][1], 2));
			return d-vector[i-1]-vector[j-1];
		}
	}

	public void calculateVector(double a){
		double x0=0.0,y0=0.0,lenAvg=0.0;
		double[] len=new double[N];
		for(int i=0;i<N;i++){
			x0 += data[i][0];
			y0 += data[i][1];
		}
		x0/=N;
		y0/=N;

		for(int i=0;i<N;i++){
			len[i]=Math.sqrt(Math.pow(data[i][0]-x0, 2)+Math.pow(data[i][1]-y0, 2));
			lenAvg+=len[i];
		}
		lenAvg/=N;
		for(int i=0;i<N;i++){
			vector[i]=a*(len[i]-lenAvg);
		}


	}

	public TSP(File file,double a){
		try {
			Scanner input = new Scanner(file);
			N= input.nextInt();
			if(N<2){
				System.out.println("输入的点少于两个");
				System.exit(-1);
			}
//			kTree=new int[N+1][N+1];
			data=new double[N][2];
			remain=new ArrayList<Integer>();
			for(int i=0;i<N;i++){
//				System.out.println(input.nextInt());
				input.nextInt();

				data[i][0]=input.nextDouble();
				data[i][1]=input.nextDouble();
				remain.add(i);
			}
			input.close();

			vector=new double[N];
			calculateVector(a);
			degrees=new int[N];
			tail=new int[N];
			int j=0;
			heapEdges=new Edge[N];
			heap=new Heap(heapEdges,0);
			for(int i=0;i<N;i++){
				degrees[i]=0;
				tail[i]=-1;
				j=NN(i+1);
//				double length=Math.sqrt(Math.pow(data[i][0], 2)-Math.pow(data[i][1], 2)-vector[i]-vector[j-1]);
				double length=distance(i+1, j);
				heap.insert(new Edge(i+1, j, length));
			}
//		System.out.println(heap.size());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		currentPath = new ArrayList<Edge>();
	}
	public static void main(String[] args){
		double a=0.0;
		double[] result=new double[100];
		for(int i=0;i<100;i++){
			result[i]=0.0;
		}
		for(int k=0;k<100;k+=1){

			TSP tsp = new TSP(new File("src/algorithm/TSP/input.txt"),a);
			boolean isStep6;
			boolean flag=true;
			while(flag){
				isStep6=true;
				Edge first=tsp.heap.removeFirst();
				int x=first.getBegin();
				int y=first.getEnd();
				if(tsp.isValidEdge(x, y)){
//				tsp.currentPath.add(new Edge(x, y, tsp.distance(x, y)));
					tsp.currentPath.add(first);
					tsp.degrees[x-1]++;
					tsp.degrees[y-1]++;
					if(tsp.degrees[x-1]==2){
						remain.remove(remain.indexOf(x-1));
//					int xx=tsp.kdTree.indexOf(tsp.data[x-1]);
//					KDTree.remove(xx+1);
//					tsp.kdTree=KDTree.build(KDTree.data);
					}
					if(tsp.degrees[y-1]==2){
						remain.remove(remain.indexOf(y-1));
//					int yy=tsp.kdTree.indexOf(tsp.data[y-1]);
//					KDTree.remove(yy+1);
//					tsp.kdTree=KDTree.build(KDTree.data);
					}
					int tailx=tsp.tail[x-1];
					int taily=tsp.tail[y-1];
					if(tailx==-1 && taily==-1){
						tsp.tail[x-1]=y-1;
						tsp.tail[y-1]=x-1;
					}else if(tailx!=-1 && taily==-1){
						tsp.tail[tailx]=y-1;
						tsp.tail[y-1]=tailx;
						tsp.tail[x-1]=-1;
					}else if(tailx==-1 && taily!=-1){
						tsp.tail[taily]=x-1;
						tsp.tail[x-1]=taily;
						tsp.tail[y-1]=-1;
					}else{
						tsp.tail[taily]=tailx;
						tsp.tail[tailx]=taily;
						tsp.tail[x-1]=-1;
						tsp.tail[y-1]=-1;
					}
					if(tsp.currentPath.size()==tsp.N-1){
						break;
					}
					isStep6=false;
				}
				if(isStep6){
					if(tsp.degrees[x-1]==2){
						continue;
					}else{
						int z=tsp.NN(x);

						Edge edge=new Edge(x, z, tsp.distance(x, z));
						tsp.heap.insert(edge);
					}
				}else{
					if(tsp.degrees[x-1]==1){
						int z=tsp.NN(x);
						Edge edge=new Edge(x, z, tsp.distance(x, z));
						tsp.heap.insert(edge);
					}
				}
			}
			double sum=0.0;
			for(int i=0;i<tsp.currentPath.size();i++){
				System.out.println("("+tsp.currentPath.get(i).getBegin()+
						","+tsp.currentPath.get(i).getEnd()+")\t");
				sum+=tsp.normalDistance(tsp.currentPath.get(i).getBegin(),tsp.currentPath.get(i).getEnd());

			}
			int[] lastTwo=new int[2];
			int count=0;
			for(int i=0;i<tsp.N;i++){
				if(tsp.degrees[i]!=2){
					lastTwo[count++]=i+1;
				}
			}
			System.out.println("("+lastTwo[0]+","+lastTwo[1]+")");
			sum+=tsp.normalDistance(lastTwo[0], lastTwo[1]);
			System.out.println("distance:"+sum);
			double sum1=0;
			for(int i=tsp.N-2;i>tsp.N-1-tsp.N/10;i--){
				sum1+=tsp.normalDistance(tsp.currentPath.get(i).getBegin(), tsp.currentPath.get(i).getEnd());
			}
			sum1+=tsp.normalDistance(lastTwo[0], lastTwo[1]);
			System.out.println("最后"+tsp.N/10+"条边的长度为："+sum1);
			System.out.println(sum1/sum);
			result[k]=sum;
			a+=0.01;
		}
		double min=result[0];
		for(int i=0;i<result.length;i++){
			if(result[i]<min){
				min=result[i];
			}
		}
		System.out.println("min:"+min);
	}
	public double normalDistance(int i,int j){
		return Math.sqrt(Math.pow(data[i-1][0]-data[j-1][0],2)+Math.pow(data[i-1][1]-data[j-1][1], 2));
	}
	public boolean isValidEdge(int x,int y){
		if(degrees[x-1]==2 || degrees[y-1]==2 || tail[x-1]==y-1){
			return false;
		}else{
			return true;
		}
	}

}
