/**
 * 
 */
package levelOne;
import java.util.jar.Attributes.Name;

/**
 * @author Table
 *
 */
@SuppressWarnings("unused")
public class StringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String stringMethod = "This is a String";
		 boolean compare = stringMethod.equals("this is a string");
		 System.out.println("\n\tCase sensitive stringMethod comparison is: "+compare);
		 boolean compare2 = stringMethod.equalsIgnoreCase("This is a String");
		 System.out.println("\n\tCase insencitive stringMethod comparison is: "+compare2);
		 int length = stringMethod.length();
		 System.out.println("\n\tThe total length of the stringMethod is: "+length);
		 char result = stringMethod.charAt(15);
		 System.out.println("\n\tThe 15th character in the stringMethod is: "+result);
		 int result2 = stringMethod.indexOf("i");
		 System.out.println("\n\tWithin stringMethod the first occurence of letter i is indexted at the: "+result2+"th character");
		 boolean empty = stringMethod.isEmpty();
		 System.out.println("\n\tThe stringMethod is completely empty: "+empty);		 
		 boolean blank = stringMethod.isBlank();		 
		 System.out.println("\n\tThe stringMethod contains only non printable characters: "+blank);
		 String upper = stringMethod.toUpperCase();
		 System.out.println("\n\tThe stringMethod is completely uppercased: "+upper);			 
		 String lower = stringMethod.toLowerCase(); 
		 System.out.println("\n\tThe stringMethod is completely lowercased: "+lower);
		 String trim = stringMethod.trim();
		 System.out.println("\n\tThe stringMethod is removes spaces: "+trim);
		 String replaced = stringMethod.replace("is a String", "Has Been Replaced");		
		 System.out.println("\n\tThe stringMethod is removes spaces: "+replaced);
	}

}
