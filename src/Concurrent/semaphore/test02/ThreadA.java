package Concurrent.semaphore.test02;

/**
 * Created by Administrator on 2017/3/13/013.
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.method1();
    }
}
