// 2-Dimensional Array: it is used to represent the rows and columns of a matrix
// 1 dimension is for rows and the other dimension is for columns 
import java.util.*;
public class Array2D_matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements for array: ");
		int arr[][] = new int[3][3]; // here the size of the matrix is 3X3 
		int i;
		int j=0;
		for (i=0; i<3; i++) //outer loop for columns
		{
			for (j=0; j<3; j++) // inner loop for rows 
			{
				arr[i][j]=sc.nextInt(); // initializing the values 
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
		
		//diagonal zero matrix
		System.out.println("enter elements for diagonal zero matrix: ");
		int drr[][]= new int[3][3];
		int c;
		int d=0;
		for(c=0;c<3;c++)
		{
			for(d=0;d<3;d++)
			{
				drr[c][d]=sc.nextInt();
			}
		}
		for(c=0;c<3;c++)
		{
			for(d=0;d<3;d++)
			{
				if(c==d)
				{
					drr[c][d]=0;
				}
				System.out.print(drr[c][d]+" ");
			}
			System.out.println();
		}
		
		System.out.println("enter the elements for lower triangular matrix: ");
		int jrr[][]= new int[3][3];
		int m;
		int n=0;
		for(m=0;m<3;m++)
		{
			for(n=0;n<3;n++)
			{
				jrr[m][n]=sc.nextInt();
			}
		}
		for(m=0;m<3;m++)
		{
			for(n=0;n<3;n++)
			{
				if(m>n)
				{
					jrr[m][n]=0;
				}
				System.out.print(jrr[m][n]+" ");
			}
			System.out.println();
		}
		
		System.out.println("enter elements for upper triangular matrix: ");
		int crr[][] = new int[3][3];
		int x;
		int y=0;
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				crr[x][y]=sc.nextInt();
			}
		}
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				if(x<y)
				{
					crr[x][y]=0;
				}
				System.out.print(crr[x][y]+" ");
			}
			System.out.println();
		}
		
	}
}
