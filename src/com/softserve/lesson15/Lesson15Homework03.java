package com.softserve.lesson15;

public class Lesson15Homework03 {
    static Thread t1 = new Thread() {
        @Override
        public void run() {
            t2.start();
        }
    };

    static Thread t2 = new Thread() {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Thread t3 = new Thread() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                }
            };
            t3.start();
        }
    };

    public static void main(String[] args) {
        t1.start();
    }
}
