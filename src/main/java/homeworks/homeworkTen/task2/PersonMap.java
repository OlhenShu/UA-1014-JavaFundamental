package homeworks.homeworkTen.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Gerasym", "Julia");
        map.put("Jordan", "Tim");
        map.put("Batman", "Vasia");
        map.put("Barak", "Obama");
        map.put("Malush", "Natasha");
        map.put("Yenekiuk", "Vasia");
        map.put("Chobotar", "Kolya");
        map.put("Frankofski", "Sebastian");
        map.put("Adronichuk", "Edgar");
        map.put("Daniliuk", "Denis");

        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("First name: " + entry.getValue() + ", Last name: " + entry.getKey());
        }
        
        boolean hasSameName = checkDuplicateNames(map);
        System.out.println("\nDoes it has duplicate names?: " + hasSameName);

        String firstNameToRemove = "Denis";
        removePersonByName(map, firstNameToRemove);
        System.out.println("\nList after removig persin with first name: " + firstNameToRemove + "\n");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("First name: " + entry.getValue() + ", Last name: " + entry.getKey());
        }
    }

    public static boolean checkDuplicateNames(Map<String, String> map) {
        Set<String> firstNames = new HashSet<>();
        for (String firstName : map.values())  {
            if (firstNames.contains(firstName)) return true;
            firstNames.add(firstName);
        }
        return false;
    }

    public static void removePersonByName(Map<String, String> map, String firstName) {
        Iterator<Entry<String, String>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            var entry = it.next();
            if (entry.getValue().equals(firstName)) {
                it.remove();
                break;
            }
        }
    }
}
