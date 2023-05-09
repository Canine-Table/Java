package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/** @author Table **/
	
public class JFrameClass
	{		
		protected static ImageIcon jIcon()
			{
				ImageIcon jIcon = new ImageIcon("src\\javaSandboxOneLevelOne\\Video_Player_download.png");
				return jIcon;
			}

		protected static JLabel jLabel()
			{
				ImageIcon labelIcon = new ImageIcon("src\\javaSandboxOneLevelOne\\IMG_0879.gif");
				JLabel jLabel = new JLabel();
				jLabel.setText("Waveform Audio File Format Player");
				jLabel.setFont(new Font("Arial, Helvetica, sans-serif;",Font.BOLD,16));
				jLabel.setIcon(labelIcon);
				jLabel.setBackground(new Color(0x000000));
				jLabel.setForeground(new Color(0xFFFFFFF));
				jLabel.setHorizontalTextPosition(JLabel.CENTER);
				jLabel.setVerticalTextPosition(JLabel.TOP);
				jLabel.setInheritsPopupMenu(false);
				jLabel.setOpaque(true);
				jLabel.setBorder(jBorder());
				jLabel.setVerticalAlignment(JLabel.CENTER);
				jLabel.setHorizontalAlignment(JLabel.CENTER);
				jLabel.setBounds(0,0,486,464);
				return jLabel;
			}
		
		protected static Border jBorder()
			{
				Border jBorder = BorderFactory.createLineBorder(new Color(0xFFFFFF),3);
				return jBorder;
			}
		protected static JPanel jPanelOne()
			{
				JPanel jPanel = new JPanel();
				jPanel.setBackground(new Color(0xFFFFFF));
				jPanel.add(jLabel());
				return jPanel;
			}	
		
		public static void main(String[] args)
			{
				JFrame frame = new JFrame();
				frame.setSize(500,500);
				frame.isAlwaysOnTop();
				//frame.setLayout(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Java Audio Player");
				frame.setVisible(true);				
				frame.getContentPane().setBackground(new Color(0x000000));
				frame.add(jPanelOne());
				frame.setIconImage(jIcon().getImage());
				frame.setResizable(false);
				frame.pack();
			}
	}