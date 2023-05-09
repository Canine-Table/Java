package javaJFrameSandboxOne;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
@SuppressWarnings("all")
public class DragnDropFrameClass extends JFrame 
	{	
		DragnDropFrameClass()
			{
				new DragnDropClass();
				//jIconOne = new ImageIcon("Images/PNG/04_y.png"); 
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setSize(1024,760);
				this.getContentPane().setBackground(new Color(0x000000));
				this.setVisible(true);
			}
	}