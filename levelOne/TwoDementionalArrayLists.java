/**
 *  2d ArrayLists are dynamic lists of lists
 *  You can change the size of these lists durring runtime :D
 */
package levelOne;
import java.util.ArrayList;
/**
 * @author Table
 *
 */
public class TwoDementionalArrayLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> backeryList = new ArrayList<String>();
	backeryList.add("garlic");
	backeryList.add("flower");
	backeryList.add("oil");
	backeryList.add("dough");
	backeryList.add("salt");
	
	ArrayList<String> produceList = new ArrayList<String>();
	produceList.add("apple");
	produceList.add("orange");
	produceList.add("grapes");
	produceList.add("mango");
	produceList.add("avocado");
	
	ArrayList<String> drinksList = new ArrayList<String>();
	drinksList.add("garlic");
	drinksList.add("flower");
	drinksList.add("oil");
	drinksList.add("dough");
	drinksList.add("salt");
	
	ArrayList<ArrayList<String>> groceryList = new 	ArrayList<ArrayList<String>>();
	groceryList.add(drinksList);
	groceryList.add(backeryList);	
	groceryList.add(produceList);
	
	System.out.print(groceryList.get(0).get(0));
	}

}
