package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
/** @author Table **/
@SuppressWarnings("all")

public class MainTestingClass extends JFrame implements KeyListener
	{
		MainTestingClass()
			{
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setSize(512,512);
				this.setLayout(null);
				this.addKeyListener(this);
				this.setVisible(true);
			}
		
		public static void main(String[] args)
			{
			 	new MainTestingClass();
			}

		@Override
		public void keyTyped(KeyEvent e) 
			{
				System.out.println("Key Typed: "+e.getKeyChar());				
			}
	
		@Override
		public void keyPressed(KeyEvent e) 
			{
				System.out.println("");				
			}
	
		@Override
		public void keyReleased(KeyEvent e) 
			{
				System.out.println("");				
			}
	}