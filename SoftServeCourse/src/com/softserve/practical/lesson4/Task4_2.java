import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the index of the day of the week (1 - 7)");
        int indexOfTheDay = scan.nextInt();
        scan.close();
        if (indexOfTheDay > 7 || indexOfTheDay <= 0) {
            System.out.println("Wrong index input!Return index 1");
            indexOfTheDay = 1;
        }
        switch (indexOfTheDay) {
            case 1:
                System.out.println("Monday/Понеділок");
                break;
            case 2:
                System.out.println("Tuesday/Вівторок");
                break;
            case 3:
                System.out.println("Wednesday/Середа");
                break;
            case 4:
                System.out.println("Thursday/Четвер");
                break;
            case 5:
                System.out.println("Friday/П'ятниця");
                break;
            case 6:
                System.out.println("Saturday/Субота");
                break;
            default:
                System.out.println("Sunday/Неділя");

        }
    }
}
