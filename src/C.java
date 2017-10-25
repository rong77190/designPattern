//import java.util.*;
//
//public class C {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {//注意while处理多个case
//            int N = in.nextInt();//N活动
//            String[] str = new String[N];
//            for (int i = 0; i < N; i++) {
//                str[i] = in.nextLine();
//            }
//            int M = in.nextInt();
//
////Integer.valueOf("FFFF",16).toString();
//
//            Map<String,String> map = new HashMap<String, String>();
//            for (int i = 0 ; i < N; i++){
//                map.put(str[i].substring(4,12),str[i]);
//            }
//            List<Map.Entry<String, String>> id =
//                    new ArrayList<Map.Entry<String, String>>(map.entrySet());
//
//
//            Collections.sort(id, new Comparator<Map.Entry<String, String>>() {
//                public int compare(Map.Entry<String, String> o1,Map.Entry<String, String> o2) {
//                    return (o1.getValue().substring())
//                }
//            });
//
//            for (int i = 0 ; i < N; i++){
//                String s = str[i].substring(str.length - 16,str.length-12);
//                nodle[i] = (Integer.valueOf(s,16));
//            }
//            if ()
//        }
//    }
//
//
//
//
//
//}