//package ThreadPack;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static java.lang.Thread.*;

public class FutureDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        Future<String> stringFuture1 = executor.submit(() ->{
            System.out.println("Thread1 Started..");
            Thread.sleep(500);
            return "task1 completed..";
        });
        Future<String> stringFuture2 = executor.submit(() ->{
            System.out.println("Thread2 Started..");
            Thread.sleep(500);
            return "task2 completed..";
        });
        System.out.println("Pool Size :" + executor.getPoolSize());
        System.out.println("Queue Size :" + executor.getQueue().size());
        try {
            System.out.println(stringFuture1.isDone());
            System.out.println(stringFuture2.isDone());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        

    }
}
 