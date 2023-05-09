package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/** @author Table */
@SuppressWarnings("all")

public class JProgressBarClass 
	{		
		  public static void main(String[] args)
			{

			 	int value = 0;
				JProgressBar jProgressBar = new JProgressBar();
				jProgressBar.setValue(value);
				jProgressBar.setBounds(6,36,474,25);
				jProgressBar.setStringPainted(true);
				JFrame jFrame = new JFrame();
				jFrame.getContentPane().setBackground(new Color(0xFFFFFF));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(null);
				jFrame.setSize(500,500);
				jFrame.add(jProgressBar);	
				jFrame.setVisible(true);
				while(value<=100)
					{
					jProgressBar.setValue(value);	
					try 
						{
							Thread.sleep(1000);
						} catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						value += 10;
					}
		}
	}