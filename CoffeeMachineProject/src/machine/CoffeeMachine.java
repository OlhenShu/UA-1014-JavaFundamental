package machine;

import java.util.InputMismatchException;

/**
 * Клас CoffeeMachine працює як кавова машина,можна купити каву,поповнити запаси молока,води,бобів аюо стаканчиків
 * також присутня можливість забрати гроші з машини до магазину,на початку доступно три види кави,дальше буде відкриватись
 * ще
 */
public class CoffeeMachine {
    private static final String WRONG_INPUT = "Wrong input, try again";
    private final Menu menu = new Menu();
    private int needWater = 200;
    private int needMilk = 50;
    private int needCoffeeBeans = 15;
    private double needMoney = 0;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private double money;
    private CoffeeTypes coffeeType;

    public CoffeeMachine() {
    }

    public CoffeeMachine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public int setCupsOfCoffeeNeed() {

        while (true) {
            try {
                System.out.println("Write how many cups of coffee you will need:");
                return Main.scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(WRONG_INPUT);
                Main.scan.nextLine();
            }
        }
    }

    /**
     * Трішки покращенний сеттер який використовує цикл while і ввід з сканнера до того часу поки
     * все не буде зроблено правильно,блок try-catch забезпечує захист від помилок.Використовується
     * в цьому методі і ще двох(setMilk,setCoffeeBeans)
     */
    public void setWater() {
        while (true) {
            try {
                System.out.println("Write how many ml of water the coffee machine has:");
                this.water = Main.scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(WRONG_INPUT);
                Main.scan.nextLine();
            }
        }
    }

    public void setMilk() {
        while (true) {
            try {
                System.out.println("Write how many ml of milk the coffee machine has:");
                this.milk = Main.scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(WRONG_INPUT);
                Main.scan.nextLine();
            }
        }
    }

    public void setCoffeeBeans() {
        while (true) {
            try {
                System.out.println("Write how many g of beans the coffee machine has:");
                this.coffeeBeans = Main.scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println(WRONG_INPUT);
                Main.scan.nextLine();
            }
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public CoffeeTypes getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeTypes coffeeType) {
        this.coffeeType = coffeeType;
    }


    /**
     * Метод просить вибрати тип кави,кількість ресурсів в кавовій машині,та кількість стаканчиків кави
     * яку ви бажаєте приготувати.Метод підраховує скільки стаканів кави можна приготувати з цих ресурсів
     * після чого порівнює кількість доступних стаканів кави та кількість яку ви хочете приготувати і видає
     * відповідь в залежності чи зможе приготувати стільки чи ні.
     */
    public void howManyCupsMachineHas() {
        System.out.println("In this test you input resources for coffee machine, and cups what you need. " +
                "For these data you can check how many cups of coffee, the machine can make. " +
                "-------------------------------------");
        CoffeeMachine testMachine = new CoffeeMachine();
        testMachine.setWater();
        testMachine.setMilk();
        testMachine.setCoffeeBeans();
        System.out.println("""
                Select the type of coffee that will be taken for the test:
                1 - Espresso    4 - Americano
                2 - Latte       5 - Flat White
                3 - Cappuccino
                -------------------------------------
                """);
        Main.scan.nextLine();
        String choice = Main.scan.nextLine();
        switch (choice) {
            case "1" -> testMachine.coffeeTypeNeedResources(CoffeeTypes.ESPRESSO, testMachine);
            case "2" -> testMachine.coffeeTypeNeedResources(CoffeeTypes.LATTE, testMachine);
            case "3" -> testMachine.coffeeTypeNeedResources(CoffeeTypes.CAPPUCCINO, testMachine);
            case "4" -> testMachine.coffeeTypeNeedResources(CoffeeTypes.AMERICANO, testMachine);
            case "5" -> testMachine.coffeeTypeNeedResources(CoffeeTypes.FLAT_WHITE, testMachine);
            default -> {
                System.out.println("Incorrect input,let's do test from espresso!");
                testMachine.coffeeTypeNeedResources(CoffeeTypes.ESPRESSO, testMachine);
            }
        }
        int cupsNeed = setCupsOfCoffeeNeed();
        int cupsHas = 0;
        while ((testMachine.water -= needWater) >= 0 && (testMachine.milk -= needMilk) >= 0
                && (testMachine.coffeeBeans -= needCoffeeBeans) >= 0) {
            cupsHas++;
        }
        if (cupsHas == cupsNeed) {
            System.out.println("Yes, I can make that amount of coffee" + "\n-------------------------------------");
        } else if (cupsHas < cupsNeed) {
            System.out.println("No, I can make only " + cupsHas + " cup(s) of coffee" +
                    "\n-------------------------------------");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsHas - cupsNeed) +
                    " more than that)" + "\n-------------------------------------");
        }
        Main.scan.nextLine();
    }

    /**
     * Метод який виводить в консоль процес приготування кави.Залежно від того чи має кава молоко в собі чи ні,
     * додається одне речення в опис приготування.
     */
    public String makingCoffee(CoffeeTypes type) {
        if (type.equals(CoffeeTypes.AMERICANO) || type.equals(CoffeeTypes.ESPRESSO)) {
            return """
                    Starting to make a coffee
                    Grinding coffee beans
                    Boiling water
                    Mixing boiled water with crushed coffee beans
                    Pouring coffee into the cup
                    Coffee is ready!
                    -------------------------------------
                    """;
        } else {
            return """
                    Starting to make a coffee
                    Grinding coffee beans
                    Boiling water
                    Mixing boiled water with crushed coffee beans
                    Pouring coffee into the cup
                    Pouring some milk into the cup
                    Coffee is ready!
                    -------------------------------------
                    """;
        }
    }

    /**
     * Метод для виклику внутрішнього приватного классу Menu,через обєкт типу CoffeeMachine
     *
     * @param shop передаю обєкт типу shop який містить в собі обєкт класу CoffeeMachine для його подальшої зміни
     */
    public void callMenu(Shop shop) {
        menu.action(shop);
    }

    /**
     * Метод змінює потребності в ресурсах для приготування напою залежно від типу кави.
     *
     * @param type    Енум типів кави які доступні у кавовій машині
     * @param machine використовується для запису осаннього типу кави який вибрав покупець
     */
    private void coffeeTypeNeedResources(CoffeeTypes type, CoffeeMachine machine) {
        switch (type) {
            case ESPRESSO -> {
                needWater = 250;
                needMilk = 0;
                needCoffeeBeans = 16;
                needMoney = 5;
                machine.setCoffeeType(type);
            }
            case LATTE -> {
                needWater = 350;
                needMilk = 75;
                needCoffeeBeans = 20;
                needMoney = 7;
                machine.setCoffeeType(type);
            }
            case CAPPUCCINO -> {
                needWater = 200;
                needMilk = 100;
                needCoffeeBeans = 12;
                needMoney = 6;
                machine.setCoffeeType(type);
            }
            case AMERICANO -> {
                needWater = 350;
                needMilk = 0;
                needCoffeeBeans = 16;
                needMoney = 8;
                machine.setCoffeeType(type);
            }
            case FLAT_WHITE -> {
                needWater = 250;
                needMilk = 75;
                needCoffeeBeans = 20;
                needMoney = 9;
                machine.setCoffeeType(type);
            }
        }

    }


    @Override
    public String toString() {
        return String.format("The coffee machine has:%n%d ml of water%n%d ml of milk%n" +
                        "%d g of coffee beans%n%d disposable cups%n$%.2f of money%n-------------------------------------",
                water, milk, coffeeBeans, disposableCups, money);
    }

    /**
     * Клас Menu потрібен для реалізації функцій меню у кавовій машині,сам клас і методи є приватними,вмкликаються
     * через створений фінальний обєкт menu.Одже клас реалізовує такі функції як купити(buy), поповнити ресурси(fill),
     * забрати гроші з кавової машини до магазину(take),переглянути скільки залишилось ресурсів(remaining) і останнє
     * це метод для виходу з меню(exit).Всі методи даного класу приймають обєкт типу Shop для зміни обєкта типу
     * CoffeeMachine який належить йому.
     */
    private class Menu {
        /**
         * Метод для вибору подальших дій,використовує цикл while для того щоб користувач якщо і введе некоректну
         * операцію,зміг би пробувати знову і знову поки не пропише exit.
         *
         * @param shop для передачі обєкту типу CoffeeMachine
         */
        private void action(Shop shop) {
            boolean check = false;
            while (!check) {
                System.out.println("""
                        Write action:
                        - Buy     - Fill                 
                        - Take    - Remaining
                        - Exit
                        -------------------------------------
                        """);
                String action = Main.scan.nextLine().toLowerCase();
                switch (action) {
                    case "buy" -> menu.buy(shop);
                    case "fill" -> menu.fill(shop);
                    case "take" -> menu.take(shop);
                    case "remaining" -> menu.remaining(shop);
                    case "exit" -> {
                        check = true;
                    }
                    default -> System.out.println(WRONG_INPUT);
                }
            }
        }

        /**
         * Метод buy - тобто "купити".Позволяє купити тип кави який вибере покупець,при першому рівні магазину
         * доступні 3 види кави і плюс два види ще коли розширити магазин.Одже при виборі виду кави викликається
         * метож coffeeTypeNeedResources і передає тип кави який вибрав користувач,після цього кавова машина
         * переглядає чи достатньо ресурсів для приготування.Якщо так,то виводиться текст про приготування кави
         * вираховує потрібну кількість ресурсів з машини,додає гроші за каву та ще записує ці гроші до загальної
         * суми доходу і вписує яку саме каву було продано.Якщо ж ресурсів не достатньо,то програма виведе чого саме
         * не хватає і завершить виконання методу.
         *
         * @param shop обєкт класу Shop який містить обєкт класу CoffeeMachine
         * @return можна звісно зробити метод типу void,але я використовую return щоб вийти з методу при певному
         * розщвитку подій
         */
        private CoffeeMachine buy(Shop shop) {
            if (shop.getLevel() == 1) {
                System.out.println("""
                        What you want to buy?(input number)
                        1 - Espresso   3 - Cappuccino
                        2 - Latte      4 - Back
                        -------------------------------------
                        """);
                String choice = Main.scan.nextLine();
                switch (choice) {
                    case "1" ->
                            shop.getCoffeeMachine().coffeeTypeNeedResources(CoffeeTypes.ESPRESSO, shop.getCoffeeMachine());
                    case "2" ->
                            shop.getCoffeeMachine().coffeeTypeNeedResources(CoffeeTypes.LATTE, shop.getCoffeeMachine());
                    case "3" ->
                            shop.getCoffeeMachine().coffeeTypeNeedResources(CoffeeTypes.CAPPUCCINO, shop.getCoffeeMachine());
                    case "4" -> {
                        return shop.getCoffeeMachine();
                    }
                    default -> {
                        System.out.println("Sorry, a coffee machine doesn't have this function ");
                        return shop.getCoffeeMachine();
                    }
                }
            } else {
                System.out.println("""
                        What you want to buy?(input number)
                        1 - Espresso    4 - Americano
                        2 - Latte       5 - Flat White
                        3 - Cappuccino  6 - Back
                        -------------------------------------
                        """);
                String choice = Main.scan.nextLine();
                switch (choice) {
                    case "1" ->
                            shop.getCoffeeMachine().coffeeTypeNeedResources(CoffeeTypes.ESPRESSO, shop.getCoffeeMachine());
                    case "2" ->
                            shop.getCoffeeMachine().coffeeTypeNeedResources(CoffeeTypes.LATTE, shop.getCoffeeMachine());
                    case "3" ->
                            shop.getCoffeeMachine().coffeeTypeNeedResources(CoffeeTypes.CAPPUCCINO, shop.getCoffeeMachine());
                    case "4" ->
                            shop.getCoffeeMachine().coffeeTypeNeedResources(CoffeeTypes.AMERICANO, shop.getCoffeeMachine());
                    case "5" ->
                            shop.getCoffeeMachine().coffeeTypeNeedResources(CoffeeTypes.FLAT_WHITE, shop.getCoffeeMachine());
                    case "6" -> {
                        return shop.getCoffeeMachine();
                    }
                    default -> {
                        System.out.println("Sorry, a coffee machine doesn't have this function ");
                        return shop.getCoffeeMachine();
                    }
                }
            }
            if (shop.getCoffeeMachine().water >= needWater && shop.getCoffeeMachine().milk >= needMilk &&
                    shop.getCoffeeMachine().coffeeBeans >= needCoffeeBeans && shop.getCoffeeMachine().disposableCups > 0) {
                shop.getCoffeeMachine().water -= needWater;
                shop.getCoffeeMachine().milk -= needMilk;
                shop.getCoffeeMachine().coffeeBeans -= needCoffeeBeans;
                shop.getCoffeeMachine().disposableCups -= 1;
                shop.getCoffeeMachine().money += needMoney;
                System.out.println("I have enough resources, making you " + shop.getCoffeeMachine().getCoffeeType());
                System.out.println(shop.getCoffeeMachine().makingCoffee(shop.getCoffeeMachine().getCoffeeType()));
                shop.setSoldOut(shop, shop.getCoffeeMachine().getCoffeeType());
                shop.setProfit(shop.getProfit() + shop.getCoffeeMachine().needMoney);
                return shop.getCoffeeMachine();
            } else {
                if (shop.getCoffeeMachine().water < shop.getCoffeeMachine().needWater) {
                    System.out.println("Sorry, not enough water!");
                }
                if (shop.getCoffeeMachine().milk < needMilk) {
                    System.out.println("Sorry, not enough milk!");
                }
                if (shop.getCoffeeMachine().coffeeBeans < needCoffeeBeans) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                if (shop.getCoffeeMachine().disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                }
            }
            return shop.getCoffeeMachine();
        }

        /**
         * Метод який поповнює кількість ресурсів в кавовій машині,по черзі запитує скільки і чого добавити.
         * Якщо введення не вірне в консолі про це виведеться повідомлення і доведеться вводити спочатку.Метод
         * записує дані в проміжні змінні в яких перед назвою ресурса є add і якщо все введено коректно,додає
         * введену кількість до кавової машини.
         *
         * @param shop обєкт класу Shop який містить обєкт класу CoffeeMachine
         * @return повертає кавову машину
         */
        private CoffeeMachine fill(Shop shop) {
            int addWater = 0;
            int addMilk = 0;
            int addCoffeeBeans = 0;
            int addDisposableCups = 0;
            boolean check = false;
            while (!check) {
                try {
                    System.out.println("Write how many ml of water you want to add:");
                    addWater = Main.scan.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    addMilk = Main.scan.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    addCoffeeBeans = Main.scan.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    addDisposableCups = Main.scan.nextInt();
                    System.out.println("-------------------------------------");
                    check = true;
                } catch (InputMismatchException e) {
                    System.out.println(WRONG_INPUT);
                    Main.scan.nextLine();
                }
            }
            shop.getCoffeeMachine().water += addWater;
            shop.getCoffeeMachine().milk += addMilk;
            shop.getCoffeeMachine().coffeeBeans += addCoffeeBeans;
            shop.getCoffeeMachine().disposableCups += addDisposableCups;
            Main.scan.nextLine();
            return shop.getCoffeeMachine();
        }

        /**
         * Метод який забирає всі гроші з кавової машини і переносить їх в обєкт класу shop, для їх подальшого
         * використання.
         *
         * @param shop обєкт класу Shop який містить обєкт класу CoffeeMachine
         * @return повертає кавову машину
         */
        private CoffeeMachine take(Shop shop) {
            System.out.println("I take $" + money + " from machine to shop" + "\n-------------------------------------");
            shop.setMoney(shop.getMoney() + shop.getCoffeeMachine().getMoney());
            shop.getCoffeeMachine().setMoney(0);

            return shop.getCoffeeMachine();
        }

        /**
         * Метод виводить в консоль метод toString() для ковової машини,відображає залишки ресурсів у ній
         *
         * @param shop обєкт класу Shop який містить обєкт класу CoffeeMachine
         */
        private void remaining(Shop shop) {
            System.out.println(shop.getCoffeeMachine().toString());
        }
    }
}


