package com.softserve.lesson10;

import java.util.*;

public class Lesson10Homework02 {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        Name name;

        for (int i = 0; i < 3; i++) {
            name = new Name();
            name.putName();
            personMap.put(name.getFirstName(), name.getLastName());
        }

        System.out.println(personMap);
        sameName(personMap);
        removeOrest(personMap);
        System.out.println(personMap);
    }

    public static void sameName(Map<String, String> map) {
        System.out.println("Same name");
        List<String> arr = new ArrayList<>();
        List<String> element = new ArrayList<>();
        arr.addAll(map.values());

        for (int i = 0; i < arr.size(); i++) {
            element.clear();
            String str = arr.get(i);

            for (int j = arr.size() - 1; j >= 0; j--) {
                if (str.equals(arr.get(j))) {
                    element.add(arr.get(j));
                    arr.remove(j);
                }
            }

            if (element.size() > 1) {
                System.out.println(element);
            }
        }
    }

    public static void removeOrest(Map<String, String> map) {
        System.out.println("Remove Orest ");
        map.remove("Orest");
    }
}

class Name {
    private String firstName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void putName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input firstName: ");
        firstName = scanner.next();
        System.out.print("Input lastName: ");
        lastName = scanner.next();
    }
}
