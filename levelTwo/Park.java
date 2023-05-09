/**
 * 
 */
package levelTwo;

/**
 * @author Table
 *
 */
public class Park {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Garage garage = new Garage();

	@SuppressWarnings("unused")
	Vehicle ford = new Vehicle("Ford");
	@SuppressWarnings("unused")
	Vehicle mazda = new Vehicle("Mazda");
	Vehicle honda = new Vehicle("Honda");
	Vehicle bmw = new Vehicle("BMW");
	
	garage.parking(bmw);
	garage.parking(honda);
	

	}

}
