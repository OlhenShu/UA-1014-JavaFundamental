package lesson6.practical;

class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Truck is much bigger, so runs slower");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void stop() {
        System.out.println("Truck stops");


    }
}
