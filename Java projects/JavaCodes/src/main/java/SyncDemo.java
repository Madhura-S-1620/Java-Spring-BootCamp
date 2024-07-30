class Counter {
    public synchronized void count(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class SyncDemo extends Thread {
    Counter counter;
    char[] chars;

    public SyncDemo(Counter c, char[] chars) {
        this.counter = c;
        this.chars = chars;
    }

    public void run() {
        counter.count(chars);
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'M', 'a', 'd', 'h', 'u', 'r', 'a'};
        SyncDemo syncDemo1 = new SyncDemo(counter1, chars);
        SyncDemo syncDemo2 = new SyncDemo(counter1, chars);
        syncDemo1.start();
        syncDemo2.start();
    }
}