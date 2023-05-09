/**
 * 
 */
package theGarage;

/**
 * @author Table
 *
 */
public class Garage {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "\n\t|=====================|=====================|=====================|=====================|=====================|=====================|=====================|=====================|=====================|" );
		System.out.printf( "\t| %-20s| %-20s| %-20s| %-20s| %-20s| %-20s| %-20s| %-20s| %-20s|%n",
				 "Name", "Brand", "Model", "Type", "Color", "Used", "Price", "Milage", "Top Speed" );
		System.out.println( "\t|=====================|=====================|=====================|=====================|=====================|=====================|=====================|=====================|=====================|" );

		Inventory Highlander = new Inventory( "Toyota", 2022,"Highlander", false);
		Highlander.$CarStats(36420.00f, 0.30, 270);
		Highlander.$Color("Blue");
		Highlander.$Type("SUV");
		Highlander.$CarInformation();
		
		Inventory Spyder = new Inventory( "Audi", 2023,"R8 Spyder", false);
		Spyder.$CarStats(171000.00f, 0.940, 329);
		Spyder.$Color("White");
		Spyder.$Type("Sport");
		Spyder.$CarInformation();
		
		System.out.println( "\t|=====================|=====================|=====================|=====================|=====================|=====================|=====================|=====================|=====================|" );

	}

}
