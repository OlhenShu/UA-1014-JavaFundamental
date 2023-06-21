package machine;
import java.util.ArrayList;
import java.util.Scanner;

public class Machine {
    private int water;
    private int milk;
    private int coffee;
    private int cups;
    private int money;
    private ArrayList<Ingredients> ingredients;

    public Machine(int water, int milk, int coffee, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cups = cups;
        this.money = money;
        ingredientsInt();
    }
    Scanner scanner = new Scanner(System.in);
    protected void ingredientsInt() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredients(1, "espresso", 250, 0, 16, 4));
        ingredients.add(new Ingredients(2, "latte", 350, 75, 20, 7));
        ingredients.add(new Ingredients(3, "cappuccino", 200, 100, 12, 6));

    }
    public void status() {
        System.out.println("\nThe coffee machine has:");
        System.out.printf("%d of water%n", water);
        System.out.printf("%d of milk%n", milk);
        System.out.printf("%d of coffee beans%n", coffee);
        System.out.printf("%d of disposable cups%n", cups);
        System.out.printf("%d of money%n", money);
    }

    public void processAction() {
        boolean exit = true;

        while (exit) {
            System.out.println("Write action (buy, fill, take,remaining, exit): ");

            String action = scanner.nextLine();
            switch (action){
                case "buy" ->  processBuy();
                case "fill" -> processFill();
                case "take" -> processTake();
                case "exit" -> exit = false;
                case "remaining" -> status();
                default -> System.out.println("Unknown command");
            }
        }
    }
    void processBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        try {
            String ingredientsId = scanner.nextLine();
            if (!ingredientsId.equals("back")) {
                makeCoffee(Integer.parseInt(ingredientsId));
            }
        } catch (IllegalArgumentException e){
            System.out.println("Unknown command");
        }
    }

    void processTake() {
        System.out.printf("I gave you $%d%n", money);
        money = 0;
    }

    void processFill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffee += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
    }

    private void makeCoffee(int Id) {
        Ingredients ingredient =
                ingredients
                        .stream()
                        .filter(n -> n.getId() == Id)
                        .findFirst().orElseThrow(IllegalArgumentException ::new);
        if (water >= ingredient.getWater() &&
                milk >= ingredient.getMilk() &&
                coffee >= ingredient.getCoffee() &&
                cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= ingredient.getWater();
            milk -= ingredient.getMilk();
            coffee -= ingredient.getCoffee();
            money += ingredient.getCost();
            cups -= 1;
        } else {
            System.out.println("Sorry, haven't ingredients");
        }
    }
}