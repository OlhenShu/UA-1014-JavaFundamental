package homeworkEight;

public abstract class Person {
    protected FullName fullName;
    private int age;

    public Person (FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + getAge();
    }

    public abstract String activity();

    public static class FullName {
        private String firstName;
        private String lastName;

        public FullName (String firstName, String lastName) {
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
