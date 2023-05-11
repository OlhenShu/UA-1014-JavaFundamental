package homework8;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public String info(){
        return String.format("First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age);
    }

    public abstract String activity();

    public static class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

}
