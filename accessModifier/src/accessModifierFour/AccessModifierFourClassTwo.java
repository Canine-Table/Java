package accessModifierFour;

	import accessModifierOne.*;
	import accessModifierTwo.*;
	import accessModifierThree.*;

@SuppressWarnings("unused")
public class AccessModifierFourClassTwo extends AccessModifierFourClassOne
	{
	
		public static void main(String[] args)
		{
			AccessModifierFourClassTwo $Two4 = new AccessModifierFourClassTwo();
			AccessModifierOneClassTwo $One2 = new AccessModifierOneClassTwo();

//			System.out.println($One2.defaultModifier); // None
			System.out.println($One2.publicDefaultModifier); // Public
//			System.out.println(staticDefaultModifier); // Static
			System.out.println(AccessModifierOneClassTwo.publicStaticDefaultModifier); // Public, Static

		}
	
	}