
public class TypeCastingExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		double d = i; //converts directly from int to double
		System.out.println("implicit typecasting: "+i);
		
		double b = 10.0;
		int n = (int)b; //manually converts from double to int
		System.out.println("explicit typecasting: "+b);
	}
}


