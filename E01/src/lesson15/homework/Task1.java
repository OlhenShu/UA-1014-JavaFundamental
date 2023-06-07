package lesson15.homework;

public class Task1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Printer("Thread 1", "Hello"));
        Thread thread2 = new Thread(new Printer("Thread 2", "Hi"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread3 = new Thread(new Printer("Thread 3", "Greetings"));
        thread3.start();
    }

    static class Printer implements Runnable {
        private String name;
        private String message;

        public Printer(String name, String message) {
            this.name = name;
            this.message = message;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + message);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

