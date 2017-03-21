package Concurrent.semaphore.test02;


/**
 * Created by Administrator on 2017/3/13/013.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA thread1 = new ThreadA(service);
        thread1.setName("A");
        ThreadB thread2 = new ThreadB(service);
        thread2.setName("B");
        ThreadC thread3 = new ThreadC(service);
        thread3.setName("C");
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
