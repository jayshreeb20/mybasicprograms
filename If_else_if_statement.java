package basicsPackage;

public class If_else_if_statement {

	public static void main(String[] args) 
	{
		String light1="Red";
		String light2="Green";
		String light3="Yellow";
		String signal1="off";
		String signal2="not working";
		
		if(light1=="Red")
		{
			
			System.out.println("stop the car");
		}
		
		else if(light3=="Yellow")
		{
			System.out.println("wait for sometime");
		}	
		
		else if(light2=="Green")
		{
			System.out.println("GO slow");
		}	
		
		else if(signal1=="off")
		{
			System.out.println("GO slow");
		}	
		
		else if(signal2=="not working")
		{
			System.out.println("follow traffic police");
		}	
		
		else
		{
			System.out.println("you can go");
			
		}
		

	}

}
