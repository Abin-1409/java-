import java.io.*;

public class WriteReadFile {
    public static void main(String[] args) {
        String filename = "welcome.txt";

        // Write to file
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write("Welcome to Java File I/O!");
            System.out.println("Wrote to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            System.out.println("Reading from file: " + filename);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("From file: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
