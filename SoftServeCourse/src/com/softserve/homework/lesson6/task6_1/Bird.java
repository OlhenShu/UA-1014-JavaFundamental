package homework.lesson6.task6_1;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;
    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract void fly();

    @Override
    public String toString() {
        return " has feathers - " + feathers
                + ",\nlay eggs - " + layEggs + ".\n";
    }
}
