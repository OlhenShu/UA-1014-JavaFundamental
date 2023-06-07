package lesson15.practical;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(new Printer("Hello World", 2000));
        var t2 = new Thread(new Printer("Peace to the World", 3000));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is " + Thread.currentThread().getName());
    }

    static class Printer implements Runnable {
        String phrase;
        int interval;

        public Printer(String phrase, int interval) {
            this.phrase = phrase;
            this.interval = interval;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(phrase);
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
