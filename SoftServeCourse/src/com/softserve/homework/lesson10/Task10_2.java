package homework.lesson10;
import java.util.*;
public class Task10_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> personMap = new HashMap<>();
        input(personMap,scan);
        removeSamePersonName(personMap,scan);
    }
    public static void input(Map<String,String> pMap,Scanner scan){
        int i = 0;
        do{
            System.out.print("Enter first name:");
            String firstName = scan.nextLine();
            System.out.print("Enter second name:");
            String lastName = scan.nextLine();
            pMap.put(lastName,firstName);
            i++;
        }while(i < 4);
        printMap(pMap);
    }
    public static void removeSamePersonName(Map<String,String> pMap,Scanner scan){
        System.out.println("Do you want to delete person?(yes/no)");
        String answer = scan.nextLine();
        if(answer.equals("no")){
            System.out.println("Okay,goodbye.");
        }
        else if(answer.equals("yes")) {
            System.out.print("Input person name:");
            String name = scan.nextLine();
            for (Map.Entry<String, String> entry : pMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    pMap.remove(entry.getKey());
                    printMap(pMap);
                    break;
                }
            }
        }
        else {
            System.out.println("Incorrect answer.");
        }

    }
    public static void printMap(Map<String,String> pMap){
        System.out.println("Your map:");
        for(Map.Entry<String,String> entry : pMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

