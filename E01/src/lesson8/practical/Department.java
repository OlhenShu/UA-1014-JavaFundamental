package lesson8.practical;

class DepartmentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("SoftServe", new Department.Address("Lviv", "Kyivska", 21));
        Department department1 = department.clone();
        System.out.println("department = " + department);
        System.out.println("department1 = " + department1);
        department1.getAddress().setCity("Kyiv");
        System.out.println("department = " + department);
        System.out.println("department1 = " + department1);
    }
}

class Department implements Cloneable {
    private String name;
    Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Department clone() throws CloneNotSupportedException {
        var res = (Department) super.clone();
        res.address = res.address.clone();
        return res;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }

        public void setCity(String city) {
            this.city = city;
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
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
