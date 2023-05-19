package homework.lesson10.task10_3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        input(studentList,scan);
        Student.printStudents(studentList,3);
        sorted(studentList,scan);
        scan.close();
    }
    static List<Student> input(List<Student> list,Scanner scan){
        for(int i = 0;i < 5;i++){
            System.out.print("Input student course:");
            int course = scan.nextInt();
            System.out.print("Input student name:");
            scan.nextLine();
            String name = scan.nextLine();
            list.add(new Student(name,course));
        }
        return list;
    }
    static void sorted(List<Student> list,Scanner scan){
        System.out.println("How will you sorted student?(name or course)");
        String answer = scan.nextLine().toLowerCase();
        if(answer.equals("name")){
            Collections.sort(list,new SortedByName());
            System.out.println(list);
        }
        else if(answer.equals("course")){
            Collections.sort(list,new SortedByCourse());
            System.out.println(list);
        }
        else {
            System.out.println("Incorrect input");
        }
    }
}
