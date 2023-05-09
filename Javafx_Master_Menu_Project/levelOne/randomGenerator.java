/**
 * 
 */
package levelOne;
import java.util.Random;
/**
 * @author Table
 *
 */
public class randomGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); // these are sudo random numbers not totally random but close to random.
		int a = random.nextInt(100)+1;
		System.out.println("\n\tThe random int number is: "+a+"\n");
		double b = random.nextDouble();
		System.out.println("\n\tThe random double number is: "+b+"\n");
		boolean c = random.nextBoolean();
		System.out.println("\n\tThe random boolean number is: "+c+"\n");
		long d = random.nextLong(1000000)+1;
		System.out.println("\n\tThe random long number is: "+d+"\n");
	}

}
