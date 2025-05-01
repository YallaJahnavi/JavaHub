import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class CharacterStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("example2.txt");
			String text = "hello world";
			fw.write(text);
			fw.close();
			System.out.println("written successfully");
			
			FileReader fr = new FileReader("example2.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
			fr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
