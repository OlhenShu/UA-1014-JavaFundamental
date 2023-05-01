package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

class Car {
    private String type;
    private int yearProduction;
    private double engineCapacity;

    public Car(String type, int yearProduction, double engineCapacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }


}

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[4];
        cars[0] = new Car("Coupe", 2019, 3500);
        cars[1] = new Car("Hatchback", 2018, 2500);
        cars[2] = new Car("Sedan", 2017, 1800);
        cars[3] = new Car("Sports car", 2022, 4300);

        System.out.println("Enter the year you are interested in");
        int num = scanner.nextInt();

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearProduction() == num) {
                System.out.println(cars[i].getType() + " was made in " + cars[i].getYearProduction());
            }
        }
        for (int i=0; i<cars.length-1; i++) {
            for (int j=0; j<cars.length-1; j++) {
                if (cars[j].getYearProduction()>cars[j+1].getYearProduction()) {
                    Car temp = cars[j];
                    cars[j]=cars[j+1];
                    cars[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted cars by year: ");
        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i].getType() + " was made in " + cars[i].getYearProduction());
        }
        scanner.close();
    }
}

