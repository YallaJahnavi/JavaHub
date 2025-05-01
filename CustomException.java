class AgeException extends Exception{
	AgeException(String message)
	{
		super(message);
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;
		try {
			if(age<18)
			{
				throw new Exception("not eligible");
			}
			System.out.println("you are eligible");
		}
		catch(Exception e){
			System.out.println("Custom Exception found is: "+e.getMessage());
		}
	}

}
