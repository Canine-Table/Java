package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Pickup extends Vehicles implements TruckActions
	{
		protected Pickup()
			{
				
			}
		
		protected Pickup(String _Make, String _Model)
			{
				super.setModel(_Model);
				super.setMake(_Make);
			}
		
		protected Pickup(String _Make, String _Model, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected Pickup(String _Make, String _Model, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected Pickup(String _Make, String _Model, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected Pickup(String _Make, String _Model, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected Pickup(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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
		protected void copyItem(Pickup _Pickup)
			{
				setModel(_Pickup.getModel());
				setColor(_Pickup.getColor());
				setMake(_Pickup.getMake());
				setStyle(_Pickup.getStyle());
				setYear(_Pickup.getYear());
				setPrice(_Pickup.getPrice());
				setHorsePower(_Pickup.getHorsePower());
				setEfficiency(_Pickup.getEfficiency());
				setMillage(_Pickup.getMillage());
			}

		@Override
		public void Tow(People _People) 
			{
				System.out.println("\n\t"+_People.getName()+" is towing a vehicle with their "+getMake()+" "+getModel()+".");
			}
	}