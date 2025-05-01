import java.util.Arrays;
import java.util.Scanner;
public class MinandMaxNumberExample
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elements for array: ");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int x:a)
		{
			System.out.println(x);
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(i==0)
			{
				System.out.println("the minimum number is: "+a[i]);
			}
			if(i==a.length-1)
			{
				System.out.println("the maximum number is: "+a[a.length-1]);
			}
		}
	}
}