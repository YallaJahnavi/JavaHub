import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		
		if(num % 4 == 0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}

}

 