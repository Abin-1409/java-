import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap (using 3rd variable): a = " + a + ", b = " + b);

        // Without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap (without 3rd variable): a = " + a + ", b = " + b);

        sc.close();
    }
}
