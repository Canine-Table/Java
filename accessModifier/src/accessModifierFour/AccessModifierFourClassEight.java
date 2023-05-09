package accessModifierFour;

	import accessModifierOne.*;
	import accessModifierTwo.*;
	import accessModifierThree.*;
	
@SuppressWarnings("unused")
public class AccessModifierFourClassEight extends AccessModifierFourClassSeven
	{
		public static void main(String[] args)
			{
				AccessModifierFourClassEight $Four8 = new AccessModifierFourClassEight();
				System.out.println($Four8.$StringFour1n1);
				System.out.println($Four8.StringFour4n2);
				System.out.println($StringFour1n3);
				System.out.println(AccessModifierFourClassEight.$StringFour1n3);
				System.out.println($Four8.$StringFour1n4);
				System.out.println(AccessModifierFourClassEight.$StringFour1n7);
				System.out.println($StringFour1n7);
				System.out.println($Four8.$StringFour1n8);
				System.out.println($Four8.$StringFour1n9);
				System.out.println(AccessModifierFourClassEight.$StringFour1n10);
				System.out.println($StringFour1n10);
			}
	}