
public class CountExample {
	public static void main(String[] args)
	{
		String s1="welcome to my world";
		int charactercount =0;
		int vowelcount =0;
		int consonantcount =0;
		int wordcount=1;
		int spacecount =0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch = s1.charAt(i);
			if(ch==' ')
			{
				spacecount = spacecount+1;
				wordcount= wordcount +1;
			}
			else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowelcount = vowelcount +1;
			}
			else
			{
				consonantcount = consonantcount+1;
			}
			charactercount=vowelcount+consonantcount;
		}
		System.out.println("no of vowels: "+vowelcount);
		System.out.println("no of characters: "+charactercount);
		System.out.println("no of spaces: "+spacecount);
		System.out.println("no of wordcount: "+wordcount);
		System.out.println("no of consonants: "+consonantcount);
	}

}
