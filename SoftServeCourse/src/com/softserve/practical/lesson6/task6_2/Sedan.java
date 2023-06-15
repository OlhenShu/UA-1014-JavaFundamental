package practical.lesson6.task6_2;

public class Sedan extends Car {
    public Sedan(String model,double maxSpeed, int yearOfproduction){
        super(model,maxSpeed,yearOfproduction);
    }
    @Override
    public void run(){
        System.out.println("Sedan " + getModel() + " starts driving");
    }
    @Override
    public void stop(){
        System.out.println("Sedan " + getModel() + " stops");
    }
    @Override
    public String toString() {
        return "Sedan: " + super.toString();
    }
}
