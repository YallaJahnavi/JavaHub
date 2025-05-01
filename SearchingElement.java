import java.util.Scanner;
public class SearchingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num: ");
		int num = sc.nextInt();
		int a[]= {1,2,3,4,5};
		int i=0; 
		while(i<= a.length-1)
			{
			if(a[i] != num)
			{
				i++;
			}
			else
			{
				System.out.println("element found");
				break;
			}
			}
		if (i >= a.length)
		{
			System.out.println("element not found");
		}
		}
	}