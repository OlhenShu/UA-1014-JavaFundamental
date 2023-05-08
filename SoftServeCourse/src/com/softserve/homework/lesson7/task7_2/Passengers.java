package homework.lesson7.task7_2;

public abstract class Passengers {
    private int passengers;
    protected Passengers(int passengers){
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
