/**
 * 
 */
package sandboxOne;

import java.util.Random;
/**
 * @author Table
 *
 */
public class RollDice {

	Random random;
	int number;

	RollDice() {
		Random random = new Random();
		random = new Random();
		int number = 0;
		roll(random,number);
		roll();

	}

	void roll(Random random, int number) {
		number = random.nextInt(6+1);
		System.out.println(number);
	}
	void roll() {
		number = random.nextInt(6+1);
		System.out.println(number);
	}
}
