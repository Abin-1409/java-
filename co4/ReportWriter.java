import java.io.*;

public class ReportWriter {
    public static void main(String[] args) {
        String filename = "report.txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            pw.println("Report Title: Student Scores");
            pw.printf("Student 1: Score = %d%n", 85);
            pw.printf("Student 2: Score = %d%n", 93);
            System.out.println("Data written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display file contents
        System.out.println("\nThe file " + filename + " contents:");
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
