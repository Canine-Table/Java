package accessModifierFour;

	import accessModifierOne.*;
	import accessModifierTwo.*;
	import accessModifierThree.*;
	
@SuppressWarnings("unused")
public class AccessModifierFourClassSeven extends AccessModifierFourClassSix
	{
	
		public static void main(String[] args)
			{
				AccessModifierFourClassSeven $Four7 = new AccessModifierFourClassSeven();
				System.out.println($Four7.$StringFour1n1);
				System.out.println($StringFour1n3);
				System.out.println(AccessModifierFourClassSeven.$StringFour1n3);
				System.out.println($Four7.$StringFour1n4);
				System.out.println(AccessModifierFourClassSeven.$StringFour1n7);
				System.out.println($StringFour1n7);
				System.out.println($Four7.$StringFour1n8);
				System.out.println($Four7.$StringFour1n9);
				System.out.println(AccessModifierFourClassSeven.$StringFour1n10);
				System.out.println($StringFour1n10);
			}	
	}