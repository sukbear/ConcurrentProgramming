package CountDownLatchAndCyclicBarrier.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author sukbear
 * @create 2018-12-12 16:54
 */
public class MyThread extends Thread {
    private CountDownLatch maxRuner;

    public MyThread(CountDownLatch maxRuner) {
        this.maxRuner = maxRuner;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            maxRuner.countDown();
        }
    }
}
