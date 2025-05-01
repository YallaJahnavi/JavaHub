
public class ComparingtwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "welcome";
		String s2 = "Welcome";
		boolean flag = false;
		if(s1.equals(s2))
		{
			flag = true;
		}
		if(flag)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		System.out.println(s1.compareTo(s2));
	}

}
