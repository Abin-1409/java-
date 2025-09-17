public class Task5 {
    public static void main(String[] args) {
        System.out.println("Resource opened");
        try {
            int result = 10 / 0; // deliberate exception
            System.out.println("This will not print");
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred!");
        } finally {
            System.out.println("Resource closed");
        }
        System.out.println("Program continues after try-catch-finally.");
    }
}
