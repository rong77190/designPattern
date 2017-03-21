package Concurrent.semaphore.test02;

import java.util.concurrent.Semaphore;

/**
 * Semaphore 的同步性
 *
 */
public class Service {

    //定义最多一个线程执行acquire() 跟 release() 之间的代码，所以打印的结果就是三个线程是同步的
//    private Semaphore semaphore = new Semaphore(1);

    private Semaphore semaphore = new Semaphore(2);
    public void method1(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+
            "  begin timer = "+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+
            "  end   timer = "+System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
