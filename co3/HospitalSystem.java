// Abstract class
abstract class Staff {
    private double baseSalary;
    private int extraHours;

    public Staff(double baseSalary, int extraHours) {
        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
    }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public int getExtraHours() { return extraHours; }
    public void setExtraHours(int extraHours) { this.extraHours = extraHours; }

    public abstract double calculateSalary();
}

// Doctor subclass
class Doctor extends Staff {
    public Doctor(double baseSalary, int extraHours) { super(baseSalary, extraHours); }

    @Override
    public double calculateSalary() { return getBaseSalary() + getExtraHours() * 1000; }
}

// Nurse subclass
class Nurse extends Staff {
    public Nurse(double baseSalary, int extraHours) { super(baseSalary, extraHours); }

    @Override
    public double calculateSalary() { return getBaseSalary() + getExtraHours() * 500; }
}

// Test class
public class HospitalSystem {
    public static void main(String[] args) {
        Doctor doc = new Doctor(50000, 10);
        Nurse nurse = new Nurse(30000, 15);

        System.out.println("Doctor Salary: " + doc.calculateSalary());
        System.out.println("Nurse Salary: " + nurse.calculateSalary());
    }
}
