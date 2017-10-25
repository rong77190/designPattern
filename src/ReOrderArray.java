/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {

    public static void main(String[] args) {
        ReOrderArray r = new ReOrderArray();
        int[] a= {0,1,2,3,4,5,6};
        r.reOrderArray(a);
    }

    public void reOrderArray(int[] a){
        for (int i = a.length-1; i > 0;i--){
            for (int j = 0;j < i; j++)
            if (a[j] % 2 == 0 && a[j+1] % 2 == 1){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }

    }


}
