
/**
 * 
 */
package javaSandboxOneLevelTwoGarage;

/**
 * @author Table
 *
 */
public class Garage extends Vehicle 
	{
		static int $Parked = 0;

		void Parked(Vehicle Vehicle)
			{
			 	System.out.println("\n\tThe "+Vehicle.getMake()+" "+Vehicle.getModel()+" is parked.");
				$Parked +=1;
			}
		void Parked(Motorcycle Motorcycle)
			{
			 	System.out.println("\n\tThe "+Motorcycle.getMake()+" "+Motorcycle.getModel()+" is parked.");
				$Parked +=1;
			}

		static void getParked()
			{
				System.out.println("\n\tThere are currently "+$Parked+" parked vehicles.");
			}
		
		public class Boat extends Garage
			{
				Boat(String _Make, String _Model, String _Color, String _Style, int _Year, float _HorsePower,float _Price, float _Efficiency)
					{
						this.$Efficiency = _Efficiency;
						this.$Model = _Model;
						this.$Style = _Style;
						this.$Color = _Color;
						this.$Make = _Make;
						this.$Price = _Price;
						this.$Year = _Year;
						this.$HorsePower = _HorsePower;
					}	
				public void getWheels()
					{
						System.out.println("\n\tThis is a "+$Make+" "+$Model+". The boat has no wheels.");
					}
				void Parked()
					{
					 	System.out.println("\n\tThe "+$Make+" "+$Model+" is parked.");
						$Parked +=1;
					}				
			}
		public static void main(String[] args) {
			Human Marcus = new Human("Marcus Aurelius Antoninus","Antoninus","Marcus","Aurelius","Politician","Emperor",58,5.8f,140.33f,5000000);
			Human Germanicus = new Human( "Germanicus Julius Caesar","Caesar","Germanicus","Julius","Politician","Executive Magistrate",33,5.8f,130.33f,2000000);
			Vehicle $Corolla = new Vehicle("Toyota","Corolla","Blue","Sedan",2023,169,21550,35);
			Vehicle $Prius = new Vehicle("Toyota","Prius","Silver","Hatchback",2022,191,25075,49);
			Vehicle $Mirage = new Vehicle("Mitsubishi","Mirage","Black","Hatchback",2022,74,16245,39);
			Vehicle $Cherokee = new Vehicle("Jeep","Cherokee","Red","SUV",2014,293,29995,25);
			Vehicle $Niro = new Vehicle("Kia","Niro","White","SUV",2023,139,26490,53);
			Vehicle $H3T  = new Vehicle("Hummer","H3T","Yellow","Pickup",2009,239,40300,14);
			Vehicle $330 = new Vehicle("BMW","330","Slate","Coupe",2023,255,37400,29);
			Vehicle $A3 = new Vehicle("Audi","A3","Blue","Sedan",2021,201,35400,30);
			Vehicle $Challenger = new Vehicle("Dodge","Challenger","Gray","Coupe",2023,303,30545,15);
			Vehicle $Mazda6 = new Vehicle("Mazda","Mazda6","Red","Sedan",2021,187,24475,26);
			Vehicle $Integra = new Vehicle("Acura","Integra","Beige","Sedan",2023,200,30800,30);
			System.out.print($Corolla+"\n"+$Prius+"\n"+$Mirage+"\n"+$Cherokee+"\n"+$Niro+"\n"+$H3T+"\n"+$330+"\n"+$A3+"\n"+$Challenger+"\n"+$Mazda6+"\n"+$Integra+"\n");
			
			Garage $Garage = new Garage();
			$Garage.Parked($330);
			$Garage.Parked($Prius);
			$Garage.Parked($Challenger);
			$Garage.Parked($Integra);
			$Garage.Parked($Niro);
			Garage.getParked();
			Motorcycle $Panigale = new Motorcycle("Ducati","Panigale V4R","Green","Sport",2022,240.5f,457373.64f,30);
			Motorcycle $S1000RR = new Motorcycle("BMW","S1000RR","White","Sport",2023,202,25049.83f,30);
			Motorcycle $YZF = new Motorcycle("Yamaha","YZF-R1M","Black","Sport",2020,197,33092.05f,30);
			Motorcycle $RSV4 = new Motorcycle("Aprilia","RSV4 RF","Slate","Sport",2023,201,29715.07f,30);
			Motorcycle $ZX = new Motorcycle("Kawasaki","ZX-10R","Red","Sport",2020,210,17399,30);
			System.out.print($Panigale+"\n"+$S1000RR+"\n"+$YZF+"\n"+$RSV4+"\n"+$ZX+"\n");
			$Garage.Parked($S1000RR);
			$Garage.Parked($RSV4);
			$Garage.Parked($ZX);
			Garage.getParked();
			Garage.Boat $Vantage = new Garage().new Boat("Boston","Whaler 240 Vantage","White","Bass",112,400,221739,50);
			$Vantage.Park(Germanicus);
			$Garage.Parked($Vantage);
			Garage.getParked();
			$Corolla.getClass();
			$Vantage.getWheels();
			$Vantage.Stats();
			$Vantage.Parked();
			Garage.getParked();
			$Vantage.Park(Julius);
			$Vantage.Drive(Marcus);
			$Challenger.Drive(Andrew);
			Andrew.$Profession = "Business";
			Andrew.$JobTitle = "Millionaire";
			System.out.println(Andrew.toString());
			Feminazi.$Profession = "Only Fans";
			Feminazi.$JobTitle = "Professional Whore";
			System.out.println(Feminazi.toString());
			Bike Havoc = new Bike("Havoc","Mountain Bike","Green",1700.94f);
			Havoc.Brake();
			Havoc.Increase();
			Havoc.Decrease();
			Havoc.Move();
			System.out.println(Havoc.toString());
			Sedan Civic = new Sedan("Honda","Civic","ss","Red",4,3,3,3);
			Civic.Stats();
		}
	}

