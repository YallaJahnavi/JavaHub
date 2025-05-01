// METHOD OVERLOADING
/*public class PolymorphismEx {

	void display(int a, int b)
	{
		System.out.println("sum: "+(a+b));
	}
	void display(int a, int b, int c)
	{
		System.out.println("sum: "+(a+b+c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismEx ob = new PolymorphismEx();
		ob.display(3, 2);
		ob.display(3, 2, 5);
	}

}*/

//METHOD OVERRIDING

class A1{
	void sum()
	{
		int a=10;
		int b=20;
		System.out.println("sum: "+(a+b));
	}
}
class PolymorphismEx extends A1
{
	void sum()
	{
		System.out.println("i am in method overriding method");
	}

public static void main (String[] args)
{
	PolymorphismEx ob = new PolymorphismEx();
	ob.sum();
}
}

