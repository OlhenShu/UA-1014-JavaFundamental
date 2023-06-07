package lesson15.practical;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("I study Java");
            Thread.sleep(1000);
        }
    }
}
