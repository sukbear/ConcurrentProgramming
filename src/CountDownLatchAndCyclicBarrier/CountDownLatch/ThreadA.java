package CountDownLatchAndCyclicBarrier.CountDownLatch;

/**
 * @author sukbear
 * @create 2018-12-12 16:48
 */
public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.doMethod();
    }
}

