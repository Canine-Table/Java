package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage 
{
	
	LaunchPage()
	{
		jFrame();
	}

	protected static JFrame jFrame()
		{
			JFrame jFrame = new JFrame();
			jFrame.getContentPane().setBackground(new Color(0x000000));
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setSize(512,512);
			JButton jButton = new JButton("This is a big Button!");
			jButton.setFont(new Font("Arial, Helvetica, sans-serif;",Font.BOLD,48));
			jButton.setFocusable(false);
			jButton.addActionListener(e -> 
				{
					new LayeredPanes();
				});
			jFrame.add(jButton);
			jFrame.setVisible(true);
			return jFrame;
		}

	public static void main(String[] args)
		{
			jFrame();
		}	
}