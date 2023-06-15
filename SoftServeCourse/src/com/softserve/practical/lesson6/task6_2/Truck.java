package practical.lesson6.task6_2;

public class Truck extends Car{
    public Truck(String model,double maxSpeed, int yearOfproduction){
        super(model,maxSpeed,yearOfproduction);
    }
    @Override
    public void run(){
        System.out.println("Truck " + getModel() + " starts driving");
    }
    @Override
    public void stop() {
        System.out.println("Truck " + getModel() + " stops");
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString();
    }
}
