import java.util.Scanner;
public class NewFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the typechecking datatype: ");
		String datatype = sc.next();
		Object ob = "Jahnavi";
		if (ob instanceof Integer i)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("It isn't such type");
		}
	}

}
