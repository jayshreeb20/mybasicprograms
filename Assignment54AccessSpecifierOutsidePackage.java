package basicsPackage;

import Assignment.Assignment54AccessSpecifierOutsidePackageWithoutbecomingSubClass;

public class Assignment54AccessSpecifierOutsidePackage {

	public static void main(String[] args) 
	{
		Assignment54AccessSpecifierOutsidePackageWithoutbecomingSubClass a2 = new Assignment54AccessSpecifierOutsidePackageWithoutbecomingSubClass();
		a2.add(); // here able to access method having access specifier as public only
		
	}

}
