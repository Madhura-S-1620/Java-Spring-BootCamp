//package ThreadPack;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmployeeThread implements Runnable{

    private String name;
    public EmployeeThread(String name)
    {
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + "started");
        System.out.println("name = " + this.name);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        String []names={"Pratik","Yash","Om","Prathamesh","Chetan"};
        for(String name:names){
            Runnable runnable=new EmployeeThread(name);
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }
}