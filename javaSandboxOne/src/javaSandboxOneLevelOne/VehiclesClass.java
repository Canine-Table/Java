package javaSandboxOneLevelOne;

public class VehiclesClass
	{	
		public float $Efficiency = 0.0f;
		public String $Model = null;
		public String $Style = null;
		public float $HorsePower = 0;
		public String $Make = null;
		public String $Color = null;
		public float $Price = 0.0f;
		public int $Year = 0;
		
		public VehiclesClass() 
			{
			}		
		public VehiclesClass(String _Model)
			{
				this.$Model = _Model;
			}
		public VehiclesClass(String _Model, String _Make)
			{
				this.$Model = _Model;
				this.$Make = _Make;
			}
		public VehiclesClass(String _Model, String _Make, int _Year)
			{
				this.$Model = _Model;
				this.$Make = _Make;
				this.$Year = _Year;
			}
		public VehiclesClass(String _Model, String _Make, int _Year,float _Price)
			{
				this.$Model = _Model;
				this.$Make = _Make;
				this.$Price = _Price;
				this.$Year = _Year;
			}
		public VehiclesClass(String _Model, String _Make,String _Color, int _Year,float _Price)
			{
				this.$Model = _Model;
				this.$Make = _Make;
				this.$Color = _Color;
				this.$Price = _Price;
				this.$Year = _Year;
			}
		public VehiclesClass(String _Make, String _Model, String _Color, String _Style, int _Year, float _HorsePower,float _Price, float _Efficiency)
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
		public void Drive()
			{
				System.out.println("\n\tThe owner of the "+$Make+" "+$Model+" started their vehicle.");
			}
		public void Park()
			{
				System.out.println("\n\tThe owner of the "+$Make+" "+$Model+" parked their vehicle.");
			}	
		public void Stop()
			{
				System.out.println("\n\tThe owner of the "+$Make+" "+$Model+" stopped their vehicle.");
			}
		public void getWheels()
		{
			System.out.println("\n\tThe "+$Make+" "+$Model+" has 4 wheels.");
		}
		public void Stats()
			{
				System.out.printf(	"%n\tCar Manufacturer: %s"
								  + "%n\tCar Model: %s"
								  + "%n\tBody Style: %s"
								  + "%n\tCar Color: %s"
								  + "%n\tProduction Year: %d"
								  + "%n\tHorse Power: %,.2fhp"
								  + "%n\tCar Price: $%,.2f"
								  + "%n\tMiles Per Gallon: %,.2fmpg%n",
								  $Make,$Model,$Color,$Style,$Year,$HorsePower,$Price,$Efficiency );
			}
		public String toString()
			{
				String VehicleString = "\n\tCar Manufacturer: "+$Make+""
										+ "\n\tCar Model: "+$Model+""
										+ "\n\tBody Style: "+$Style+""
										+ "\n\tCar Color: "+$Color+""
										+ "\n\tProduction Year: "+$Year+""
										+ "\n\tHorse Power: "+$HorsePower+"hp"
										+ "\n\tPrice: $"+$Price+""
										+ "\n\tMiles Per Gallon: "+$Efficiency+"mpg";
				return VehicleString;
			}
		public String getMake()
			{
				return $Make;
			}
		
		public void setMake(String _Make)
			{
				this.$Make = _Make;
			}
		
		public String getModel()
			{
				return $Model;
			}
		
		public void setModel(String _Model)
			{
				this.$Model = _Model;
			}		
			
		public String getColor()
			{
				return $Color;
			}
		
		public void setColor(String _Color)
		{
			this.$Color = _Color;
		}		
		
		public int getYear()
			{
				return $Year;
			}
		
		public void setYear(int _Year)
			{
				this.$Year = _Year;
			}		

		public String getStyle()
			{
				return $Style;
			}
		public void setStyle(String _Style)
			{
				this.$Style = _Style;
			}		

		public float getHorsePower()
			{
				return $HorsePower;
			}	
		
		public void setHorsePower(float _HorsePower)
			{
				this.$HorsePower = _HorsePower;
			}		
		
		public float getPrice()
			{
				return $Price;
			}
		
		public void setPrice(float _Price)
			{
				this.$Price = _Price;
			}

		public float getEfficiency()
			{
				return $Efficiency;
			}
		public void setEfficiency(float _Efficiency)
			{
				this.$Efficiency = _Efficiency;
			}
	}