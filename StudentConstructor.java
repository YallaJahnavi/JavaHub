
public class StudentConstructor {

	int num;
	String name;
	
	StudentConstructor(int num, String name)
	{
		this.num=num;
		this.name=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentConstructor s1 = new StudentConstructor(1,"janu");
		StudentConstructor s2 = new StudentConstructor(2,"chotu");
		StudentConstructor s3 = new StudentConstructor(3,"chota");
		StudentConstructor s4 = new StudentConstructor(4,"jahn");
		StudentConstructor s5 = new StudentConstructor(5,"jaan");
		System.out.println(s1.num+"."+s1.name);
		System.out.println(s2.num+"."+s2.name);
		System.out.println(s3.num+"."+s3.name);
		System.out.println(s4.num+"."+s4.name);
		System.out.println(s5.num+"."+s5.name);
	}

}
