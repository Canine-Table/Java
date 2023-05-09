package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Hatchback extends Vehicles
	{
		protected Hatchback()
			{
			
			}
		protected Hatchback(String _Make, String _Model)
			{
				super.setModel(_Model);
				super.setMake(_Make);
			}
		
		protected Hatchback(String _Make, String _Model, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected Hatchback(String _Make, String _Model, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected Hatchback(String _Make, String _Model, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected Hatchback(String _Make, String _Model, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected Hatchback(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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
		protected void copyItem(Hatchback _Hatchback)
			{
				setModel(_Hatchback.getModel());
				setColor(_Hatchback.getColor());
				setMake(_Hatchback.getMake());
				setStyle(_Hatchback.getStyle());
				setYear(_Hatchback.getYear());
				setPrice(_Hatchback.getPrice());
				setHorsePower(_Hatchback.getHorsePower());
				setEfficiency(_Hatchback.getEfficiency());
				setMillage(_Hatchback.getMillage());
			}
	}