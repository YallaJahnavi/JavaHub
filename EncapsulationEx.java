class Student{
	private String name;
	private int rollnum;
	
	public String getname()
	{
		return name;
	}
	public void setname(String n)
	{
		name= n;
	}
	public int getrollnum()
	{
		return rollnum;
	}
	public void setrollnum(int d)
	{
		rollnum=d;
	}
}
public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setname("jahnavi");
		s1.setrollnum(46);
		System.out.println("name: "+s1.getname()+"\nroll num: "+s1.getrollnum());

	}

}
