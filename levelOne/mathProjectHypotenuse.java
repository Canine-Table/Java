package levelOne;
import javax.swing.JOptionPane;
/**
 * 
 */

/**
 * @author Table
 *
 */
public class mathProjectHypotenuse {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// double sum=360;
		double x = Double.parseDouble(JOptionPane.showInputDialog(null," What is the Value of (X)"));
		double y = Double.parseDouble(JOptionPane.showInputDialog(null," What is the Value of (Y)"));
		// double z = sum-(x+y); This is to look for the angle or a triangle. 
		double z = Math.sqrt((x*x)+(y*y)); 
		JOptionPane.showMessageDialog(null,"\n The (X) value is: "+x+"\n The (Y) value is: "+y+"\n The Hypotenuse is: "+z+"              \n\n");
	}
}
