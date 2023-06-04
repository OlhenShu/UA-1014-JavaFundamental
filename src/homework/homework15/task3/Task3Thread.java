package homework.homework15.task3;

public class Task3Thread {
    static public void main(String[] args){
        var one = new Thread(new One());
        one.start();
    }
    static class One implements Runnable {

        @Override
        public void run() {
            var two = new Thread(new Two());
            two.start();
        }
    }
    static class Two implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            var three = new Thread(new Three());
            three.start();
        }
    }
    static class Three implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number three");
            }
        }
    }
}
