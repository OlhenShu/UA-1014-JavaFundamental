package machine;

import java.util.HashMap;
import java.util.Map;

public class Shop {
    private final ManageMenu menu = new ManageMenu();
    HashMap<CoffeeTypes,Integer> soldOut;
    double profit;
    private double money;
    private int level;
    private CoffeeMachine coffeeMachine;
    private int checkForMap;

    public Shop(double money, CoffeeMachine coffeeMachine, int level) {
        this.money = money;
        this.coffeeMachine = coffeeMachine;
        this.level = level;
        soldOut = new HashMap<>();
        checkForMap = 0;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public CoffeeMachine getCoffeeMachine() {
        return coffeeMachine;
    }

    public int getLevel() {
        return level;
    }

    public int getCheckForMap() {
        return checkForMap;
    }

    public void setCheckForMap(int checkForMap) {
        this.checkForMap = checkForMap;
    }

    public void setSoldOut(Shop shop, CoffeeTypes type){
        if(shop.getCheckForMap() == 0){
            shop.getSoldOut().put(CoffeeTypes.ESPRESSO,0);
            shop.getSoldOut().put(CoffeeTypes.CAPPUCCINO,0);
            shop.getSoldOut().put(CoffeeTypes.LATTE,0);
            shop.setCheckForMap(1);
        }
        else if(shop.getCheckForMap() == 2){
            shop.getSoldOut().put(CoffeeTypes.AMERICANO,0);
            shop.getSoldOut().put(CoffeeTypes.FLAT_WHITE,0);
            shop.setCheckForMap(3);
        }
        for (Map.Entry<CoffeeTypes,Integer> entry : shop.getSoldOut().entrySet()) {
            if (entry.getKey().equals(type)) {
                shop.getSoldOut().put(type, entry.getValue() + 1);
            }
        }
        System.out.println("-------------------------------------");
    }

    public HashMap<CoffeeTypes, Integer> getSoldOut() {
        return soldOut;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void shopAction(Shop shop) {
        System.out.println("Good day!We glad to see you!");
        boolean check = true;
        while (check) {
            System.out.println("""
                    Input what do you wish?
                    - Price     - Coffee    
                    - Manage (Only for personal)
                    - Close
                    -------------------------------------
                    """);
            String choice = Main.scan.nextLine().toLowerCase();
            switch(choice){
                case "price" -> Shop.price(shop);
                case "coffee" -> shop.getCoffeeMachine().callMenu(shop);
                case "manage" -> shop.callMenu(shop);
                case "close" -> {
                    System.out.println("Shop closed,see you soon!");
                    check = false;
                }
                default -> System.out.println("Wrong input, try again!");
            }
        }
    }

    /**
     * Метод показує доступну каву та її ціну.
     * @param shop передаю обєкт типу Shop щоб дізнатись якого рівня магазин,адже від рівня залежить кількість
     *             доступної кави
     */
    private static void price(Shop shop){
        if(shop.getLevel() == 1) {
            System.out.println("""
                   Price:
                   Espresso - 5$     Cappuccino - 6$
                   Latte     - 7$    
                   -------------------------------------
                    """);
        }
        else{
            System.out.println("""
                    Price:
                    Espresso - 5$     Cappuccino - 6$
                    Latte     - 7$    Flat White  - 9$
                    Americano  - 8$      
                    -------------------------------------                             
                    """);
        }
    }

    /**
     * Викликає меню в магазині(доступні функції)
     * @param shop
     */
    public void callMenu(Shop shop){
        shop.menu.action(shop);
    }

    /**
     * Клас реалізує собою меню,обєднює декілька методів які надають певний функціонал який доступний в магазині
     */
    private class ManageMenu {
        /**
         * Метод який відображає доступні дії в магазині
         * @param shop обєкт типу Shop, передається для подальшого використання і змін
         */
        private void action(Shop shop) {
            boolean check = true;
            while (check) {
                System.out.println("""
                        Choose action(input number):
                        1."The cups test".      3.Information about profit today.
                        2.Upgrade shop.         4.Back.
                        -------------------------------------
                        """);
                String choice = Main.scan.nextLine().toLowerCase();
                switch (choice) {
                    case "1" -> shop.getCoffeeMachine().howManyCupsMachineHas();
                    case "2" -> shop.menu.upgradeShop(shop);
                    case "3" -> profitToday(shop);
                    case "4" -> check = false;
                    default -> System.out.println("Wrong input try again!");
                }

            }
        }

        /**
         * Метод з допомогою якого можна підняти рівень магазину до другого,перевіряє кількість грошей,якщо сума
         * достатня для підняття рівня,то запитує чи хочимо це зробити
         * @param shop Передається щоб перевірити кількість доступних грошей
         */
        private void upgradeShop(Shop shop) {
            if (shop.getLevel() == 1) {
                System.out.println("If you improve the shop, new types of coffee will appear.You need 600$ for this.");
                if (shop.getMoney() >= 600) {
                    System.out.println("You have enough money.Do you want upgrade shop?(Yes or No)");
                    String choice = Main.scan.nextLine().toLowerCase();
                    switch (choice) {
                        case "yes" -> {
                            System.out.println("Congratulations!New types of coffee will appear" +
                                    "\n-------------------------------------");
                            shop.setMoney(shop.getMoney() - 600);
                            shop.setLevel(shop.getLevel() + 1);
                            shop.setCheckForMap(2);
                        }
                        case "no" -> System.out.println("Return to manage menu");
                    }
                } else {
                    System.out.println("You don't have enough money" + "\n-------------------------------------");
                }
            } else {
                System.out.println("The shop can't be improved anymore" + "\n-------------------------------------");
            }
        }

        /**
         * Метод відображає суму грошей яку заробили на продажі кави за сеанс і яку саме каву продали,і в
         * якій кількості
         * @param shop обєкт типу Shop
         */
        private void profitToday(Shop shop){
            System.out.println("Profit today - " + shop.getProfit());
            HashMap<CoffeeTypes,Integer> testMap = shop.getSoldOut();
            System.out.println("We sold today:");
            for(Map.Entry<CoffeeTypes,Integer> entry : testMap.entrySet()){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
