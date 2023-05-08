package homework7.Vehicle;

public class WaterTransport extends Passengers implements Vehicle{

    public WaterTransport(int passengers) {
        super(passengers);
    }

    @Override
    public void drive() {}

    @Override
    public void move() {
        System.out.println("Movement on water");
    }
}

class Liner extends WaterTransport{
    final int floor;
    public Liner(int passengers, int floor) {
        super(passengers);
        this.floor = floor;
    }
    public String toString() {
        return String.format("passengers: %s floor: %s", getPassengers(), floor);
    }

}
class Boat extends WaterTransport{
    final int volume;
    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }
    public String toString() {
        return String.format("passengers: %d volume: %d", getPassengers(), volume);
    }


}