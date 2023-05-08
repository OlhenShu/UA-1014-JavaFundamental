package homework7.Vehicle;

public abstract class Passengers {
    final int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return String.format("passengers: %d", passengers);
    }
}
