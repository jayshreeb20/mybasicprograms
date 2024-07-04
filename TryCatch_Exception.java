package basicsPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch_Exception 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
try {		
	System.out.println("Enter the valid age");
	int age=	s1.nextInt();
	
}
catch(InputMismatchException a1)
{
	System.out.println("Hey age must be a valid numeric value, please enter again");
	Scanner s2=new Scanner(System.in);
	System.out.println("Enter the valid age");
	int age1=	s2.nextInt();

}
System.out.println("please enter your name");
Scanner s3=new Scanner(System.in);
		String name=	s3.next();
		
	}
	
	
}


/*
 try{
age-int
salary double
your_weight float
are_you_a_student -boolean
}
catch(IME s1)
{
please fill the form again

*/






