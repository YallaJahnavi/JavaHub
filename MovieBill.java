import java.util.*;
public class MovieBill{
	public static void main(String[] args)
	{
		//in order to generate the bill 1st i have to fix the prices of the items
		final int pizza_price = 100;
		final int puff_price = 20;
		final int cooldrink_price = 10;
		
		//implement an scanner object to give input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of pizzas: ");
		int pizzanum = sc.nextInt();
		
		System.out.println("Enter the no. of puffs: ");
		int puffnum = sc.nextInt();
		
		System.out.println("Enter the no. of cooldrinks: ");
		int cooldrinksnum = sc.nextInt();
		
		//calculate the total price to generate the bill
		int totalprice = (pizzanum * pizza_price)+(puffnum * puff_price)+(cooldrinksnum * cooldrink_price);
		
		//generate the bill
		System.out.println("\n Bill Details: ");
		System.out.println("No.of Pizzas: "+pizzanum);
		System.out.println("No. of Puffs: "+puffnum);
		System.out.println("No. of CoolDrinks: "+cooldrinksnum);
		System.out.println("Total: "+totalprice);
	}
}