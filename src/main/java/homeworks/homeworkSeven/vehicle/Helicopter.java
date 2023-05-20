package homeworks.homeworkSeven.vehicle;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxWeight;

    public Helicopter(int passengers, int weight, int maxWeight) {
        super(passengers);
        this.weight = weight;
        this.maxWeight = maxWeight;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void fly() {
        System.out.println("Engine started. " + getClass().getSimpleName() + " is flying");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }
}
