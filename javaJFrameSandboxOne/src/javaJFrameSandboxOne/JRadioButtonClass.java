package javaJFrameSandboxOne;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonClass implements ActionListener
	{
		public static ButtonGroup jButtonGroup;
		public static JRadioButton jRadioButtonHotDog;
		public static ImageIcon HotDog = new  ImageIcon("Images/PNG/68_y.png");
		public static JRadioButton jRadioButtonHamburger;
		public static ImageIcon HamBurger = new  ImageIcon("Images/PNG/38_y.png");
		public static JRadioButton jRadioButtonPizza;
		public static ImageIcon Pizza = new ImageIcon("Images/PNG/19_y.png");
		protected static JRadioButton jRadioButtonPizza()
			{
				jRadioButtonPizza = new JRadioButton("Pizza");
				jRadioButtonPizza.setIcon(Pizza);
				jRadioButtonPizza.addActionListener(e -> {
				System.out.println("actionPizza");	
				});
				return jRadioButtonPizza;
			}
		
		protected static JRadioButton jRadioButtonHamburger()
			{
				jRadioButtonHamburger = new JRadioButton("Hamburger");
				jRadioButtonHamburger.setIcon(HamBurger);
				jRadioButtonHamburger.addActionListener(e -> {
					System.out.println("actionHamburger");
				});
				return jRadioButtonHamburger;
			}
		
		protected static JRadioButton jRadioButtonHotDog()
			{
				jRadioButtonHotDog = new JRadioButton("HotDog");
				jRadioButtonHotDog.setIcon(HotDog);
				jRadioButtonHotDog.addActionListener(e -> {
					System.out.println("ActionPizza");
				});
				return jRadioButtonHotDog;
			}
		
		protected static ButtonGroup jButtonGroup()
			{
				jButtonGroup = new ButtonGroup();
				jButtonGroup.add(jRadioButtonHotDog());
				jButtonGroup.add(jRadioButtonHamburger());
				jButtonGroup.add(jRadioButtonPizza());
				return jButtonGroup;
			}

		protected static JFrame jFrame()
			{
				JFrame jFrame = new JFrame();
				jFrame.getContentPane().setBackground(new Color(0x000000));
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setLayout(new FlowLayout());
				jFrame.setSize(500,500);
				jFrame.setVisible(true);
				jButtonGroup();
				jFrame.add(jRadioButtonHotDog);
				jFrame.add(jRadioButtonHamburger);
				jFrame.add(jRadioButtonPizza);
				jFrame.pack();
				return jFrame;
			}
		
		public static void main(String[] args)
			{
				jFrame();
			}

		@Override
		public void actionPerformed(ActionEvent e) 
			{
/*				if(e.getSource()==jRadioButtonHotDog)
					{
						System.out.println("You Get a Hotdog");
					}
				else if (e.getSource()==jRadioButtonHamburger)
					{
						System.out.println("You Get a Hamburger");
					}
				else if (e.getSource()==jRadioButtonPizza)
					{
						System.out.println("You Get a Pizza");
					}
*/			}
	}