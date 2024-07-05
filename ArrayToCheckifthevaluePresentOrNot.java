package Array;

public class ArrayToCheckifthevaluePresentOrNot {
	
	static int  no_to_check=15;

	public static void main(String[] args) 
	{
		int rollno []= {11,12,13,14,15};
	
	
	for (int i=0;i<rollno.length;i++)
	{
		if(no_to_check==rollno[i])
		{
			System.out.println("I5 is present in given array");
			System.out.println("And the index of 15 is-->" + i); // to find the index of the n. we are sraching for.
		}
		
		//else
		//{
			//System.out.println("I5 is not present in given array");
		//}
	}

}
}
