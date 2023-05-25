package com.softserve.edu05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create class called Car with fields: type, year of production and engine capacity.
 * • Create and initialize in main() method four instances of class Car.
 * • Output result for cars:
 * o certain model year (enter year in the console);
 * o sorted cars by the field “year of production ”.
 */
public class Car {
    private final String type;
    private final int yearOfProduction;
    private final double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public static void getByYears(Car[] cars, int yearProduction) {
        for (Car car : cars) {
            if (yearProduction == car.getYearProduction()) {
                System.out.println(car);
            }
        }
    }

    public static void sortedCarsByYearProduction(Car[] cars) {
        Arrays.sort(cars, Comparator.comparing(Car::getYearProduction));

        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return String.format("Car:%n \tType: %s, \tYear: %d, \tEngine: %.2f", getType(), getYearProduction(), getEngineCapacity());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car[] cars = {
                new Car("Sedan", 2006, 2.5),
                new Car("SUV", 2016, 2.5),
                new Car("Crossover", 2002, 1.5),
                new Car("Sports", 2006, 3.5),
                new Car("Minivan", 2002, 1.5),
        };

        try {
            System.out.print("Enter year to search: ");
            int searchYear = input.nextInt();
            input.close();

            System.out.printf("Cars produced in year %d:%n", searchYear);
            getByYears(cars, searchYear);

            System.out.printf("Sorted cars by the field “year of production”:%n");
            sortedCarsByYearProduction(cars);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid year.");
        } finally {
            input.close();
        }
    }
}
