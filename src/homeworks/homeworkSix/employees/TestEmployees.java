package homeworkSix.employees;

public class TestEmployees {
    public static void main(String[] args) {
        
        Employee empl1 = new Employee("Elias", 23, 150_000.50);
        Employee dev1 = new Developer("Augustin", 24, "Senior Java Developer", 200_000.50);

        System.out.println(empl1.report());
        System.out.println(dev1.report());
    }
}
