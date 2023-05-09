/**
 * 
 */
package levelTwo;

import java.util.Random;
/**
 * @author Table
 *
 */
public class DiceRoller {

	Random random;
	int number;

	DiceRoller() {
		// these are local variables:	Random random = new Random();
		random = new Random();
		// these are local variables:	int number = 0;
		// these are local variables:	roll(random,number);
		roll();

	}

	// these are local variables:	void roll(Random random, int number) {
	void roll() {
		number = random.nextInt(6+1);
		System.out.println(number);
	}
}
