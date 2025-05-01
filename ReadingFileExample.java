import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileExample {
    public static void main(String[] args) {
        try {
            File f1 = new File("example1.txt");
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
