package javaSandboxOneLevelOne;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** @author Table **/
public class JFrameClassTwo 
	{
	
		protected static ImageIcon jLabelIcon()
			{
				ImageIcon jLabelIcon = new ImageIcon("src\\javaSandboxOneLevelOne\\IMG_0879.gif");
				return jLabelIcon;
			}
		protected static JPanel jPanelOne()
			{	
				JPanel jPanelOne = new JPanel();
				jPanelOne.setBackground(new Color(0x893443));
				jPanelOne.setBounds(0,512,512,512);
				jPanelOne.setLayout(new BorderLayout());
				
				JLabel jLabelOne = new JLabel();
				jLabelOne.setText("JPanel One");
				jLabelOne.setForeground(new Color(0x349834));
				jLabelOne.setIcon(jLabelIcon());
				jLabelOne.setVerticalAlignment(JLabel.TOP);
				jLabelOne.setHorizontalAlignment(JLabel.RIGHT);
				jPanelOne.add(jLabelOne);
				return jPanelOne;
			}
		
		protected static JPanel jPanelTwo()
			{	
				JPanel jPanelTwo = new JPanel();
				jPanelTwo.setBackground(new Color(0x934198));
				jPanelTwo.setBounds(512,0,512,512);
				jPanelTwo.setLayout(new BorderLayout());

				
				JLabel jLabelTwo = new JLabel();
				jLabelTwo.setText("JPanel Two");
				jLabelTwo.setForeground(new Color(0x012347));
				jLabelTwo.setIcon(jLabelIcon());
				jLabelTwo.setVerticalAlignment(JLabel.BOTTOM);
				jLabelTwo.setHorizontalAlignment(JLabel.LEFT);

				jPanelTwo.add(jLabelTwo);
				
				return jPanelTwo;
			}
		
		protected static JPanel jPanelThree()
			{	
				JPanel jPanelThree = new JPanel();
				jPanelThree.setBackground(new Color(0x0432783));
				jPanelThree.setBounds(0,0,512,512);
				jPanelThree.setLayout(new BorderLayout());
				
				JLabel jLabelThree = new JLabel();
				jLabelThree.setText("JPanel Three");
				jLabelThree.setForeground(new Color(0xFFFFFF));
				jLabelThree.setIcon(jLabelIcon());
				jLabelThree.setVerticalAlignment(JLabel.BOTTOM);
				jLabelThree.setHorizontalAlignment(JLabel.RIGHT);
				jPanelThree.add(jLabelThree);
				return jPanelThree;
			}

		protected static JPanel jPanelFour()
			{	
				JPanel jPanelFour = new JPanel();
				jPanelFour.setBackground(new Color(0x038334));
				jPanelFour.setBounds(512,512,512,512);
				jPanelFour.setLayout(new BorderLayout());
				
				JLabel jLabelFour = new JLabel();
				jLabelFour.setText("JPanel Four");
				jLabelFour.setForeground(new Color(0xFFF3E9));
				jLabelFour.setIcon(jLabelIcon());
				jLabelFour.setVerticalAlignment(JLabel.TOP);
				jLabelFour.setHorizontalAlignment(JLabel.LEFT);
				jPanelFour.add(jLabelFour);
				
				return jPanelFour;
			}

		public static void main(String[] args)
			{
				JFrame jFrame = new JFrame();
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(null);
				jFrame.setSize(512,512);
				jFrame.setBackground(new Color(0x000000));
				jFrame.setVisible(true);
				jFrame.add(jPanelOne());
				jFrame.add(jPanelTwo());
				jFrame.add(jPanelThree());
				jFrame.add(jPanelFour());
				
			}
	
	}