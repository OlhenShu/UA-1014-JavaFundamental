package com.softserve.edu15.practicalTask;

/**
 * Output text «I study Java» 10 times with the intervals of one second (Thread.sleep(1000);).
 */
public class TenTimes {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("I study java");
            Thread.sleep(1000);
        }
    }
}
