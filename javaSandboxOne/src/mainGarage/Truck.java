package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Truck extends Vehicles implements TruckActions
	{
		protected Truck()
			{
				
			}

		protected Truck(String _Make, String _Model)
		{
			super.setModel(_Model);
			super.setMake(_Make);
		}
	
	protected Truck(String _Make, String _Model, int _Year)
		{
			super.setModel(_Model);
			super.setMake(_Make);
			super.setYear(_Year);
		}
	
	protected Truck(String _Make, String _Model, String _Color, int _Year)
		{
			super.setMake(_Make);
			super.setYear(_Year);
			super.setColor(_Color);
			super.setModel(_Model);
		}
	
	protected Truck(String _Make, String _Model, String _Color, String _Style, int _Year)
		{
			super.setMake(_Make);
			super.setYear(_Year);
			super.setColor(_Color);
			super.setModel(_Model);
			super.setStyle(_Style);		
		}
	
	protected Truck(String _Make, String _Model, String _Color, int _Year, float _Price)
		{
			super.setMake(_Make);
			super.setYear(_Year);
			super.setYear(_Year);
			super.setColor(_Color);
			super.setModel(_Model);
			super.setPrice(_Price);
		}
	
	protected Truck(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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

		protected void copyItem(Truck _Truck)
			{
				setModel(_Truck.getModel());
				setColor(_Truck.getColor());
				setMake(_Truck.getMake());
				setStyle(_Truck.getStyle());
				setYear(_Truck.getYear());
				setPrice(_Truck.getPrice());
				setHorsePower(_Truck.getHorsePower());
				setEfficiency(_Truck.getEfficiency());
				setMillage(_Truck.getMillage());
			}

		@Override
		public void Tow(People _People) 
			{
				System.out.println("\n\t"+_People.getName()+" is towing a vehicle with their "+getMake()+" "+getModel()+".");
			}
	}