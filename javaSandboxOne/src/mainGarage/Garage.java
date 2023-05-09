package mainGarage;

import java.util.ArrayList;
import java.util.Scanner;

/** @author Table */

@SuppressWarnings("unused")
public class Garage extends Vehicles
	{
		private static int $Parked = 0;
		ArrayList<Vehicles> $Vehicle = new ArrayList<Vehicles>();
		private <Thing> void Parked(Thing _Vehicles)
			{
				$Parked+=1;
			}
		 
		private static void getParked()
			{
				System.out.println("\n\tThere are currently "+$Parked+" parked vehicles.");
			}
		
		public static void Header()
			{	
				ArrayList<Vehicles> $Created = new ArrayList<Vehicles>();
				System.out.print("\n    =>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<=");
				System.out.printf("%n    |  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|%n",
				"Brand","Models","Color","Style","Year","Horse Power","Price","Efficiency","Kilometers");
				System.out.print("    |----------------|----------------|----------------|----------------|----------------|----------------|----------------|----------------|----------------|");
			}
		
		public static void Footer()
			{
				System.out.print("\n    =>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<=\n\n");
			}
		
		public static void main(String[] args)
			{
			

					ArrayList<Vehicles> $Vehicle = new ArrayList<Vehicles>();
					Garage $Garage = new Garage();
					People $Caesar = new People();
					People $Andrew = new People("Andrew Tate");
					People $Marcus = new People("Marcus Aurelius Antoninus","Antoninus","Marcus","Aurelius","Politician","Emperor",58,5.8f,140.33f,5000000);
					People $Germanicus = new People( "Germanicus Julius Caesar","Caesar","Germanicus","Julius","Politician","Executive Magistrate",33,5.8f,130.33f,2000000);

					Sedan $Corolla = new Sedan("Toyota","Corolla","Blue","Sedan",2023,20250,169,35,345465);$Vehicle.add($Corolla);
					Sedan $A3 = new Sedan("Audi","A3","Blue","Sedan",2021,36900,201,30,292239);$Vehicle.add($A3);
					Sedan $Mazda6 = new Sedan("Mazda","Mazda6","Red","Sedan",2021,20393,187,26,299123);$Vehicle.add($Mazda6);
					Sedan $Integra = new Sedan("Acura","Integra","Beige","Sedan",2023,20394,200,30,354354);$Vehicle.add($Integra);
					Sedan Civic = new Sedan("Honda","Civic","Red","Sedan",2022,19253,123,34,345334);$Vehicle.add(Civic);

					Hatchback $Prius = new Hatchback("Toyota","Prius","Silver","Hatchback",2022,25075,191,49,4546);$Vehicle.add($Prius);
					Hatchback $Mirage = new Hatchback("Mitsubishi","Mirage","Black","Hatchback",2022,16245,74,39,54645);$Vehicle.add($Mirage);
					
					SportUtilityVehicle $Cherokee = new SportUtilityVehicle("Jeep","Cherokee","Red","SUV",2014,29995,293,25,44564);$Vehicle.add($Cherokee);
					SportUtilityVehicle $Niro = new SportUtilityVehicle("Kia","Niro","White","SUV",2023,26490,139,53,4546454);$Vehicle.add($Niro);
					
					Pickup $H3T  = new Pickup("Hummer","H3T","Yellow","Pickup",2009,40300,239,14,3457445);$Vehicle.add($H3T);
					Pickup $Sierra = new Pickup("GMC","Sierra 2500","White","Truck",2024,80135,340,10,2);$Vehicle.add($Sierra);
					Pickup $SierraDuplicate = new Pickup();$Vehicle.add($SierraDuplicate);

					Coupe $330 = new Coupe("BMW","330","Slate","Coupe",2023,37400,255,29,3457858);$Vehicle.add($330);
					Coupe $Challenger = new Coupe("Dodge","Challenger","Gray","Coupe",2023,30545,303,15,354754);$Vehicle.add($Challenger);

					Motorcycle $Panigale = new Motorcycle("Ducati","Panigale V4R","Green","Sport",2022,457373.64f,240.5f,30,7445744);$Vehicle.add($Panigale);
					Motorcycle $S1000RR = new Motorcycle("BMW","S1000RR","White","Sport",2023,25049.83f,202,30,754744);$Vehicle.add($S1000RR);
					Motorcycle $YZF = new Motorcycle("Yamaha","YZF-R1M","Black","Sport",2020,33092.05f,197,30,4575474);$Vehicle.add($YZF);
					Motorcycle $RSV4 = new Motorcycle("Aprilia","RSV4 RF","Slate","Sport",2023,29715.07f,201,30,945745);$Vehicle.add($RSV4);
					Motorcycle $ZX = new Motorcycle("Kawasaki","ZX-10R","Red","Sport",2020,17399,210,300,454654);$Vehicle.add($ZX);
					
					Bicycle $Havoc = new Bicycle("Havoc","Mountain Bike","Green","Bicycle",2022,900.94f,30,30,94933);$Vehicle.add($Havoc);
					
					Boat $Vantage = new Boat("Boston","Whaler 240","White","Boat",2112,400,22.17f,50.0f,445467);$Vehicle.add($Vantage);

					$Vantage.setYear(2020);
					$Vantage.setPrice(67585);
					$Vantage.setHorsePower(385);
					$Havoc.setHorsePower(0.3f);
					$SierraDuplicate.copyItem($Sierra);
					$SierraDuplicate.setYear(2003);
					$SierraDuplicate.setMillage(563567);
					$SierraDuplicate.setColor("Blue");
					
					System.out.print("\n    =>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<=");
					System.out.printf("%n    |  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|%n",
					"Brand","Models","Color","Style","Year","Horse Power","Price","Efficiency","Kilometers");
					System.out.print("    |----------------|----------------|----------------|----------------|----------------|----------------|----------------|----------------|----------------|");
					
					for (Vehicles _Vehicle : $Vehicle)
						{
							_Vehicle.getInformation();
						}

					System.out.print("\n    =>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<=\n\n");
					
					$Vantage.Start($Caesar);
					$330.Increase($Andrew);
					$S1000RR.Decrease($Germanicus);
					$Cherokee.Lock($Marcus);
					$Garage.Parked($Challenger);
					$Garage.Parked($330);
					$Garage.Parked($Mirage);
					$Garage.Parked($Cherokee);
					$Garage.Parked($SierraDuplicate);
					$Garage.Parked($Panigale);
					Garage.getParked();

					$Caesar.Eating();
					$Andrew.Running();
					$Vantage.Sailing($Andrew);
					$Havoc.Pedaling($Marcus);
					$SierraDuplicate.Tow($Germanicus);
					System.out.println("\n\n\t(1) Yes\t\t(2) No");
					System.out.print("\n\tWould you like to Create a Vehicle: ");
					boolean[] $Condition = new boolean[2];
					$Condition[0] = false;
					$Condition[1] = false;
					try (Scanner $Input = new Scanner(System.in)) 
						{
							while ($Condition[0] == false)
								{
									String $Choice = $Input.nextLine();
									switch($Choice)
										{
											case "1": System.out.print("\n\tVehicle Make: ");
												String[] $String = new String[4];
												int[] $Integer = new int[1];
												float[] $Float = new float[4];
											 	$Choice = $Input.nextLine(); $String[0] = $Choice;
											 	System.out.print("\n\tVehicle Model: ");
											 	$Choice = $Input.nextLine();$String[1] = $Choice;
											 	System.out.print("\n\tVehicle Color: ");
											 	$Choice = $Input.nextLine();$String[2] = $Choice;
											 	System.out.print("\n\tVehicle Year: ");
											 	try 
											 		{
											 			$Choice = $Input.nextLine();$Integer[0] = Integer.parseInt($Choice);
											 		} catch (NumberFormatException e)
											 			{
											 				System.out.println("\n\tYou didnt enter a number :(");
											 			}
											 	System.out.print("\n\tVehicle Horse Power: ");
											 	try 
										 			{
											 			$Choice = $Input.nextLine();$Float[0] = Float.parseFloat($Choice);
												 	} catch (NumberFormatException e)
											 			{
											 				System.out.println("\n\tYou didnt enter a number :(");
											 			}
											 	System.out.print("\n\tVehicle Price: ");
											 	try 
											 		{
											 	$Choice = $Input.nextLine();$Float[1] = Float.parseFloat($Choice);
												 	} catch (NumberFormatException e)
											 			{
											 				System.out.println("\n\tYou didnt enter a number :(");
											 			}
											 	
											 	System.out.print("\n\tVehicle Efficiency: ");
											 	try {
											 			$Choice = $Input.nextLine();$Float[2] = Float.parseFloat($Choice);$Float[3] = 0.0f;
												 	} catch (NumberFormatException e)
											 			{
											 				System.out.println("\n\tYou didnt enter a number :(");
											 			}
											 	
											 	System.out.println("\n\t(1) Hatchback\t\t (2) Sedan\t\t (3) Coupe\t\t (4) Truck\n\t(5) Pickup\t\t (6) Motorcycle\t\t (7) Sport\t\t (8) Super");
											 	while ($Condition[1] == false)
													{
												 		System.out.print("\n\tVehicle Type: ");
												 		$Choice = $Input.nextLine();$String[3] = $Choice;
												 		switch ($Choice)
												 			{
												 				case "1": Hatchback _Hatchback = new Hatchback($String[0],$String[1],$String[2],$String[3],$Integer[0],$Float[0],$Float[1],$Float[2],$Float[3]);
														 				Header();
														 				_Hatchback.getInformation();
														 				Footer();
														 				$Condition[1] = true;
												 					break;
												 				case "2": Sedan _Sedan = new Sedan($String[0],$String[1],$String[2],$String[3],$Integer[0],$Float[0],$Float[1],$Float[2],$Float[3]);
														 				Header();
														 				_Sedan.getInformation();
														 				Footer();
														 				$Condition[1] = true;
														 			break;
												 				case "3": Coupe _Coupe = new Coupe($String[0],$String[1],$String[2],$String[3],$Integer[0],$Float[0],$Float[1],$Float[2],$Float[3]);
														 				Header();
														 				_Coupe.getInformation();
														 				Footer();
														 				$Condition[1] = true;
														 			break;
												 				case "4": Truck _Truck = new Truck($String[0],$String[1],$String[2],$String[3],$Integer[0],$Float[0],$Float[1],$Float[2],$Float[3]);
														 				Header();
														 				_Truck.getInformation();
														 				Footer();
														 				$Condition[1] = true;	
														 			break; 
												 				case "5": Pickup _Pickup = new Pickup($String[0],$String[1],$String[2],$String[3],$Integer[0],$Float[0],$Float[1],$Float[2],$Float[3]);
														 				Header();
														 				_Pickup.getInformation();
														 				Footer();
														 				$Condition[1] = true;
														 			break;
												 				case "6": Motorcycle _Motorcycle = new Motorcycle($String[0],$String[1],$String[2],$String[3],$Integer[0],$Float[0],$Float[1],$Float[2],$Float[3]);
														 				Header();
														 				_Motorcycle.getInformation();
														 				Footer();
														 				$Condition[1] = true;	
														 			break;
												 				case "7": Sport _Sport = new Sport($String[0],$String[1],$String[2],$String[3],$Integer[0],$Float[0],$Float[1],$Float[2],$Float[3]);
														 				Header();
														 				_Sport.getInformation();
														 				Footer();
														 				$Condition[1] = true;	
														 			break;
												 				case "8": Super _Super = new Super($String[0],$String[1],$String[2],$String[3],$Integer[0],$Float[0],$Float[1],$Float[2],$Float[3]);
														 				Header();
														 				_Super.getInformation();
														 				Footer();
														 				$Condition[1] = true;
														 			break;
												 				default: System.out.print("\n\tVehicle Type: ");
												 					continue;
												 			}
													}
											 	continue;
											case "2": $Condition[0] = true; break;
											default: System.out.println("\n\n\t(1) Yes\t\t(2) No"); 
												System.out.print("\n\tWould you like to Create a Vehicle: ");
											continue;
										}
								}
						} catch (NumberFormatException e)
							{
								e.printStackTrace();
							}	
			}
	}