package project;

import java.util.ArrayList;

public class CoffeeMachine {

    public static void main(String[] args) {
        Machine machine = new Machine(400, 540, 120, 9, 550);

        ArrayList<CoffeeType> coffeeTypes = new ArrayList<>();
        coffeeTypes.add(CoffeeType.ESPRESSO);
        coffeeTypes.add(CoffeeType.LATTE);
        coffeeTypes.add(CoffeeType.CAPPUCCINO);

        machine.action();
    }
}




