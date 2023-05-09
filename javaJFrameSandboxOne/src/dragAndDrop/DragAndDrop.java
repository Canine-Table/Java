package dragAndDrop;

import javax.swing.JFrame;
import javax.swing.JPanel;

/** @author Table */
@SuppressWarnings("all")
public class DragAndDrop extends JFrame
	{
		DragAndDropPanel dragAndDropPanel = new DragAndDropPanel();
		DragAndDrop()
			{
				
				this.setTitle("Drag & Drop");
				this.setSize(512,512);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.add(dragAndDropPanel);
				this.setVisible(true);
			}
		public static void main(String[] args)
			{
				new DragAndDrop();
			}
	}