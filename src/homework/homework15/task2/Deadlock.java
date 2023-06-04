package homework.homework15.task2;

public class Deadlock {
    public static void main() throws InterruptedException{
        var threads = new Thread(new DeadThread());
        threads.join();
    }
}
class DeadThread implements Runnable {
    @Override
    public void run() {
        var dl = new Deadlock();
        try {
            dl.main();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
