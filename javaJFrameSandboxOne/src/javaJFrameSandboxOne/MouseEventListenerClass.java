package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/** @author Table */
@SuppressWarnings("all")
public class MouseEventListenerClass extends JFrame implements MouseListener, KeyListener
	{
		ImageIcon jIconOne;
		ImageIcon jIconTwo;
		ImageIcon jIconThree;
		ImageIcon jIconFour;
		ImageIcon jIconFive;
		JLabel jLabel;
		MouseEventListenerClass()
			{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(1024,760);
			this.getContentPane().setBackground(new Color(0x000000));
			this.setLayout(null);
			jIconOne = new ImageIcon("Images/PNG/04_y.png");
			jIconTwo = new ImageIcon("Images/PNG/24_y.png");
			jIconThree = new ImageIcon("Images/PNG/14_y.png");
			jIconFour = new ImageIcon("Images/PNG/08_y.png");
			jIconFive = new ImageIcon("Images/PNG/18_y.png");
			jLabel = new JLabel(jIconOne);
			jLabel.setBackground(new Color(0x00FF00));
			jLabel.setBounds(0,0,225,225);
			this.jLabel.addMouseListener(this);
			this.setLayout(null);
			this.addKeyListener(this);
			this.addKeyListener(this);
			this.setLocationRelativeTo(null);
			this.add(jLabel);
			this.setVisible(true);
			}

		public static void main(String[] args) 
			{
				new MouseEventListenerClass();
			}
		
		@Override
		public void mouseClicked(MouseEvent e) 
			{
				//System.out.println("You clicked the component.");
				jLabel.setIcon(jIconTwo);
			}

		@Override
		public void mousePressed(MouseEvent e) 
			{
			//System.out.println("You pressed the component.");				
			jLabel.setIcon(jIconThree);
			}

		@Override
		public void mouseReleased(MouseEvent e) 
			{
				//System.out.println("You released your component click.");	
				jLabel.setIcon(jIconFour);
			}

		@Override
		public void mouseEntered(MouseEvent e) 
			{
				//System.out.println("You entered the component.");
				jLabel.setIcon(jIconFive);
			}

		@Override
		public void mouseExited(MouseEvent e) 
			{
				//System.out.println("You exited the component.");
				jLabel.setIcon(jIconOne);
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