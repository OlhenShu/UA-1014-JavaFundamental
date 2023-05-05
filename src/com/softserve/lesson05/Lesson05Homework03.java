package com.softserve.lesson05;

import java.util.Scanner;

public class Lesson05Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCar = 4;
        Car[] car = new Car[countCar];

        for (int i = 0; i < countCar; i++) {
            car[i] = new Car();

            System.out.print("Input type car: ");
            car[i].setType(scanner.next());
            System.out.print("Input yearProduction car: ");
            car[i].setYearProduction(scanner.nextInt());
            System.out.print("Input engineCapacity car: ");
            car[i].setEngineCapacity(scanner.nextDouble());
        }
        System.out.print("Enter year ");
        int yearCar = scanner.nextInt();

        for (int i = 0; i < countCar; i++) {
            if (yearCar == car[i].getYearProduction()) {
                System.out.println(car[i]);
            }
        }

        System.out.println("\nSorted cars by the field year of production ");

        for (int i = 0; i < countCar; i++) {
            for (int j = countCar - 1; j > i; j--) {
                if (car[j - 1].getYearProduction() > car[j].getYearProduction()) {
                    Car tmp = car[j - 1];
                    car[j - 1] = car[j];
                    car[j] = tmp;
                }
            }
        }

        for (int i = 0; i < countCar; i++) {
            System.out.println(car[i]);
        }
    }
}

class Car {
    private String type;
    private int yearProduction;
    private double engineCapacity;

    public String getType() {
        return type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car: type = " + type + "  year production = " + yearProduction + "  engine capacity = " + engineCapacity;
    }
}
