package homework.lesson9.task9_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Integer> grades1 = new ArrayList<>();
        randomInputGrades(grades1);
        students.add(new Student("Sara","ME",1,grades1));
        List<Integer> grades2 = new ArrayList<>();
        randomInputGrades(grades2);
        students.add(new Student("Roman","FI",3,grades2));
        List<Integer> grades3 = new ArrayList<>();
        randomInputGrades(grades3);
        students.add(new Student("Andriy","SO",2,grades3));
        List<Integer> grades4 = new ArrayList<>();
        randomInputGrades(grades4);
        students.add(new Student("Anna","MI",4,grades4));
        System.out.println("Before check average score " + students);
        Student.checkAverageScore(students);
        System.out.println("After check average score " + students);
        System.out.println("Enter the course number you want to check (1-4)");
        Scanner scan = new Scanner(System.in);
        Student.printStudent(students,scan.nextInt());
    }
    public static void randomInputGrades(List<Integer> grades){
        Random random = new Random();
        for (int i = 0;i < 5;i++){
            grades.add(random.nextInt(1,6));
        }
    }

}
