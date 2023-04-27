package practical;

import java.util.Arrays;

public class Product  {
    private String name;
    public   double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Product p1 = new Product("phone",2100,100);
        Product p2  = new Product("tablet",1900,70);
        Product p3  =new Product("Laptop",3100,150);
        Product p4= new Product("Headphones",500,200);

        if (p1.quantity> p2.quantity &&p1.quantity> p3.quantity && p1.quantity> p4.quantity ){
            System.out.println("The name is "+p1.name);
        } else if (p2.quantity> p1.quantity&&p2.quantity> p3.quantity &&p2.quantity> p4.quantity) {
            System.out.println("The name is "+p2.name);
        } else if (p3.quantity> p2.quantity &&p3.quantity> p1.quantity &&p3.quantity> p4.quantity) {
            System.out.println("The name is "+p3.name);
        }else {
            System.out.println("The name is "+p4.name);
        }

        if (p1.price> p2.price &&p1.price> p3.price &&p1.price> p4.price ){
            System.out.println("The name is "+p1.name+" and The quantity is "+p1.quantity);
        } else if (p2.price> p1.price &&p2.price> p3.price &&p2.price> p4.price) {
            System.out.println("The name is "+p2.name+"and The quantity is"+p2.quantity);
        } else if (p3.price> p2.price &&p3.price> p1.price &&p3.price> p4.price) {
            System.out.println("The name is "+p3.name+" and The quantity is "+p3.quantity);
        }else {
            System.out.println("The name is "+p4.name+" and The quantity is"+p4.quantity);
        }

    }


}


