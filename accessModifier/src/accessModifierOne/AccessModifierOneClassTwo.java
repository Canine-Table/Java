package accessModifierOne;

	import accessModifierTwo.*;
	import accessModifierThree.*;
	import accessModifierFour.*;

@SuppressWarnings("unused")
public class AccessModifierOneClassTwo extends AccessModifierOneClassOne 
	{
			String StringFour4n0 = new String("\n\tHello World!");
			String StringFour4n1 = "\n\tHello World!";
			protected String StringFour4n2 = "\n\tHello World!";
		public static void main(String[] args)
			{
				AccessModifierOneClassTwo $One = new AccessModifierOneClassTwo();
				System.out.println($One.defaultModifier); // None
				System.out.println($One.publicDefaultModifier); // Public
				System.out.println(staticDefaultModifier); // Static
				System.out.println(publicStaticDefaultModifier); // Public, Static
			}
	}	