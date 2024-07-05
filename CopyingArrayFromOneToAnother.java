package Array;

import java.util.Arrays;

public class CopyingArrayFromOneToAnother {

	public static void main(String[] args)
	{
		int array1 [] = {10,20,30,40,50};
		int array2 [] =  new int [array1.length];
		
		for (int i=0;i<array1.length;i++)
		{
			array2[i]=array1 [i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
	}

}
