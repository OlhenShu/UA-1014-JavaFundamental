package practical.lessonEight;

public class Department implements Cloneable {
    private String name;
    private Address address;

    public Department( String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public static class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + " {city = " + getCity() + ", street = " + getStreet() + ", building = " + getBuilding() + "}";
        }

        @Override
        public Address clone() throws CloneNotSupportedException {
            var res = (Address) super.clone();
            return res;
        }
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {name = " + getName() + ", " + getAddress() + "}";
    }

    @Override
    public Department clone() throws CloneNotSupportedException {
        var res = (Department) super.clone();
        res.address = res.address.clone();
        return res;
    }
}
