package homework5;
                    /** 3.* Create class called Car with fields: type, year of production and engine capacity.
                     • Create and initialize in main() method four instances of class Car.
                     • Output result for cars:
                     o certain model year (enter year in the console);
                     o sorted cars by the field “year of production ”.*/
import java.util.Scanner;

public class DemoCar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Car[] cars = {
                new Car("Hatchback",2010,2.0 ),
                new Car("Sedan",2012,1.8),
                new Car("Crossover",2020,1.6),
                new Car("SUV",2022,2.2),
//                new Car("SUV",2022,2.2),
        };

        System.out.print("Please enter the year of the car. " +
            "You can choose from the following options: 2010, 2012, 2020, or 2022: ");

        int a = Integer.parseInt(sc.nextLine());
//        System.out.println( cars[2].getYearProduction());


        for (Car car : cars) {
            if (a == car.getYearProduction()) {
                System.out.println("Year of production " + car.getYearProduction());
                System.out.println("Type " + car.getType());
                System.out.println("Engine capacity " + car.getEngineCapacity());
            }
        }







//        if (a == 2010 ) System.out.println(car1);
//        if (a == 2012 ) System.out.println(car2);
//        if (a == 2020 ) System.out.println(car3);
//        if (a == 2022 ) System.out.println(car4);

    }
}
