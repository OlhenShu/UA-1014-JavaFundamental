package com.softserve.edu10.personMap;


import java.util.HashMap;
import java.util.Map;

//Create a map called personMap and populate it with ten entries of type <String,
//String>, where each entry corresponds to a person's last name and first name. Display
//the contents of the map on the screen. Are there at least two persons with the same
//first name among these ten people? Remove the person from the map whose first
//name is "Orest" (or any other specified name). Print the resulting map after the
//removal.
public class PersonMap {
    private static final HashMap<String, String> personMap = new HashMap<>();

    public static void populatePersonMap() {
        addPerson("Lyashuk", "Ben");
        addPerson("Shevchuk", "Oleksandr");
        addPerson("Shevchenko", "David");
        addPerson("Mikhailuk", "Michael");
        addPerson("Miller", "Ivan");
        addPerson("Zhuk", "Ivan");
        addPerson("Zhovtnevy", "Orest");
        addPerson("Lyashuk", "Ben");
        addPerson("Shevchuk", "Oleksandr");
        addPerson("Andrushok", "Ivan");
    }

    private static void addPerson(String lastName, String firstName) {
        personMap.put(lastName, firstName);
    }

    public static String checkDuplicateFirstName() {
        Map<String, Integer> firstNameCountMap = new HashMap<>();

        for (String firstName : personMap.values()) {
            firstNameCountMap.put(firstName, firstNameCountMap.getOrDefault(firstName, 0) + 1);
        }

        for (int count : firstNameCountMap.values()) {
            if (count >= 2) {
                return "Yes";
            }
        }

        return "No";
    }

    public static void removePersonByFirstName(String firstName) {
        personMap.values().removeIf(value -> value.equals(firstName));
    }

    public static void displayPersonMap() {
        System.out.println(personMap);
    }
}
