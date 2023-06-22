package project;


import java.util.Scanner;

public class Machine {
    private final static Scanner scanner = new Scanner(System.in);

    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;

    public Machine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public void remaining() {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
        action();
    }


    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        action();
    }

    public void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int addCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:  ");
        int addCups = scanner.nextInt();
        water += addWater;
        milk += addMilk;
        coffeeBeans += addCoffeeBeans;
        disposableCups += addCups;
        action();
    }

    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String action2 = scanner.next();

        try {
            switch (action2) {
                case "1" -> prepareCoffee(CoffeeType.ESPRESSO);
                case "2" -> prepareCoffee(CoffeeType.LATTE);
                case "3" -> prepareCoffee(CoffeeType.CAPPUCCINO);
                case "back" -> action();
                default -> throw new IllegalArgumentException("Unknown action");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal input. Please try again.");
            buy();
        }
    }

    public void prepareCoffee(CoffeeType coffeeType) {

        if (water > coffeeType.getWater() && milk > coffeeType.getMilk() && coffeeBeans > coffeeType.getBeans() && disposableCups > 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= coffeeType.getWater();
            milk -= coffeeType.getMilk();
            coffeeBeans -= coffeeType.getBeans();
            money += coffeeType.getPrice();
            disposableCups--;
            action();
        } else {
            if (coffeeBeans < coffeeType.getBeans()) {
                System.out.println("Sorry, not enough beans!");
                action();
            } else if (water < coffeeType.getWater()) {
                System.out.println("Sorry, not enough water!");
                action();
            } else if (milk < coffeeType.getMilk()) {
                System.out.println("Sorry, not enough milk!");
                action();
            } else if (disposableCups < 1) {
                System.out.println("Sorry, not enough cups!");
                action();
            }
        }

    }

    public void action() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action = scanner.next();

        try {
            switch (action) {

                case "buy" -> buy();

                case "fill" -> fill();

                case "take" -> take();

                case "remaining" -> remaining();

                case "exit" -> System.exit(0);

                default -> throw new IllegalArgumentException("Unknown action");

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal input. Please try again");
            action();
        }
    }
}



