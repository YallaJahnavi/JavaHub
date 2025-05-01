class Car{
	
	String brand; //defining the attributes and are also called as data members
	int speed;
	
	Car(String brand, int speed) // constructor that is used to initialize the values
	{
		this.brand=brand;
		this.speed= speed;
	}
	
	void displayCar() // method to define the behaviour
	{
		System.out.println("Car brand: "+brand);
		System.out.println("Car speed: "+speed);
	}
}
public class ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob = new Car("xyz",30); // creating an object to the  and giving the values 
		ob.displayCar(); // using object we are invoking the methods 
		

	}

}
