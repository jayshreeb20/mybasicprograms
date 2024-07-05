package Array;

import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) 
	{
		//sending int values in Array
		int rollno[]= new int[5];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
		rollno[4]=5;
		
		System.out.println(Arrays.toString(rollno));
		
		//sending string values in Array
		String name[]=new String[5];
		name[0]="Jayshree";
		name[1]="Rajesh";
		name[2]="Rajshree";
		name[3]="Yogesh";
		name[4]="Manisha";
		
		System.out.println(Arrays.toString(name));

	}

}
