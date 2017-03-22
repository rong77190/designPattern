package Concurrent.semaphore.test03;


/**
 * Created by Administrator on 2017/3/13/013.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();

        ThreadA[] a =  new ThreadA[10];
        for (int i = 0;i < a.length; i++){
            a[i] = new ThreadA(service);
            a[i].start();
        }
    }
}
