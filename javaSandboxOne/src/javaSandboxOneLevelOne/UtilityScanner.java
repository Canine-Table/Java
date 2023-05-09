package javaSandboxOneLevelOne;
	import java.util.Scanner;

public class UtilityScanner 
	{	
		public static void main(String[] args)
			{
				try ( Scanner $Scanner = new Scanner(System.in) ) 
					{
						System.out.print("What is your name: ");
						String $Name = $Scanner.nextLine();
						System.out.print("How old are you "+$Name+": ");
						int $Age = $Scanner.nextInt();
						System.out.print($Name+" is "+$Age+" years old. but what is his favorite food: ");
						$Scanner.nextLine(); /* This is needed to remove /n or new line from the scanner because /n 
						will not be read by int or nextInt in this case. only by strings line nextLine */
						String $Food = $Scanner.nextLine();
						System.out.print($Name+" is "+$Age+" years old and enjoys eating "+$Food+".");
						$Scanner.close();
					}
			}	
		
	}