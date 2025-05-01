//public Access modifier
public class AccessModifiers {
	public String name= " jahnavi";
	public void display()
	{
		System.out.println(name);
	}
	public static void main(String [] args)
	{
		AccessModifiers ob = new AccessModifiers();
		ob.display(); // accessible because it is public
	}
}
/*public class AccessModifiers{
	private String name ="jahnavi";
	private void show()
	{
		System.out.println(name);
	}
	public void display()
	{
		System.out.println(name);
	}
}
class Test
{
	public static void main(String[ ] args)
	{
		AccessModifiers ob = new AccessModifiers();
		//ob.show(); // error occurs because method is private  
		ob.display();
	}
}*/
