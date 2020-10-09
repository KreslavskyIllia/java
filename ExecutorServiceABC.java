import java.util.concurrent.*;

public class ExecutorServiceABC {

    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        });
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("C");
        });

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.shutdown();
    }
}