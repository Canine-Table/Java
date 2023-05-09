package javaSandboxOneLevelOne;
	import javax.swing.JOptionPane;
public class HypotenuseClass {

	public static void main(String [] args)
	{
		
		double $SideOne = Double.parseDouble(
				JOptionPane.showInputDialog(" Please enter the length of side one. "));			
		double $SideTwo = Double.parseDouble(
				JOptionPane.showInputDialog(" Please enter the length of side two. "));

		double $Total = Math.sqrt(($SideOne * $SideOne) + ($SideTwo * $SideTwo));

		JOptionPane.showMessageDialog(null, " The Length of the hypoteneuse is "+$Total+" ", " Hypotenuse ", 3, null);						
	}
}