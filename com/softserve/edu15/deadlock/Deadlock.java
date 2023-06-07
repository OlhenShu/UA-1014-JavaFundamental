package com.softserve.edu15.deadlock;

/**
 * Cause a deadlock. Organize the expectations of ending a thread in main(), and make
 * the end of the method main() in this thread.
 */
public class Deadlock implements Runnable {
    private final Object lock1;
    private final Object lock2;

    public Deadlock(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        synchronized (lock1) {
            System.out.printf("%s lock 1%n", threadName);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock2) {
                System.out.printf("%s lock 2%n", threadName);
            }
        }

        System.out.printf("%s end%n", threadName);
    }
}
