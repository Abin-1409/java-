import java.io.*;
import java.util.Scanner;

public class SumToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "sum.txt";

        int sum = 0;
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }

        // Write sum to file
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            pw.println(sum);
            System.out.println("Sum written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read sum back from file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            System.out.println("Sum read from file: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
