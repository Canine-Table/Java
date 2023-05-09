package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxes 
	{
		public static String item;
		protected static JComboBox<String> jComboBox()
			{
				String[] $Fish = {"Starfish","Oyster Toadfish","Black Drum","Lizardfish","Jumping Mullet","Silver Perch","Haddock","Knobbed Porgy","Sea Mullet","Blacktip Shark"};
				JComboBox<String> jComboBox = new JComboBox<String>($Fish);
				jComboBox.isEditable();
				jComboBox.insertItemAt("None", 0);
				jComboBox.setSelectedIndex(0);
				jComboBox.addActionListener(e ->
					{
						item = (String) jComboBox.getSelectedItem();	
					});
				return jComboBox;
			}
				
		protected static JButton jButton()
			{
				JButton jButton = new JButton();
				jButton.addActionListener(e ->
					{	
						switch(item)
							{
									case ("Starfish"): System.out.println("This fish is a Starfish."); break;
									case ("Oyster Toadfish"): System.out.println("This fish is a Oyster Toadfish."); break;
									case ("Black Drum"): System.out.println("This fish is a Black Drum."); break;
									case ("Lizardfish"): System.out.println("This fish is a Lizardfish."); break;
									case ("Jumping Mullet"): System.out.println("This fish is a Jumping Mullet."); break;
									case ("Silver Perch"): System.out.println("This fish is a Silver Perch."); break;
									case ("Haddock"): System.out.println("This fish is a Haddock."); break;
									case ("Knobbed Porgy"): System.out.println("This fish is a Knobbed Porgy."); break;
									case ("Sea Mullet"): System.out.println("This fish is a Sea Mullet."); break;
									case ("Blacktip Shark"): System.out.println("This fish is a Blacktip Shark."); break;					
							}
					});
				return jButton;
			}
		protected static JFrame jFrame()
			{
			
				JFrame jFrame = new JFrame();
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(new FlowLayout());
				jFrame.setSize(500,500);
				jFrame.add(jComboBox());
				jFrame.add(jButton());
				jFrame.setVisible(true);
				jFrame.pack();
				return jFrame;
			}

		public static void main(String[] args)
			{
				jFrame();
			}
	}