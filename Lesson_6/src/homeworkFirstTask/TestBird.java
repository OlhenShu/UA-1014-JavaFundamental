package homeworkFirstTask;

public class TestBird {
    public static void main(String[] args) {
        var birds = new Bird[6];
        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Penguin(true, true);
        birds[3] = new Kiwi(true, true);
        birds[4] = new FlyingBird(true, true);
        birds[5] = new NonFlyingBird(true, true);

        for (var bir:birds) {
            bir.fly();
            System.out.println("Feathers: " + bir.isFeathers());
            System.out.println("Lays Eggs: " + bir.isLayEggs());
            System.out.println();
        }
    }
}
