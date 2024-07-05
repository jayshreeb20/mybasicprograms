package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInputUsingScanner {
	
	static Scanner s= new Scanner(System.in);

	public static void main(String[] args) 
	{
		int rollno[]= new int[5];
		
		for (int i=0;i<=rollno.length-1;i++)
		{
			rollno[i]= s.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
	}

}
