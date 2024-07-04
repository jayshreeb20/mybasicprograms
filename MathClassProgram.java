package basicsPackage;

public class MathClassProgram {

	public static void main(String[] args) 
	{
		//Math class --> It comes from java lang package.Any class which comes from java lang package should not be imported.
		
		System.out.println(Math.addExact(10, 20));   //using math class predefined method i.e. add exact having parameters as 
													//int using it we can add two nos.
	
		System.out.println(Math.addExact(6789, 4567));	//here using add exact method having parameters as long.
	
		System.out.println(Math.multiplyExact(20, 10));	//here using multiply exact method having parameters as int.
		
		System.out.println(Math.max(20.3, 30.5));	//here using add exact method having parameters as double.
		
		System.out.println(Math.min(20.3, 30.5));	//here using add exact method having parameters as double.
		
		System.out.println(Math.sqrt(144));		//here using squareroot method having parameters as double to find squareroot of a no.
		
		System.out.println(Math.PI);		// pre defined value of pi
		
		System.out.println(Math.random());   //it generates values between0 and 1 and the values are always unique
											//and return type is double
	
	}

}
