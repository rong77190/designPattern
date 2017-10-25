package algorithm;

/**
 * Created by Administrator on 2017/4/16/016.
 */
public class StrToInt {
    static boolean isValid = true;

    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("1-23"));
//        int[] a= new int[10];
//        for (int i =0;i < 10;i++){
//            a[i] = (int)(Math.random()*100);
//            System.out.println(a[i]+" ");
//        }

        int[] a = {5,6,7,8,9,1,2,3};
        int b = GetLongestIncrementalSubSequence__O_NLogN_(a);
            System.out.print(b+" ");


    }

    public static int strToInt(String str){

        if (str== null || str.length() == 0 || "".equals(str.trim()) || str.indexOf("++") >= 0 ||
                str.indexOf("--") >= 0 || str.indexOf("+") >= 0 || str.indexOf("- ") >= 0){
            isValid = false;
            return 0;
        }
        str = str.trim();//去除空格
        if (str != null && str.length() != 0){
            char[] ch = str.toCharArray();
            boolean minus = false;
            if (ch[0]=='+'){
                ch = str.substring(1).toCharArray();
            }else if (ch[0] == '-'){

                minus = true;
                ch = str.substring(1).toCharArray();
            }

        }
        return 0;
    }


    public static int GetLongestIncrementalSubSequence__O_NLogN_(int array[]){
        //use the result array to get the longest length

        int b[] = new int[array.length];
        if (array.length == 0)return 0;
        b[0] = array[0];
        int curLongestLength = 1;
        for (int i = 1; i < array.length;i++){
            if (array[i] > b[curLongestLength-1]){
                b[++curLongestLength -1] = array[i];
            }else {
                if (array[i] <= b[0]){
                    b[0] = array[i];
                    continue;
                }
                //二分法求
                int begin = 0;
                int end = curLongestLength -1;
                for (;begin != end -1;){
                    if (array[i] > b[(begin +end)/2])
                        begin = (begin + end) / 2;
                    else
                        end = (begin + end)/2;
                }
                b[end] = array[i];
            }
        }
        return curLongestLength;
    }


}
