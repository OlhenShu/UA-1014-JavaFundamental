package com.softserve.edu04;

import java.util.Scanner;

/**
 * Create a class called Faculty and input the information about the number of students (using
 * the console) and the current season (using enum). Each season must have a name in English
 * (use the constructor). In main() method, check the correct operation of the code.
 */
public class Faculty {
    enum Season {
        SPRING("Spring"),
        SUMMER("Summer"),
        AUTUMN("Fall"),
        WINTER("Winter");

        private final String seasonName;

        Season(String seasonName) {
            this.seasonName = seasonName;
        }

        public String getSeasonName() {
            return seasonName;
        }
    }

    private final int numStudents;
    private final Season currentSeason;

    public Faculty(int numStudents, Season currentSeason) {
        this.numStudents = numStudents;
        this.currentSeason = currentSeason;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();

        System.out.print("Enter current season: ");
        String seasonName = input.next();
        input.close();

        Season currentSeason = Season.valueOf(seasonName.toUpperCase());
        Faculty faculty = new Faculty(numStudents, currentSeason);

        System.out.printf("Faculty has %d students and it's currently %s season.", faculty.numStudents, faculty.currentSeason.getSeasonName());
    }
}
