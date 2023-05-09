package javaJFrameSandboxOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** @author Table **/

public class GridLayoutManager 
	{

	
		protected static JPanel jPanel()
			{
				JPanel jPanel = new JPanel();
				jPanel.setBackground(new Color(0x000000));
				jPanel.setLayout(new GridLayout(8,8,8,8));
				jPanel.add(new JButton("01"));
				jPanel.add(new JButton("02"));
				jPanel.add(new JButton("03"));
				jPanel.add(new JButton("04"));
				jPanel.add(new JButton("05"));
				jPanel.add(new JButton("06"));
				jPanel.add(new JButton("07"));
				jPanel.add(new JButton("08"));
				jPanel.add(new JButton("09"));				
				jPanel.add(new JButton("10"));
				jPanel.add(new JButton("11"));
				jPanel.add(new JButton("12"));
				jPanel.add(new JButton("13"));
				jPanel.add(new JButton("14"));
				jPanel.add(new JButton("15"));
				jPanel.add(new JButton("16"));
				jPanel.add(new JButton("17"));
				jPanel.add(new JButton("18"));
				jPanel.add(new JButton("19"));			
				jPanel.add(new JButton("20"));
				jPanel.add(new JButton("21"));
				jPanel.add(new JButton("22"));
				jPanel.add(new JButton("23"));
				jPanel.add(new JButton("24"));
				jPanel.add(new JButton("25"));
				jPanel.add(new JButton("26"));
				jPanel.add(new JButton("27"));
				jPanel.add(new JButton("28"));
				jPanel.add(new JButton("29"));
				jPanel.add(new JButton("30"));
				jPanel.add(new JButton("31"));
				jPanel.add(new JButton("32"));
				jPanel.add(new JButton("33"));
				jPanel.add(new JButton("34"));
				jPanel.add(new JButton("35"));
				jPanel.add(new JButton("36"));
				jPanel.add(new JButton("37"));
				jPanel.add(new JButton("38"));
				jPanel.add(new JButton("39"));
				jPanel.add(new JButton("40"));
				jPanel.add(new JButton("41"));
				jPanel.add(new JButton("42"));
				jPanel.add(new JButton("43"));
				jPanel.add(new JButton("44"));
				jPanel.add(new JButton("45"));
				jPanel.add(new JButton("46"));
				jPanel.add(new JButton("47"));
				jPanel.add(new JButton("48"));
				jPanel.add(new JButton("49"));				
				jPanel.add(new JButton("50"));
				jPanel.add(new JButton("51"));
				jPanel.add(new JButton("52"));
				jPanel.add(new JButton("53"));
				jPanel.add(new JButton("54"));
				jPanel.add(new JButton("55"));
				jPanel.add(new JButton("56"));
				jPanel.add(new JButton("57"));
				jPanel.add(new JButton("58"));
				jPanel.add(new JButton("59"));				
				jPanel.add(new JButton("60"));
				jPanel.add(new JButton("61"));
				jPanel.add(new JButton("62"));
				jPanel.add(new JButton("63"));
				jPanel.add(new JButton("64"));
				return jPanel;
			}
		
		protected static JFrame jFrame()
			{
				JFrame jFrame = new JFrame();
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setSize(500,500);
				jFrame.add(jPanel(),BorderLayout.CENTER);
				jFrame.setVisible(true);
				return jFrame;
			}
				
		public static void main(String[] args)
			{
				jFrame();
			}
	}