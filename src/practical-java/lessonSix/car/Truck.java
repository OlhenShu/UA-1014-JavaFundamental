package lessonSix.car;

public class Truck extends Car {
    
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck run");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
    }
}
