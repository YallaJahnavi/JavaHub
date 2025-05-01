
public class BankingApplication {
	
	int amount=2000;
	void deposit(int x)
	{
		amount = amount+x;
	}
	void withdraw(int y)
	{
		amount = amount -y;
	}
	void display()
	{
		System.out.println("current amount: "+amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingApplication ob = new BankingApplication();
		ob.deposit(500);
		ob.withdraw(1000);
		ob.display();
	}
}
