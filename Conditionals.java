//Conditionals: Conditionals in java are the expressions that return true or false and are used in decision 
// making statements

// the mainly used operators in conditionals are: (==, !=, >, <, >=, <=, &&, !)
public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Conditionals Examples: ");
		int a=10, b=20;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println((a>b) && (b>a));
		System.out.println(!(a<b)); //! this is a logical not symbol, it simply reverses the condition
	}
}