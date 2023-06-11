package homework.homework04.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Faculty {
    private int numberOfStudents;
    private Season season;
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public Season getSeason() {
        return season;
    }
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        faculty.numberOfStudents = getNumberOfStudents("Please enter " +
                    "the number of students in your faculty: ");
        faculty.season = getCurrentMonth("Please enter the number of current month: ");
        System.out.println(toString(faculty));
        //sc.close();
    }
    public static String toString(Faculty faculty){
        return "Faculty [Amount of students = " + faculty.getNumberOfStudents()
                + ", season = " + faculty.getSeason().getEn() +"]";
    }
    static int getNumberOfStudents (String prompt) {
        System.out.print(prompt);
        try {
            int numberOfStudents = sc.nextInt();
            return numberOfStudents;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.nextLine();
            return getNumberOfStudents(prompt);
        }
    }
    static Season getCurrentMonth (String prompt) {
        System.out.print(prompt);
        try {
            int currentMonth = sc.nextInt();
            switch (currentMonth) {
                case 1, 2, 12, 11, 10, 9 -> {
                    return Season.AUTUMN;
                }
                case 3, 4, 5, 6, 7, 8 -> {
                    return Season.SPRING;
                }
                default -> {System.out.println("You have entered an incorrect number." +
                        " Please try another one."); return getCurrentMonth(prompt);}
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.nextLine();
            return getCurrentMonth(prompt);
        }
    }

}
enum Season {
    SPRING("Spring season", "Весняний сезон"), AUTUMN("Autumn season", "Осінній сезон");
    private final String ua;
    private final String en;

    Season(String en, String ua) {
        this.ua = ua;
        this.en = en;
    }

    public String getEn() {
        return en;
    }

    public String getUa() {
        return ua;
    }
}