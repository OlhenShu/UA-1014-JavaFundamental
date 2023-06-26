package machine;

import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400,400,100,9,600);
        Shop coffeeShop = new Shop(0,coffeeMachine,1);
       coffeeShop.shopAction(coffeeShop);
    }
}