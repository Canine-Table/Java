package javaSandboxOneLevelOne;
import java.util.Random;
import javax.swing.JOptionPane;
public class LogicalOperators {

	public static void main(String [] arg)
	{
	Random $Randomize = new Random();
	
	int $Seconds = $Randomize.nextInt(1,60);
	
	if ($Seconds >= 10 && $Seconds <= 50)
		{

			String $Quit = JOptionPane.showInputDialog(null, "Would you like to quit? (Q) or (q)");
			if (!$Quit.equals("q") && !$Quit.equals("Q"))
				{
					JOptionPane.showMessageDialog(null,"You have continued the game.");	
				}
			else
				{
					JOptionPane.showMessageDialog(null,"You have quit the game.");
				}
		}
	else
		{
			JOptionPane.showMessageDialog(null,"You have ran out of time.");
		}
	}
}