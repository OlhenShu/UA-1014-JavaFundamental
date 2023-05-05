package lesson6.practical;

public class CarDemo {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Sedan("Honda", 250, 2015);
        cars[1] = new Truck("Ford", 120, 2019);
        cars[2] = new Sedan("Audi", 280, 2022);
        cars[3] = new Truck("Volvo", 130, 2011);

        for (Car car : cars) {
            System.out.println(car.toString());
            car.run();
            car.stop();
        }
    }
}
