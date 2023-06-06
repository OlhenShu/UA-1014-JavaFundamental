package com.softserve.edu15;

/**
 * Create a thread «one», which would start the thread «two», which has to output its
 * number («Thread number two») 3 times and create thread «three», which would to
 * output message «Thread number three» 5 times.
 */
public class Threads {
    public static void main(String[] args) {
        Thread one = new Thread(new FirstThread());
        one.start();

        try {
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }

    static class FirstThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread number one");

            Thread two = new Thread(new SecondThread());
            two.start();

            try {
                two.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread three = new Thread(new ThirdThread());
            three.start();

            try {
                three.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class SecondThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
        }
    }

    static class ThirdThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }
    }
}
