package homework14;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class homework14Task14 {
    public  static void main(String[] args){
        var products = Stream.of(
                new Product(2016,1000,"Tv"),
                new Product(2019,3700,"Computer"),
                new Product(2015,2000,"Computer"),
                new Product(2023,3800,"Phone"),
                new Product(2022,3500,"Phone"),
                new Product(2017,1700,"Tv"),
                new Product(2020,3700,"Phone")
        );
        Stream< Employee> employees = Stream.of(
                new Employee("Bob"),
                new Employee("Sam"),
                new Employee("Sam"),
                new Employee("Din")
        );

        getFilteredProducts(products);
        mostPopularName(employees);
    }
    static void getFilteredProducts(Stream<Product> products){
        int localDate = LocalDate.now().getYear() - 1;
        products
                .filter(p -> "Phone" .equals( p.getCategory()))
                .filter(p -> p.getDateOfManufacture() <=  localDate)
                .filter(p -> 3000 < p.getPrice()).toList()
                .forEach(System.out :: println);
    }
    static Optional<String> mostPopularName(Stream< Employee> employees) {
        Map<String ,Integer> mapEmployees = employees
                .collect(Collectors.toMap(Employee::getName, e -> 1, Integer::sum));

        Set<Map.Entry<String,Integer>> entries = mapEmployees.entrySet();

        Optional<Map.Entry<String, Integer>> max = entries.stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(max);

        return Optional.empty();
    }
}
