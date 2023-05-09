package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
@SuppressWarnings("unused")
/** @author Table */
public class TwoDAnimationsClass 
	{
		final int PANEL_WIDTH = 480;
		final int PANEL_HEIGHT = 480;
		
		TwoDAnimationsClass()
			{
				new Frame();
			}
	
		@SuppressWarnings({"serial"})
		private class Frame extends JFrame
			{
			
				Frame()
					{
						this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						this.setSize(PANEL_HEIGHT,PANEL_WIDTH);
						this.setLocationRelativeTo(null);
						this.setResizable(false);
						this.add(new Panel());
						this.setVisible(true);
					}
			}

		@SuppressWarnings({"serial"})
		private class Panel extends JPanel implements ActionListener
			{
				Timer timer;
				Image character;
				Image background;
				int xVelocity = 1;
				int yVelocity = 3;
				int x = 0;
				int y = 0;
						
				Panel()
				{
					this.setPreferredSize(new Dimension(PANEL_HEIGHT,PANEL_WIDTH));
					this.setBackground(new Color(0x000000));
					character = new ImageIcon("Images\\PNG\\01_y.png").getImage();
					background = new ImageIcon("Images\\PNG\\Music-music-32070905-1440-900-2982823025.png").getImage();				
					timer = new Timer(0,this);
					timer.start();
				}

				
				public void paint(Graphics g)
					{
						Graphics2D graphics = (Graphics2D) g;
						graphics.drawImage(background, 0, 0, null);
						graphics.drawImage(character, x, y, null);
					}
				
				@Override
				public void actionPerformed(ActionEvent e) 
					{
						if(x>=PANEL_WIDTH-character.getWidth(null) || x<-15)
							{
								xVelocity = xVelocity *-1;
							}

						if(y>=PANEL_HEIGHT-15-character.getHeight(null) || y<-15)
							{
								yVelocity = yVelocity *-1;
							}

						x=x+xVelocity;
						y=y+yVelocity;
						repaint();
						
					}
			}
		
		public static void main(String[] args)
			{
				new TwoDAnimationsClass();
			}
	}
