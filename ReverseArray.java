package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
	
	//static int reverse= 0;
	static int k=0;


	public static void main(String[] args) 
	{
		int array1 [] =  {1,2,3,4,5};
		int reverseArray[]= new int[array1.length];
		
		/*int array2[]= new int[array1.length];
		
		for(int i=array1.length-1;i>=0;i--)
		{
			array2[i]=array1[k];
			k++;
		}
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));*/
		
		for(int i=array1.length-1;i>=0;i--)
		{
			reverseArray[i]=array1[k];
			k++;
			
		}
		
		System.out.println(Arrays.toString(reverseArray));
	
		
		
		
		
		
		
	}

}
