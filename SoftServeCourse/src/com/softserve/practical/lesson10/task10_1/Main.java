package practical.lesson10.task10_1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Employee> employeeMap = new HashMap<>();
        input(employeeMap,scanner);
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("ID - " + entry.getKey() + "::" + entry.getValue());
        }
        changeInformation(employeeMap,scanner);
        checkID(employeeMap,scanner);
        checkValue(employeeMap,scanner);
        sorting(employeeMap,scanner);
    }

    public static void checkID(Map<Integer, Employee> map,Scanner scan) {
        System.out.print("Input ID which you want to check : ");
        int check = scan.nextInt();
        if (map.containsKey(check)){
            System.out.println("Correct ID.Name is " + map.get(check).getName());
        }
        else {
            System.out.println("Incorrect ID.");
        }
    }
    public static void checkValue(Map<Integer, Employee> employeeMap,Scanner scan) {
        System.out.print("Input name which you want to check : " + scan.nextLine());
        String name = scan.nextLine();
        boolean check = false;
       for(Map.Entry<Integer,Employee> entry : employeeMap.entrySet()){
           if(employeeMap.get(entry.getKey()).getName().equals(name)){
               System.out.println("Correct name.ID is " + entry.getKey());
               check = true;
           }
       }
        if(!check){
            System.out.println("Incorrect name");
        }
    }
    public static void input(Map<Integer,Employee> employeeMap, Scanner scanner){
        int count = 0;
        do{
            System.out.print("Input ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input name:");
            String name = scanner.nextLine();
            boolean check = false;
            for(Map.Entry<Integer,Employee> entry : employeeMap.entrySet()){
                if (entry.getKey() == id && entry.getValue().getName().equals(name)){
                    check = true;
                }
            }
            if(check){
                System.out.println("This ID and name are duplicates, try again!");
                continue;
            }
            System.out.println("Do you want enter additional information?(yes/no)");
            String choose = scanner.nextLine().toLowerCase();
            if (choose.equals("yes")){
                employeeMap.put(id,new Employee(name));
                System.out.print("Input position:");
                String position = scanner.nextLine();
                System.out.print("Input salary:");
                double salary = scanner.nextDouble();
                System.out.print("Input day of birth:");
                int day = scanner.nextInt();
                System.out.print("Input month of birth:");
                int month = scanner.nextInt();
                System.out.print("Input year of birth:");
                int year = scanner.nextInt();
                employeeMap.get(id).setPosition(position);
                employeeMap.get(id).setSalary(salary);
                employeeMap.get(id).setDateOfBitrh(new DateOfBirth(day,month,year));
            }
            else {
                employeeMap.put(id,new Employee(name));
            }
            count++;
        }while(count < 7);
    }
    public static void changeInformation(Map<Integer,Employee> employeeMap,Scanner scanner){
        do {
            System.out.print("You want change information(yes/no) or input (list) if you want check information" +
                    " about Employees:");
            String answer = scanner.nextLine().toLowerCase();
            if(answer.equals("no")){
                break;
            }
            else if(answer.equals("list")){
                for(Map.Entry<Integer,Employee> entry : employeeMap.entrySet()){
                    System.out.println("ID - " + entry.getKey() + "::" + entry.getValue());
                }
            }
            else if(answer.equals("yes")){
                System.out.print("Input ID who you want to change:");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Input what you want to change(name,position or salary):");
                String change = scanner.nextLine();
                switch (change) {
                    case "name" -> {
                        System.out.print("Enter new name:");
                        String name = scanner.nextLine();
                        employeeMap.get(id).setName(name);
                    }
                    case "position" -> {
                        System.out.print("Enter new position:");
                        String position = scanner.nextLine();
                        employeeMap.get(id).setPosition(position);
                    }
                    case "salary" -> {
                        System.out.print("Enter new salary:");
                        double salary = scanner.nextDouble();
                        employeeMap.get(id).setSalary(salary);
                    }
                    default -> {
                        System.out.println("Incorrect wrote data try again");
                    }
                }
            }
            else {
                System.out.println("Incorrect word,try again.");
            }
        }while(true);
    }
    public static void sorting(Map<Integer,Employee> employeeMap,Scanner scanner){
        System.out.println("By what parameter will we sort(name,id,position)");
        String parameter = scanner.nextLine().toLowerCase();
        switch(parameter) {
            case "name" -> {
                Set<Map.Entry<Integer,Employee>> nameTreeSet = new TreeSet<>(new SortByName());
                nameTreeSet.addAll(employeeMap.entrySet());
                for(var tree : nameTreeSet){
                    System.out.println(tree);
                }
            }
            case "id" -> {
                Set<Map.Entry<Integer,Employee>> idTreeSet = new TreeSet<>(new SortByID());
                idTreeSet.addAll(employeeMap.entrySet());
                for(var tree : idTreeSet){
                    System.out.println(tree);
                };
            }
            case "position" -> {
                Set<Map.Entry<Integer,Employee>> positionTreeSet = new TreeSet<>(new SortByPosition());
                positionTreeSet.addAll(employeeMap.entrySet());
                for(var tree : positionTreeSet){
                    System.out.println(tree);
                }
            }
            default -> System.out.println("Incorrect parameter");
        }
    }
}
