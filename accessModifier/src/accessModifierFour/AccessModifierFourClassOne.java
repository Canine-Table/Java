package accessModifierFour;

	import accessModifierOne.*;
	import accessModifierTwo.*;
	import accessModifierThree.*;

@SuppressWarnings("unused")
public class AccessModifierFourClassOne
	{
		private String $StringFour1n0 = new String("\n\tHello Private World!");
		public String $StringFour1n1 = new String("\n\tHello Public World!");
		protected String $StringFour1n2 = new String("\n\tHello Protected World!");
		static String $StringFour1n3 = new String("\n\tHello Static World!");
		final String $StringFour1n4 = new String("\n\tHello Final World!");
		
		static private String $StringFour1n5 = new String("\n\tHello Static Private World!");
		final private String $StringFour1n6 = new String("\n\tHello Final Private World!");
		
		static protected String $StringFour1n7 = new String("\n\tHello Static Protected World!");
		final protected String $StringFour1n8 = new String("\n\tHello Final Protected World!");

		static public String $StringFour1n10 = new String("\n\tHello Static Public World!");
		final public String $StringFour1n9 = new String("\n\tHello Final Public World!");
		
		public static void main(String[] args) 
			{
				AccessModifierFourClassOne $Four1 = new AccessModifierFourClassOne();
				System.out.println($Four1.$StringFour1n0);
				System.out.println($Four1.$StringFour1n1);
				System.out.println($StringFour1n3);
				System.out.println(AccessModifierFourClassOne.$StringFour1n3);
				System.out.println($Four1.$StringFour1n4);
				System.out.println(AccessModifierFourClassOne.$StringFour1n5);
				System.out.println($StringFour1n5);
				System.out.println($Four1.$StringFour1n6);
				System.out.println(AccessModifierFourClassOne.$StringFour1n7);
				System.out.println($StringFour1n7);
				System.out.println($Four1.$StringFour1n8);
				System.out.println($Four1.$StringFour1n9);
				System.out.println(AccessModifierFourClassOne.$StringFour1n10);
				System.out.println($StringFour1n10);
			}	
	}