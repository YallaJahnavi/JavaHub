/*public class WelcomeToJavaEx {
	String x ="welcome";
	String y;
	void display(String y)
	{
		x = x+y;
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WelcomeToJavaEx ob = new WelcomeToJavaEx();
		ob.display(" "+"to java");
	}
}*/
public class WelcomeToJavaEx{
	String x,y;
	
	WelcomeToJavaEx(String x, String y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		x=x+y;
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		WelcomeToJavaEx ob = new WelcomeToJavaEx("welcome ","to java");
		ob.display();
	}
}