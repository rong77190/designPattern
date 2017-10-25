//
///**
// * Created by Administrator on 2017/4/12/012.
// */
//public class BigInt {
//    public static void main(String[] args) {
//        BigInt a = new BigInt()
//    }
//
//
//    public BigInt(String num){
//        splitNumToArray(num);
//    }
//
//    private int[] arrayint = new int[100];
//    public void splitNumToArray(String num){
//        int j = 0;
//        StringBuffer sb = new StringBuffer();
//
//        num = new StringBuffer(num).reverse().toString();
//        for (int i = 0;i < num.length();i++){
//            if (i % 8 == 0){
//                if (sb != null && !sb.toString().equals("")){
//                    arrayint[j] = Integer.valueOf(sb.reverse().toString());
//                    j++;
//                    sb = new StringBuffer();
//                }
//            }
//
//            sb.append(num.charAt(i));
//
//        }
//
//        if(sb != null){
//            arrayint[j] = Integer.valueOf(sb.reverse().toString());
//        }
//
//        //数组从后开始打印数字，不满8位补齐8位数字用0填充
//
//    }
//
//    public String printArray(int[] array) {
//        StringBuffer sb= new StringBuffer();
//        boolean isNotFirstInt = false;
//        for (int i = array.length-1; i >=0; i--){
//            if (array[i] != 0){
//                System.out.println(i +":"+array[i]);
//            }
//
//            if (isNotFirstInt && String.valueOf(array[i])){
//
//            }
//        }
//    }
//
//
//
//
//    }
//}
