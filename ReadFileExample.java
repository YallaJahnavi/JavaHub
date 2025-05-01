import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            // Create BufferedReader to read from a file
            BufferedReader reader = new BufferedReader(new FileReader("example1.txt"));

            String line;
            while ((line = reader.readLine()) != null) { // Read line by line
                System.out.println(line);
            }

            reader.close(); // Close the BufferedReader
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }
}
