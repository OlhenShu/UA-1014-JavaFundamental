package homework7.Vehicle;

public class VehicleMain {
    public static void main(String[] args){
        Passengers[] passengers = {
                new Liner(100, 3),
                new Boat(10, 50),
                new Helicopter(4,3000,4),
                new Plane(15,20),
                new Bus(20, "Through the darkness"),
                new Motorcycle(2,250)
        };

        for (Passengers passenger : passengers){
            System.out.println(passenger.getClass().getSimpleName() + " " + passenger);
            ((Vehicle) passenger).move();
            ((Vehicle) passenger).drive();
            System.out.println(" ");
        }
    }
}
