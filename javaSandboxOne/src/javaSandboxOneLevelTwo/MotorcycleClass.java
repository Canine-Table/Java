package javaSandboxOneLevelTwo;

import javaSandboxOneLevelOne.VehiclesClass;

public class MotorcycleClass extends VehiclesClass
	{
		public MotorcycleClass(String _Make, String _Model, String _Color, String _Style, int _Year, float _HorsePower,float _Price, float _Efficiency)
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
				System.out.println("\n\tThe "+$Make+" "+$Model+" has 2 Wheels.");
			}
	}