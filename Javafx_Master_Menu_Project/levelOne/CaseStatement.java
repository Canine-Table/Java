/**
 * 
 */
package levelOne;

/**
 * @author Table
 *
 */
public class CaseStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String day = "Friday";
		switch( day ) {
			case "Monday": System.out.println("\n\tToday is a Monday.");
				break;
			case "Tuesday": System.out.println("\n\tToday is a Tuesday.");
				break;
			case "Wednesday": System.out.println("\n\tToday is a Wednesday.");
				break;
			case "Thursday": System.out.println("\n\tToday is a Thursday.");
				break;
			case "Friday": System.out.println("\n\tToday is a Friday.");
				break;
			case "Saturday": System.out.println("\n\tToday is a Saturday.");
				break;
			case "Sunday": System.out.println("\n\tToday is a Sunday.");
				break;
			default: System.out.println("\n\t"+day+" is not a valid day.");
		} // End of the Switch statement.
		
	}

}
