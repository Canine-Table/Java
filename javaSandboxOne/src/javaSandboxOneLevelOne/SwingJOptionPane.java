package javaSandboxOneLevelOne;
	import javax.swing.JOptionPane;
public class SwingJOptionPane {
	public static void main(String[] args) {
		
		String $Name = JOptionPane.showInputDialog(" Please enter your name. ");
		JOptionPane.showMessageDialog(null, " Hello "+$Name+". ", $Name, 3, null);
		int $Age = Integer.parseInt(
				JOptionPane.showInputDialog(" Please enter your age "+$Name+". "));
		JOptionPane.showMessageDialog(null, " Hello "+$Name+" of age "+$Age+". ", $Name+" is "+$Age+" years old", 3, null);
		float $Salary = Float.parseFloat(
				JOptionPane.showInputDialog(" Please enter your Salary "+$Name+". "));			
		JOptionPane.showMessageDialog(null, " Hello "+$Name+" of age "+$Age+" Make $"+$Salary+" a year. ", $Name+" is "+$Age+" years old", 3, null);				
	}

}
