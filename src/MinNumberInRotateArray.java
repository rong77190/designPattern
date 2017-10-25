/**
 * Created by Administrator on 2017/4/16/016.
 *
 */
public class    MinNumberInRotateArray {

    public static void main(String[] args) {
//        int[] a= {4,5,1,2,3};
//        System.out.println(minNumberInRotateArray(a));
//        int[] b = {1,1,1,0,1};
//        System.out.println(minNumberInRotateArray(b));
//
//        int[] c = {1,0,1,1,1};
//        System.out.println(minNumberInRotateArray(c));
        int i =0;
        System.out.println(""+i++);
    }

    public static  int minNumberInRotateArray(int[] a){
        if (a == null || a.length == 0){
            return -1;
        }
        int index1 = 0;
        int index2 = a.length-1;
        int midIndex = index1;
        while (a[index1] >= a[index2] ){
            if (index2 - index1 == 1){
                midIndex = index2;
                break;
            }

            midIndex = (index1 + index2) / 2;

            //如果下标为index1，index2和midIndex的三个数字相等，则只能顺序查找
            if(a[index1] == a[index2] && a[midIndex] == a[index1]){
                return MinInOrder(a,index1,index2);
            }
            if (a[midIndex] >= a[index1]){
                index1 = midIndex;
            }else if (a[index2] >= a[midIndex]){
                index2 = midIndex;
            }
        }
        return a[midIndex];
    }


    public static int MinInOrder(int[] a,int index1,int index2){
        int result = a[index1];
        for (int i = index1;i <= index2;i++){
            if (result > a[i]){
                result  = a[i];
            }
        }
        return result;
    }
}
