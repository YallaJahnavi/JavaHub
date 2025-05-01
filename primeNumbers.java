import java.util.Scanner;
public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		System.out.println("enter number for prime: ");
		int num = sc.nextInt();
		int count =0;
		for (int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count ++;
			}
		}
		System.out.println("enter num for palin: " );
		int palinnum = sc.nextInt();
		int temp = palinnum;
		int rev =0;
		while (palinnum !=0)
		{
			int d= palinnum %10;
			rev = rev * 10 +d;
			palinnum = palinnum/10;
		}
		if(count == 2 && temp == rev)
		{
			System.out.println("palin prime number");
		}
		else
		{
			System.out.println("not palin prime");
		}
	}

}
