package javaSandboxOneLevelTwoGarage;

public class Bike extends Actions
	{

	public String $Model = null;
	public String $Style = null;
	public String $Color = null;
	public float $Price = 0.0f;

		Bike(String _Model, String _Style, String _Color, float _Price)
			{
				this.$Color = _Color;
				this.$Model = _Model;
				this.$Style = _Style;
				this.$Price = _Price;
			}

		@Override
		public void Move() 
			{
				System.out.println("\n\tThe "+$Model+" is moving.");
			}

		@Override
		public void Brake() 
			{
				System.out.println("\n\tThe "+$Model+" stopped.");			
			}

		@Override
		public void Increase() 
			{
				System.out.println("\n\tThe "+$Model+" is picking up speed.");			
			}

		@Override
		public void Decrease()
			{
				System.out.println("\n\tThe "+$Model+" is slowing down.");
			}
		public String toString()
			{
				return "\n\tBike Model: "+$Model+"\n\tBike Style: "+$Style+"\n\tBike Color: "+$Color+"\n\tBike Price: $"+$Price;
			}
	}