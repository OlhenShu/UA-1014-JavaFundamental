package homework15;

public class homework15Task1 {
    public  static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Task1("Hallo people", 2000));
        Thread thread2 = new Thread(new Task1("How are you people", 1000));
        Thread thread3 = new Thread(new Task1("Goodbye people", 1000));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();

    }
}
