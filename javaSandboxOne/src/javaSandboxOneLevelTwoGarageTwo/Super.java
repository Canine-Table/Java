package javaSandboxOneLevelTwoGarageTwo;

public class Super
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
	
		Super()
			{
				
			}
		
		Super(String _Model, String _Make)
			{
				this.setModel(_Model);
				this.setMake(_Make);
			}
		
		Super(String _Model, String _Make, int _Year)
			{
				this.setModel(_Model);
				this.setMake(_Make);
				this.setYear(_Year);
			}
		
		Super(String _Model, String _Make, String _Color, int _Year)
			{
				this.setModel(_Model);
				this.setColor(_Color);
				this.setMake(_Make);
				this.setYear(_Year);
			}
		
		Super(String _Model, String _Make, String _Color, String _Style, int _Year)
			{
				this.setModel(_Model);
				this.setColor(_Color);
				this.setMake(_Make);
				this.setStyle(_Style);
				this.setYear(_Year);
			}
		
		Super(String _Model, String _Make, String _Color, int _Year, int _Price)
			{
				this.setModel(_Model);
				this.setColor(_Color);
				this.setMake(_Make);
				this.setYear(_Year);
				this.setPrice(_Price);
			}
		
		Super(String _Model, String _Make, String _Color, String _Style, int _Year, int _Price, float _HorsePower, float _Efficiency, float _Millage)
			{
				this.setModel(_Model);
				this.setColor(_Color);
				this.setMake(_Make);
				this.setStyle(_Style);
				this.setYear(_Year);
				this.setPrice(_Price);
				this.setHorsePower(_HorsePower);
				this.setEfficiency(_Efficiency);
				this.setMillage(_Millage);
			}
			
		protected void setModel(String _Model) 
			{
				this.$Model = _Model;
			}
		
		protected void setMake(String _Make) 
			{
				this.$Make = _Make;
			}
		
		protected void setColor(String _Color) 
			{
				this.$Color = _Color;
			}
	
		protected void setStyle(String _Style) 
			{
				this.$Style = _Style;
			}
		
		protected void setYear(int _Year) 
			{
				this.$Year = _Year;
			}
		
		protected void setPrice(float _Price)
			{
				this.$Price = _Price;
			}
		
		protected void setEfficiency(float _Efficiency) 
			{
				this.$Efficiency = _Efficiency;
			}
	
		protected void setMillage(float _Millage) 
			{
				this.$Millage = _Millage;
			}
		
		protected void setHorsePower(float _HorsePower)
			{
				this.$HorsePower = _HorsePower;
			}

		protected String getMake()
			{
				return $Make;
			}
		
		protected String getModel()
			{
				return $Model;
			}
		
		protected String getColor()
			{
				return $Color;
			}
		
		protected String getStyle()
			{
				return $Style;
			}
		
		protected int getyear()
			{
				return $Year;
			}		
		
		protected float getHorsePower()
			{
				return $HorsePower;
			}		
		
		protected float getPrice()
			{
				return $Price;
			}		
		
		protected float getEfficiency()
			{
				return $Efficiency;
			}
		
		protected float getMillage()
		{
			return $Millage;
		}	

		protected void copyItem(Truck _Truck)
			{
				this.setModel(_Truck.getModel());
				this.setColor(_Truck.getColor());
				this.setMake(_Truck.getMake());
				this.setStyle(_Truck.getStyle());
				this.setYear(_Truck.getyear());
				this.setPrice(_Truck.getPrice());
				this.setHorsePower(_Truck.getHorsePower());
				this.setEfficiency(_Truck.getEfficiency());
				this.setMillage(_Truck.getMillage());
			}
		
		protected void getInformation()
			{
				System.out.printf("%n    |  %-14s|  %-14s|  %-14s|  %-14s|  %-14d|  %,-14.2f| $%,-14.2f|  %,-14.2f|  %,-14.2f|",
						getModel(), getMake(), getColor(), getStyle(), getyear(), getHorsePower(), getPrice(), getEfficiency(), getMillage());
			}
	}