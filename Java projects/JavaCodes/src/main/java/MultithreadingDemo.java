class P extends Thread {
    public void run() {
        Thread.currentThread().setName("t1"); 
        Thread.currentThread().setPriority(7);
        for (int i = 1; i < 7; i++) {
            System.out.println(Thread.currentThread().getName() + " In Pmethod() " + i);
        }
    }
}

class Q extends Thread {
    public void run() {
        Thread.currentThread().setName("t2"); 
        Thread.currentThread().setPriority(5);
        for (int i = 1; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " In Qmethod() " + i);
        }
    }
}

class R extends Thread {
    public void run() {
        Thread.currentThread().setName("t3"); 
        Thread.currentThread().setPriority(8);
        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " In Rmethod() " + i);
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        P p = new P();
        Q q = new Q();
        R r = new R();

        // Start the threads
        r.start(); // High priority
        p.start(); // Medium priority
        q.start(); // Low priority

        try {
            r.join();
            p.join();
            q.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed.");
    }
}