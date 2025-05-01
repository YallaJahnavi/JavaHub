import java.util.Scanner;
public class primeprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*int count = 0;
		for (int i=1; i<=num; i++)
		{
			if (num % i == 0);
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}*/
		if(num%1 == 0 && num%num == 0)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
