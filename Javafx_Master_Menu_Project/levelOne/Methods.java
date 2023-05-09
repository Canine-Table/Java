/**
 * a Method is a block of code that is executed whenever it is called upon.
 * a Argument is a value or variables which is send to a method.
 * a Parameter is a matching set of a method.
 */
package levelOne;

/**
 * @author Table
 *
 */
public class Methods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JohnDoe";
		int age = 32;
		int x = 33;
		int y = 493;
		hello(name,age);
		System.out.print("\n\n\t"+add(x,y));
		stuff();
		main();
	}
	
	static void hello(String iefjgjjkefmeiod, int age ) {
		System.out.print("\n\n\t Hello "+iefjgjjkefmeiod+".\n\n\t You are "+age+" years old.");
	
	}
	
	private static int add( int x, int y ) {
		return x + y;
		
	}
	private static void stuff() {
		System.out.print("\n\n\t Hello Stuff.");		
	}
	public static void main(){
		System.out.println("\n\n\t "
				+ "main without args");
	}  
}