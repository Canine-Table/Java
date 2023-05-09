package javaJFrameSandboxOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("unused")
public class Temp 
	{
	static JPanel jPanelOne;
	protected static JPanel jPanelTwo()
	{	
		JPanel jPanelTwo = new JPanel();
		jPanelTwo.setBackground(new Color(0xFFFFFF));
		jPanelTwo.setLayout(new BorderLayout());
		jPanelTwo.setPreferredSize(new Dimension(100,100));
		JButton jButton = new JButton();
		jButton.addActionListener(e ->
		{
			if (jPanelOne.isVisible())
			{
				jPanelOne.setVisible(false);
			}
			else
			{
			jPanelOne.setVisible(true);			
	}
		});
		jPanelTwo.add(jButton);
		return jPanelTwo;
	}
	
	protected static JPanel jPanelOne()
	{	
		jPanelOne = new JPanel();
		jPanelOne.setBackground(new Color(0x893443));
		jPanelOne.setLayout(new BorderLayout());
		return jPanelOne;
	}
		protected static JFrame jFrame()
			{
				JFrame jFrame = new JFrame();
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setSize(500,500);
				jFrame.setLayout(new BorderLayout(10,10));
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.add(jPanelOne());
				jFrame.add(jPanelTwo(),BorderLayout.NORTH);				
				jFrame.setVisible(true);
				return jFrame;
			}
		
		public static void main(String[] args)
			{
				jFrame();
			}
	}
