// Looping Statements: 
// 1. Looping statements are used to reduce the complexity of the code by reducing the no.of lines that are
//	  used to execute the same statement multiple times
public class Looping_Statements {
// program for addition of first 10 consecutive numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For Loop:
		// here the iterations are fixed and known
		System.out.println("For Loop: ");
		int sum =0;
		for(int i=1; i<=10; i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
		//all the number and letter based series/patterns belongs to for loop only
		
		//while loop:
		//here the condition is known but we don't know the no of iterations
		System.out.println("While Loop: ");
		int i=1;
		int total =0;
		while(i<=10)
		{
			total = total +i;
			i++;
		}
		System.out.println(total);
		
		
		//do while loop:
		// the do while loop executes the statement atleast once, whether the condition is true or false
		System.out.println("Do while Loop: ");
		int i1=1;
		int comp =0;
		do
		{
			comp = comp+i1;
			i1++;
		}
		while(i1<=10);
		System.out.println(comp);
		
		
		//for each loop 
		// this loop is mainly used for strings, arrays and collections
	}
}
