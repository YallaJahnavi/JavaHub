// array is used to store the data of same kind
// it is an object so it stores the elements of similar data type only
// it is a data structure, so we can add only limited number of elements into an array
// it stores the elements as an contiguous memory allocation
// arrays are the part of java.util package
// arrays are index based and its indexing starts from 0 onwards
// it is an object of an dynamically formed class

// in java arrays are broadly classified into types they are:
// 1-D array
// 2-D array
public class ArraysAndTypesOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 - DIMENSIONAL ARRAY
		// it is a linear collection of the elements of the similar data type
		// 1st way of declaring an 1-D Array
		System.out.println("1-Dimensional Array: ");
		int a[] = new int[5]; //the size of the array is 5 here //declaration and instantiation
		a[0]= 10; // initializing the values
		a[2]=20;  // as it is index based if an index gone missed, by default it takes 0
		a[3]=30;
		a[4]=40;
		for(int i=0;i<a.length;i++) { //traversing an array
		System.out.println(a[i]);
		}
		
		System.out.println("\n2-Dimensional Array: ");
		// 2nd way of declaring an 1-D Array
		String b[]= {"1",null,"3","4","5"}; //declaration, instantiation and initialization
		// we cannot insert null values for primitive data types, but we can for non-primitive data types 
		// so here we used String, and can be used for "arrays" and "collections"
		for(int i=0; i<b.length;i++) //traversing an array
		{
			System.out.println(b[i]);
		}
		
		System.out.println("\nForward printing of an array: ");
		int[] janu= {1,2,3,4,5};
		for(int i=0;i<janu.length;i++)
		{
			System.out.println(janu[i]);
		}
		
		System.out.println("\nBackward printing of an array: ");
		int[] kittu= {1,2,3,4,5};
		for(int j=kittu.length-1;j>=0;j--)
		{
			System.out.println(kittu[j]);
		}
		
		System.out.println("\nArray Left Rotation ");
		int n[]= {10,20,30,40,50};
		int temp = n[0];
		int i;
		for(i=0;i<n.length-1;i++)
		{
			n[i]=n[i+1];
		}
		n[i]=temp;
		for(i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}	
		 
		System.out.println("\n\nArray Right Rotation ");
		int m[]= {10,20,30,40,50};
		int temp1 = m[m.length-1];
		int i1;
		for (i1=m.length-1; i1>0; i1--)
		{
			m[i1]=m[i1-1];
		}
		m[i1]=temp1;
		for (i1=0; i1<=m.length-1; i1++)
		{
			System.out.print(m[i1]+" ");
		}
	}
}
// note: the length method starts counting from 1 onwards
// the index numbers of the array starts from 0 onwards

