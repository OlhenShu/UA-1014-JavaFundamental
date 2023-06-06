package homework.homework15.task2;

import homework.homework15.task3.Task3Thread;

public class Deadlock {
      static public void main(String[] args){
        var threads = new Thread(new DeadThread());
        threads.start();
        try {
            threads.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("works");
    }
    static class DeadThread implements Runnable {
        @Override
        public void run() {
            var dl = new Thread((Runnable) new Deadlock());
            try {
                dl.start();
                dl.join();
            } catch (ClassCastException | InterruptedException e) { }
        }
    }
}

