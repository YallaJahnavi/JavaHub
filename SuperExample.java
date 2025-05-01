class J
{
	String name="Jahnavi";
	void display()
	{
		System.out.println("name is displaying");
	}
}
class l extends J
{
	String name="Janu";
	void display()
	{
		System.out.println("superclass method: "+this.name);
		System.out.println("subclass method: "+super.name);
	}
}
public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l ob = new l();
		ob.display();
		
	}

}
