//data types: 
// 1. the data types are used to specify the size and type of values that can be stored in variables.
// 2. there are 2 types of data types in java: primitive data types , non-primitive data types.

class Data_Types{
	public static void main(String[] args)
	{
		//1. Byte data type
		//	 size : 8 bits
		//   range : -128 to 127
		System.out.println("Byte Data Type: ");
		byte age = 25;
		System.out.println("Age: "+age);
		
		//2. Short data type
		//   size : 16 bits
		//   range : -32768 to 32767
		System.out.println("Short Data Type: ");
		short num = 15000;
		System.out.println("Num: "+num);
		
		//3. Int data type
		//   size : 32 bits
		//	 range : -2147483648 to -2147483647
		System.out.println("Int Data Type: ");
		int salary = 50000;
		System.out.println("Salary: "+salary);
		
		//4. Long data type
		//	 size : 64 bits
		//   range : -9223372036854775808 to 9223372036854775807
		System.out.println("Long Data Type: ");
		long fees = 78000000000l;
		System.out.println("Fees: "+fees);
		
		//5. Float data type
		//   size : 32 bits
		//   range : +-3.40282347E+38F
		System.out.println("Float Data Type: ");
		float pi = 3.14f;
		System.out.println("Pi: "+pi);
		
		//6. Double data type
		//	 size : 64 bits
		//	 range : +-79769313486231570E+308
		System.out.println("Double Data Type: ");
		double population = 2.718281828459045;
		System.out.println("Population: "+population);
		
		//7. Char data type
		//	 size : 16 bits
		//   range : 0 to 65,535 
		System.out.println("Char Data Type: ");
		char grade = 'A';
		System.out.println("Grade: "+grade);
		
		//8. Boolean data type
		//	 size : 1 bit
		//   range : only 2 outcomes
		System.out.println("Boolean Data Type: ");
		boolean istrue = true;
		System.out.println("MyScore: "+istrue);
	}
}