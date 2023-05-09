package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/** @author Table **/
@SuppressWarnings("unused")
public class ColorPickerClass implements ActionListener
	{
		JButton jButton;
		JFrame jFrame;
		JLabel jLabel;
		ColorPickerClass()
			{

				jLabel = new JLabel(" This is some text. ");
				jLabel.setForeground(new Color(0x000000));
				jLabel.setOpaque(true);
				jLabel.setFont(new Font("Arial, Helvetica, sans-serif",Font.BOLD,48));

				jButton = new JButton("I AM A BUTTON CLICK ME NOW!!!");
				jButton.addActionListener(this);

				jFrame = new JFrame();
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(new FlowLayout());
				jFrame.setSize(500,500);
				jFrame.add(jLabel);
				jFrame.add(jButton);
				jFrame.setVisible(true);
			}
		public static void main(String[] args)
			{
				jFrame();
			}
		public static void jFrame()
			{	
				new ColorPickerClass();
			}
		
		@Override
		public void actionPerformed(ActionEvent e) 
			{
				if(e.getSource()==jButton)
					{
						JColorChooser colorChoice = new JColorChooser();
						Color color = JColorChooser.showDialog(null, "CHOOSE YOUR COLOR!!!",new Color(0x032443));
						jLabel.setBackground(color);
						jFrame.getContentPane().setBackground(color);
					}
			}	
	}