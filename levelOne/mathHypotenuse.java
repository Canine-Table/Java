/**
 * 
 */
package levelOne;
import java.util.Scanner;
/**
 * @author Table
 *
 */
public class mathHypotenuse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x; double y; double z;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a x value: ");
		x = scan.nextDouble();
		System.out.println(" Enter an y value: ");		
		y = scan.nextDouble();		
		z = Math.sqrt((x*x)+(y*y));
		System.out.print(" The hypotenuyse is: "+z);
		scan.close();
	}

}