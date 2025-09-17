class Employee {
    protected String name;
    protected double salary;
}

class Manager extends Employee {
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Alice";
        m.salary = 90000;
        m.displayInfo();
    }
}
