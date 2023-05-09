package javaJFrameSandboxOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** @author Table **/

public class BorderLayoutManager 
	{
		protected static JPanel jPanelOne()
			{
				JPanel jPanelOne = new JPanel();
				jPanelOne.setBackground(new Color(0xFF0000));
				jPanelOne.setPreferredSize(new Dimension(100,100));
				return jPanelOne;
			}

		protected static JPanel jPanelTwo()
		{
			JPanel jPanelTwo = new JPanel();
			jPanelTwo.setBackground(new Color(0x008000));
			jPanelTwo.setPreferredSize(new Dimension(100,100));
			return jPanelTwo;
		}
		protected static JPanel jPanelThree()
		{
			JPanel jPanelThree = new JPanel();
			jPanelThree.setBackground(new Color(0xFFFF00));
			jPanelThree.setPreferredSize(new Dimension(100,100));
			return jPanelThree;
		}
		protected static JPanel jPanelFour()
			{
				JPanel jPanelFour = new JPanel();
				jPanelFour.setBackground(new Color(0xFF00FF));
				jPanelFour.setPreferredSize(new Dimension(100,100));
				return jPanelFour;
			}
		
		protected static JPanel jPanelFive()
			{
				
				JPanel jPanelFive = new JPanel();
				jPanelFive.setBackground(new Color(0x00FFFF));
				jPanelFive.setPreferredSize(new Dimension(100,100));
				return jPanelFive;
			}	
			
		protected static JPanel jPanelMain()
			{
				
				JPanel jPanelMain = new JPanel();
				jPanelMain.setLayout(new BorderLayout(10,10));
				jPanelMain.setBackground(new Color(0X000000));
				jPanelMain.setPreferredSize(new Dimension(100,100));
				jPanelMain.add(jPanelOne(),BorderLayout.NORTH);
				jPanelMain.add(jPanelTwo(),BorderLayout.WEST);
				jPanelMain.add(jPanelThree(),BorderLayout.EAST);
				jPanelMain.add(jPanelFour(),BorderLayout.SOUTH);
				jPanelMain.add(jPanelFive(),BorderLayout.CENTER);
				return jPanelMain;
			}		
		
		protected static JFrame jFrame()
			{
				JFrame jFrame = new JFrame();
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setSize(500,500);
				jFrame.setLayout(new BorderLayout(10,10));
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.add(jPanelOne(),BorderLayout.NORTH);
				jFrame.add(jPanelTwo(),BorderLayout.WEST);
				jFrame.add(jPanelThree(),BorderLayout.EAST);
				jFrame.add(jPanelFour(),BorderLayout.SOUTH);
				jFrame.add(jPanelMain(),BorderLayout.CENTER);
				jFrame.setVisible(true);
				return jFrame;
			}
	
		public static void main(String[] args)
			{
				jFrame();
			}
	}