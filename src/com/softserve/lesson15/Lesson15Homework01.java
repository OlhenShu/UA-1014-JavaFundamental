package com.softserve.lesson15;

public class Lesson15Homework01 {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(new Print("Thread 1"));
        var t2 = new Thread(new Print("Thread 2"));
        var t3 = new Thread(new Print("Thread 3"));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
    }
}

class Print implements Runnable {
    private String phrase;

    public Print(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(phrase);
        }
    }
}
