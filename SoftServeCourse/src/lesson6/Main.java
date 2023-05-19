package Students;

import java.util.Locale;
import java.util.Scanner;

import static Students.Student.printStudentStats;

public class Main {
    static public final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        printStudentStats();

        Student student1 = new Student();
        Student.promptParameters(student1);
        printStudentStats();

        Student student2 = new Student();
        Student.promptParameters(student2);
        printStudentStats();

        Student student3 = new Student();
        Student.promptParameters(student3);
        printStudentStats();

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}