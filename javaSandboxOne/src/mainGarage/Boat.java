package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Boat extends Vehicles implements BoatActions
	{
		protected Boat()
			{
				
			}
			
		protected Boat(String _Make, String _Model)
			{
				super.setModel(_Model);
				super.setMake(_Make);
			}
		
		protected Boat(String _Make, String _Model, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected Boat(String _Make, String _Model, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected Boat(String _Make, String _Model, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected Boat(String _Make, String _Model, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected Boat(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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
	
		
		public void Sailing(People _People)
			{
				System.out.println("\n\t"+_People.getName()+" is sailing the heigh seas with their "+getMake()+" "+getModel()+".");
			}
	}