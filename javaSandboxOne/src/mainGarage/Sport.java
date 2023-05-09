package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Sport extends Vehicles
	{
		protected Sport()
			{
				
			}
		
		protected Sport(String _Make, String _Model)
			{
				super.setModel(_Model);
				super.setMake(_Make);
			}
		
		protected Sport(String _Make, String _Model, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected Sport(String _Make, String _Model, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected Sport(String _Make, String _Model, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected Sport(String _Make, String _Model, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected Sport(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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
	
	protected void copyItem(Sport _Sport)
			{
				setModel(_Sport.getModel());
				setColor(_Sport.getColor());
				setMake(_Sport.getMake());
				setStyle(_Sport.getStyle());
				setYear(_Sport.getYear());
				setPrice(_Sport.getPrice());
				setHorsePower(_Sport.getHorsePower());
				setEfficiency(_Sport.getEfficiency());
				setMillage(_Sport.getMillage());
			}
	}