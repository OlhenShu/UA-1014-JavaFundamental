package homework.lesson15;

public class Task15_2 {
    public static void main(String[] args) throws InterruptedException {
        var thread1 = new Thread(() -> {
            try {
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        thread1.join();
    }
    }

