import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("example6.txt");
			String text="Hello World!";
			fw.write(text);
			fw.close();
			System.out.println("written successfully");
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.getStackTrace();
		}
	}

}
