package practical.lessonSeven.person;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = new Person[6];
        persons[0] = new Student("Mathias");
        persons[1] = new Teacher("Tobias");
        persons[2] = new Cleaner("Maria");
        persons[3] = new Student("Elias");
        persons[4] = new Teacher("Augustin");
        persons[5] = new Cleaner("Julia");

        for (Person person : persons) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println("");
        }
    }
}
