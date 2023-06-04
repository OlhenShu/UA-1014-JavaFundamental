package homework.homework15.task1;

public class ThreeThreads {
    public static void main(String[] args) throws InterruptedException{
        var t1 = new Thread(new Printer("The first random text"));
        var t2 = new Thread(new Printer("Second random text"));
        var t3 = new Thread(new Printer("The third random text"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
    static class Printer implements Runnable {
        String phrase;


        public Printer(String phrase) {
            this.phrase = phrase;

        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(phrase);
            }
        }
    }
}
