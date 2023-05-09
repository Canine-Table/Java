package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class DropDownMenuThree implements ActionListener
	{
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");
		JMenuItem closeItem = new JMenuItem("Close");
		JMenu fileOption = new JMenu("File");
		JMenu editOption = new JMenu("Edit");
		JMenu helpOption = new JMenu("Help");
		ImageIcon fileIcon = new ImageIcon("Images/PNG/12_y.png");
		ImageIcon editIcon = new ImageIcon("Images/PNG/14_y.png");
		ImageIcon helpIcon = new ImageIcon("Images/PNG/16_y.png");
		ImageIcon edit1Icon = new ImageIcon("Images/PNG/20_y.png");
		ImageIcon edit2Icon = new ImageIcon("Images/PNG/22_y.png");
		ImageIcon edit3Icon = new ImageIcon("Images/PNG/24_y.png");
		ImageIcon edit4Icon = new ImageIcon("Images/PNG/26_y.png");
		
		DropDownMenuThree()
			{
			
			JMenuBar jMenuBar = new JMenuBar();
				fileOption.setMnemonic(KeyEvent.VK_F);
				fileOption.setIcon(fileIcon);
				editOption.setMnemonic(KeyEvent.VK_D);
				editOption.setIcon(editIcon);
				helpOption.setMnemonic(KeyEvent.VK_H);
				helpOption.setIcon(helpIcon);
					editOption.add(openItem);
					openItem.setIcon(edit1Icon);
					editOption.add(saveItem);
					saveItem.setIcon(edit2Icon);
					editOption.add(exitItem);
					exitItem.setIcon(edit3Icon);
					editOption.add(closeItem);
					closeItem.setIcon(edit4Icon);
					jMenuBar.add(fileOption);
					jMenuBar.add(editOption);
					jMenuBar.add(helpOption);
				openItem.addActionListener(this);
				openItem.setMnemonic(KeyEvent.VK_O);
				saveItem.addActionListener(this);
				saveItem.setMnemonic(KeyEvent.VK_S);
				exitItem.addActionListener(this);
				exitItem.setMnemonic(KeyEvent.VK_E);
				closeItem.addActionListener(this);
				closeItem.setMnemonic(KeyEvent.VK_C);
				
			JFrame jFrame = new JFrame();
			jFrame.getContentPane().setBackground(new Color(0x000000));
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setLayout(new FlowLayout());
			jFrame.setSize(500,500);
			jFrame.setJMenuBar(jMenuBar);
			jFrame.setVisible(true);
			}
	
		@Override
		public void actionPerformed(ActionEvent e) 
			{
			
				if(e.getSource()==openItem)
					{
						JFileChooser explore = new JFileChooser();
						explore.setCurrentDirectory(new File("."));
						explore.showOpenDialog(null);
						int responce = explore.showOpenDialog(null);
						if (responce == JFileChooser.APPROVE_OPTION)
							{
								File file = new File(explore.getSelectedFile().getAbsoluteFile(),"");
								System.out.println(file);
							}
					}
				if(e.getSource()==saveItem)
					{
					
					JFileChooser explore = new JFileChooser();
					explore.setCurrentDirectory(new File("."));
					explore.showSaveDialog(null);
					int responce = explore.showOpenDialog(null);
					if (responce == JFileChooser.APPROVE_OPTION)
						{
							File file = new File(explore.getSelectedFile().getAbsoluteFile(),"");
							System.out.println(file);
						}
					}
				if(e.getSource()==exitItem)
					{
						System.out.println("\n\tExiting Gui :D");
						System.exit(0);
					}
				if(e.getSource()==closeItem)
					{
						System.out.println("\n\tClosing Gui :D");
						System.exit(0);
					}
			}
	
	}