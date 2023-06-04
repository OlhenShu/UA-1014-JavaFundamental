package homework15;
public class homework15Task2 {
    public  static void main(String[] args){

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End");
    }
    static class DeadLock extends Thread{
        static final Object firstLock = new Object();
        static final Object secondLock = new Object();
    }
    static Thread thread1 = new Thread(() -> {
            synchronized (DeadLock.firstLock) {

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e) {
                    };
                }
                synchronized (DeadLock.secondLock) {

                    System.out.println("Thread 2 ");
                }
            }
    });
    static Thread thread2 = new Thread(() -> {
        synchronized (DeadLock.secondLock) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e) {
                };
            }
            synchronized (DeadLock.firstLock) {
                    System.out.println("Thread2 2 ");
            }
        }
    });
}
