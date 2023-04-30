package homeworkFour;

import java.util.Scanner;

public class Faculty {
    
    public enum Season {WINTER, SPRING, SUMMER, AUTUMN;}
    
    private int students;
    Season season;
    
    Season getSeason(String season) {
        return this.season = switch (season) {
            case "winter" -> Season.WINTER;
            case "spring" -> Season.SPRING;
            case "summer" -> Season.SUMMER;
            case "autumn", "fall" -> Season.AUTUMN;
            default -> Season.WINTER;
        };
    }

    Faculty(int students, String season) {
        this.students = students;
        this.season = getSeason(season);
    }

    public int getStudents() {
        return students;
    }
}

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students and the season: ");
        String input = scanner.nextLine();
        scanner.close();
        String[] split = input.split(" ");
        int students = Integer.parseInt(split[0]);
        String season = split[1];

        Faculty faculty1 = new Faculty(students, season);
        System.out.println("You've entered " + faculty1.getStudents() + " students and season " + faculty1.getSeason(season));
    }
}
