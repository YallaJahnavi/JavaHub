
public class ExceptionHandling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.fillInStackTrace());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			System.out.println(e.getSuppressed());
		}
	}

}
