package practical.practical04.task4;


import homework.homework04.task5.Dog;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private int count = 0;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args){
        Product p1 = new Product("coffee", 2.5, 2);
        Product p2 = new Product("coffee", 3.2, 5);
        Product p3 = new Product("grapefruit", 6,3);
        Product p4 = new Product("apple", 3.1,4);

        Product expensiveProduct = maxPrice(maxPrice(maxPrice(p1, p2), p3),p4);
        System.out.println("The most expensive product is " + expensiveProduct.getName() +
                ". Its quantity " + expensiveProduct.getQuantity() + ".");

        p1.equals(p2);
        p1.equals(p3);
        p1.equals(p4);
        p2.equals(p1);
        p2.equals(p3);
        p2.equals(p4);
        p3.equals(p1);
        p3.equals(p2);
        p3.equals(p4);
        p4.equals(p1);
        p4.equals(p2);
        p4.equals(p3);

        Product popularProduct = maxCount(maxCount(maxCount(p1, p2), p3),p4);
        System.out.println("The most popular product is " + popularProduct.getName() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if(Objects.equals(name, product.name)){
            this.count = this.count + 1;
        }
        return Objects.equals(name, product.name);
    }

    public static Product maxPrice(Product a, Product b) {
        if (a.getPrice() > b.getPrice()){  return a;}
        else { return b;}
    }
    public static Product maxCount(Product a, Product b) {
        if (a.getCount() > b.getCount()){  return a;}
        else { return b;}
    }
}
