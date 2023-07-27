package pattern.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        multiThreadedMain();
        Thread.sleep(3);
        System.out.println("=============================");
        multiThreadedMainWrongSauron();
    }

    public static void multiThreadedMain() {
        ExecutorService executorService = newFixedThreadPool(10);

        IntStream.rangeClosed(1, 10)
                .parallel()
                .forEach(n -> executorService.execute(new CreateSauron()));

        executorService.shutdown();
    }

    public static void multiThreadedMainWrongSauron() {
        ExecutorService executorService = newFixedThreadPool(10);

        IntStream.rangeClosed(1, 10)
                .parallel()
                .forEach(n -> executorService.execute(new CreateWrongSauron()));

        executorService.shutdown();
    }

}
