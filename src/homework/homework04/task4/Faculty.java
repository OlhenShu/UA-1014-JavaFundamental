package homework.homework04.task4;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty faculty = new Faculty();
        System.out.print("Please enter the number of students in your faculty: ");

        faculty.numberOfStudents = sc.nextInt();

        System.out.print("Please enter the number of current month: ");

        switch (sc.nextInt()) {
            case 1, 2, 12, 11, 10, 9 -> faculty.season = Season.AUTUMN;
            case 3, 4, 5, 6, 7, 8 -> faculty.season = Season.SPRING;
            default -> System.out.println("You have entered an incorrect number." +
                    " Please try another one.");
        }

        System.out.println("Name of this error: " + toString(faculty));

        sc.close();
    }
    public static String toString(Faculty faculty){
        return "Faculty [Amount of students = " + faculty.getNumberOfStudents() + ", season = " + faculty.getSeason().getEn() +"]";}


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