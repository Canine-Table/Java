/**
 * 
 */
package levelOne;
import java.util.ArrayList;
/**
 * @author Table
 *
 */
public class ForEachLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("garlic");
		drinksList.add("flower");
		drinksList.add("oil");
		drinksList.add("dough");
		drinksList.add("salt");
		drinksList.add("break");
		drinksList.add("candy");
		drinksList.add("sugar");
		drinksList.add("bagel");
		drinksList.add("wheat");
		drinksList.add("pear");
		drinksList.add("apple");
		drinksList.add("grapes");
		drinksList.add("orange");
		
	for ( String i : drinksList) {
		System.out.println(i);
		}
	} 
}
