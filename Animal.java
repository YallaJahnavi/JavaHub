//by directly initializing the values:
/*public class Animal {
	String name;
	String breed;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("by Direct initialization of the values: ");
		Animal a1 = new Animal();
		a1.name = "Tony";
		a1.breed = "Pedigree";
		System.out.println("name: "+a1.name+"\nbreed: "+a1.breed);
	}
}*/
//by using setters and getters
/*public class Animal {
	String name;
	String breed;
	
	public String getname()
	{
		return name;
	}
	public void setname(String n)
	{
		name = n;
	}
	public String getbreed()
	{
		return breed;
	}
	public void setbreed(String m)
	{
		breed = m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("by Direct initialization of the values: ");
		Animal a1 = new Animal();
		a1.name = "Tony";
		a1.breed = "Pedigree";
		System.out.println("name: "+a1.name+"\nbreed: "+a1.breed);	
		
		System.out.println("by using setters and getters: ");
		Animal a2 = new Animal();
		a2.setname("Rocky");
		a2.setbreed("meat");
		System.out.println("name: "+a2.getname()+"\nbreed: "+a2.getbreed());
	}
}*/
public class Animal{
	String name;
	String breed;
	
	Animal(String name, String breed)
	{
		this.name = name;
		this.breed = breed;
	}
	public static void main (String[ ] args)
	{
		Animal a3 = new Animal("Snoopy","healthy food");
		System.out.println("name: "+a3.name+" "+"breed: "+a3.breed);
	}
}
