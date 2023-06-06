package homework.lesson15.task15_1;

import java.io.Serializable;

public class MyThread implements Runnable {
    private String message;
    public MyThread(String ms){
        this.message = ms;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}
