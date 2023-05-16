package practicalSecondTask;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Sedan("Skoda Fabia", 250, 2014);
        cars[1] = new Truck("Ford F-150", 230, 2000);
        cars[2] = new Sedan("Honda Civic", 270, 2022);
        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max Speed: " + car.getModel());
            System.out.println("Year of Production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println();
        }
    }
}
