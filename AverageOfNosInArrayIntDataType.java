package Array;

public class AverageOfNosInArrayIntDataType {
	
	static int sum=0;
	static double average=0;

	public static void main(String[] args) 
	{
		int marks[]= new int[4];
		marks[0]= 34;
		marks[1]= 44;
		marks[2]= 54;
		marks[3]= 64;
		
		for(int i=0;i<marks.length;i++)
		{
			sum= sum+marks[i]; //i=0 then sum=0+34=34 ,i=1 then sum will be 34+44=78 ,i=2 the sum=78+54=132 , i=3 then sum=132+64
		}
		
		System.out.println("the sum of the marks is -->"+ sum);
		
		 average= sum/marks.length;
		 
		 System.out.println("the average is -->" + average);
		
		

	}

}
