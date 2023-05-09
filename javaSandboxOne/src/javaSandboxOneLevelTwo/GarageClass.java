package javaSandboxOneLevelTwo;
import  javaSandboxOneLevelOne.VehiclesClass;

public class GarageClass extends VehiclesClass {
	static int $Parked = 0;
	void Parked(VehiclesClass Vehicle)
		{
		 	System.out.println("\n\tThe "+Vehicle.getMake()+" "+Vehicle.getModel()+" is parked.");
			$Parked +=1;
		}
	void Parked(MotorcycleClass Motorcycle)
		{
		 	System.out.println("\n\tThe "+Motorcycle.getMake()+" "+Motorcycle.getModel()+" is parked.");
			$Parked +=1;
		}

	static void getParked()
		{
			System.out.println("\n\tThere are currently "+$Parked+" parked vehicles.");
		}
	
	public class BoatClass extends GarageClass
		{
			public BoatClass(String _Make, String _Model, String _Color, String _Style, int _Year, float _HorsePower,float _Price, float _Efficiency)
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

		VehiclesClass $Corolla = new VehiclesClass("Toyota","Corolla","Blue","Sedan",2023,169,21550,35);
		VehiclesClass $Prius = new VehiclesClass("Toyota","Prius","Silver","Hatchback",2022,191,25075,49);
		VehiclesClass $Mirage = new VehiclesClass("Mitsubishi","Mirage","Black","Hatchback",2022,74,16245,39);
		VehiclesClass $Cherokee = new VehiclesClass("Jeep","Cherokee","Red","SUV",2014,293,29995,25);
		VehiclesClass $Niro = new VehiclesClass("Kia","Niro","White","SUV",2023,139,26490,53);
		VehiclesClass $H3T  = new VehiclesClass("Hummer","H3T","Yellow","Pickup",2009,239,40300,14);
		VehiclesClass $330 = new VehiclesClass("BMW","330","Slate","Coupe",2023,255,37400,29);
		VehiclesClass $A3 = new VehiclesClass("Audi","A3","Blue","Sedan",2021,201,35400,30);
		VehiclesClass $Challenger = new VehiclesClass("Dodge","Challenger","Gray","Coupe",2023,303,30545,15);
		VehiclesClass $Mazda6 = new VehiclesClass("Mazda","Mazda6","Red","Sedan",2021,187,24475,26);
		VehiclesClass $Integra = new VehiclesClass("Acura","Integra","Beige","Sedan",2023,200,30800,30);
		System.out.print($Corolla+"\n"+$Prius+"\n"+$Mirage+"\n"+$Cherokee+"\n"+$Niro+"\n"+$H3T+"\n"+$330+"\n"+$A3+"\n"+$Challenger+"\n"+$Mazda6+"\n"+$Integra+"\n");
		
		GarageClass $Garage = new GarageClass();
		$Garage.Parked($330);
		$Garage.Parked($Prius);
		$Garage.Parked($Challenger);
		$Garage.Parked($Integra);
		$Garage.Parked($Niro);
		GarageClass.getParked();
		MotorcycleClass $Panigale = new MotorcycleClass("Ducati","Panigale V4R","Green","Sport",2022,240.5f,457373.64f,30);
		MotorcycleClass $S1000RR = new MotorcycleClass("BMW","S1000RR","White","Sport",2023,202,25049.83f,30);
		MotorcycleClass $YZF = new MotorcycleClass("Yamaha","YZF-R1M","Black","Sport",2020,197,33092.05f,30);
		MotorcycleClass $RSV4 = new MotorcycleClass("Aprilia","RSV4 RF","Slate","Sport",2023,201,29715.07f,30);
		MotorcycleClass $ZX = new MotorcycleClass("Kawasaki","ZX-10R","Red","Sport",2020,210,17399,30);
		System.out.print($Panigale+"\n"+$S1000RR+"\n"+$YZF+"\n"+$RSV4+"\n"+$ZX+"\n");
		$Garage.Parked($S1000RR);
		$Garage.Parked($RSV4);
		$Garage.Parked($ZX);
		$ZX.Drive();
		$S1000RR.Stop();
		GarageClass.getParked();
		GarageClass.BoatClass $Vantage = new GarageClass().new BoatClass("Boston","Whaler 240 Vantage","White","Bass",112,400,221739,50);
		$Vantage.Park();
		$Garage.Parked($Vantage);
		GarageClass.getParked();
		$S1000RR.getWheels();
		$Corolla.getClass();
		$Vantage.getWheels();
		$Vantage.Stats();
		$Vantage.Parked();
		GarageClass.getParked();
		
		
	}
}