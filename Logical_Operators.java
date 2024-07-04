package basicsPackage;

//Logical Operators
//1. AND--> symbol- && , syntax- if(Condition1 && Condition2)
//2. OR--> symbol- ||  , syntax- if (Condition1 || Condition2)
//3. NOT -> symbol- !
//4. Syntax for AND with NOT- if(!(Condition1 && Condition2))
//5. Syntax for OR with NOT- if(!(Condition1 || Condition2))
//6. Table for operator
//7. AND -- condition 1 True , condition 2 True, output=True
//			condition 1 True , condition 2 False, output=False
//			condition 1 False , condition 2 True, output=False
//			condition 1 False , condition 2 False, output=False
//8. OR -- 	condition 1 True , condition 2 True, output=True
//			condition 1 True , condition 2 False, output=True
//			condition 1 False , condition 2 True, output=True
//			condition 1 False , condition 2 False, output=False
//9. NOT -- True gives False
//			False gives True

public class Logical_Operators {

	public static void main(String[] args)
	{
		
		int age=18;
		int salary=10000;
		
// AND Operator
		if(age>18 && salary==10000)
		{
			System.out.println("tis condition is false and this block will nt execute");
		}
		
		if(age>18 && salary!=10000)
		{
			System.out.println("this condition2 is false and this block will nt execute");
		}
		
		if(age<=18 && salary==10000)
		{
			System.out.println("tis condition is True and this block will be executed");
		}

//AND with NOT
		if(!(age>18 && salary==10000))
		{
			System.out.println("this condition is false bt with NOT it becomes true this block will be executed");
		}
		
		if(!(age>18 && salary!=10000))
		{
			System.out.println("this condition is false bt with NOT it becomes true this block will be executed");
		}
		
		if(!(age<=18 && salary==10000))
		{
			System.out.println("\"this condition is True bt with NOT it becomes false this block will not be executed");
		}
		
//OR 
		if(age>18 || salary==10000)
		{
			System.out.println("tis is for OR perator one cond true this block will be execute");
		}
		
		if(age>18 || salary!=10000)
		{
			System.out.println("tis is for OR perator both cond false and this block will nt execute");
		}
		
		if(age<=18 | salary==10000)
		{
			System.out.println("tis is for OR perator one cond true this block will be executed");
		}
		
//OR with NOT
				if(!(age>18 || salary==10000))
				{
					System.out.println("this condition is True bt with NOT it becomes false this block will nt execute");
				}
				
				if(!(age>18 || salary!=10000))
				{
					System.out.println("this condition2 is false and but with NOT it becomes true this block will be executed");
				}
				
				if(!(age<=18 || salary==10000))
				{
					System.out.println("tis condition is True bt with NOT it becomes false this block will nt execute");
				}


	}

}
