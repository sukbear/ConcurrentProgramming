package CountDownLatchAndCyclicBarrier.CountDownLatch;

/**
 * @author sukbear
 * @create 2018-12-12 16:49
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Thread[] tArray = new Thread[10];
        for(int i = 0; i < tArray.length;i++){
            tArray[i] = new ThreadA(service);
            tArray[i].setName("线程 "+(i+1));
            tArray[i].start();
        }
        Thread.sleep(2000);
        service.doneMethod();
    }
}
