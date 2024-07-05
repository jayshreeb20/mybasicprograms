package Array;

public class RemoveParticularLetterFromString {

	public static void main(String[] args) 
	{
		String name = "Jayshree";
		String	test = "who are you";
		String name1 = name.replaceAll("a", "");
		String test1 = test.replaceAll("a", "");
		
		//System.out.println(name1);
		System.out.println(test1);
		
		//or else you can also write the string function directly inside the print statement
		
		System.out.println(name.replaceAll("a", ""));
	}

}
