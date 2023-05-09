package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Sedan extends Vehicles
	{
		protected Sedan()
			{
				
			}
		
		protected Sedan(String _Make, String _Model)
		{
			super.setModel(_Model);
			super.setMake(_Make);
		}
	
		protected Sedan(String _Make, String _Model, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected Sedan(String _Make, String _Model, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected Sedan(String _Make, String _Model, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected Sedan(String _Make, String _Model, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected Sedan(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);	
				super.setPrice(_Price);
				super.setMillage(_Millage);
				super.setHorsePower(_HorsePower);
				super.setEfficiency(_Efficiency);	
			}

		protected void copyItem(Sedan _Sedan)
			{
				setModel(_Sedan.getModel());
				setColor(_Sedan.getColor());
				setMake(_Sedan.getMake());
				setStyle(_Sedan.getStyle());
				setYear(_Sedan.getYear());
				setPrice(_Sedan.getPrice());
				setHorsePower(_Sedan.getHorsePower());
				setEfficiency(_Sedan.getEfficiency());
				setMillage(_Sedan.getMillage());
			}
	}