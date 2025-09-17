class Employee {
    String name;
    double basicPay, da;

    void calculateDA() {
        da = 0.10 * basicPay;
    }

    void calculateSalary() {
        calculateDA(); // calling another method
        double total = basicPay + da;
        System.out.println("Employee: " + name);
        System.out.println("Total Salary: " + total);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Alice";
        e.basicPay = 50000;
        e.calculateSalary();
    }
}
