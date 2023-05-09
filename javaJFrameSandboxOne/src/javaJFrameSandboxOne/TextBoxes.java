package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextBoxes 
	{
		static JTextField jTextField;
		protected static JLabel jLabel()
			{
				JLabel jLabel = new JLabel("Username:");
				jLabel.setFont(new Font("Consolas",Font.BOLD,28));
				jLabel.setForeground(new Color(0xFFFFFF));
				return jLabel;
			}
		
		protected static JButton jButton()
			{
				JButton jButton = new JButton("Ok");
				jButton.setPreferredSize(new Dimension(64,28));
				jButton.addActionListener(e ->
					{
						JOptionPane.showMessageDialog(null, "Hello "+jTextField.getText()+".","Welcome", JOptionPane.INFORMATION_MESSAGE);
					});
				return jButton;
			}
	
		protected static JTextField jTextField()
			{
				jTextField = new JTextField();
				jTextField.setPreferredSize(new Dimension(250,28));
				jTextField.setFont(new Font("Consolas",Font.BOLD,20));
				jTextField.setForeground(new Color(0x00FF00));
				jTextField.setBackground(new Color(0x000000));
				jTextField.setText("Username");
				jTextField.setEditable(true);
				jTextField.setDisabledTextColor(new Color(0x000000));
				return jTextField;
			}
		
	
		protected static JFrame jFrame()
			{
				JFrame jFrame = new JFrame();
				jFrame.getContentPane().setBackground(new Color(0x00000F));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(new FlowLayout());
				jFrame.add(jLabel());
				jFrame.add(jTextField());
				jFrame.add(jButton());
				jFrame.setResizable(false);
				jFrame.setVisible(true);
				jFrame.pack();
				return jFrame;
			}
			
		public static void main(String[] args)
			{
				jFrame();
			}
	}