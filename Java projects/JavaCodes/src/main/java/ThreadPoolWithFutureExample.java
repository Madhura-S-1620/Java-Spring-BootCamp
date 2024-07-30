//package ThreadPack;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

class TestRunnable implements Runnable {
    private final long pauseDuration;

    TestRunnable(int time) {
        this.pauseDuration = time;
    }

    @Override
    public void run() {

        System.out.println("Before Sleep .." + Thread.currentThread().getName());
        try {
            Thread.sleep(pauseDuration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After Sleep .." + Thread.currentThread().getName());

    }

}

public class ThreadPoolWithFutureExample {
    public static void main(String[] args) {
        TestRunnable runnable1 = new TestRunnable(1500);
        TestRunnable runnable2 = new TestRunnable(2600);
        FutureTask<String> ft1 = new FutureTask<>(runnable1, "The first result is stored");
        FutureTask<String> ft2 = new FutureTask<>(runnable1, "The second result is stored");
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(ft1);
        executorService.submit(ft2);
        System.out.println("Task submitted to executorservice");
        while (true) {
            try {
                if (ft1.isDone() && ft2.isDone()) {
                    System.out.println("Futuretask completed");
                    executorService.shutdown();

                    return;

                }
                if (!ft1.isDone()) {
                    try {
                        System.out.println("Futuretask1 result:" + ft1.get());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        System.out.println("Futuretask2 result" + ft2.get());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
            } finally {
                System.out.println("done..");
            }
        }
    }
}
