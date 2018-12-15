package CountDownLatchAndCyclicBarrier.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author sukbear
 * @create 2018-12-12 16:46
 */
public class Service {
    private CountDownLatch latch = new CountDownLatch(1);

    public void doMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + " 准备 ");
            latch.await();
            System.out.println(Thread.currentThread().getName() + " 结束 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doneMethod() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("开始");
        latch.countDown();
    }
}
