package practical.practical15.task2;

public class SomeClass {
    public static void main(String[] args) throws InterruptedException{
        var t1 = new Thread(new Printer("Hello, world", 2000));
        var t2 = new Thread(new Printer("Peace to the world", 3000));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Mu name is " + Thread.currentThread().getName());
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
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(phrase);
            }
        }
    }
}
