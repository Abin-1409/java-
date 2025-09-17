import java.io.*;
import java.util.Scanner;

public class UserInputToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "user_input.txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter line " + i + ": ");
                String line = sc.nextLine();
                pw.println(line);
            }
            System.out.println("Wrote input to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read file back
        System.out.println("Reading file contents:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
