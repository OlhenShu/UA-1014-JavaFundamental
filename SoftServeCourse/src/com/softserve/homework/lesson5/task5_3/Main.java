package homework.lesson5.task5_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Audi",1998,2.6),
                new Car("Mercedes-Benz", 2004, 2.0),
                new Car("Reno",2000,1.8),
                new Car("Audi",2014,2.4),
        };
        outputYearOfProduction(cars);
        sortedCarsByYearOfProduction(cars);
    }
    public static void outputYearOfProduction(Car[] cars){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the year of production you are interested in:");
        int a = scan.nextInt();
        for(int i = 0;i < cars.length;i++){
            if(cars[i].getYearOfProduction() == a){
                System.out.println(cars[i].toString());
            }
        }
    }
    public static void sortedCarsByYearOfProduction(Car[] cars){
        for (int i = 0;i < cars.length;i++){
            for (int j = i + 1;j < cars.length;j++){
                Car car = new Car();
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    car = cars[i];
                    cars[i] = cars[j];
                    cars[j] = car;
                }
            }
        }
        System.out.println("Sorted cars by the years of production ");
        System.out.println(Arrays.toString(cars));
    }
}
