package Concurrent.semaphore.test03;

import java.util.concurrent.Semaphore;

/**
 * Semaphore 的同步性
 *
 */
public class Service {

    //定义最多一个线程执行acquire() 跟 release() 之间的代码，所以打印的结果就是三个线程是同步的
//    private Semaphore semaphore = new Semaphore(1);

    private Semaphore semaphore = new Semaphore(10);

    public void method1(){
        try {
            //这里有十个许可，代码时耗费掉两个，10/2=5,说明同一时间只有五个线程允许执行 acquire()跟release()之间的代码
            semaphore.acquire(2);
            System.out.println(Thread.currentThread().getName()+
            "  begin timer = "+System.currentTimeMillis());
            int sleepValue = ((int) (Math.random() * (10*1000) ));
            System.out.println(Thread.currentThread().getName()+" 停止了"+(sleepValue/1000)+"秒");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+
            "  end   timer = "+System.currentTimeMillis());
            semaphore.release(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
