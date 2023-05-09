package javaSandboxOneLevelOne;

public class StringClass {

	String $Name = "John Doe";
	int $Age = 0;
	public StringClass(String _Name, int _Age)
		{
			this.$Name = _Name;
			this.$Age = _Age;
		}
public static void main(String [] args)
	{
		StringClass $Tom = new StringClass("Tom",32);
		
		System.out.println("\n"+$Tom.$Name+" is currently "+$Tom.$Age+" years old");		
		System.out.println("Does tom have tOM in it: "+$Tom.$Name.equalsIgnoreCase("tOM"));
		System.out.println("Does Tom contain the letter T: "+$Tom.$Name.contains("T"));
		System.out.println("The index of 1 contains the character: "+$Tom.$Name.charAt(1));
		System.out.println("Does Tom contain the letter T: "+$Tom.$Name.contains("T"));
		System.out.println("What index does the letter m fall under: "+$Tom.$Name.indexOf("m"));
		System.out.println("What Does my name look like in all uppercase: "+$Tom.$Name.toUpperCase());
		System.out.println("What Does my name look like in all lowercase: "+$Tom.$Name.toLowerCase());
		System.out.println("Replace m with mmy: "+$Tom.$Name.replace("m","mmy"));
		System.out.println("How long is the name Tom: "+$Tom.$Name.length());
		

		
	}
}
