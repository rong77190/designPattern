import java.util.*;

/**
 * 题目描述
 牛牛的作业薄上有一个长度为 n 的排列 A，
 这个排列包含了从1到n的n个数，
 但是因为一些原因，
 其中有一些位置（不超过 10 个）看不清了，
 但是牛牛记得这个数列顺序对的数量是 k，
 顺序对是指满足 i < j 且 A[i] < A[j] 的对数，请帮助牛牛计算出，符合这个要求的合法排列的数目。
 输入描述:
 每个输入包含一个测试用例。
 每个测试用例的第一行包含两个整数 n 和 k（1 <= n <= 100, 0 <= k <= 1000000000），
 接下来的 1 行，包含 n 个数字表示排列 A，其中等于0的项表示看不清的位置（不超过 10 个）。
 输出描述:
 输出一行表示合法的排列数目。
 示例1
 输入
 5 5
 4 0 0 2 0
 输出

 2
 */

/**
 * 分析：
 * 原来的数组是1-n
 * 数组a,插入数组b，对之前的顺序对的数目没有改变，结果=数组a的顺序对个数+数组b的顺序对个数+每个元素插入产生的顺序对。
 */
public class RestoreArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            boolean[] flag = new boolean[n+1];
            for (int i = 0; i < n;i++) {
                arr[i] = in.nextInt();
                if (arr[i] != 0){
                    flag[arr[i]] = true;
                }
            }
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n;i++){
                if (flag[i] == false) {
                    list.add(i);
                }
            }
            List<ArrayList<Integer>> perm = new ArrayList<ArrayList<Integer>>();
            
            //计算perm
            calperm(perm,list,0);

            //计算已经有的顺序对
            int cv = 0;
            for (int i = 0; i < n;i++) {
                if (arr[i] != 0) {
                    for(int j = i+1;j < n;j++) {
                        if(arr[j] != 0 && arr[i] < arr[j]){
                            cv++;
                        }
                    }
                }
            }
            int count = 0;

            //计算每个模糊数字排列的顺序对
            for (ArrayList<Integer> list1 : perm) {

                int val = cv;
                int[] tmpA = Arrays.copyOf(arr, n);
                val += calvalue(list1, tmpA);
                if(val == k)
                    count++;
            }
        }
    }

    //计算全排列
    public static void calperm(List<ArrayList<Integer>> perm , ArrayList<Integer> list, int n){
        if(n == list.size()){
            perm.add(new ArrayList<Integer>(list));
        }else{
        for(int i=n;i<list.size();i++){
            Collections.swap(list, i, n);
            calperm(perm, list, n+1);
            Collections.swap(list, i, n);
            }
        }
    }


    //计算排列的顺序对
    public static int calvalue(List<Integer> list, int[] A){
        int val = 0;
        int j = 0;
        for(int i=0;i<A.length;i++){
            if(A[i] == 0){
                A[i] = list.get(j++);
                for(int k = 0;k<i;k++){
                    if(A[k]!=0 && A[k]<A[i])
                    val++;
                    }
                for(int k=i+1;k<A.length;k++){
                    if(A[k]!=0 && A[k]>A[i])
                    val++;
                    }
                }
            }
        return val;
        }


}
