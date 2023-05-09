package mainGarage;

/** @author Table */

import mainGarage.*;

@SuppressWarnings("unused")
public class Vehicles extends Archives
	{
		private String $Model;
		private String $Color;
		private String $Make;
		private String $Style;

	
		private int $Year;
		private float $Price;
		private float $HorsePower;
		private float $Efficiency;
		private float $Millage;

		@Override
		protected String getModel() 
			{
				return this.$Model;
			}

		@Override
		protected String getMake() 
			{
				return this.$Make;
			}

		@Override
		protected String getColor() 
			{
				return this.$Color;
			}

		@Override
		protected String getStyle() 
			{
				return this.$Style;
			}

		@Override
		protected int getYear()
			{
				return this.$Year;
			}

		@Override
		protected float getPrice()
			{
				return this.$Price;
			}

		@Override
		protected float getEfficiency() 
			{
				return this.$Efficiency;
			}

		@Override
		protected float getMillage() 
			{
				return this.$Millage;
			}
		
		@Override
		protected float getHorsePower()
			{
			return this.$HorsePower;			
			}
		
		@Override
		protected void setModel(String _Model) 
			{
				this.$Model = _Model;
			}

		@Override
		protected void setMake(String _Make) 
			{
				this.$Make = _Make;
			}

		@Override
		protected void setColor(String _Color) 
			{
				this.$Color = _Color;
			}

		@Override
		protected void setStyle(String _Style) 
			{
				this.$Style = _Style;
			}

		@Override
		protected void setYear(int _Year) 
			{
				this.$Year = _Year;
			}

		@Override
		protected void setPrice(float _Price)
			{
				this.$Price = _Price;
			}

		@Override
		protected void setEfficiency(float _Efficiency) 
			{
				this.$Efficiency = _Efficiency;
			}

		@Override
		protected void setMillage(float _Millage) 
			{
				this.$Millage = _Millage;
			}
		@Override
		protected void setHorsePower(float _HorsePower)
			{
				this.$HorsePower = _HorsePower;
			}
		protected void getInformation()
			{
				System.out.printf("%n    |  %-14s|  %-14s|  %-14s|  %-14s|  %-14d|  %,-14.2f| $%,-14.2f|  %,-14.2f|  %,-14.2f|",
						getMake(), getModel(), getColor(), getStyle(), getYear(), getHorsePower(), getPrice(), getEfficiency(), getMillage());
			}
		@Override
		public void Start(People _People)
			{
				System.out.println("\n\t"+_People.getName()+" started up the "+getMake()+" "+getModel()+".");
			}

		@Override
		public void Stop(People _People)
			{
				System.out.println("\n\t"+_People.getName()+" put the "+getMake()+" "+getModel()+" to a stand still.");
			}

		@Override
		public void Increase(People _People) 
			{
				System.out.println("\n\t"+_People.getName()+" pressed the pedal to the metal while driving their "+getMake()+" "+getModel()+" to a stand still.");
			}

		@Override
		public void Decrease(People _People)
			{
				System.out.println("\n\t"+_People.getName()+" started to drop their "+getMake()+" "+getModel()+"s speed.");
			}

		@Override
		public void Lock(People _People)
			{			
				System.out.println("\n\t"+_People.getName()+" locked the doors of their "+getMake()+" "+getModel()+".");
			}

		@Override
		public void Open(People _People)
			{
				System.out.println("\n\t"+_People.getName()+" opened the doors of their "+getMake()+" "+getModel()+".");
			}
	}