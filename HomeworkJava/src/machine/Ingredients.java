package machine;

public class Ingredients {
    private int id;
    private String name;
    private int water;
    private int milk;
    private int coffee;
    private int cost;

    public Ingredients(int id, String name, int water, int milk, int coffee, int cost) {
        this.id = id;
        this.name = name;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Ingredients setName(String name) {
        this.name = name;
        return this;
    }
    public int getWater() {
        return water;
    }
        public int getMilk() {
        return milk;
    }
    public int getCoffee() {
        return coffee;
    }
    public int getCost() {
        return cost;
    }
}


