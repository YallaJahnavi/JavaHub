
public class reversingWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s3 = "ABC";
		String rev = " ";
		for (int i=s3.length()-1;i>=0;i--)
		{
			char c = s3.charAt(i);
			rev = rev + c;
		}
		System.out.println(rev);
	}

}
