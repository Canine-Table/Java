package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Motorcycle extends Vehicles
	{
		protected Motorcycle()
			{
				
			}
		protected Motorcycle(String _Make, String _Model)
			{
				super.setModel(_Model);
				super.setMake(_Make);
			}
		
		protected Motorcycle(String _Make, String _Model, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected Motorcycle(String _Make, String _Model, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected Motorcycle(String _Make, String _Model, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected Motorcycle(String _Make, String _Model, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected Motorcycle(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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
		protected void copyItem(Motorcycle _Motorcycle)
			{
				setModel(_Motorcycle.getModel());
				setColor(_Motorcycle.getColor());
				setMake(_Motorcycle.getMake());
				setStyle(_Motorcycle.getStyle());
				setYear(_Motorcycle.getYear());
				setPrice(_Motorcycle.getPrice());
				setHorsePower(_Motorcycle.getHorsePower());
				setEfficiency(_Motorcycle.getEfficiency());
				setMillage(_Motorcycle.getMillage());
			}

	}