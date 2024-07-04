package basicsPackage;

public class Non_Static_method {
	void add()
	{
		int a=10;
		int b=6;
		int sum=a+b;
		
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		//To call an non-static method in main method we need to create an object of the method inside main method
		//syntax to create an object
		//Classname ref_variable=new Classname();
		Non_Static_method n= new Non_Static_method();
		n.add();
		
		
	}

}
