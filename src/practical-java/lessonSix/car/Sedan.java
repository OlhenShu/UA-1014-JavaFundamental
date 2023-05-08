package lessonSix.car;

public class Sedan extends Car {
    
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan " + this.getModel() + " " + getYearOfProduction() + " with max speed " + getMaxSpeed() + " km/h started and is running");
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + this.getModel() + " " + getYearOfProduction() + " is stopped");
    }
}
