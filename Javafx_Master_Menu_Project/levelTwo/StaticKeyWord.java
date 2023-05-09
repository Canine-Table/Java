/**
 * static = modifier. A single copy of a variavle/method is created and shared.
 * 			the class "owns" the static member
 */
package levelTwo;

/**
 * @author Table
 *
 */
public class StaticKeyWord {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
	@SuppressWarnings("unused")
	Friends bob = new Friends("Bob");	
	@SuppressWarnings("unused")
	Friends sam = new Friends("Sam");	
	@SuppressWarnings("unused")
	Friends pat = new Friends("Patrick");
	@SuppressWarnings("unused")
	Friends jp = new Friends("John Paul");	
	@SuppressWarnings("unused")
	Friends jason = new Friends("Jason");
		// TODO Auto-generated method stub
		System.out.print(Friends.numOffFriends);

	}

}
