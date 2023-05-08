package lesson7.practical;

public class PersonDemo {
    public static void main(String[] args) {
        Person[] persons = {
                new Teacher("Alf"),
                new Cleaner("Bob"),
                new Student("Claire")
        };
        for (Person person : persons) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println();
        }
    }
}
