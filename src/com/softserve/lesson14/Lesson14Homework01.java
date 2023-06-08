package com.softserve.lesson14;

import java.time.*;
import java.util.*;
import java.util.stream.*;

public class Lesson14Homework01 {
    public static void main(String[] args) {
        Product[] products = new Product[20];

        for (int i = 0; i < 20; i++) {
            products[i] = new Product();
            products[i].setManufactureCategory(products[i].randomString());
            products[i].setDateOfManufacture(products[i].randomLocalDate());
            products[i].setPrice(products[i].randomPrice());
        }

        List<Product> list = Arrays.asList(products);
        System.out.println(list);
        var listSort = list.stream()
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().getYear() < 2021)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listSort);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alice"));
        employeeList.add(new Employee("Bob"));
        employeeList.add(new Employee("Alice"));
        employeeList.add(new Employee("Alice"));
        Stream<Employee> employees = employeeList.stream();
        System.out.println(Employee.mostPopularName(employees));
    }
}

class Product implements Comparable<Product> {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product() {
    }

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String randomString() {
        Random random = new Random();
        char tmp = (char) (random.nextInt(25) + 65);
        String str = "" + tmp;

        for (int j = 0; j < 5; j++) {
            tmp = (char) (random.nextInt(25) + 97);
            str += tmp;
        }
        return str;
    }

    public LocalDate randomLocalDate() {
        int year = 2001 + (int) (Math.random() * 22);
        int month = (int) (Math.random() * 11 + 1);

        try {
            int day = (int) (Math.random() * 31);
            LocalDate date = LocalDate.of(year, month, day);
            return date;
        } catch (DateTimeException e) {
            int day = 1;
            LocalDate date = LocalDate.of(year, month, day);
            return date;
        }
    }

    public double randomPrice() {
        return Math.random() * 5000 + 1000;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        if (Double.compare(this.price, product.price) != 0) {
            return Double.compare(this.price, product.price);
        } else {
            return this.manufactureCategory.compareTo(product.manufactureCategory);
        }
    }
}

class Employee {
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    static Employee mostPopularName(Stream<Employee> employees) {
        List<Employee> arrayList = employees.collect(Collectors.toList());
        Map<Employee, Integer> counter = new HashMap<>();
        for (Employee emp : arrayList) {
            int newValue = counter.getOrDefault(emp, 0) + 1;
            counter.put(emp, newValue);
        }

        Collection<Integer> listValue = counter.values();
        int max = 0;
        for (int i : listValue) {
            if (i > max) {
                max = i;
            }
        }

        Employee tmp = null;
        for (Map.Entry<Employee, Integer> item : counter.entrySet()) {
            if (item.getValue() == max) {
                tmp = item.getKey();
            }
        }
        return tmp;
    }
}
