package javaJFrameSandboxOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class SliderClass 
	{
		public static JLabel jLabel;
		protected static JSlider jSlider()
			{
				JSlider jSlider = new JSlider(0,100);
				jSlider.setPreferredSize(new Dimension(100,700));
				jSlider.setPaintTicks(true);
				jSlider.setPaintTrack(true);
				jSlider.setMajorTickSpacing(5);
				jSlider.setPaintLabels(true);
				jSlider.setFont(new Font("Arial, Helvetica, sans-serif",Font.PLAIN,15));
				jSlider.setOrientation(SwingConstants.VERTICAL);
				jSlider.addChangeListener(e ->
					{
						jLabel.setText(""+jSlider.getValue());
					});
				return jSlider;
			}
			
		protected static JPanel jPanel()
			{
				JPanel jPanel = new JPanel();
				jPanel.setLayout(new BorderLayout());
				jPanel.setBackground(new Color(0xEEEEEE));
				jPanel.setPreferredSize(new Dimension(128,0));
				jPanel.add(jSlider());
				return jPanel;
			}
		
		protected static JLabel jLabel()
			{
				jLabel = new JLabel("50");
				jLabel.setFont(new Font("Arial, Helvetica, sans-serif",Font.PLAIN,256));
				jLabel.setForeground(new Color(0xFFFFFF));
				return jLabel;
			}
		
		protected static JFrame jFrame()
			{
				JFrame jFrame = new JFrame();
				jFrame.getContentPane().setBackground(new Color(0x00000F));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(new BorderLayout(10,10));
				jFrame.setSize(768,768);
				jFrame.add(jPanel(),BorderLayout.WEST);
				jFrame.add(jLabel());
				jFrame.setVisible(true);
				return jFrame;
			}
			
		public static void main(String[] args)
			{
				jFrame();
			}
	}
