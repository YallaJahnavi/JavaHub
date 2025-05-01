
public class ArrayInMethod {
	int sum =0;
	
	void display(int a[])
	{
		for(int z:a) 
		{
			sum = sum + z;
		}
		System.out.println("sum: s"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {1,2,3,4};
		ArrayInMethod a1 = new ArrayInMethod();
		a1.display(b);
	}

}
