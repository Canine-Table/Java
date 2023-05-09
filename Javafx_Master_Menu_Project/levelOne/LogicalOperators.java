/**
 * 
 */
package levelOne;

/**
 * @author Table
 *
 */
public class LogicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int temperature = 300;
		if  ( temperature > 40 ) { System.out.println("\n\tIt is way to hot to safely outside!");
			} 
		else if ( temperature > 30 && temperature <= 40 ) { System.out.println("\n\tIt is dangerously hot outside!");
			} 
		else if ( temperature > 20 && temperature <= 30) { System.out.println("\n\tIts a extremely hot outside!");
			}
		else if ( temperature > 10 && temperature <= 20) { System.out.println("\n\tIt is hot outside.");
			}
		else if ( temperature > 0 && temperature <= 10 ) { System.out.println("\n\tIt is chili outside.");
			}
		else if ( temperature > -10 && temperature <= 0 ) { System.out.println("\n\tIt is cold ouside.");
			}
		else if ( temperature > -20 && temperature <= -10 ) { System.out.println("\n\tIt is very cold outside.");
			}
		else if ( temperature > -30 && temperature <= -20 ) { System.out.println("\n\tIt is extremely cold outside!");
			}
		else if ( temperature > -40 && temperature <= -30 ) { System.out.println("\n\tIt is dangerously cold to go outside!");
			}
		else { System.out.println("\n\tit is way to cold to safely go outside!"); }	
	String string = "Hello";
		if (string.equals("Hello")) {
			System.out.println("\n\tHello");
		} else if  (!string.equals("Hello") );
			System.out.println("\n\tBye");	
			}

}
