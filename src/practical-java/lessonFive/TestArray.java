package lessonFive;

import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
    
        String[] popularPlantsType = {"Wildflower", "Thistle", "Flower", "Herb", "Mushroom",
        "Weed", "Fern", "Cattail", "Bamboo"};
        Arrays.sort(popularPlantsType);
        System.out.print("Sorted array: ");
        for (String plant : popularPlantsType) {
            System.out.print(plant + ", ");
        }

        int[] oddNumbers = {35, 67, 21, 7, 73};
        System.out.println("\nThe average of current array is: " + getAverage(oddNumbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name of a plant type: ");
        String respond = scanner.nextLine();
        scanner.close();
        boolean found = false;
        for (String plant : popularPlantsType) {
            if (plant.toLowerCase().equals(respond.toLowerCase())) {
                System.out.println("Plant type " + plant + " found");
                found = true;
            }
        }
        if (!found) System.out.println("Unknown plant type: " + respond);
    }

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = Math.round((sum / arr.length) * 100.0) / 100.0 ;
        return average;
    }
}
