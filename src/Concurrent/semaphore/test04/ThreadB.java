package Concurrent.semaphore.test04;

/**
 * Created by Administrator on 2017/3/13/013.
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.method1();
    }
}
