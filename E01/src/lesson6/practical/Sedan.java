package lesson6.practical;

class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan runs more quickly than truck");
    }

    @Override
    void stop() {
        System.out.println("Sedan stops");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

