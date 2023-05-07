package lessonSix.car;

public abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();

}
