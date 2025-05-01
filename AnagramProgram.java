import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "race";
		String s2 = "care";
		if(s1.length() == s2.length())
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c2);
			Arrays.sort(c1);
			boolean b = Arrays.equals(c1,c2);
			if(b)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram because of characters");
			}
		}
		else
		{
			System.out.println("not anagram because of length");
		}
	}
}