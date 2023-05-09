package javaJFrameSandboxOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/** @author Table **/
@SuppressWarnings("unused")
public class MenuBarsClass implements ActionListener
	{
		JMenuItem open = new JMenu("Open");
		JMenuItem load = new JMenu("Load");
		JMenuItem save = new JMenu("Save");
		JMenuItem exit = new JMenu("Exit");
		public static JFrame jFrame = new JFrame();
		MenuBarsClass()
			{
			
			jFrame.getContentPane().setBackground(new Color(0x000000));
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setLayout(new FlowLayout());
			jFrame.setSize(500,500);
			JMenuBar jMenuBar = new JMenuBar();
			JMenu file = new JMenu("File");
			JMenuItem open = new JMenu("Open");
			open.addActionListener(e -> 
			{
System.out.println("fdjsm");			});
			JMenuItem load = new JMenu("Load");
			load.addActionListener(this);
			JMenuItem save = new JMenu("Save");
			save.addActionListener(this);
			JMenuItem exit = new JMenu("Exit");
			file.add(exit);
			file.add(save);
			file.add(load);
			file.add(open);
			file.add(exit);
			jMenuBar.add(file);
			
			jFrame.setJMenuBar(jMenuBar);
			jFrame.setVisible(true);
			}


	
		public static void main(String[] args)
			{
				new MenuBarsClass();
			}
		
		@Override
		public void actionPerformed(ActionEvent e) 
			{
				if (e.getSource()==load)
					{
						System.out.println("loading file");
					}
				if (e.getSource()==save)
					{
						System.out.println("loading file");
					}
				if (e.getSource()==exit)
					{
						System.out.println("loading file");
						System.exit(0);
					}
				}
	}