package OnlineCode;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import com.sun.xml.internal.ws.developer.SchemaValidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/7/007.
 */
public class SumOfSer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            ArrayList list = new ArrayList();
            if (n % 2 == 1){
                System.out.print((n-1)/2+" "+(n+1)/2);
            }else {
                for (int i = 3; i <= Math.sqrt(n);i= i +2){
                    if (n % i == 0){
                        int mid = n / i;
                        for (int j = -(i-1)/2;j < (i+1)/2 ; j++){
                            System.out.print(mid+j+" ");
                        }
                    }
                }
            }


        }
    }
}
