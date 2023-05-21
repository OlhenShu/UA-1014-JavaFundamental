package lesson10.homework;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Melmak", "Alf");
        personMap.put("Baker", "Bob");
        personMap.put("Carpenter", "Claire");
        personMap.put("Dornwood", "Dilan");
        personMap.put("Patrelly", "Etan");
        personMap.put("Drinkwater", "Frank");
        personMap.put("Hurricane", "George");
        personMap.put("Holland", "Ian");
        personMap.put("Wednesday", "Katy");
        personMap.put("Lyutyy", "Orest");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        boolean hasDuplicateFirstName = checkDuplicateFirstName(personMap);
        System.out.println("At least two persons with the same first name? " + hasDuplicateFirstName);


        String firstNameToRemove = "Orest";
        removePersonByFirstName(personMap, firstNameToRemove);

        System.out.println("\nPersonMap after removing '" + firstNameToRemove + "':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    public static boolean checkDuplicateFirstName(Map<String, String> personMap) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : personMap.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }
        for (int count : firstNameCount.values()) {
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    public static void removePersonByFirstName(Map<String, String> personMap, String firstName) {
        personMap.values().removeIf(value -> value.equals(firstName));
    }
}