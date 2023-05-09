/**
 * 
 */
package levelOne;
import java.util.ArrayList;
/**
 * @author Table
 *
 */
public class ArrayLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<String>();

		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Goose");
		animals.add("Owl");
		animals.add("Fox");
		animals.add("Wolf");
		animals.add("Pig");
		animals.add("Horse");
		animals.add("Bull");
		animals.add("Gazel");
		animals.add("Pony");
		animals.add("Worm");
		animals.add("Ant");
		animals.add("Spider");
		animals.set(13, "Platypus");
		animals.set(14, "Lizard");
		animals.remove(6);
		animals.remove(11);
		
		for ( int i = 0 ; i<animals.size() ; i++ ) {
			System.out.println("\n\t"+animals.get(i));
		}
		
		animals.clear();

	}

}
