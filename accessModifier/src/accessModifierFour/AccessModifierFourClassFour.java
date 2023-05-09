package accessModifierFour;

	import accessModifierOne.*;
	import accessModifierTwo.*;
	import accessModifierThree.*;

@SuppressWarnings("unused")
class AccessModifierFourClassFour extends AccessModifierFourClassThree
	{	
		String StringFour4n0 = new String("\n\tHello World!");
		String StringFour4n1 = "\n\tHello World!";
		protected String StringFour4n2 = "\n\tHello World!";
		void SomthingFour3()
			{
				System.out.println("\n\tan abstract something.");
			}

		public static void main(String [] args)
			{
				AccessModifierFourClassOne $Four1 = new AccessModifierFourClassOne();
				AccessModifierFourClassTwo $Four2 = new AccessModifierFourClassTwo();
				AccessModifierFourClassThree $Four3;
				AccessModifierFourClassFour $Four4 = new AccessModifierFourClassFour();
				$Four4.SomthingFour3();
				System.out.println($Four4.StringFour4n0);
				System.out.println($Four4.StringFour4n1);
				System.out.println($Four4.StringFour4n2);
			}
	}