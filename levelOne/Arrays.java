/**
 * 
 */
package levelOne;

/**
 * @author Table
 *
 */
public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String vehicles[] = new String[6];
	vehicles[0]="Camaro";
	vehicles[1]="Corvette";
	vehicles[2]="Tesla";
	vehicles[3]="Lamborgini";
	vehicles[4]="Ferrari";
	vehicles[5]="Autsin Martin"; // This array has 3 elements
	String cars[] = new String[6];
	cars[0]="Nessan";
	cars[1]="Honda";	
	cars[2]="Ford";
	cars[3]="Jaguar";
	cars[4]="Mazda";
	cars[5]="Dodge";
	String objects[] = {"Tree","Rock","Log","Branch","Crane","Pool"};
	for ( int i = 0 ; i < cars.length ; i++ ){
		System.out.println("\n\t"+vehicles[i]+"\n\t"+cars[i]+"\n\t"+objects[i]);
		}
	}
}