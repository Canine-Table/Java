package javaProjectOne;

import java.util.Scanner;

public class AssignmentIdk {

		public static void main(String[] args) {

	//Declares Variables
			int x = 0;
			int TCDOT = 0;
			int TCKOT = 0;
			double ExpectedDiameter = 7.25;
			double ExpectedKerf = 0.059;
			double diameter = 0.0;
			double kerf = 0.0;
			boolean Continue = true;
			
	//While loop that continues as long as user wants
			while (Continue) {
				
				boolean InvalidDiameter = true;
				boolean InvalidKerf = true;
				boolean hasnextDouble;
				boolean InvalidResponse = true;
				boolean hasnextLine;
				String Response;
				
	//Adds 1 to x each time it loops and then declares it as a variable
				x++;
				int NumberofSawBlades = x;
				

				Scanner dia = new Scanner(System.in);
					System.out.println("What is the Diameter of the Sawblade?");
	/*While loop that continues until user enters a number, and sets diameter to equal user input
	 *I would have changed it to only accept positive numbers but I've been 
	 * working on this assignment for 3 days straight and Im tired and want to sleep
	 */
					while (InvalidDiameter) {
						hasnextDouble = dia.hasNextDouble();
						if (hasnextDouble) {
							diameter = dia.nextDouble();
							InvalidDiameter = false;
						} else {
							System.out.println("Invalid input, please enter a number");
						}
						dia.nextLine();
					}
				


				Scanner Kerf = new Scanner(System.in);
					System.out.println("What is the Kerf of the Sawblade?");
	//While loop that continues until user enters a number, and sets kerf to equal user input	
					while (InvalidKerf) {
						hasnextDouble = Kerf.hasNextDouble();
						if (hasnextDouble) {
							kerf = Kerf.nextDouble();
							InvalidKerf = false;
						} 
						else {
							System.out.println("Invalid input, please enter a number");
						}
						Kerf.nextLine();
					}
				
				
				System.out.println(diameter);
				System.out.println(kerf);
	//if statement to check if diameter is in tolerance and then output if it is or not
	//Also adds 1 to TCDOT if it isnt in tolerance each time it loops
				if (diameter < 7.265625 && (diameter > 7.234375)) {
					System.out.println("Diameter In tolerance");
				} else {
					System.out.println("Diameter not in tolerance");
					TCDOT++;
				}
	//if statement to check if kerf is in tolerance and then output if it is or not
	//Also adds 1 to TCKOT if it isnt in tolerance each time it loops
				if (kerf > 0.043375 && (kerf < 0.074625)) {
					System.out.println("Kerf In tolerance");

				} else {
					System.out.println("Kerf not in tolerance");
					TCKOT++;
				}
	//Calculates and defines Inches out of Tolerance for both diameter and kerf
				double DIOT = ExpectedDiameter - diameter;
				double KIOT = ExpectedKerf - kerf;
	//Outputs Inches out of tolerance for diameter and kerf
	//Also outputs total number of Chainsaws that have a diameter or kerf out of tolerance
	//Also prints the total number of Sawblades done so far
				System.out.println("Diameters inches out of Tolerance:" + DIOT);
				System.out.println("Total ChainSaw Diameters out of Tolerance:" + TCDOT);
				System.out.println("Kerfs inches out of Tolerance:" + KIOT);
				System.out.println("Total ChainSaw Kerfs out of Tolerance:" + TCKOT);
				System.out.println("Number of SawBlades:" + NumberofSawBlades );
				System.out.println("Created by Luke Kirpalani");
				Scanner Res = new Scanner(System.in); 
					System.out.println("Would you like to continue?");
	//While loop that continues if user enters something other then yes or no
	//if user enters no it prints Goodbye and the code ends
	//if user enters yes it loops back to the start
	//if user doesnt enter either of these it prompts them to enter either yes or no
	//I also set it to print the response I type in order to ensure its working correctly
					while (InvalidResponse) {
						Response = Res.nextLine();
						if (Response.equals("No") || Response.equals("NO") || Response.equals("no")) {
							System.out.println(Response);
							System.out.println("Ok Goodbye.");
							InvalidResponse = false;
							Continue = false;

						} else if (Response.equals("Yes") || Response.equals("yes") || Response.equals("YES")) {
							System.out.println(Response);
							InvalidResponse = false;
							Continue = true;
						
						} else {
							System.out.println("Invalid Response, please type yes or no to continue");
							System.out.println(Response);
						}

					}
		}
	}
	}

		

	//END OF CODE5