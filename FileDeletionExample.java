import java.io.File;
public class FileDeletionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("example6.txt");
		if(f1.delete())
		{
			System.out.println("file deleted: "+f1.getName());
		}
		else
		{
			System.out.println("failed to delete the file");
		}
	}

}
