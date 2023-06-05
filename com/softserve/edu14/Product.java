package com.softserve.edu14;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Create class Product with fields  manufacture category, date of manufacture and price. Add all needed methods
 * Create list Product with 20 objects
 * Obtain a sorted by the price list of products belong to category Phone with price > 3000, and the date of manufacture was more then 1 year ago.
 */
public class Product {
    private final String category;
    private final LocalDate manufactureDate;
    private final double price;

    public Product(String category, LocalDate manufactureDate, double price) {
        this.category = category;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        var productList = Stream.of(
                new Product("Phone", LocalDate.of(2020, 5, 10), 3500),
                new Product("Phone", LocalDate.of(2021, 2, 15), 2800),
                new Product("Phone", LocalDate.of(2023, 2, 15), 2500),
                new Product("Phone", LocalDate.of(2022, 8, 5), 4000),
                new Product("Laptop", LocalDate.of(2021, 9, 20), 5000),
                new Product("Phone", LocalDate.of(2022, 6, 1), 3200),
                new Product("Laptop", LocalDate.of(2020, 12, 5), 4500),
                new Product("Phone", LocalDate.of(2023, 4, 15), 3800),
                new Product("Laptop", LocalDate.of(2021, 7, 10), 5200),
                new Product("Phone", LocalDate.of(2022, 9, 25), 2900),
                new Product("Laptop", LocalDate.of(2020, 8, 5), 4800),
                new Product("Phone", LocalDate.of(2023, 1, 15), 4100),
                new Product("Laptop", LocalDate.of(2021, 3, 20), 5300),
                new Product("Phone", LocalDate.of(2022, 11, 5), 3400),
                new Product("Laptop", LocalDate.of(2020, 10, 10), 4700),
                new Product("Phone", LocalDate.of(2023, 5, 15), 3900),
                new Product("Laptop", LocalDate.of(2021, 4, 1), 5100),
                new Product("Phone", LocalDate.of(2022, 7, 20), 3000),
                new Product("Laptop", LocalDate.of(2020, 11, 5), 4600),
                new Product("Phone", LocalDate.of(2023, 3, 15), 4200)
        );

        LocalDate nowDateMinusOneYear = LocalDate.now().minusYears(1);

        productList
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getManufactureDate().isBefore(nowDateMinusOneYear))
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                '}';
    }
}