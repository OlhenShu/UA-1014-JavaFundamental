package task3_3;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }
    public Person (String fN,String lN) {
        this.firstName = fN;
        this.lastName = lN;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getAge() {
        return Year.now().getValue() - getBirthYear();
    }
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name");
        setFirstName(scan.nextLine());
        System.out.println("Enter the last name");
        setLastName(scan.nextLine());
        System.out.println("Enter the year of birth");
        setBirthYear(scan.nextInt());
    }
    public void output(){
        System.out.printf("Full name: %s %s%nYear of birth: %d%nAge: %d",getFirstName(),getLastName(),getBirthYear(),getAge());
    }
    public void changeName(String fN,String lN){
        this.firstName = fN;
        this.lastName = lN;
    }
}
