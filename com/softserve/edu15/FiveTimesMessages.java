package com.softserve.edu15;

/**
 * Run three threads and output there different messages for 5 times.
 * The third thread supposed to start after finishing working of the two previous threads.
 */
public class FiveTimesMessages {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(new Printer("Hello, world", 2000));
        var t2 = new Thread(new Printer("Peace to the world", 3000));
        var t3 = new Thread(new Printer("Three", 1000));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t3.join();

        System.out.printf("My name is %s", Thread.currentThread().getName());
    }
}
