package com.softserve.edu15.Deadlock;

public class Main {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new Thread(new Deadlock(lock1, lock2));
        Thread thread2 = new Thread(new Deadlock(lock2, lock1));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main end");
    }
}
