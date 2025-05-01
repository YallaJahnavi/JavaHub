
public class PatternMatchingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = 42;
		if (obj instanceof Integer i)
		{
			System.out.println("Integer value: "+i);
		}
		else
		{
			System.out.println("The object isn't an integer.");
		}
	}

}
