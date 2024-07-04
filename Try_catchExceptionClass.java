package basicsPackage;
public class Try_catchExceptionClass
{
	public static void main(String[] args) 
	{
		
	try {	
		int a=1/0;//b from parent class and c comes from grand parent class
		System.out.println(a);
	}
	catch(ArithmeticException a1)
	{
		System.out.println("handled the exception");
	}
		
		

	}

}
