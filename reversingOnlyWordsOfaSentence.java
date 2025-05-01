import java.util.Scanner;
public class reversingOnlyWordsOfaSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter string: ");
		String s1 = sc.nextLine();
		String[] words = s1.split(" ");
		String revs1=" ";
		for (int i=words.length-1;i>=0;i--)
		{
			revs1 = revs1+ words[i]+" ";
		}
		System.out.println("the reversed String : "+revs1);
		}

}
