import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try {
            // Writing bytes to a file
            FileOutputStream fos = new FileOutputStream("byteFile.txt");
            String text = "Hello, Byte Stream!";
            fos.write(text.getBytes());
            fos.close();
            System.out.println("Data written to file.");

            // Reading bytes from a file
            FileInputStream fis = new FileInputStream("byteFile.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
