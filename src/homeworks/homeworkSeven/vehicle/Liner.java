package homeworkSeven.vehicle;

public class Liner extends WatterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Engine started. " + getClass().getSimpleName() + " is sailing.");
    }
}
