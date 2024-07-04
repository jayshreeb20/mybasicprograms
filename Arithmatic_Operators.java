package basicsPackage;

// Arithmetic Operators
//Addition--> +
//Subtraction --> -
//Multiplication --> *
//Division --> /  (To get quotient --> eg. - 16/2 then the quotient will be 8)
//Modulus --> %  (To get the remainder --> eg.--> 46/5 then the remainder will be 1)
//i++ --> Increment operator(Used in for loops)
////i-- --> Decrement operator (Used in for loops)

public class Arithmatic_Operators {

	static void add() 
	{
		int a=10;
		int b=5;
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	static void subtraction() 
	{
		int a=10;
		int b=5;
		int subtraction=a-b;
		
		System.out.println(subtraction);
	}

	static void multiplication() 
	{
		int a=10;
		int b=5;
		int multiplication=a*b;
		
		System.out.println(multiplication);
	}
	
	static void division() 
	{
		int a=10;
		int b=5;
		int division=a/b;
		
		System.out.println(division);
	}
	
	static void modulus() 
	{
		int a=10;
		int b=5;
		int modulus=a%b;
		
		System.out.println(modulus);
	}

	public static void main(String[] args) // calling static method in main method
	
	{
		add();		
		subtraction();
		multiplication();
		division();
		modulus();
		
		
	}

}
