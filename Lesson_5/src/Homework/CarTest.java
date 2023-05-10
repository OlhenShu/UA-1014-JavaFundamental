package Homework;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var carArr = initCarArray();
        System.out.println("Enter year of car: ");
        int yearOfCar = sc.nextInt();
        showCarList(carArr, yearOfCar);
        sortCar(carArr);
    }

    private static void showCarList(Car[] carArr, int numberOfCar) {
        System.out.println("employees of this department " + numberOfCar + ":");
        for (var car : carArr) {
            if (car.getYearOfProduction() ==numberOfCar ) {
                System.out.println(car);
            }
        }
    }
    private static void sortCar(Car[] carArr) {
        int n = carArr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (carArr[i - 1].getYearOfProduction() < carArr[i].getYearOfProduction()) {
                    Car temp = carArr[i - 1];
                    carArr[i - 1] = carArr[i];
                    carArr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        System.out.println("---------------------------");
        for (var car : carArr) {
            System.out.println(car);
        }
    }

    private static Car[] initCarArray() {
        Car[] carArr = new Car[5];
        carArr[0] = new Car("Sedan",2021,4);
        carArr[1] = new Car("MiniVan",2012,5);
        carArr[2] = new Car("PickUP",2000,10);
        carArr[3] = new Car("Van",1999,6);
        carArr[4] = new Car("Coupe",2000,3);
        return carArr;
    }
}
