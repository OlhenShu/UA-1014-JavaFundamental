package task4_4;

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(){
    }
    public Product(String n,double p,int q){
        this.name = n;
        this.price = p;
        this.quantity = q;
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
    public void getMostExpensiveProduct(Product p1,Product p2,Product p3,Product p4){
        double max = 0;
        Product pExpensive = null;
        if (p1.getPrice() > max){
            max = p1.getPrice();
            pExpensive = p1;
        }
         if (p2.getPrice() > max){
            max = p2.getPrice();
            pExpensive = p2;
        }
         if (p3.getPrice() > max){
            max = p3.getPrice();
            pExpensive = p3;
        }
         if (p4.getPrice() > max){
            max = p4.getPrice();
            pExpensive = p4;
        }
        System.out.printf("The name of the most expansive product is %s%nQuantity is %d%n",pExpensive.getName(),pExpensive.getQuantity());;
    }
    public void getBiggestQuantityItem(Product p1,Product p2,Product p3,Product p4){
        int maximum = Math.max(Math.max(p1.getQuantity(), p2.getQuantity()),Math.max(p3.getQuantity(), p4.getQuantity()));
        Product pQuantity;
        if (maximum == p1.getQuantity()) {
            pQuantity = p1;
        }
        else if (maximum == p2.getQuantity()) {
            pQuantity = p2;
        }
        else if (maximum == p3.getQuantity()) {
            pQuantity = p3;
        }
        else {
            pQuantity = p4;
        }
        System.out.printf("Name of the product which has the biggest quantity is %s%n",pQuantity.getName());
    }
}

