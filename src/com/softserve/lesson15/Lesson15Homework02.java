package com.softserve.lesson15;

public class Lesson15Homework02 {
    static Thread t = new Thread() {
        public void run() {
            try {
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        t.start();
        t.join();
    }
}
