import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("example6.txt");
			int i;
			while((i=fr.read())!= -1)
			{
				System.out.println((char)i);
			}
			fr.close();
			System.out.println("read successfully");
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.getStackTrace();
		}
	}

}
