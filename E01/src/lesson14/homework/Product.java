package lesson14.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Product {
    private String category;
    private LocalDate date;
    private double price;

    public Product(String category, LocalDate date, double price) {
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Phone", LocalDate.of(2023, 5, 5), 1500));
        productList.add(new Product("Laptop", LocalDate.of(2022, 8, 8), 2500));
        productList.add(new Product("Headphones", LocalDate.of(2020, 3, 20), 3500));
        productList.add(new Product("Microphone", LocalDate.of(2019, 1, 10), 500));
        productList.add(new Product("Phone", LocalDate.of(2022, 4, 18), 4500));
        productList.add(new Product("Phone", LocalDate.of(2020, 10, 28), 2000));
        productList.add(new Product("Laptop", LocalDate.of(2022, 7, 29), 1700));
        productList.add(new Product("Microphone", LocalDate.of(2020, 12, 30), 2300));
        productList.add(new Product("Phone", LocalDate.of(2023, 3, 8), 2700));
        productList.add(new Product("Headphones", LocalDate.of(2023, 9, 22), 3200));
        productList.add(new Product("Phone", LocalDate.of(2019, 11, 19), 4100));

        List<Product> filteredList = productList.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDate().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();

        filteredList.forEach(System.out::println);
    }
}


