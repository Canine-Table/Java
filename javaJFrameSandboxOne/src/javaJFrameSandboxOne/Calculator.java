package javaJFrameSandboxOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** @author Table **/
@SuppressWarnings("unused")
public class Calculator implements KeyListener 
	{
	
		Calculator()
			{
			
			}
		
		public class Interface extends Calculator
		{
			int totalVariable;
			String inputVariable = "";
			JButton jButtonZero = new JButton("0");
			JButton jButtonOne = new JButton("1");
			JButton jButtonTwo = new JButton("2");
			JButton jButtonThree = new JButton("3");
			JButton jButtonFour = new JButton("4");
			JButton jButtonFive = new JButton("5");
			JButton jButtonSix = new JButton("6");
			JButton jButtonSeven = new JButton("7");
			JButton jButtonEight = new JButton("8");
			JButton jButtonNine = new JButton("9");
			JButton jButtonAdd = new JButton("+");
			JButton jButtonSubtract = new JButton("-");
			JButton jButtonDivide = new JButton("÷");
			JButton jButtonMultiply = new JButton("×");
			JButton jButtonEquals = new JButton("=");
			JButton jButtonRemainder = new JButton("%");
			JButton jButtonPower = new JButton("^");
			JButton jButtonSquareRoot = new JButton("√");
			JButton jButtonClear = new JButton("CE");
			JButton jButtonDelete = new JButton("⌫");	
			JButton jButtonDecimal = new JButton(".");
			JButton jButtonPositiveOrNegative = new JButton("+/-");		
			JLabel jTextBox = new JLabel("");
//	TODO @author Table
 //		Interface()
			{
				jButtonZero.addActionListener(e ->
					{	inputVariable += "0";
						jTextBox.setText(inputVariable);
					});
				jButtonOne.addActionListener(e ->
					{
						inputVariable += "1";
						jTextBox.setText(inputVariable);		
					});
				jButtonTwo.addActionListener(e ->
					{
						inputVariable += "2";
						jTextBox.setText(inputVariable);
					});
				jButtonThree.addActionListener(e ->
					{
						inputVariable += "3";
						jTextBox.setText(inputVariable);
					});
				jButtonFour.addActionListener(e ->
					{
						inputVariable += "4";
						jTextBox.setText(inputVariable);
					});
				jButtonFive.addActionListener(e ->
					{
						inputVariable += "5";
						jTextBox.setText(inputVariable);	
					});
				jButtonSix.addActionListener(e ->
					{
						inputVariable += "6";
						jTextBox.setText(inputVariable);	
					});
				jButtonSeven.addActionListener(e ->
					{
						inputVariable += "7";
						jTextBox.setText(inputVariable);
					});
				jButtonEight.addActionListener(e ->
					{
						inputVariable += "8";
						jTextBox.setText(inputVariable);
					});
				jButtonNine.addActionListener(e ->
					{
						inputVariable += "9";
						jTextBox.setText(inputVariable);
					});
				jButtonAdd.addActionListener(e ->
					{
						inputVariable += "+";
						jTextBox.setText(inputVariable);
					});
				jButtonSubtract.addActionListener(e ->
					{
						inputVariable += "-";
						jTextBox.setText(inputVariable);
					});
				jButtonDivide.addActionListener(e ->
					{
						inputVariable += "/";
						jTextBox.setText(inputVariable);	
					});
				jButtonMultiply.addActionListener(e ->
					{
						inputVariable += "*";
						jTextBox.setText(inputVariable);
					});
				
				jButtonEquals.addActionListener(e ->
				{
					//totalVariable = () Integer.parseInt(inputVariable);
	
					System.out.println(totalVariable);
					//jTextBox.setText(String.valueOf(totalVariable));
				});
				jButtonRemainder.addActionListener(e ->
					{
						inputVariable += "%";
						jTextBox.setText(inputVariable);
					});
				jButtonPower.addActionListener(e ->{System.out.println("hello");});
				jButtonSquareRoot.addActionListener(e ->{System.out.println("hello");});
				jButtonClear.addActionListener(e ->
					{
						inputVariable.equals("");
						jTextBox.setText("");
					});
				jButtonDelete.addActionListener(e ->{System.out.println("hello");});
				jButtonDecimal.addActionListener(e ->
					{
						inputVariable += ".";
						jTextBox.setText(inputVariable);	
					});
				jButtonPositiveOrNegative.addActionListener(e ->{System.out.println("hello");});
				JFrame jFrame = new JFrame();
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setSize(629,512);
				jFrame.setMinimumSize(new Dimension(786,593));
				jFrame.setLayout(new BorderLayout(10,10));
				jFrame.getContentPane().setBackground(new Color(0x202020));
				jFrame.add(jPanel(),BorderLayout.SOUTH);
				jFrame.add(jInputPanel(),BorderLayout.CENTER);
				jFrame.setVisible(true);
			}
		
			public JPanel jInputPanel()
				{
					JPanel jInputPanel = new JPanel();
					jInputPanel.setLayout(new BorderLayout());
					jInputPanel.setPreferredSize(new Dimension(0,350));
					jInputPanel.setBackground(new Color(0x999999));
					jInputPanel.setBorder(BorderFactory.createLineBorder(new Color(0X202020),45));
					jInputPanel.add(jTextBox(),BorderLayout.CENTER);
					return jInputPanel;
				}
			
			public JLabel jTextBox()
				{
				 	jTextBox.setPreferredSize(new Dimension(0,350));
				 	jTextBox.setBackground(new Color(0x999999));
				 	jTextBox.setFont(new Font("Arial, Helvetica, sans-serif",Font.BOLD,36));
				 	jTextBox.setBorder(BorderFactory.createLineBorder(new Color(0x999999),25));
					return jTextBox;
				}
			
			public class jButtonAttributes
				{
					jButtonAttributes(JButton jButton)
						{
							jButton.setFont(new Font("Arial, Helvetica, sans-serif",Font.BOLD,24));
							jButton.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF),1));
							jButton.setFocusable(false);
						}
				}
				
			public JPanel jPanel()
				{
					jButton();
					JPanel jPanel = new JPanel();
					jPanel.setPreferredSize(new Dimension(0,256));
					jPanel.setLayout(new GridLayout(3,6,10,10));
					jPanel.setBackground(new Color(0x202020));
					jPanel.setBorder(BorderFactory.createLineBorder(new Color(0x202020),50));
					jPanel.add(jButtonRemainder);
					jPanel.add(jButtonDivide);
					jPanel.add(jButtonMultiply);	
					jPanel.add(jButtonPower);
					jPanel.add(jButtonSquareRoot);
					jPanel.add(jButtonClear);
					jPanel.add(jButtonDelete);	
					jPanel.add(jButtonZero);
					jPanel.add(jButtonOne);
					jPanel.add(jButtonTwo);
					jPanel.add(jButtonThree);
					jPanel.add(jButtonFour);
					jPanel.add(jButtonAdd);
					jPanel.add(jButtonEquals);
					jPanel.add(jButtonFive);
					jPanel.add(jButtonSix);
					jPanel.add(jButtonSeven);
					jPanel.add(jButtonEight);
					jPanel.add(jButtonNine);					
					jPanel.add(jButtonSubtract);				
					jPanel.add(jButtonPositiveOrNegative);
					return jPanel;
				}
			
			public void jButton()
				{

				 	new jButtonAttributes(jButtonZero);
					new jButtonAttributes(jButtonOne);
					new jButtonAttributes(jButtonTwo);
					new jButtonAttributes(jButtonThree);
					new jButtonAttributes(jButtonFour);
					new jButtonAttributes(jButtonFive);
					new jButtonAttributes(jButtonSix);
					new jButtonAttributes(jButtonSeven);
					new jButtonAttributes(jButtonEight);
					new jButtonAttributes(jButtonNine);
					new jButtonAttributes(jButtonAdd);
					new jButtonAttributes(jButtonSubtract);
					new jButtonAttributes(jButtonDivide);
					new jButtonAttributes(jButtonMultiply);
					new jButtonAttributes(jButtonEquals);
					new jButtonAttributes(jButtonRemainder);
					new jButtonAttributes(jButtonPower);
					new jButtonAttributes(jButtonSquareRoot);
					new jButtonAttributes(jButtonDelete);
					jButtonClear = new JButton("CE");	
					new jButtonAttributes(jButtonClear);
					new jButtonAttributes(jButtonDecimal);
					new jButtonAttributes(jButtonPositiveOrNegative);
				}
		}

		public static void main(String[] args)
			{
				new Calculator().new Interface();
			}
	
		@Override
		public void keyTyped(KeyEvent e) 
			{

			}
	
		@Override
		public void keyPressed(KeyEvent e) 
			{
				System.out.println("sij");
			}
	
		@Override
		public void keyReleased(KeyEvent e) 
			{
				
			}
	}