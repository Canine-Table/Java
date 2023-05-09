/**
 * 
 * Overloaded methods = methods that share the same name ut have different parameters.
 * 						method name + parameters = method signature
 * 		I currently have 6 method signatures.
 *  The matching signatures will match 1 and 6 int paramaters to the private add methods.
 *  	What is taken into consideration is the...
 *
 *		- the data types
 *		- the number of paramaters
 *		- the order of the values
 */
package levelOne;

/**
 * @author Table
 *
 */
public class OverLoadMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = add(4453.34,403.33,3434.34);
		System.out.print(x);
	}

	@SuppressWarnings("unused")
	private static int add(int a) {
		System.out.print("\n\n\tThis is the First Overload: ");
		return a;
	}

	@SuppressWarnings("unused")
	private static int add(int a, int b) {
		System.out.print("\n\n\tThis is the Second Overload: ");
		return a+b;
	
	}

	@SuppressWarnings("unused")
	private static int add(int a, int b, int c) {
		System.out.print("\n\n\tThis is the Third Overload: ");
		return a+b+c;
	
	}
	private static double add(double a, double b, double c) {
		System.out.print("\n\n\tThis is the Third and Doubled Overload: ");
		return a+b+c;
	
	}

	@SuppressWarnings("unused")
	private static int add(int a, int b, int c, int d) {
		System.out.print("\n\n\tThis is the Forth Overload: ");
		return a+b+c+d;
	
	}
	
	@SuppressWarnings("unused")
	private static int add(int a, int b, int c, int d,int e) {
		System.out.print("\n\n\tThis is the Fifth Overload: ");
		return a+b+c+d+e;

	}
	@SuppressWarnings("unused")
	private static int add(int a, int b, int c, int d,int e, int f) {
		System.out.print("\n\n\tThis is the Fifth Overload: ");
		return a+b+c+d+e+f;

	}
	
}