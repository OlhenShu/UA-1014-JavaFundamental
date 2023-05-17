package homework.homework10.task1;

import java.util.*;

public class PersonMap {
    private static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        Map<String, String> personMap = new HashMap<>();
        personMap.put("John","Doe");
        personMap.put("Nancy","Drew");
        personMap.put("Jack","London");
        personMap.put("George","Sand");
        personMap.put("Lesya","Ukrainka");
        personMap.put("Markó","Vovchók");
        personMap.put("Panás","Murny");
        personMap.put("Stepan","Bandera");
        personMap.put("Jane","Doe");
        personMap.put("Orest", "Levitskyi");

        printAll(personMap);
        System.out.println("Enter the name you want to remove:");
        String dellName = sc.nextLine();
        if (personMap.containsKey(dellName)) {
            personMap.remove(dellName);
        }
        printAll(personMap);
    }

    public static void printAll(Map<String, String> personMap){
        System.out.println("Now we have the following names:");
        for (Map.Entry pm : personMap.entrySet()) {
            System.out.println(pm.getKey() + " " + pm.getValue());
        }
    }
}
