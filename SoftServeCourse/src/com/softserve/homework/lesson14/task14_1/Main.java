package homework.lesson14.task14_1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone",LocalDate.of(2011,10,14),3500));
        list.add(new Product("PC",LocalDate.of(2014,11,1),8500));
        list.add(new Product("Phone",LocalDate.of(2019,4,15),3750));
        list.add(new Product("Bicycle",LocalDate.of(2022,11,25),4000));
        list.add(new Product("Phone",LocalDate.of(2023,1,29),2450));
        list.add(new Product("Laptop",LocalDate.of(2018,3,13),8000));
        list.add(new Product("Phone",LocalDate.of(2010,2,20),2700));
        list.add(new Product("CoffeeMachine",LocalDate.of(2022,12,1),4350));
        list.add(new Product("Phone",LocalDate.of(2023,2,27),5500));
        list.add(new Product("PC",LocalDate.of(2017,7,21),10030));
        list.add(new Product("Phone",LocalDate.of(2015,11,6),2700));
        list.add(new Product("Phone",LocalDate.of(2009,10,28),1980));
        list.add(new Product("Bicycle",LocalDate.of(2011,6,27),5500));
        list.add(new Product("Laptop",LocalDate.of(2022,3,2),4750));
        list.add(new Product("Phone",LocalDate.of(2023,1,30),5100));
        list.add(new Product("CoffeeMachine",LocalDate.of(2017,9,9),4700));
        list.add(new Product("Phone",LocalDate.of(2020,11,30),5030));
        list.add(new Product("Phone",LocalDate.of(2022,1,14),6000));
        list.add(new Product("Laptop",LocalDate.of(2016,6,16),6300));
        list.add(new Product("Phone",LocalDate.of(2009,10,18),3010));
//        System.out.println(list);
        LocalDate nowDateMinusOneYear = LocalDate.now().minusYears(1);
        List<Product> sortedList= list.stream()
                .filter(product -> product.getCategory().equals("Phone"))
                .filter(product -> product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufactured().isBefore(nowDateMinusOneYear))
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();
        System.out.println(sortedList);
    }
}
