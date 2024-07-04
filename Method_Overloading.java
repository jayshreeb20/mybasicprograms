package basicsPackage;

//Method Overloading means developing multiple methods with same name but variation in the argument list
//1. no.of arguments
//2. order of arguments
//3. different types of arguments

public class Method_Overloading {
	
	static void add(int a) // 1 parameter
	{
		int sum=a+8;
		System.out.println(sum);
	}
	
	static void add(long c) // 1 parameter
	{
		long sum=c+896785437;
		System.out.println(sum);
				
	}
	
	static void add(int a,int b)// 2 parameter
	{
		int sum=a+b-10;
		System.out.println(sum);
	}
	
	static void add(String J)  // 0 parameter)
	{
		String s=J + "BARDE";
		System.out.println(s);
	}

	static void add (double d)  // any type of parameter can be used)
	{
		double sum=d+13.02;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		add(20);
		add(200000000);
		add(10,10);
		add("JAYSHREE");
		add(0.4);

	}

}
