package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Coupe extends Vehicles
	{
		protected Coupe()
			{
				
			}
		
		protected Coupe(String _Model, String _Make)
			{
				super.setModel(_Model);
				super.setMake(_Make);
			}
		
		protected Coupe(String _Model, String _Make, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected Coupe(String _Model, String _Make, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected Coupe(String _Model, String _Make, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected Coupe(String _Model, String _Make, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected Coupe(String _Model, String _Make, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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
		protected void copyItem(Coupe _Coupe)
			{
				setModel(_Coupe.getModel());
				setColor(_Coupe.getColor());
				setMake(_Coupe.getMake());
				setStyle(_Coupe.getStyle());
				setYear(_Coupe.getYear());
				setPrice(_Coupe.getPrice());
				setHorsePower(_Coupe.getHorsePower());
				setEfficiency(_Coupe.getEfficiency());
				setMillage(_Coupe.getMillage());
			}
	}