package basicsPackage;

//DATA TYPES 
//1. To store Numbers- eg(age,height,salary etc)--> byte,short,int,long
//2. To store decimal numbers(eg- 3.14, 10.01) -->Double ,float
//3..To store Characters(eg- a,g,h,j,p,o) --> char
//4. To store True/false --> boolean
//5.To store String(eg- name,address,sentence) --> String

// VARIABLES
//Variables are the containers which holds values (data)

//bits and bytes as per data types
//Data Type			byte			bits

//byte				1				8
//short				2				16
//int				4				32
//long				8				64

//1 TB= 1024 GB
//1 GB= 1024 MB
//1 MB=	1024 KB
//1 KB=	1024 Bytes
//1 byte= 8 bits

//Formula to calculate range of each data type --> -2^(n-1) to 2^(n-1)-1 , where n is the no. of bit as per data type.

//Declaration of variable-- > eg--> byte a;
//Initialization of Variable --> eg--> a=10;
//Both can be done together eg--> byte a=10;

public class DataTypes_AND_Variables {

	public static void main(String[] args) 
	{
		byte a=10;
		short s=20;
		int b=5;
		long l=234567389;
		double d=32.145786;
		float f=2.34f;
		boolean b1=true;
		char c1= 'J';
		String name="Jayshree Barde";
				
		System.out.println(name);
		System.out.println(c1);
	}

}
