package lessonFour;

public class Product {

    private String name;
    private String brand;
    private double price;
    private int quantity;

    public Product(String name, String brand, double price, int quantity) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this. quantity = quantity;
    }

    public Product() {};

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Main {
    public static void main(String[] args) {
        Product jeans = new Product("jeans", "Tommy Hilfiger", 99.99, 79);
        Product shirt = new Product("shirt", "Disel", 49.99, 99);
        Product sneakers = new Product("sneakers", "Nike Jordan", 120.99, 34);
        Product cap = new Product("cap", "Lacoste", 45.99, 58);

        Product expensiveItem = mostExpensiveItem(jeans, shirt, sneakers, cap);
        Product biggestQnty = biggestQuantity(jeans, shirt, sneakers, cap);

        System.out.println("Most expensive item: " + expensiveItem.getName() + " " + expensiveItem.getBrand());
        System.out.println("Biggest quantity: " + biggestQnty.getName() + " " + biggestQnty.getBrand());
    }

    public static Product mostExpensiveItem(Product a, Product b, Product c, Product d) {
        Product[] priceArr = {a, b, c, d};
        Product max = priceArr[0];
        for(int i = 0; i < priceArr.length; i++) {
            if (max.getPrice() < priceArr[i].getPrice()) max = priceArr[i];
        }
        return max;
    }

    public static Product biggestQuantity(Product a, Product b, Product c, Product d) {
        Product[] quantityArr = {a, b, c, d};
        Product  max = quantityArr[0];
        for(int i = 0; i < quantityArr.length; i++) {
            if (max.getQuantity() < quantityArr[i].getQuantity()) max = quantityArr[i];
        }
        return max;
    }
}
