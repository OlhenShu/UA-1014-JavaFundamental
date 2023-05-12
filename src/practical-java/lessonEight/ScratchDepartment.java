package lessonEight;

public class ScratchDepartment {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Holder", new Department.Address("Chernivtsi", "Holovna", 250));
        Department department1 = department.clone();
        System.out.println(department);
        System.out.println(department1);
        department1.getAddress().setCity("Madrid");
        System.out.println(department);
        System.out.println(department1);

    }
}
