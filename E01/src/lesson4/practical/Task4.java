package lesson4.practical;


class Product {
    private String name;
    private double price;
    private int quantity;

    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
public class Task4 {
    public static void main(String[] args) {
        Product product1 = new Product("Samsung", 123.3, 30);
        Product product2 = new Product("Nokia", 99.8, 28);
        Product product3 = new Product("LG", 85.4, 48);
        Product product4 = new Product("Apple", 155.5, 12);
        Product mostexpensive = product1;
        if (product2.getPrice() > mostexpensive.getPrice()) {
            mostexpensive = product2;
        }
        if (product3.getPrice() > mostexpensive.getPrice()) {
            mostexpensive = product3;
        }
        if (product4.getPrice() > mostexpensive.getPrice()) {
            mostexpensive = product4;
        }

        System.out.println("The most expensive is: " + mostexpensive.getName() + " which quantity is: " + mostexpensive.getQuantity());

        Product biggestquantity = product1;
        if (product2.getQuantity() > biggestquantity.getQuantity()) {
            biggestquantity = product2;
        }
        if (product3.getQuantity() > biggestquantity.getQuantity()) {
            biggestquantity = product3;
        }
        if (product4.getQuantity() > biggestquantity.getQuantity()) {
            biggestquantity = product4;
        }

        System.out.println("The name of the items, which has the biigewt quantity is: " + biggestquantity.getName());
    }
}
