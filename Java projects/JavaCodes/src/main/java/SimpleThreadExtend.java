//package ThreadPack;

public class SimpleThreadExtend extends Thread{    //also can be used as implements
public void run() {
    for (int i = 1; i < 5; i++) {
        System.out.println("Inside run method of SimpleThread class...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

    public static void main(String[] args) {
        SimpleThreadExtend simpleThread=new SimpleThreadExtend();
        Thread thread=new Thread(simpleThread);
        thread.start();
    }
}
 