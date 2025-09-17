class Student {
    String name;
    int marks;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.marks = 85;
        s.displayDetails();
    }
}
