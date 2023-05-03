package com.softserve.edu06.practicalTask.car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Scania", 160, 2022),
                new Sedan("KIA", 210, 2019),
                new Sedan("Toyota", 230, 2014),
                new Sedan("Lexus", 280, 2023),
                new Truck("MANN", 160, 2015),
        };

        for (Car car: cars) {
            System.out.println(car);
        }
    }
}
