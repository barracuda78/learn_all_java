package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunAndStart {

    public static void main(String[] args) {
        Runnable run = () -> {
            System.out.println("=========task started to perform...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                //nothing to do here
            }
            System.out.println("===========task ended");
        };
//        run.run();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(run);
        executorService.shutdown();
        System.out.println("hello from main thread");
    }
}
