/**
 * 
 */
package levelOne;
import javax.swing.JOptionPane;
/**
 * @author Table
 *
 */
public class NestedLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = Integer.parseInt( JOptionPane.showInputDialog(" Enter the number of rows ") );
		int columns = Integer.parseInt( JOptionPane.showInputDialog(" Enter the number of rows ") );
		char symbol='@'; 
		for ( int i = 1 ; i <= rows ; i++ ) {
				System.out.println();
			for ( int j = 1 ; j <= columns ; j++ ) {
				System.out.print(symbol);
			}
		}
	}

}
