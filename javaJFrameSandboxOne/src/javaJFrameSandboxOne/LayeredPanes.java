package javaJFrameSandboxOne;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/** @author Table **/

public class LayeredPanes
	{
		LayeredPanes()
			{
				jFrame();
			}
		
	
		protected static JLayeredPane jLayeredPane()
			{
				JLayeredPane jLayeredPane = new JLayeredPane();
				jLayeredPane.setBounds(6,6,500,500);
				jLayeredPane.setBackground(new Color(0xFFFFFF));
				
				JLabel jLabelOne = new JLabel("This is a JLabel One");
				jLabelOne.setOpaque(true);
				jLabelOne.setForeground(new Color(0x394453));
				jLabelOne.setBackground(new Color(0x0900934));
				jLabelOne.setBounds(50,50,200,200);
				jLayeredPane.add(jLabelOne, Integer.valueOf(0));
				
				JLabel jLabelTwo = new JLabel("This is a JLabel Two");
				jLabelTwo.setOpaque(true);
				jLabelTwo.setForeground(new Color(0x928478));
				jLabelTwo.setBackground(new Color(0x789234));
				jLabelTwo.setBounds(100,100,200,200);
				jLayeredPane.add(jLabelTwo,Integer.valueOf(1));

				JLabel jLabelThree = new JLabel("This is a JLabel Three");
				jLabelThree.setOpaque(true);
				jLabelThree.setForeground(new Color(0x348934));
				jLabelThree.setBackground(new Color(0x032493));
				jLabelThree.setBounds(150,150,200,200);
				jLayeredPane.add(jLabelThree, Integer.valueOf(2));
				
				return jLayeredPane;
			}

		protected static JFrame jFrame()
			{
				JFrame jFrame = new JFrame();
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setSize(512,512);
				jFrame.setVisible(true);
				jFrame.add(jLayeredPane());
				return jFrame;
			}
				
		public static void main(String[] args)
			{
				jFrame();
			}
	}
