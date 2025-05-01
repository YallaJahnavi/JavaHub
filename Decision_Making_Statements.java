
public class Decision_Making_Statements {
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		// 1. if-else condition
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("a is smaller");
		}
		
		//2. if-elif-else condition
		if(a<b)
		{
			System.out.println("a is smaller");
		}
		else if(b>a)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("hence this is not correct condition");
		}
		
		//3. nested if
		if(a<b)
		{
			if(a>b)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("a is not greater");
			}
		}
		else
		{
			System.out.println("this is a correct nested if condition");
		}
	}
}
