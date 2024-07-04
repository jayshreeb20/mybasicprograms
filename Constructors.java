package basicsPackage;

public class Constructors {

//Constructors are the special methods in java which does not have any return type
//Constructors are always non static
//Constructors name will always be same as the class name
//Constructors can be parameterized or non-parameterized
//Constructors can be public,private,,protected and default/package
			
	Constructors () //syntax for constructor (this is non parameterized constructor)
		{
			System.out.println("I live in India");
		}
	public static void main(String[] args) 
	{
		//Constructors are non static and can be called by creating an object
		Constructors c=new Constructors();
		
		
		
	}

}
