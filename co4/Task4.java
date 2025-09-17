public class Task4 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // division by zero
        } catch (ArithmeticException e) {
            System.out.println("Exception type: " + e.getClass().getName());
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
