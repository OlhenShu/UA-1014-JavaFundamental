package practical.lessonSix.car;

public class CarTest {
    public static void main(String[] args) {
        Car[] arrayCars = new Car[4];

        arrayCars[0] = new Sedan("Toyota", 220, 2022);
        arrayCars[1] = new Sedan("Lexus", 260, 2023);
        arrayCars[2] = new Truck("Volvo", 160, 2022);
        arrayCars[3] = new Truck("MAN", 180, 2023);

        for (Car car : arrayCars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max speed: " + car.getMaxSpeed());
            System.out.println("Year of production: " + car.getYearOfProduction());
            car.run();
            car.stop();
            System.out.println("");
        }
    }
}
