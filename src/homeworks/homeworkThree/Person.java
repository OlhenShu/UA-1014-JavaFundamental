package homeworkThree;
import java.util.Calendar;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() { 
        return this.lastName;
    }

    public int getBirthYear() { 
        return this.birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void sentLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {};

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }

    public void input(Scanner scanner) {
        System.out.print("Enter the first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("\nEnter the last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("\nEnter the birth year: ");
        this.birthYear = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Person [first name = " + firstName + ", last name = " + lastName + ", birth year = " + birthYear + "]";
    }
    
    public void output() {
        System.out.println(toString());
    }

    public void changeName(String fn, String ln) {
        if (fn != null) this.firstName = fn;
        if (ln != null) this.lastName = ln;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person personOne = new Person();
        personOne.input(scanner);
        personOne.output();

        Person personTwo = new Person();
        personTwo.input(scanner);
        personTwo.output();

        Person personThree = new Person();
        personThree.input(scanner);
        personThree.output();

        Person personFour = new Person();
        personFour.input(scanner);
        personFour.output();

        Person personFive = new Person();
        personFive.input(scanner);
        personFive.output();

        scanner.close();
    }
}
