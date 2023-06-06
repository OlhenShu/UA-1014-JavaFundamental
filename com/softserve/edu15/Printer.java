package com.softserve.edu15;

public class Printer implements Runnable {
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
