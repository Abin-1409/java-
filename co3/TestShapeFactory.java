import java.util.Scanner;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing square");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing triangle");
    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("square")) return new Square();
        else if (type.equalsIgnoreCase("triangle")) return new Triangle();
        return null;
    }
}

public class TestShapeFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape to draw (circle/square/triangle): ");
        String choice = sc.nextLine();

        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape(choice);

        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Invalid shape!");
        }

        sc.close();
    }
}
