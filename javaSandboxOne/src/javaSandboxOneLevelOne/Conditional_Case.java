package javaSandboxOneLevelOne;

import java.util.ArrayList;

public class Conditional_Case {

	public static void main(String [] args) 
	{
		
		String $Day = "Monday";		
		switch($Day) 
		{
			case "Monday":
				System.out.println("Today is "+$Day);
					break;
			case "Tuesday":
				System.out.println("Today is "+$Day);
					break;
			case "Wednesday":
				System.out.println("Today is "+$Day);
					break;
			case "Thursday":
				System.out.println("Today is "+$Day);
					break;
			case "Friday":
				System.out.println("Today is "+$Day);
					break;
			case "Saturday":
				System.out.println("Today is "+$Day);
					break;
			case "Sunday":
				System.out.println("Today is "+$Day);
					break;
			default: System.out.println($Day+" is not a real day of the week.");
		}	
		
		ArrayList<String> $Fish = new ArrayList<String>();
			$Fish.add("Starfish");
			$Fish.add("Oyster Toadfish");
			$Fish.add("Black Drum");
			$Fish.add("Lizardfish");
			$Fish.add("Jumping Mullet");
			$Fish.add("Silver Perch");
			$Fish.add("Haddock");
			$Fish.add("Knobbed Porgy");
			$Fish.add("Sea Mullet");
		for(int $i=0; $i<$Fish.size() ;$i++)
		{
			switch($i)
				{
					case 0: 
						System.out.println("The first fish is a "+$Fish.get($i));
					case 1:
						System.out.println("The Second fish is a "+$Fish.get($i));
					case 2:
						System.out.println("The Third fish is a "+$Fish.get($i));
					case 3: 
						System.out.println("The Fourth fish is a "+$Fish.get($i));
					case 4:
						System.out.println("The Fifth fish is a "+$Fish.get($i));
					case 5:
						System.out.println("The Sixth fish is a "+$Fish.get($i));
					case 6:
						System.out.println("The Seventh fish is a "+$Fish.get($i));
					case 7:
						System.out.println("The Eighth fish is a "+$Fish.get($i));
					case 8:
						System.out.println("The Ninth fish is a "+$Fish.get($i));
					case 9:
						System.out.println("The Tenth fish is a "+$Fish.get($i));
				}
		}
	}
}