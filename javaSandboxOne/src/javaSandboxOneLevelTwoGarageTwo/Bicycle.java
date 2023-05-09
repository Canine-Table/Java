package javaSandboxOneLevelTwoGarageTwo;

public class Bicycle extends Vehicle
	{
		Bicycle()
			{
				
			}
		
		Bicycle(String _Model, String _Make)
			{
			this.$Model = _Model;
			this.$Make = _Make;
		
			}
		
		Bicycle(String _Model, String _Make, int _Year)
			{
				this.$Model = _Model;
				this.$Make = _Make;
				this.$Year = _Year;
			}
		
		Bicycle(String _Model, String _Make, String _Color, int _Year)
			{
				this.$Model = _Model;
				this.$Color = _Color;
				this.$Make = _Make;	
				this.$Year = _Year;
			}
		
		Bicycle(String _Model, String _Make, String _Color, String _Style, int _Year)
			{
				this.$Model = _Model;
				this.$Color = _Color;
				this.$Make = _Make;
				this.$Style = _Style;	
				this.$Year = _Year;
		
			}
		
		Bicycle(String _Model, String _Make, String _Color, int _Year, float _Price)
			{
				this.$Model = _Model;
				this.$Color = _Color;
				this.$Make = _Make;
				this.$Year = _Year;
				this.$Price = _Price;
			}
		
		Bicycle(String _Model, String _Make, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
			{
				this.$Model = _Model;
				this.$Color = _Color;
				this.$Make = _Make;
				this.$Style = _Style;
				this.$Year = _Year;
				this.$Price = _Price;
				this.$HorsePower = _HorsePower;
				this.$Efficiency = _Efficiency;
				this.$Millage = _Millage;
			}
	}