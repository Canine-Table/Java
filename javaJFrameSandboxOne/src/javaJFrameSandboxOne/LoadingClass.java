package javaJFrameSandboxOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

/** @author Table **/
@SuppressWarnings("unused")
public class LoadingClass 
	{
		private static JProgressBar jProgressBar = new JProgressBar();
		private static JFrame jFrame = new JFrame();
		protected static JProgressBar jProgressBar()
			{
				jProgressBar.setStringPainted(true);
				jProgressBar.setFont(new Font("Arial, Helvetica, sans-serif",Font.BOLD,36));
				jProgressBar.setPreferredSize(new Dimension(0,50));
				return jProgressBar;
			}
		
		protected static JFrame jFrame()
			{
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jProgressBar();
				jFrame.setLayout(new BorderLayout());
				jFrame.setSize(500,500);
				jFrame.add(jProgressBar,BorderLayout.NORTH);
				jFrame.setVisible(true);
				return jFrame;
			}
	
		public static void main(String[] args)
			{
				jFrame();
			 	int value = 0;
				jProgressBar.setValue(value);
				while(value<=100)
					{
						jProgressBar.setValue(value);	
						try 
							{
								Thread.sleep(50);
							} catch (InterruptedException e) 
								{
									e.printStackTrace();
								}
							value += 1;
					}
				jProgressBar.setString("Complete");
			}
	}