package homework.lesson15.task15_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var thread1 = new Thread(new MyThread("Hi,have a nice day"));
        var thread2 = new Thread(new MyThread("I'm just print this message"));
        var thread3 = new Thread(new MyThread("Yeees,my time has come"));
       thread1.start();
       thread2.start();
       thread1.join();
       thread2.join();
       thread3.start();
    }
}
