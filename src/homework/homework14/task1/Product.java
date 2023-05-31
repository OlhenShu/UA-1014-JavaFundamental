package homework.homework14.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Product {
    private String category;
    private LocalDate date;
    private Double price;

    public Product(String category, String date, Double price) {
        this.category = category;
        setDate(date);
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {

        return date;
    }

    public Double getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            this.date = LocalDate.parse(date, formatter);

        }catch (DateTimeParseException e){
        }
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}

class ToDo {
    public static void main(String[] args){
       List<Product> listProduct = Arrays.asList(
               new Product("Phone","10.05.2023",15000.00),
               new Product("Laptop", "04.10.2002", 4000.00),
               new Product("Phone","27.11.2000",1500.00),
               new Product("Phone","11.11.2010",6000.00),
               new Product("Laptop","27.11.2020",35000.00),
               new Product("Phone","10.02.2023",45500.00),
               new Product("Laptop", "07.01.2007", 14000.00),
               new Product("Phone","27.11.2000",1500.00),
               new Product("Phone","08.03.2001",2000.00),
               new Product("Laptop","20.12.2023",60000.00),
               new Product("Phone","10.05.2023",15000.00),
               new Product("Laptop", "04.10.2002", 8000.00),
               new Product("Phone","27.11.2000",1500.00),
               new Product("Phone","07.04.2016",8000.00),
               new Product("Laptop","27.11.2018",25000.00),
               new Product("Phone","30.05.2022",17500.00),
               new Product("Laptop", "07.01.2007", 14000.00),
               new Product("Phone","27.11.2000",1500.00),
               new Product("Phone","08.03.2010",2500.00),
               new Product("Laptop","20.12.2023",60000.00)
               );
       List<Product> filterListProduct = listProduct.stream()
               .sorted(Comparator.comparing(Product::getPrice))
               .filter(product -> product.getCategory() == "Phone")
               .filter(product -> product.getPrice() > 3000.00)
               .filter(product -> {
                   LocalDate today = LocalDate.now();
                   return product.getDate().isBefore(today.minusYears(1));
               })
               .toList();
       for (var product: filterListProduct){
           System.out.println(product);
       }

    }
}
