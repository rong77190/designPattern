package Concurrent.semaphore.test04;


/**
 * Created by Administrator on 2017/3/13/013.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000);
        System.out.println("main中断了a");


    }
}
