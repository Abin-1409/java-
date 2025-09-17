class Rectangle {
    int length, breadth;

    void setDimensions(int l, int b) {
        length = l;
        breadth = b;
    }

    int getPerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setDimensions(10, 5);
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
