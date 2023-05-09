/**
 * 
 */
package levelTwo;
/**
 * @author Table
 *
 */
public class ChevroletCorvette {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClassTwo Chevrolet = new CarClassTwo();
		CarClassTwo Corvette = new CarClassTwo();
		
			System.out.println("\n\n\t Car Make: "+Chevrolet.make);	
			System.out.println("\n\n\tCar Model: "+Chevrolet.model);
			System.out.println("\n\n\t Price: "+Chevrolet.price);	
			System.out.println("\n\n\tHorse Power: "+Chevrolet.power);
			System.out.println("\n\n\tCar Color: "+Chevrolet.color);
			Chevrolet.drive();
			Chevrolet.start();
			Chevrolet.brake();
			System.out.println("\n\n\t Car Make: "+Corvette.make);	
			System.out.println("\n\n\tCar Model: "+Corvette.model);
			System.out.println("\n\n\t Price: "+Corvette.price);	
			System.out.println("\n\n\tHorse Power: "+Corvette.power);
			System.out.println("\n\n\tCar Color: "+Corvette.color);
			Corvette.drive();
			Corvette.start();
			Corvette.brake();
			
	}
}
