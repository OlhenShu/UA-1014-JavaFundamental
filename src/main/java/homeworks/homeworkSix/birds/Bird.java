package homeworks.homeworkSix.birds;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean getFeathers() {
        return feathers;
    }

    public boolean getLayEggs() {
        return layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Bird { has feathers = " + getFeathers() + ", can lay eggs = " + getLayEggs() + " }";
    }
}
