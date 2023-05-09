package javaSandboxOneLevelOne;
import java.util.Scanner;
public class ConditionalWhile {

	public static void main( String [] args)
	{
		try ( Scanner $Scanning = new Scanner(System.in) )
			{
			String $Input = "";
			
			while($Input.isBlank()) 
				{
				System.out.print("What is your name: ");
				$Input = $Scanning.nextLine();
				}
			$Scanning.close();
			};
	}
}