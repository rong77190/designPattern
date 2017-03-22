package Concurrent.semaphore.test03_2;

import java.util.concurrent.Semaphore;

/**
 * 说明这个5 并不是最终的许可数量，仅仅是初始的状态值
 */
public class Test {
    public static void main(String[] args) {
        try {
            Semaphore semaphore = new Semaphore(5);
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            System.out.println(semaphore.availablePermits());
            semaphore.release(4);
            System.out.println(semaphore.availablePermits());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
