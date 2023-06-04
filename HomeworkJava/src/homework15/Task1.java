package homework15;

public class Task1 implements Runnable{
    String phrase;
    int times;

    public Task1(String phrase, int times) {
        this.times = times;
        this.phrase = phrase;
    }
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(phrase);
            try {
                Thread.sleep(times);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
