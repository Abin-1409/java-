class Shape {
    public final static double PI = 3.14159;

    public Shape() {
        System.out.println("Shape Calculator Initialized");
    }

    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateAreaCircle(double radius) {
        return PI * radius * radius;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("Area of square (side = 5): " + s.calculateArea(5));
        System.out.println("Area of rectangle (5 x 10): " + s.calculateArea(5, 10));
        System.out.println("Area of circle (radius = 7): " + s.calculateAreaCircle(7));
    }
}
