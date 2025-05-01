class Ant
{
	void animal()
	{
		System.out.println("Animal husbandary");
	}
}
class Boy extends Ant
{
	void sound()
	{
		System.out.println("human husbandary");
	}
}
class C extends Boy
{
	void display()
	{
		System.out.println("both human and animal");
	}
}
public class MultilevelInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob = new C();
		ob.animal();
		ob.sound();
		ob.display();
	}

}
