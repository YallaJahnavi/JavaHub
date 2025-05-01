import java.util.Scanner;
public class CountofVoCoWoChSp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String s1 = sc.nextLine();
		int vowelcount =0;
		int consonantcount =0;
		int wordcount =1;
		int spacecount =0;
		int charactercount =0;
		for(int i=0; i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if (c == ' ')
			{
				spacecount = spacecount + 1;
				wordcount = wordcount + 1;
			}
			else if(c == 'a' || c=='e' || c=='i'|| c=='o'|| c=='u')
			{
				vowelcount = vowelcount + 1;
			}
			else
			{
				consonantcount = consonantcount + 1;
			}
			charactercount = vowelcount + consonantcount;
		}
		System.out.println("no of vowels		:"+vowelcount);
		System.out.println("no of consonants	:"+consonantcount);
		System.out.println("no of words			:"+wordcount);
		System.out.println("no of spaces		:"+spacecount);
		System.out.println("no of characters	:"+charactercount);
	}
}