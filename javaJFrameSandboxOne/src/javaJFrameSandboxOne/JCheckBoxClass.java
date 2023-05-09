
package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxClass 
	{
		static boolean Checked;
		final static ImageIcon x = new ImageIcon("Images\\PNG\\Market_Cascade_128x.png");
		final static ImageIcon y = new ImageIcon("Images\\PNG\\Market_BrandIntelliCode_128x.png");
		protected static JCheckBox jCheckBox()
			{
				JCheckBox jCheckBox = new JCheckBox("CheckBox");
				jCheckBox.setFocusable(false);
				jCheckBox.setIcon(x);
				jCheckBox.setSelectedIcon(y);
				jCheckBox.addActionListener(e ->
					{
						Checked = jCheckBox.isSelected();
					});
				return jCheckBox;
			}
		
		protected static JButton jButton()
			{
				JButton jButton = new JButton("Get Status");
				jButton.setFocusable(false);
				jButton.setPreferredSize(new Dimension(100,24));
				jButton.addActionListener(e ->
					{
						if (Checked)
							{
								System.out.println("true");
							}
						else
							{
								System.out.println("false");
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
				jFrame.add(jCheckBox());
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