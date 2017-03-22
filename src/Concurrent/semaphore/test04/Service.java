package Concurrent.semaphore.test04;

import java.util.concurrent.Semaphore;

/**
 * Semaphore 的同步性
 *
 */
public class Service {

    //定义最多一个线程执行acquire() 跟 release() 之间的代码，所以打印的结果就是三个线程是同步的
//    private Semaphore semaphore = new Semaphore(1);

    private Semaphore semaphore = new Semaphore(1);

    public void method1(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+
            "  begin timer = "+System.currentTimeMillis());
            for (int i = 0; i < Integer.MAX_VALUE/50;i++){
                String str = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()+
            "  end   timer = "+System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            System.out.println("线程"+Thread.currentThread().getName()+"进入了catch");
            e.printStackTrace();
        }
    }
}
