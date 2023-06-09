package com.softserve.lesson15;

public class Lesson15PracticalTask02 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(new Printer("Hello, world", 2000));
        var t2 = new Thread(new Printer("Peace in the peace", 3000));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("My name is " + Thread.currentThread().getName());
    }
}

class Printer implements Runnable {
    private String phrase;
    private int interval;

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
                e.printStackTrace();
            }
            System.out.println(phrase);
        }
    }
}
