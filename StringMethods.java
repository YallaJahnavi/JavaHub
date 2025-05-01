// strings are stored in objects
// strings are a part of java.lang package
// strings are inbuilt in java
// strings provide high security as the variable names cannot be changed (immutable)
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//split method
		String x ="hello word ";
		String y[] = x.split(" ");
		for (String s:y)
		{
			System.out.println(s);
		}
		
		//toUppercase method
		String z = x.toUpperCase();
		System.out.println(z);
		
		String s1="Jahnavi";
		String s2="Krishna";
		
		//comparing strings
		//1. by using double equal(==) symbol
		if(s1 == s2)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		//2. by using equals method
		System.out.println(s1.equals(s2));
		//3. by using compareTo method
		System.out.println(s1.compareTo(s2));
		
		//concatenation
		//1. using "+" operator
		String s3 = s1+s2;
		System.out.println(s3);
		
		//2. using concat method
		String s4 = s1.concat(s2);
		System.out.println(s4);
		
		//length of a string
		String s5="I am Jahnavi";
		System.out.println(s5.length());
		
		//replace methods
		//1. replacing
		System.out.println(s5.replace("J", "j")); // replaces an alphabet from one place to another
		//2. replace first
		System.out.println(s5.replaceFirst("a", "A")); // replaces only the 1st occurrence of "a" to "A"
		//3. replace all
		System.out.println(s5.replaceAll("a", "*")); // replaces all occurrences of "a" to "*"
		
		//value function: this function is used to convert any other data type to string data type
		int i=8;
		String s6 = String.valueOf(i);
		System.out.println(s6);
		
	}

}
