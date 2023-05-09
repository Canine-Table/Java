/**
 * 
 */
package levelTwo;

/**
 * @author Table
 *
 */
public class Enheritance extends Boat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck truck = new Truck();
		Motorcycle bike = new Motorcycle();
		bike.stop();
		Boat boat = new Boat();
		boat.start();
		Enheritance now = new Enheritance();
		now.start();
		truck.stop();
		bike.wheels();
		System.out.println(bike.wheels);
		
		

		

	}

}
