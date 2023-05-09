package levelTwo;
/**
 * Constructors = special method that is called when an object is instantiated (created)
 */
/**
 * @author Table
 *
 */
public class Constructors {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human johnDoe = new Human("Johnny Doe", "Male", 53, 6.4, 134);
		Human janeDoe = new Human("Janet Doe", "Female", 66, 5.2, 274);
			System.out.println("\n\n\t Jane Doe's Full Name: "+janeDoe.name);
			System.out.println("\n\n\t Jane Doe's Gender: "+janeDoe.gender);
			System.out.println("\n\n\t Jane Doe's Age: "+janeDoe.age);
			System.out.println("\n\n\t Jane Doe's Height: "+janeDoe.height);
			System.out.println("\n\n\t Jane Doe's Weight: "+janeDoe.weight);
			janeDoe.drink();
			janeDoe.eat();
			System.out.println("\n\n");
			System.out.println("\n\n\tJohn Doe's Full Name: "+johnDoe.name);
			System.out.println("\n\n\tJohn Doe's Gender: "+johnDoe.gender);
			System.out.println("\n\n\tJohn Doe's Age: "+johnDoe.age);
			System.out.println("\n\n\tJohn Doe's Height: "+johnDoe.height);
			System.out.println("\n\n\tJohn Doe's Weight: "+johnDoe.weight);
			johnDoe.drink();
			johnDoe.eat();
	}
}
