package homework.lesson6.task6_2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Valentyn",25,700),
                new Developer("Vladislav",36,1500,"Middle Java Dev"),
                new Employee("Galyna",30,900),
                new Developer("Nastya",21,600,"Junior Java Dev"),
        };
        for(Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
