package lesson4.homework;


import java.util.Scanner;


enum Season {
    WINTER ("Winter"), SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn");
    private final String name;

    Season(String name) {
        this.name = name;
    }
}
public class Faculty {
    private int numbers;

    @Override
    public String toString() {
        return "Faculty{" +
                "numbers=" + numbers +
                ", season=" + season +
                '}';
    }

    private Season season;

    public Faculty(int numbers, Season season) {
        this.numbers = numbers;
        this.season = season;
    }
    public int getNumbers() {
        return numbers;
    }

    public Season getSeason() {
        return season;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students for " + Season.WINTER);
        int num1 = scanner.nextInt();
        System.out.println("Enter the number of students for " + Season.SPRING);
        int num2 = scanner.nextInt();
        System.out.println("Enter the number of students for " + Season.SUMMER);
        int num3 = scanner.nextInt();
        System.out.println("Enter the number of students for " + Season.AUTUMN);
        int num4 = scanner.nextInt();

        Faculty faculty1 = new Faculty(num1, Season.WINTER);
        System.out.println(faculty1);
    }
}