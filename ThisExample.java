
public class ThisExample {

	String name;
	int age;
	
	ThisExample(String name, int age)
	{
		this.name= name;
		this.age=age;
	}
	
	void display()
	{
		System.out.println("name: "+name+"age: "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample t1 = new ThisExample("jahnavi",422966);
		t1.display();
	}

}
