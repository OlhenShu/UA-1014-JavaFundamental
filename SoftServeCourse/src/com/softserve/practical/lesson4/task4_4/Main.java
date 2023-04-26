package task4_4;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Coca-Cola",24.3,20);
        Product p2 = new Product("Fanta",26.2,25);
        Product p3 = new Product("Pepsi",25,20);
        Product p4 = new Product("Morshynska",22.3,35);
        p1.getMostExpensiveProduct(p1,p2,p3,p4);
        p1.getBiggestQuantityItem(p1,p2,p3,p4);
    }

}
