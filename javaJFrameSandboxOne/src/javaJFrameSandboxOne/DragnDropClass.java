package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** @author Table */
@SuppressWarnings("all")

public class DragnDropClass extends JPanel
	{
		ImageIcon jIconOne;
		JLabel jLabel;
		final int WIDTH = jIconOne.getIconWidth();
		final int HEIGHT = jIconOne.getIconHeight();
		Point ImageCorners;
		Point PrevPoints;
		DragnDropClass()
			{
				ImageCorners = new Point(0,0);
				ClickListener clickListener = new ClickListener();
				DragListener dragListener = new DragListener();
				this.addMouseListener(clickListener);
				this.addMouseMotionListener(dragListener);
				 
				//jLabel.setOpaque(true);

			}
		
		public void paintComponent(Graphics g)
			{
				super.paintComponents(g);
				jIconOne.paintIcon(this, g, (int)ImageCorners.getX(), (int)ImageCorners.getY());
			}
		
		private class ClickListener extends MouseAdapter
			{
				public void mousePressed(MouseEvent e)
					{
						PrevPoints = e.getPoint();
					}
			}
		
		
		private class DragListener extends MouseMotionAdapter
			{
				
			}
		
		public static void main(String[] args)
			{
				new DragnDropFrameClass();
			}
	}