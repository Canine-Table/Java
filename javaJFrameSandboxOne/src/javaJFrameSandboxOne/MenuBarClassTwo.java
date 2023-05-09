package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarClassTwo implements ActionListener 
	{				
	    public static JMenuBar jMenuBar = new JMenuBar();
		public static JFrame jFrame = new JFrame();
		public JMenuItem saveas;
		public  JMenuItem open = new JMenu("Open");
		public  JMenuItem load = new JMenu("Load");
		public  JMenuItem save = new JMenu("Save");
		public  JMenuItem exit = new JMenu("Exit");	
		MenuBarClassTwo()
			{
				JMenu file = new JMenu("File");
				JMenu edit = new JMenu("Edit");

				  	edit.add(open);
				  	edit.add(load);
				  	edit.add(save);
				  	edit.add(saveas);
				  	edit.add(exit);
				JMenu search = new JMenu("Search");
				JMenu navigate = new JMenu("Navigate");
				JMenu help = new JMenu("Help");
				jMenuBar.add(file);
				jMenuBar.add(exit);
				jMenuBar.add(navigate);
				jMenuBar.add(search);
				jMenuBar.add(help);
				jFrame.setJMenuBar(jMenuBar);
				jFrame();
			}
		
		public static JFrame jFrame()
			{
			
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(new FlowLayout());
				jFrame.setSize(500,500);
				jFrame.setVisible(true);
				return jFrame;
			}
		
		public static void main(String []Args)
			{
			new MenuBarClassTwo();
			}
		
		@Override
		public void actionPerformed(ActionEvent e) 
			{
				
			}
	}