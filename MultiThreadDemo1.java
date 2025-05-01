class Thread1 implements Runnable{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("using runnable 1: "+i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
class Thread2 implements Runnable{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("using runnable 2: "+i); 
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
public class MultiThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		Thread t = new Thread(t1);
		Thread tt = new Thread(t2);
		
		t.start();
		tt.start();

	}

}
