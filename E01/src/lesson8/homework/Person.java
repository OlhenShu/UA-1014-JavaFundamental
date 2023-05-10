package lesson8.homework;

public abstract class Person implements Cloneable{
    private FullName fullName = new FullName();
    private int age;

    public Person(String firstName, String lastName, int age) {
        fullName.firstName = firstName;
        fullName.lastName = lastName;
        this.age = age;
    }

    public String info() {
        return "First name:  " + fullName.getFirstName() + " Last name: " + fullName.getLastName() + " Age " + age;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    public abstract String activity();

    public class FullName {
        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}


