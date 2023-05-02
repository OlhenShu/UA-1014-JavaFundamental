package homework5;

public class Car {

    private String type;//Hatchback
    private int  yearProduction;
    private double engineCapacity;

    public Car(String type, int yearProduction, double engineCapacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearProduction=" + yearProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
