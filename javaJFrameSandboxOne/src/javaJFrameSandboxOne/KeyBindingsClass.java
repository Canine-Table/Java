package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/** @author Table */
public class KeyBindingsClass
	{	
	
		KeyBindingsClass()
			{
				new Game();
			}
		
		@SuppressWarnings("serial")
		private class Game extends JFrame
			{
				UpAction upAction;
				DownAction downAction;
				RightAction rightAction;
				LeftAction leftAction;
				JLabel jLabel;
				
				Game()
					{						
						jLabel = new JLabel();
						jLabel.setBackground(new Color(0x00FF00));
						jLabel.setBounds(150,150,150,150);
						jLabel.setOpaque(true);
						
						upAction = new UpAction();
						downAction = new DownAction();
						leftAction = new LeftAction();
						rightAction = new RightAction();
						
						jLabel.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
						jLabel.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
						jLabel.getActionMap().put("upAction", upAction);
						
						jLabel.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
						jLabel.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");

						jLabel.getActionMap().put("downAction", downAction);
						
						jLabel.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
						jLabel.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");

						jLabel.getActionMap().put("rightAction", rightAction);
						
						jLabel.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
						jLabel.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");

						jLabel.getActionMap().put("leftAction", leftAction);
						
						this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						this.setSize(512,512);
						this.setLayout(null);
						this.add(jLabel);
						this.setVisible(true);
						
					}
				
				private class UpAction extends AbstractAction
					{
		
						@Override
						public void actionPerformed(ActionEvent e) 
							{						
								jLabel.setLocation(jLabel.getX(),jLabel.getY()-10);
							}
								
					}
				
				private class DownAction extends AbstractAction
					{
		
						@Override
						public void actionPerformed(ActionEvent e) 
							{						
								jLabel.setLocation(jLabel.getX(),jLabel.getY()+10);
							}
								
					}
					
				private class RightAction extends AbstractAction
					{
		
						@Override
						public void actionPerformed(ActionEvent e) 
							{						
								jLabel.setLocation(jLabel.getX()+10,jLabel.getY());
							}
								
					}
				
				private class LeftAction extends AbstractAction
					{
		
						@Override
						public void actionPerformed(ActionEvent e) 
							{						
								jLabel.setLocation(jLabel.getX()-10,jLabel.getY());
							}								
					}
			}
		public static void main(String[] args)
			{
				new KeyBindingsClass();
			}
	}