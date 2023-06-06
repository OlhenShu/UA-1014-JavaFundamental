package com.softserve.edu15.practicalTask;

import com.softserve.edu15.Printer;

/**
 * Output two messages «Hello, world» and «Peace in the peace» 5 times each
 * with the intervals of 2 seconds, and the second - 3 seconds.
 * After printing messages, print the text «My name is …»
 */
public class Messages {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new Thread(new Printer("Hello, world", 2000));
        var t2 = new Thread(new Printer("Peace to the world", 3000));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.printf("My name is %s", Thread.currentThread().getName());
    }
}
