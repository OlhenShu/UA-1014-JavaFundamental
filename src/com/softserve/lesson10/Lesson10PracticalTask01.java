package com.softserve.lesson10;

import java.util.*;

public class Lesson10PracticalTask01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        int countMap = 7;
        Random random = new Random();

        for (int i = 0; i < countMap; i++) {
            employeeMap.put(random.nextInt(99) + 1, randomString());
        }
        while (employeeMap.size() != 7) {
            employeeMap.put(random.nextInt(99) + 1, randomString());
        }

        System.out.println(employeeMap);

        System.out.print("Enter an ID: ");
        int id = scanner.nextInt();
        containsKey(employeeMap, id);

        System.out.print("Enter an name: ");
        String name = scanner.next();
        containsValue(employeeMap, name);
    }

    public static void containsKey(Map<Integer, String> map, int key) {
        boolean bl = map.containsKey(key);
        if (bl) {
            System.out.println(key + ": " + map.get(key));
        } else {
            System.out.println("The ID is not found in the map");
        }
    }

    public static void containsValue(Map<Integer, String> map, String name) {
        boolean bl = map.containsValue(name);
        if (bl) {
            for (Map.Entry m : map.entrySet()) {
                if (name.equals(m.getValue())) {
                    System.out.println(m.getKey() + ": " + m.getValue());
                }
            }
        } else {
            System.out.println("The name is not found in the map");
        }
    }

    public static String randomString() {
        Random random = new Random();
        char tmp = (char) (random.nextInt(25) + 65);
        String str = "" + tmp;

        for (int j = 0; j < 5; j++) {
            tmp = (char) (random.nextInt(25) + 97);
            str += tmp;
        }
        return str;
    }
}
