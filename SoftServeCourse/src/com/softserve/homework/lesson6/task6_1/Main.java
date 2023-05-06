package homework.lesson6.task6_1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Kiwi(),
                new Swallow(),
                new Penguin(),
        };
        for (Bird bird : birds) {
            bird.fly();
            System.out.println(bird);
        }
    }
}
