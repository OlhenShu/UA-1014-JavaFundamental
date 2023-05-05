package com.softserve.lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lesson04PracticalTask04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countProduct = 4;

        ArrayList<Product> arrayProduct = new ArrayList<>();
        ArrayList<Double> arrayPrice = new ArrayList<>();
        ArrayList<Integer> arrayQuantity = new ArrayList<>();

        for (int i = 0; i < countProduct; i++) {
            arrayProduct.add(new Product());

            System.out.print("Input name Product: ");
            arrayProduct.get(i).setName(scanner.next());
            System.out.print("Input price Product: ");
            arrayProduct.get(i).setPrice(scanner.nextDouble());
            System.out.print("Input quantity Product: ");
            arrayProduct.get(i).setQuantity(scanner.nextInt());

            arrayPrice.add(arrayProduct.get(i).getPrice());
            arrayQuantity.add(arrayProduct.get(i).getQuantity());
        }
        double maxPrise = Collections.max(arrayPrice);
        int indexMaxPrise = arrayPrice.indexOf(maxPrise);
        System.out.println("Name and quantity of the most expensive item:\n" +
                "name = " + arrayProduct.get(indexMaxPrise).getName() +
                " quantity = " + arrayProduct.get(indexMaxPrise).getQuantity());

        int maxQuantity = Collections.max(arrayQuantity);
        int indexMaxQuantity = arrayQuantity.indexOf(maxQuantity);
        System.out.println("Name of the items, which has the biggest quantity = "
                + arrayProduct.get(indexMaxQuantity).getName());
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
