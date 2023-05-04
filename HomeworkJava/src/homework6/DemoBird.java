package homework6;

public class DemoBird {
    public static void main(String[] args){
        Bird[] birds = {
                new Eagle("brown",true),
                new Swallow("black",true),
                new Penguin("black and white",true),
                new Kiwi("green",true)
        };

        for (Bird bird : birds){
            System.out.println(bird.getClass().getSimpleName() + " " + bird);
            bird.fly();
            System.out.println(" ");
        }
    }
}
