/**
 *  overloaded constuctors = multiple constructors within a class with the same name,
 *  	but have different parameters
 *  	name + paramaters = signature
 *  	What is taken into consideration is the...
 *
 *		- the data types
 *		- the number of paramaters
 *		- the order of the values
 */
package levelTwo;
/**
 * @author Table
 *
 */
public class OverloadedPizzas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		Pizzas pizza = new Pizzas("Thick Crust","Hawaiian","Ragu","Mozzarella");
			System.out.printf("%n%n\t%s%n%n\t%s%n%n\t%s%n%n\t%s%n%n\t%s%n%n\t%s%n%n\t%s",""
					+ "Here are the ingredients of your pizza",""
					+ "Using Printf",""
					+ "I am Learning things",
					pizza.bread,pizza.cheese,
					pizza.toppings,
					pizza.sauce);
	}

}
