abstract class Vehicle{
	String name;
	int num;
	abstract void sound();//abstract method
	void display() {
		System.out.println("vehicle sound on");//concrete method
	}}
class Van extends Vehicle{
	void sound() {//implementing the abstract method
		// TODO Auto-generated method stub
		System.out.println("Vehicle sound off");
	}
	void start()//concrete method
	{
		System.out.println("Vehicle is moving");
	}}
public class AbstractionEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Van ob = new Van();
		ob.sound();
		ob.start();
		ob.display();
	}
}
