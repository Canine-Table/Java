package theGarage;

/** @author Table **/
public class Inventory {

	String type;
	String brand;
	String name;
	String color;
	int model;
	float price;
	double milage;
	double topSpeed;
	boolean used = false;

	
	public Inventory( String _Brand, int _Model, String _Name ) 
		{
			this.brand = _Brand;
			this.model = _Model;
			this.name = _Name;
		}

	public Inventory( String _Brand, int _Model, String _Name, boolean _Used ) 
		{
			this.brand = _Brand;
			this.model = _Model;
			this.name = _Name;
			this.used = _Used;
		}
	
	public void $CarStats( float _Price, double _Milage, double _TopSpeed)
		{
			price = _Price;
			milage = _Milage;
			topSpeed = _TopSpeed;
		}
	
	public void $Color( String _Color)
		{
			color = _Color;
		}

	public void $Used( boolean _Used )
		{
			used = _Used;
		}

	public void $Price( float _Price )
		{
			price = _Price;
		}
	public void $Milage( double _Milage)
		{
			milage = _Milage;
		}
	
	public void $TopSpeed( double _TopSpeed )
		{
			topSpeed = _TopSpeed;
		}

	public void $Type( String _Type)
		{
			this.type = _Type;
		}
	
	public void $CarInformation()
		{
			String _TopSpeed = this.topSpeed+" km/h";
			String _Milage = this.milage+" km";
			
			System.out.printf( "\t| %-20s| %-20s| %-20d| %-20s| %-20s| %-20b| $%,-19.2f| %-20s| %-20s|%n", this.name, this.brand,
					this.model, this.type, this.color, this.used, this.price, _Milage, _TopSpeed );
		}
}