
public class subjectfailexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {45,30,25,20,15};
		int failcount=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<30)
			{
				failcount++;
			}
		}
		if(failcount == 3)
		{
			System.out.println("student failed");
		}
		else
		{
			System.out.println("student not failed");
		}
	}
}