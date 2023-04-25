package practical.practical04.task2;

import java.util.Scanner;
public enum Weekday {
    MONDAY("Понеділок", "Monday"), TUESDAY("Вівторок", "Tuesday"),
    WEDNESDAY("Середа", "Wednesday"), THURSDAY("Четвер", "Thursday"),
    FRIDAY("П'ятниця", "Friday"), SATURDAY("Субота", "Saturday"),
    SUNDAY("Неділя", "Sunday");
    private final String ua;
    private final String en;


    Weekday(String ua, String en) {
        this.ua = ua;
        this.en = en;
    }
    public String getUa() {
        return ua;
    }
    public String getEn() {
        return en;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of the day of the week: ");
        Weekday weekday = nameDay(sc.nextInt());
        System.out.println(weekday.getUa() +" "+ weekday.getEn());
        sc.close();
    }
    public static Weekday nameDay(int day){
        if (day == 1) return Weekday.MONDAY;
        if (day == 2) return Weekday.TUESDAY;
        if (day == 3) return Weekday.WEDNESDAY;
        if (day == 4) return Weekday.THURSDAY;
        if (day == 5) return Weekday.FRIDAY;
        if (day == 6) return Weekday.SATURDAY;
        return Weekday.SUNDAY;
    }
}
