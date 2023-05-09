package javaSandboxOneLevelTwoGarageTwo;

@SuppressWarnings("unused")
public class Vehicle extends Information
	{
		Vehicle()
			{
				super();
			}

		Vehicle(String _Model, String _Make)
			{
				super();
			}

		Vehicle(String _Model, String _Make, int _Year)
			{
				super();
			}
		
		Vehicle(String _Model, String _Make, String _Color, int _Year)
			{
				super();
			}
		
		Vehicle(String _Model, String _Make, String _Color, String _Style, int _Year)
			{
				super();
			}
		
		Vehicle(String _Model, String _Make, String _Color, int _Year, int _Price)
			{
				super();
			}
		
		Vehicle(String _Model, String _Make, String _Color, String _Style, int _Year, int _Price, float _HorsePower, float _Efficiency, float _Millage)
			{
				super();
			}
		
		@Override
		protected void Start(People _People)
			{
				System.out.println("\n\t"+_People.$Name+" started up the "+super.$Model+" "+super.$Make+".");
			}

		@Override
		protected void Stop(People _People)
			{
				System.out.println("\n\t"+_People.$Name+" put the "+super.$Model+" "+super.$Make+" to a stand still.");
			}

		@Override
		protected void Increase(People _People) 
			{
				System.out.println("\n\t"+_People.$Name+" pressed the pedal to the metal while driving their "+super.$Model+" "+super.$Make+".");				
			}

		@Override
		protected void Decrease(People _People)
			{
				System.out.println("\n\t"+_People.$Name+" started to drop their "+super.$Model+" "+super.$Make+"s speed.");
			}

		@Override
		protected void Lock(People _People)
			{			
				System.out.println("\n\t"+_People.$Name+" locked the doors of their "+super.$Model+" "+super.$Make+".");
			}

		@Override
		protected void Open(People _People)
			{
				System.out.println("\n\t"+_People.$Name+" opened the doors of their "+super.$Model+" "+super.$Make+".");
			}

		@Override
		protected String getModel(String _Vehicle) 
			{
				return super.$Model;
			}

		@Override
		protected String getMake(String _Vehicle) 
			{
				return super.$Make;
			}

		@Override
		protected String getColor(String _Vehicle) 
			{
				return super.$Color;
			}

		@Override
		protected String getStyle(String _Vehicle) 
			{
				return super.$Style;
			}

		@Override
		protected int getYear(String _Vehicle) 
			{
				return super.$Year;
			}

		@Override
		protected float getPrice(String _Vehicle)
			{
				return super.$Price;
			}

		@Override
		protected float getEfficiency(String _Vehicle) 
			{
				return super.$Efficiency;
			}

		@Override
		protected float getMillage(String _Vehicle) 
			{
				return super.$Millage;
			}
		
		@Override
		protected float getHorsePower(String Vehicle)
			{
			return super.$HorsePower;			
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
				super.$Millage = _Millage;
			}
		@Override
		protected void setHorsePower(float _HorsePower)
			{
				super.$HorsePower = _HorsePower;
			}
		protected void getInformation()
			{
				System.out.printf("%n    |  %-14s|  %-14s|  %-14s|  %-14s|  %-14d|  %,-14.2f| $%,-14.2f|  %,-14.2f|  %,-14.2f|",
						$Model, $Make, $Color, $Style, $Year, $HorsePower, $Price, $Efficiency, $Millage);
			}
	}