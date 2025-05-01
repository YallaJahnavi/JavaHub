class Food
{
	void details()
	{
		System.out.println("XYZ restaurant");
	}
}
class Customer extends Food
{
	void menu()
	{
		System.out.println("menu please");
	}
}
class Barrer extends Food
{
	void display()
	{
		System.out.println("your order please");
	}
}
public class HieraricalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.menu();
		c.details();
		Barrer b = new Barrer();
		b.display();
		b.details();
	}

}
