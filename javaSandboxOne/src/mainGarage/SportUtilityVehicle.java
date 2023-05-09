package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class SportUtilityVehicle extends Vehicles
	{
		protected SportUtilityVehicle()
			{
			
			}
				
		protected SportUtilityVehicle(String _Make, String _Model)
			{
				super.setModel(_Model);
				super.setMake(_Make);
			}
		
		protected SportUtilityVehicle(String _Make, String _Model, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected SportUtilityVehicle(String _Make, String _Model, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected SportUtilityVehicle(String _Make, String _Model, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected SportUtilityVehicle(String _Make, String _Model, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected SportUtilityVehicle(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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
		protected void copyItem(SportUtilityVehicle _SportUtilityVehicle)
			{
				setModel(_SportUtilityVehicle.getModel());
				setColor(_SportUtilityVehicle.getColor());
				setMake(_SportUtilityVehicle.getMake());
				setStyle(_SportUtilityVehicle.getStyle());
				setYear(_SportUtilityVehicle.getYear());
				setPrice(_SportUtilityVehicle.getPrice());
				setHorsePower(_SportUtilityVehicle.getHorsePower());
				setEfficiency(_SportUtilityVehicle.getEfficiency());
				setMillage(_SportUtilityVehicle.getMillage());
			}
	}