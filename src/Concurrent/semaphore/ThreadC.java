package Concurrent.semaphore;

/**
 * Created by Administrator on 2017/3/13/013.
 */
public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.method1();
    }
}
