package homework.homework05.task3;

import java.util.Arrays;

public class Cars {
    private String type;
    private int year;
    private double engineCapacity;
    Cars(String type, int year, double engineCapacity){
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
    public static void main(String[] args){
        Cars car1 = new Cars("Hatchback", 2015, 1.8);
        Cars car2 = new Cars("Sedan",2020, 1.2);
        Cars car3 = new Cars("Minivan", 2018, 1.5);
        Cars car4 = new Cars("Sports car", 2022, 1.6);

        Cars[] cars = sorted(new Cars[]{car1, car2, car3, car4});
        for (int i = 0; i < cars.length; i++){
            System.out.println("Tupe: " +cars[i].getType() + "; Year: " + cars[i].getYear() +
                    "; Engine apacity: " + cars[i].getEngineCapacity() + ".");
        }

    }
    public static Cars[] sorted(Cars[] carsYear){
        Cars tmp;
        for (int i = 0; i<= carsYear.length; i++){
            for (int j = i + 1; j < carsYear.length; j++) {
                if (carsYear[i].getYear() > carsYear[j].getYear()) {
                    tmp = carsYear[i];
                    carsYear[i] = carsYear[j];
                    carsYear[j] = tmp;
                }
            }
        }
        return carsYear;
    }
}
