package com.softserve.edu04.practicalTask;

/**
 * In main() method create four instances of type Product
 * • Output the name and quantity of the most expensive item;
 * • Output the name of the items, which has the biggest quantity.
 */
public class ProductMain {
    private static Product mostExpensiveProduct;
    private static Product biggestQuantityProduct;

    public static void main(String[] args) {
        Product[] products = {
                new Product("Iphone x", 555, 3),
                new Product("Iphone 14", 600, 1),
                new Product("Xiaomi redmi", 450.66, 7),
                new Product("Samsung s3", 100, 5)
        };

        double maxPrice = 0;
        int maxQty = 0;

        for (Product product : products) {
            double productPrice = product.getPrice();
            int productQuantity = product.getQuantity();

            if (productPrice > maxPrice) {
                maxPrice = productPrice;
                setMostExpensiveProduct(product);
            }
            if (productQuantity > maxQty) {
                maxQty = productQuantity;
                setBiggestQuantityProduct(product);
            }
        }

        System.out.println(getMostExpensiveProduct());
        System.out.println(getBiggestQuantityProduct());
    }

    public static String getMostExpensiveProduct() {
        return String.format("Most expensive product \"%s\", Quantity: %d, Price: %,.2f", mostExpensiveProduct.getName(), mostExpensiveProduct.getQuantity(), mostExpensiveProduct.getPrice());
    }

    public static void setMostExpensiveProduct(Product mostExpensiveProduct) {
        ProductMain.mostExpensiveProduct = mostExpensiveProduct;
    }

    public static String getBiggestQuantityProduct() {
        return String.format("The product \"%s\" has the biggest quantity, Items: %d, Price: %,.2f", biggestQuantityProduct.getName(), biggestQuantityProduct.getQuantity(), biggestQuantityProduct.getPrice());
    }

    public static void setBiggestQuantityProduct(Product biggestQuantityProduct) {
        ProductMain.biggestQuantityProduct = biggestQuantityProduct;
    }
}
