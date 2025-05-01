// BASICS OF PROGRAMMING

// a program is a set of rules that are written in a structured format and is used to perform an operation. 

// in order to perform an action every program needs a compiler and an interpreter

// compiler: it converts human readable code(high level code) into byte code(intermediate level code). 
//			 if any errors occurs during the execution , it doesn't terminate the program execution in the middle.
//			 detects and displays all the errors after compiling all the lines in the program.
//			 faster execution of the program.

// interpreter: it converts byte code into machine code during execution.
//				if any error occurs in the middle, there itself it terminates the program execution.
//				detects and displays the errors in the middle of the program.
//				the main property of the interpreter is it checks the program line by line.
//				slower execution of the program.

public class Basics_of_programming {
	public static void main(String[] args)
	{
		System.out.println("Hello World!!"); //this line is used to print the message on to the console
	}

}

//public : it is an access modifier, that allows the class to be accessible from anywhere to anywhere.
//static : static is a keyword that allows the allows us to call the class without creating the objects.
//void   : it is a return type, but it doesn't return anything
//main	 : it is the main method, the program starts executing from the main method
//(String[] args) : this helps to enter the input from the command line
