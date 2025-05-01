import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        // Create BufferedReader to read from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine(); // Reads a line of text
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine()); // Reads and converts to int
            
            System.out.println("\n✅ User Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            
            reader.close(); // Close the BufferedReader
        } catch (IOException e) {
            System.out.println("❌ Error reading input: " + e.getMessage());
        }
    }
}
