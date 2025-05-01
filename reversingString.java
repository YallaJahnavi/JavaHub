import java.util.Scanner;
public class reversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String s3 = sc.nextLine();
		String rev=" ";
		int n=s3.length();
		for (int i=n-1; i>=0; i--)
		{
			char c = s3.charAt(i);
			rev = rev + c;
		}
		System.out.print("the reversed string is :");
		System.out.print(rev);
	}
}
