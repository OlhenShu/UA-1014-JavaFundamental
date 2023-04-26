package task4_4;

public class Main {
    public static void main(String[] args) {
        Faculty economic = new Faculty(30,Season.SPRING);
        Faculty biologic = new Faculty(25,Season.AUTUMN);
        Faculty mathematical = new Faculty(20,Season.WINTER);
        System.out.printf("Information about the Faculty of Economics - %s%nInformation about the Faculty of Biologic - %s%nInformation about the Faculty of Mathematical - %s%n",economic.toString(),biologic.toString(),mathematical.toString());
    }
}
