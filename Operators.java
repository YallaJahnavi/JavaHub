//Operators: operators are used in between 2 operands to perform an operation
public class Operators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Different types of operators are : increment, arithmetic, logical, relational, assignment, ternary, shift and bitwise operator
		
		//1. Increment/decrement operator: pre increment, post increment, pre decrement, post decrement
		int a= 10;
		System.out.println("increment operators");
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		//2. Arithmetic operator(+,-,*,\,%)
		System.out.println("arithmetic operators");
		int aa=10;
		int b=20;
		System.out.println(aa+b);
		System.out.println(aa-b);
		System.out.println(aa*b);
		System.out.println(aa/b);
		System.out.println(aa%b);
		 
		//3. Logical operator(AND(&&), OR(||))
		System.out.println("logical operators");
		int a1=20;
		int b1=40;
		System.out.println((a1>b1) && (b1<a1));
		System.out.println((a1<b1) || (b1<a1));
		
		//4. Relational operator(<,>,<=,>=,==,!=)
		System.out.println("relational operators");
		int a2 = 30;
		int b2 = 60;
		System.out.println(a2 < b2);
		System.out.println(a2 > b2);
		System.out.println(a2 <= b2);
		System.out.println(a2 >= b2);
		System.out.println(a2 == b2);
		System.out.println(a2 != b2);
		
		//5. Assignment operator(=,+=,-=,*=,/=,%=)
		System.out.println("assignment operators");
		int a3 = 20;
		int a4 = 20;
		System.out.println(b=a3);
		System.out.println(a3+=a4);
		System.out.println(a3-=a4);
		System.out.println(a3*=a4);
		System.out.println(a3/=a4);
		System.out.println(a3%=a4);
		
		//6. Ternary Operator(statement ? condition1 : condition2)
		System.out.println("Ternary Operators");
		int j=100;
		int n=200;
		int c1 = (j<n)?j:n;
		System.out.println(c1);
		
		//7. Bitwise Operator(Bitwise AND(&), Bitwise OR(|))
		System.out.println("Bitwise Operators");
		int s=10;
		int k=6;
		int p = s & k;
		int r = s | k;
		System.out.println(p);
		System.out.println(r);
		
		//8. Shift Operator(shift left(<<), shift right(>>))
		System.out.println("Shift Operators");
		int a5 = 13;
		System.out.println(a5<<2);
		int a6 = 13;
		System.out.println(a6>>2);
	}
}