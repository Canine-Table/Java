package mainGarage;

/** @author Table */

@SuppressWarnings("unused")
public class Bicycle extends Vehicles implements BicycleActions
	{
		Bicycle()
			{
				
			}
		
		protected Bicycle(String _Make, String _Model)
			{
				super.setModel(_Model);
				super.setMake(_Make);
			}
		
		protected Bicycle(String _Make, String _Model, int _Year)
			{
				super.setModel(_Model);
				super.setMake(_Make);
				super.setYear(_Year);
			}
		
		protected Bicycle(String _Make, String _Model, String _Color, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
			}
		
		protected Bicycle(String _Make, String _Model, String _Color, String _Style, int _Year)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setStyle(_Style);		
			}
		
		protected Bicycle(String _Make, String _Model, String _Color, int _Year, float _Price)
			{
				super.setMake(_Make);
				super.setYear(_Year);
				super.setYear(_Year);
				super.setColor(_Color);
				super.setModel(_Model);
				super.setPrice(_Price);
			}
		
		protected Bicycle(String _Make, String _Model, String _Color, String _Style, int _Year, float _Price, float _HorsePower, float _Efficiency, float _Millage)
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
		protected void copyItem(Bicycle _Bicycle)
			{
				setModel(_Bicycle.getModel());
				setColor(_Bicycle.getColor());
				setMake(_Bicycle.getMake());
				setStyle(_Bicycle.getStyle());
				setYear(_Bicycle.getYear());
				setPrice(_Bicycle.getPrice());
				setHorsePower(_Bicycle.getHorsePower());
				setEfficiency(_Bicycle.getEfficiency());
				setMillage(_Bicycle.getMillage());
			}
		public void Pedaling(People _People)
			{
				System.out.println("\n\t"+_People.getName()+" is pedaling hard up the scenic side of the mountain with their "+getMake()+" "+getModel()+".");
			}
	}