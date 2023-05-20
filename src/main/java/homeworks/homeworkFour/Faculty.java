package homeworks.homeworkFour;

import java.util.Scanner;

public class Faculty {
    
    public enum Season {WINTER, SPRING, SUMMER, AUTUMN;}
    
    private int students;
    Season season;
    
    Season checkSeason(String season) {
        switch (season.toLowerCase()) {
            case "winter": return Season.WINTER;
            case "spring": return Season.SPRING;
            case "summer": return Season.SUMMER;
            case "autumn": case "fall": return Season.AUTUMN;
            default: throw new IllegalArgumentException("Unknown season: " + season);
        }
    }

    Faculty(int students, String season) {
        this.students = students;
        this.season = checkSeason(season);
    }

    public int getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Faculty [students = " + students + ", curent season = " + season + "]";
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
        System.out.println(faculty1.toString());
    }
}
