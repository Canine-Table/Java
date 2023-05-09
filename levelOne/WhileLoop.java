/**
 * 
 */
package levelOne;
import javax.swing.JOptionPane;
/**
 * @author Table
 *
 */
public class WhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean value = false;
while( value == false ) {
		String name = JOptionPane.showInputDialog(" Please Enter Your Name ");
	if ( name.length() != 0 ) { value= true;
		JOptionPane.showMessageDialog(null," Hello "+name+" Welcome to Java!");
			}
		}	
	}
}
