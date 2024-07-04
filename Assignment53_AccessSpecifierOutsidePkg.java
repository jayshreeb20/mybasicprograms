package basicsPackage;

import Assignment.Assignment53_AccessSpecifierOutsidePkgByCreatingRelation;

/*Outside the package by crating relation between classes 
i.e. one class will become parent and other child or sub class(which is having main method)
using extend keyword we can create the relation between them.
In this case methods having access specifiers as public and protected will only be accessible here.
*/

public class Assignment53_AccessSpecifierOutsidePkg extends Assignment53_AccessSpecifierOutsidePkgByCreatingRelation

{

	public static void main(String[] args) 
	{
		Assignment53_AccessSpecifierOutsidePkg a3 = new Assignment53_AccessSpecifierOutsidePkg();
		a3.add(); // access specifier public
		a3.multi(); // access specifier protected
		
		
	}

}
