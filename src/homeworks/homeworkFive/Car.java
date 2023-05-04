package homeworkFive;

import java.util.Scanner;

public class Car {
    private Type type;
    private int yearOfProduction;
    private double engineCapacity;

    enum Type {MINIVAN, SEDAN, COUPE, CROSSOVER};

    Car() {};

    Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = carType(type);
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    Type carType(String type) {
        switch (type.toLowerCase()) {
            case "minivan": return Type.MINIVAN;
            case "sedan": return Type.SEDAN;
            case "coupe": return Type.COUPE;
            case "crossover": return Type.CROSSOVER;
            default: throw new IllegalArgumentException("Unknown type of car: " + type);
        }
    }

    public Type getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car {type = " + getType() + ", year of production = " + getYearOfProduction() + ", engine capacity = " + getEngineCapacity() + "}";
    }
}

class TestCar {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("minivan", 2019, 1.9);
        cars[1] = new Car("sedan", 2016, 6.3);
        cars[2] = new Car("coupe", 2023, 1.6);
        cars[3] = new Car("crossover", 2022, 2.4);
        
        System.out.println(getModelByYear(cars));
        sortYear(cars);
        printYears(cars);
        
    }
    
    public static String getModelByYear(Car[] car) {
        String notFound;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of production of the car: ");
        int year = scanner.nextInt();
        
        for (Car carYear : car) {
            if (carYear.getYearOfProduction() == year) {
                return carYear.toString();
            }
        }
        notFound = "Unknown car with year: " + year;
        return notFound;
    }
    
    public static Car[] sortYear(Car[] cars) {
        boolean swap = true;
        Car temp;
            
        while (swap) {
            swap = false;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].getYearOfProduction() > cars[i + 1].getYearOfProduction()) {
                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                    swap = true;
                }
            }
        }
        return cars;
    }
        
    public static void printYears(Car[] cars) {
        for (Car year : cars) {
            System.out.print(year.getYearOfProduction() + ", ");
        }
    }
}