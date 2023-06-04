package homework14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListProduct {
    public  static void main(String[] args){
        List<Product> products = new  ArrayList<>();
        Product product1 = new Product(2016,1000,"Tv");
        Product product2 = new Product(2019,3700,"Computer");
        Product product3 = new Product(2015,2000,"Computer");
        Product product4 = new Product(2023,3800,"Phone");
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);


        Optional<Product> maxus = products.stream().max(Comparator.comparing(Product::getDateOfManufacture));



//




    }
}
