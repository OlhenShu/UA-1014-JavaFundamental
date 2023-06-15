package task4_4;

public class Faculty {
    private int numberOfStudents;
    private Season season;
 public Faculty(int numberOfStudents,Season s){
     this.numberOfStudents = numberOfStudents;
     this.season = s;
 }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

@Override
    public String toString(){
     return "Number of the students are " + numberOfStudents
             + ", the season of creation of the faculty is " + season;
}
}
