package homework.lesson15;

public class Task15_3 {
    public static void main(String[] args) {
        new Thread(() ->
        {
            new Thread(() ->
            {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
                new Thread(() ->
                {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                }).start();
            }).start();
        }).start();
    }
}
