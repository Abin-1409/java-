class Car {
    private String model;
    private int year;

    void setDetails(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class TestCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.setDetails("Tesla", 2025);
        c.display();
    }
}
