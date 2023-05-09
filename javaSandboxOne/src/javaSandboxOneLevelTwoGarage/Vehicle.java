package javaSandboxOneLevelTwoGarage;

public class Vehicle extends Human
	{
		static Human Julius = new Human();
		static Human Andrew = new Human("Andrew Tate", false, false);
		static Human Feminazi = new Human("Radical Feminist", true, true);
		
		float $Efficiency;
		String $Model;
		String $Style;
		float $HorsePower;
		String $Make;
		String $Color;
		float $Price;
		int $Year;
		public Vehicle()
			{
	
			}
		public Vehicle(String _Model)
			{
				this.$Model = _Model;
			}

		public Vehicle(String _Make, String _Model, String _Color, String _Style, int _Year, float _HorsePower,float _Price, float _Efficiency)
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

		public Vehicle(String _Make, String _Model, String _Color, int _Year, float _HorsePower,float _Price, float _Efficiency)
			{
				this.$Efficiency = _Efficiency;
				this.$Model = _Model;
				this.$Color = _Color;
				this.$Make = _Make;
				this.$Price = _Price;
				this.$Year = _Year;
				this.$HorsePower = _HorsePower;
			}

		public void Drive(Human _Human)
			{
				System.out.println("\n\t"+_Human.$Name+" started driving their "+$Make+" "+$Model+".");
			}

		public void Park(Human _Human)
			{
				System.out.println("\n\t"+_Human.$Name+" parked their "+$Make+" "+$Model+".");
			}	
		public void Stop(Human _Human)
			{
				System.out.println("\n\t"+_Human.$Name+" stopped the "+$Make+" "+$Model+".");
			}
		
		public void Start(Human _Human)
			{
			System.out.println("\n\t"+_Human.$Name+" started the "+$Make+" "+$Model+".");			
			}
		
		public void Brake(Human _Human)
		{
		System.out.println("\n\t"+_Human.$Name+" slammed on the brakes while driving their "+$Make+" "+$Model+".");			
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
