package homework14;

public class Product {
    private int dateOfManufacture;
    private int price;
    private String category;

    public Product(int dateOfManufacture, int price, String category) {
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
        this.category = category;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
