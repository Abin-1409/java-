class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary + "\n");
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeRegistry {
    public static void promote(Employee emp, double bonus) {
        emp.updateSalary(emp.getSalary() + bonus);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(101, "Alice", 50000.0);
        employees[1] = new Employee(102, "Bob", 60000.0);
        employees[2] = new Employee(103, "Charlie", 70000.0);

        System.out.println("Employee Details:\n");
        for (Employee e : employees) e.displayEmployee();

        employees[0].updateSalary(55000.0);
        System.out.println("After Salary Update:");
        employees[0].displayEmployee();

        promote(employees[1], 5000.0);
        System.out.println("After Promotion (Bonus Added):");
        employees[1].displayEmployee();
    }
}
