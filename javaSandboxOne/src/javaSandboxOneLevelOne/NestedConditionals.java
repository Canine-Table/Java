package javaSandboxOneLevelOne;
import javax.swing.JOptionPane;
public class NestedConditionals {

	public static void main(String [] args)
		{			
			int $Rows = Integer.parseInt(
					JOptionPane.showInputDialog(" Please enter the total number of rows. "));
			String $Symbol = JOptionPane.showInputDialog(" Please enter the symbol you wish to use. ");
			for (int i=1 ; i<=$Rows; i++)
				{
					if (i>1) {System.out.println();}
					for (int j=0; j<i; j++)
						{
							System.out.print($Symbol);
						}
				}
			
		}
}