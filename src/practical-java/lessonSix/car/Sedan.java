package lessonSix.car;

public class Sedan extends Car {
    
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan run");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stop");
    }
}
