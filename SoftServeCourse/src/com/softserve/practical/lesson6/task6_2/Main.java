package practical.lesson6.task6_2;

public class Main {
    public static void main(String[] args) {

        Car[] cars = {
                new Sedan("Audi a6", 220, 1998),
                new Sedan("Hyundai Verna",200,2019),
                new Truck("Pickup Sierra",220,2016),
                new Sedan("Volkswagen Passat b7",260,2020),
                new Truck("Toyota RN80",180,2000),
        };
        for(int i = 0;i < cars.length;i++){
            System.out.println(cars[i].toString());
        }
    }
}
