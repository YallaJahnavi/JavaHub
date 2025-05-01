
public class PairsofNumbersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<=3; i++)
		{
			for (int j=0; j<=3; j++)
				{
					if(i==2 && j==2)
						{
							continue;
						}
					else
						{
							System.out.println(i+ " " +j);
						}
				}
		}
	}

}
