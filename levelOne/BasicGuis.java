/**
 *
 */
package levelOne;
import javax.swing.JOptionPane;
/**
 * @author Table
 *
 */
public class BasicGuis {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog(" What is your name? ");
		JOptionPane.showMessageDialog(null," Hello "+name+".");
		int age = Integer.parseInt(JOptionPane.showInputDialog(" How old are you "+name+"?"));
		JOptionPane.showMessageDialog(null,name+" is "+age+" years old.");
		double height = Double.parseDouble(JOptionPane.showInputDialog(" How tall are you "+name+"?\n Enter your hight in feet."));
		JOptionPane.showMessageDialog(null,name+" is "+age+" years old and stands at "+height+"ft in height.");
		/** 
		 * The JOptionPane.showMessageDialog outputs strings, so you must convert parse the string unto the JOptionPane Before it will functionally receive it.
		 * Both the Integer wrapper class as well as the integer double class where used to converts the values to strings for the JOptionPane.
		 */
	}

}
