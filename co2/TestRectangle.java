class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    void compareArea(Rectangle r) {
        if (this.area() > r.area()) {
            System.out.println("Current rectangle is larger.");
        } else if (this.area() < r.area()) {
            System.out.println("Other rectangle is larger.");
        } else {
            System.out.println("Both rectangles are equal in area.");
        }
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(6, 8);
        r1.compareArea(r2);
    }
}
