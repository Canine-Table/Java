package javaJFrameSandboxOne;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** @author Table */
public class TwoDGraphicsClass
	{
		TwoDGraphicsClass()
			{
				new Frame();
			}
		@SuppressWarnings("serial")
		private class Frame extends JFrame
			{
				Image myImage;
				Frame()
					{
						this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						this.setSize(1080,512);
						this.setLocationRelativeTo(null);
						this.setBackground(new Color(0x000000));

						this.add(new Panel());
						this.setVisible(true);
					}
				
				private class Panel extends JPanel
				{
					Panel()
						{
							myImage = new ImageIcon("C:\\Users\\Table\\Downloads\\Microsoft_Office_logo_(2019–present).svg.png").getImage();
 						}
					
					public void paint(Graphics g)
						{
							Graphics2D graphics = (Graphics2D) g;
							graphics.setStroke(new BasicStroke(30));
							graphics.setPaint(new Color(0x00FF00));
							graphics.drawLine(0,0,1150,512);
							graphics.setPaint(new Color(0xFF0000));
							graphics.drawRect(0,0,1065,477);
							graphics.setPaint(new Color(0xFF00FF));							
							graphics.fillRect(50,150,150,150);
							graphics.setPaint(new Color(0x0000FF));
							graphics.fillOval(600,50,200,200);
							graphics.setPaint(new Color(0x002392));	
							graphics.drawOval(600,50,200,200);
							graphics.setPaint(new Color(0x340932));	
							graphics.fillRoundRect(20, 320, 650, 140, 50, 140);
							graphics.setPaint(new Color(0xFF0000));
							graphics.fillArc(50, 50, 100, 100, 0, 180);
							graphics.setPaint(new Color(0xEEEEEE));
							graphics.fillArc(50, 50, 100, 100, 180, 180);
							graphics.setPaint(new Color(0x202020));
							graphics.fillRoundRect(50, 95, 100, 10, 0, 100);
							graphics.setPaint(new Color(0xFFFFFF));
							graphics.drawOval(90,90,20,20);
							graphics.setPaint(new Color(0x202020));
							graphics.setStroke(new BasicStroke(6));
							graphics.drawOval(90,90,20,20);
							graphics.setStroke(new BasicStroke(16));
							graphics.drawOval(90,90,20,20);
							graphics.setStroke(new BasicStroke(3));
							graphics.setPaint(new Color(0xFFFFFF));
							graphics.fillOval(95, 95, 10, 10);
							graphics.setPaint(new Color(0x202020));
							graphics.setStroke(new BasicStroke(5));
							graphics.drawOval(75,75,50,50);
							int[] xPoints = {150,250,350};
							int[] yPoints = {350,50,350};

							graphics.setPaint(new Color(0xFFFFFF));
							graphics.drawPolygon(xPoints, yPoints, 3);
							
							int[] y2Points = {350,150,350};							
							graphics.fillPolygon(xPoints, y2Points, 3);
							graphics.setFont(new Font("Ink Free",Font.BOLD,40));
							graphics.drawString("JUST A STRING BRO", 140, 410);
							graphics.drawImage(myImage, 50, 500, null);
						}
					
				}
			}
		public static void main(String[] args)
			{
				new TwoDGraphicsClass();
			}
	}