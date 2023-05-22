package com.softserve.lesson10;

import java.time.LocalDate;
import java.util.*;

public class Lesson10PracticalTask02 {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        int countMap = 3;

        Employee employee = new Employee();
        System.out.println("Employee 0:");
        employee.putName();
        employeeMap.put(0, employee);

        for (int i = 1; i < countMap; i++) {
            employee = new Employee();
            System.out.println("Employee " + i + ":");
            employee.putName();

            for (Map.Entry<Integer, Employee> map : employeeMap.entrySet()) {
                if (employee.equals(map.getValue())) {
                    System.out.println("Duplicates are found");
                    employee.putAll();
                    break;
                }
            }
            employeeMap.put(i, employee);
        }

        System.out.println(employeeMap);
        change(employeeMap);
        System.out.println(employeeMap);
        sortMap(employeeMap);
    }

    public static void change(Map<Integer, Employee> emp) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To input the ID of the record they wish to modify: ");
        int id = scanner.nextInt();

        for (Map.Entry<Integer, Employee> map : emp.entrySet()) {
            if (map.getKey() == id) {
                System.out.print("1 - name, 2 - position, 3 - salary: ");
                int fild = scanner.nextInt();
                Employee employee = map.getValue();

                if (fild == 1) {
                    System.out.print("Input name: ");
                    String name = scanner.next();
                    employee.setName(name);
                } else if (fild == 2) {
                    System.out.print("Input position: ");
                    String position = scanner.next();
                    employee.setPosition(position);
                } else {
                    System.out.print("Input salary: ");
                    double salary = scanner.nextDouble();
                    employee.setSalary(salary);
                }
                break;
            }
        }
    }

    public static void sortMap(Map<Integer, Employee> emp) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sort: 1 - ID, 2 - name, 3 - position: ");
        int indexSort = scanner.nextInt();
        Set<Integer> keys = emp.keySet();
        Collection<Employee> values = emp.values();

        if (indexSort == 1) {
            List<Integer> listKey = new ArrayList<>();
            for (Integer em : keys) {
                listKey.add(em);
            }

            Collections.sort(listKey);
            System.out.println(listKey);

            for (int i = 0; i < listKey.size(); i++) {
                for (Map.Entry<Integer, Employee> map : emp.entrySet()) {
                    if (listKey.get(i) == map.getKey()) {
                        System.out.println(map);
                    }
                }
            }

        } else if (indexSort == 2) {
            List<String> listName = new ArrayList<>();
            for (Employee em : values) {
                listName.add(em.getName());
            }

            Collections.sort(listName);
            System.out.println(listName);

            for (int i = 0; i < listName.size(); i++) {
                for (Map.Entry<Integer, Employee> map : emp.entrySet()) {
                    if (listName.get(i) == map.getValue().getName()) {
                        System.out.println(map);
                    }
                }
            }
        } else {
            List<String> listPosition = new ArrayList<>();
            for (Employee em : values) {
                listPosition.add(em.getPosition());
            }
            Collections.sort(listPosition);
            System.out.println(listPosition);

            for (int i = 0; i < listPosition.size(); i++) {
                for (Map.Entry<Integer, Employee> map : emp.entrySet()) {
                    if (listPosition.get(i) == map.getValue().getPosition()) {
                        System.out.println(map);
                    }
                }
            }
        }
    }
}

class Employee {
    private String name;
    private String position;
    private double salary;
    private LocalDate dateBirth;

    public Employee() {
    }

    public Employee(String name, String position, double salary, LocalDate dateBirth) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void putName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        name = scanner.next();
    }

    public void putAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input position: ");
        position = scanner.next();
        System.out.print("Input salary: ");
        salary = scanner.nextDouble();
        System.out.print("Input year: ");
        int year = scanner.nextInt();
        System.out.print("Input month: ");
        int month = scanner.nextInt();
        System.out.print("Input dayOfMonth: ");
        int dayOfMonth = scanner.nextInt();
        dateBirth = LocalDate.of(year, month, dayOfMonth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(dateBirth, employee.dateBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, dateBirth);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateBirth=" + dateBirth +
                '}';
    }
}