import java.util.*;
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter numbers for array: ");
		int arr[][]=new int[3][3];
		int i;
		int j=0;
		for (i=0; i<3; i++)
		{
			for (j=0; j<3; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for (i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
