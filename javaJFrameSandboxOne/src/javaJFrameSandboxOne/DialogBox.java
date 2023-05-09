package javaJFrameSandboxOne;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogBox 
	{
	
	protected static void DialogBoxOptions()
		{
			JOptionPane.showMessageDialog(null, "Some Information","Title", JOptionPane.PLAIN_MESSAGE);
			JOptionPane.showMessageDialog(null, "Some Information","Title", JOptionPane.CANCEL_OPTION);
			JOptionPane.showMessageDialog(null, "Some Information","Title", JOptionPane.CLOSED_OPTION);
			JOptionPane.showInternalConfirmDialog(null, "Some Information","Title", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showInputDialog(null, "Some Information","Title", JOptionPane.DEFAULT_OPTION);
			JOptionPane.showConfirmDialog(null, "Some Information","Title", JOptionPane.YES_NO_CANCEL_OPTION);
		}
		public static void main(String[] args)
		{
			String[] responces = {"Yes","Probability","Maybe","Possibly","No"};
			ImageIcon icon = new ImageIcon("Images\\PNG\\music.png");
			JOptionPane.showOptionDialog(null, "Option Dialog Information", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon, responces, args);
		}		
	}

