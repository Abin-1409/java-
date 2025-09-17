import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        try {
            if (num < 0) {
                throw new ArithmeticException("Cannot compute square root of a negative number!");
            }
            double sqrt = Math.sqrt(num);
            System.out.println("Square root is: " + sqrt);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
