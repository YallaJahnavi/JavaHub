class Book{
	
	String title;
	
	Book(String title)
	{
		this.title = title;
	}
	void display()
	{
		System.out.println("the name of the book is: "+title);
	}
}
class Library{
	Book book;	//aggregation
	
	Library(Book book)
	{
		this.book=book;
	}
	void showbook()
	{
		book.display();
	}
}
public class AggregationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book mybook = new Book("Java Programming");
		Library ob = new Library(mybook);
		ob.showbook();

	}

}
