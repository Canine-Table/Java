package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/** @author Table **/
@SuppressWarnings("all")
public class KeyListenerInterfaceClass extends JFrame implements KeyListener
	{
		ImageIcon jIcon;
		JLabel jLabel;
		KeyListenerInterfaceClass()
			{
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setSize(1024,760);
				this.getContentPane().setBackground(new Color(0x000000));

				this.setLayout(null);
				this.addKeyListener(this);
				
				
				jIcon = new ImageIcon("Images/PNG/04_y.png");
				jLabel = new JLabel(jIcon);
				jLabel.setBackground(new Color(0x00FF00));
				jLabel.setBounds(0,0,225,225);
				//jLabel.setOpaque(true);
				this.add(jLabel);
				this.setVisible(true);
			}
		
		public static void main(String[] args)
			{
			 	new KeyListenerInterfaceClass();
			}

		@Override
		public void keyTyped(KeyEvent e) 
			{
				//System.out.println("Key Character Typed: "+e.getKeyChar());				
				//System.out.println("The key code for the typed character "+e.getKeyChar()+" is: "+e.getKeyCode());
				switch(e.getKeyChar())
					{
						case ('w'): jLabel.setLocation(jLabel.getX(),jLabel.getY()-15);
							break;
						case ('a'): jLabel.setLocation(jLabel.getX()-15,jLabel.getY());
							break;
						case ('s'): jLabel.setLocation(jLabel.getX(),jLabel.getY()+15);
							break;
						case ('d'): jLabel.setLocation(jLabel.getX()+15,jLabel.getY());
							break;
					}
			}
	
		@Override
		public void keyPressed(KeyEvent e) 
			{
				//System.out.println("Key Character Event: "+e.getKeyChar());
				//System.out.println("The key code for the character Event "+e.getKeyChar()+" is: "+e.getKeyCode());
				switch(e.getKeyCode())
					{
						case (38): jLabel.setLocation(jLabel.getX(),jLabel.getY()-15);
							break;
						case (37): jLabel.setLocation(jLabel.getX()-15,jLabel.getY());
							break;
						case (40): jLabel.setLocation(jLabel.getX(),jLabel.getY()+15);
							break;
						case (39): jLabel.setLocation(jLabel.getX()+15,jLabel.getY());
							break;
					}
			}	
		@Override
		public void keyReleased(KeyEvent e) 
			{
				//System.out.println("Key Character Released: "+e.getKeyChar());				
				//System.out.println("The key code for the released character "+e.getKeyChar()+" is: "+e.getKeyCode());				

			}
	}