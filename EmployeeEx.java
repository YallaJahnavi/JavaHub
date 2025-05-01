public class EmployeeEx {
	int id;
	String name;
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeEx ob = new EmployeeEx();
		ob.setid(1);
		ob.setname("Jahnavi");
		System.out.println("Id:"+ob.getid()+"\nName:"+ob.getname());
	}
}