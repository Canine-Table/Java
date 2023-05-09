package dragAndDrop;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/** @author Table */
@SuppressWarnings("all")

public class DragAndDropPanel extends JPanel
	{
		ImageIcon jIcon = new ImageIcon("Images/PNG/68_y.png");
		final int WIDTH = jIcon.getIconWidth();
		final int HEIGHT = jIcon.getIconHeight();
		Point imageCorner;
		Point prevPoint;
		
		DragAndDropPanel()
			{
				imageCorner = new Point(0,0);
				ClickListener clickListener = new ClickListener();
				DragListener dragListener = new DragListener();
				this.addMouseListener(clickListener);
				this.addMouseMotionListener(dragListener);
			}
		
		public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				jIcon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
			}
		private class ClickListener extends MouseAdapter
			{
				public void mousePressed(MouseEvent e)
					{
						prevPoint = e.getPoint();
					}
			}
		
		private class DragListener extends MouseMotionAdapter
			{
				public void mouseDragged(MouseEvent e)
					{
						Point currentPoint = e.getPoint();
						imageCorner.translate(
								(int)currentPoint.getX() - (int)prevPoint.getX(),
								(int)currentPoint.getY() - (int)prevPoint.getY()
								);
						prevPoint = currentPoint;
						repaint();
					}
			}
	}