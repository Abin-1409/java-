// Abstract class
abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Encapsulation
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Abstract method
    public abstract String getRole();
}

// Subclass Student
class Student extends Person {
    public Student(String name, int id) { super(name, id); }

    @Override
    public String getRole() { return "Student"; }
}

// Subclass Professor
class Professor extends Person {
    public Professor(String name, int id) { super(name, id); }

    @Override
    public String getRole() { return "Professor"; }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        Professor p = new Professor("Dr. Bob", 201);

        System.out.println(s.getName() + " is a " + s.getRole());
        System.out.println(p.getName() + " is a " + p.getRole());
    }
}
