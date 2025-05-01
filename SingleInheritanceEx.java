class A{
	int a = 10;
	int b = 10;
	/*public void sum(int a, int b)
	{
		System.out.println(a+b);
	}*/
}
class B extends A
{
	int c;
	int d;
	public void sum(int c,int d)
	{
		System.out.println(a+b+c+d);
	}
}
public class SingleInheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob = new B();
		ob.sum(3, 4);
	}

}
