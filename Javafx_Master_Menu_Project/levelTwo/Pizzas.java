/**
 * 
 */
package levelTwo;
/**
 * @author Table
 *
 */
public class Pizzas { // constuctors are same case as its class

	String bread;
	String toppings;
	String sauce;
	String cheese;
	
		Pizzas( String bread
				,String toppings
				,String sauce
				,String cheese ){
			
	this.bread = bread;
	this.toppings = toppings;
	this.sauce = sauce;
	this.cheese = cheese;
	
		}
		Pizzas( String bread
				,String sauce
				,String cheese ){
			
	this.bread = bread;
	this.sauce = sauce;
	this.cheese = cheese;
		}
		
		Pizzas( String bread ){
			
	this.bread = bread;

		}
}