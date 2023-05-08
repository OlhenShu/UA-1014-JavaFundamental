package homework.lesson7.task7_2;

public class Liner extends WaterVehicle{
    private int floors;
    public Liner(int passengers,int floors){
        super(passengers);
        this.floors = floors;
    }
    @Override
    public void isSailing(){
        System.out.println("The liner is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
