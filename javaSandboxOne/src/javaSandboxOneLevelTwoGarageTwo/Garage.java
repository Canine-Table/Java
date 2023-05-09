package javaSandboxOneLevelTwoGarageTwo;

@SuppressWarnings("unused")
public class Garage extends Vehicle
	{
		static int $Parked = 0;
	
		void Parked(Super Super)
			{
				$Parked+=1;
			}
		
		void Parked(Sport _Sport)
			{
				$Parked+=1;			
			}
		
		void Parked(Sedan _Sedan)
			{
				$Parked+=1;			
			}
		
		void Parked(Coupe _Coupe)
			{
				$Parked+=1;						
			}
		
		void Parked(Pickup Pickup)
			{
				$Parked+=1;
			}
		
		void Parked(Hatchback _Hatchback)
			{
				$Parked+=1;
			}
		
		void Parked(Motorcycle _Motorcycle)
			{
				$Parked+=1;
			}
		
		void Parked(SportUtilityVehicle _SportUtilityVehicle)
			{
				$Parked+=1;
			}
		void Parked(Truck _Truck)
		{
			$Parked+=1;
		}
		static void getParked()
			{
				System.out.println("\n\tThere are currently "+$Parked+" parked vehicles.");
			}
		
		public static void main(String[] args)
			{
			
				Garage $Garage = new Garage();
				
				People $Caesar = new People();
				People $Andrew = new People("Andrew Tate");
				People $Marcus = new People("Marcus Aurelius Antoninus","Antoninus","Marcus","Aurelius","Politician","Emperor",58,5.8f,140.33f,5000000);
				People $Germanicus = new People( "Germanicus Julius Caesar","Caesar","Germanicus","Julius","Politician","Executive Magistrate",33,5.8f,130.33f,2000000);

				Sedan $Corolla = new Sedan("Toyota","Corolla","Blue","Sedan",2023,20250,169,35,345465);
				Sedan $A3 = new Sedan("Audi","A3","Blue","Sedan",2021,36900,201,30,292239);
				Sedan $Mazda6 = new Sedan("Mazda","Mazda6","Red","Sedan",2021,20393,187,26,299123);			
				Sedan $Integra = new Sedan("Acura","Integra","Beige","Sedan",2023,20394,200,30,354354);
				Sedan Civic = new Sedan("Honda","Civic","Red","Sedan",2022,19253,123,34,345334);

				Hatchback $Prius = new Hatchback("Toyota","Prius","Silver","Hatchback",2022,25075,191,49,4546);
				Hatchback $Mirage = new Hatchback("Mitsubishi","Mirage","Black","Hatchback",2022,16245,74,39,54645);
				
				SportUtilityVehicle $Cherokee = new SportUtilityVehicle("Jeep","Cherokee","Red","SUV",2014,29995,293,25,44564);
				SportUtilityVehicle $Niro = new SportUtilityVehicle("Kia","Niro","White","SUV",2023,26490,139,53,4546454);
				
				Pickup $H3T  = new Pickup("Hummer","H3T","Yellow","Pickup",2009,40300,239,14,3457445);
				
				Truck $Sierra = new Truck("GMC","Sierra 2500","White","Truck",2024,80135,340,10,2);
				
				Coupe $330 = new Coupe("BMW","330","Slate","Coupe",2023,37400,255,29,3457858);
				Coupe $Challenger = new Coupe("Dodge","Challenger","Gray","Coupe",2023,30545,303,15,354754);

				Motorcycle $Panigale = new Motorcycle("Ducati","Panigale V4R","Green","Sport",2022,457373.64f,240.5f,30,7445744);
				Motorcycle $S1000RR = new Motorcycle("BMW","S1000RR","White","Sport",2023,25049.83f,202,30,754744);
				Motorcycle $YZF = new Motorcycle("Yamaha","YZF-R1M","Black","Sport",2020,33092.05f,197,30,4575474);
				Motorcycle $RSV4 = new Motorcycle("Aprilia","RSV4 RF","Slate","Sport",2023,29715.07f,201,30,945745);
				Motorcycle $ZX = new Motorcycle("Kawasaki","ZX-10R","Red","Sport",2020,17399,210,300,454654);
				
				Bicycle $Havoc = new Bicycle("Havoc","Mountain Bike","Green","Bicycle",2022,900.94f,30,30,94933);
				
				Boat $Vantage = new Boat("Boston","Whaler 240","White","Boat",2112,400,22.17f,50.0f,445467);

				$Vantage.setYear(2020);
				$Vantage.setPrice(67585);
				$Vantage.setHorsePower(385);
				$Havoc.setHorsePower(0.3f);
				
				Truck $SierraDuplicate = new Truck(null,null,null,null,0,0,0,0,0);
				$SierraDuplicate.copyItem($Sierra);
				
				System.out.print("\n    =>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<_>--------------<=");
				System.out.printf("%n    |  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|  %-14s|%n",
				"Brand","Models","Color","Style","Year","Horse Power","Price","Efficiency","Kilometers");
				System.out.print("    |----------------|----------------|----------------|----------------|----------------|----------------|----------------|----------------|----------------|");
				$Corolla.getInformation();
				$A3.getInformation();
				Civic.getInformation();
				$Mazda6.getInformation();
				$Integra.getInformation();
				$Prius.getInformation();
				$Mirage.getInformation();
				$H3T.getInformation();
				$Sierra.getInformation();
				$SierraDuplicate.getInformation();
				$Challenger.getInformation();
				$330.getInformation();
				$Cherokee.getInformation();
				$Niro.getInformation();
				$Panigale.getInformation();
				$YZF.getInformation();
				$RSV4.getInformation();
				$S1000RR.getInformation();
				$ZX.getInformation();
				$Havoc.getInformation();
				$Vantage.getInformation();
				System.out.print("\n    =>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<+>--------------<=\n\n");

				$Vantage.Start($Caesar);
				$330.Increase($Andrew);
				$S1000RR.Decrease($Germanicus);
				$Cherokee.Lock($Marcus);
				$Garage.Parked($Challenger);
				$Garage.Parked($330);
				$Garage.Parked($Mirage);
				$Garage.Parked($Cherokee);
				Garage.getParked();
			}
	}