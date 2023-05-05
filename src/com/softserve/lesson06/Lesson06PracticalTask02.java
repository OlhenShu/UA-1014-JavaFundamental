package com.softserve.lesson06;

import java.util.Scanner;

public class Lesson06PracticalTask02 {
    public static void main(String[] args) {
        int countCar = 2;
        Car[] cars = new Car[countCar];

        for (int i = 0; i < countCar / 2; i++) {
            cars[i] = new Truck();
            System.out.println("Truck");
            cars[i].input();
        }

        for (int i = countCar / 2; i < countCar; i++) {
            cars[i] = new Sedan();
            System.out.println("Sedan");
            cars[i].input();
        }

        for (int i = 0; i <countCar ; i++) {
            System.out.println(cars[i]);
        }
    }
}

abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    abstract void run();

    abstract void stop();

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input model ");
        model = scanner.next();
        System.out.print("Input maxspeed ");
        maxSpeed = scanner.nextInt();
        System.out.print("Input year of production ");
        yearOfProduction = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "model "+model+"  maxSpeed "+maxSpeed+"  yearOfProduction "+yearOfProduction;
    }
}

class Truck extends Car {
    @Override
    void run() {
        System.out.println("Run");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }
}

class Sedan extends Car {
    @Override
    void run() {
        System.out.println("Run");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }
}
