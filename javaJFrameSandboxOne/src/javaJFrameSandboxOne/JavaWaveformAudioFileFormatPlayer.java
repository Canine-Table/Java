package javaJFrameSandboxOne;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** @author Table **/

public class JavaWaveformAudioFileFormatPlayer
	{
		public static String buttonEvent = "";
		protected static ImageIcon jIcon()
		
			{
				ImageIcon jIcon = new ImageIcon("Images/PNG/Play Music (13).png");
				return jIcon;
			}
		
		protected static JButton startButton()
			{
				ImageIcon startImageIcon = new ImageIcon("Images/PNG/playButton.png");
				JButton startButton = new JButton(startImageIcon);
				startButton.setBounds(11,11,168,78);
				startButton.setText("Start");
				startButton.setIconTextGap(12);
				startButton.setFont(new Font("Arial, Helvetica, sans-serif;",Font.BOLD,24));
				startButton.setForeground(new Color(0xFFFFFF));
				startButton.setFocusable(false);
				startButton.setBorder(BorderFactory.createEtchedBorder());
				startButton.setHorizontalAlignment(JButton.CENTER);
				startButton.setBackground(new Color(0xFF6347));
				startButton.addActionListener(e -> buttonEvent = "Start");

				return startButton;
			}

		protected static JButton stopButton()
			{
				ImageIcon stopImageIcon = new ImageIcon("Images/PNG/pauseButton.png");
				JButton stopButton = new JButton(stopImageIcon);
				stopButton.setBounds(187,11,170,78);
				stopButton.setText("Stop");
				stopButton.setIconTextGap(12);
				stopButton.setFont(new Font("Arial, Helvetica, sans-serif;",Font.BOLD,24));
				stopButton.setForeground(new Color(0xFFFFFF));
				stopButton.setFocusable(false);
				stopButton.setBorder(BorderFactory.createEtchedBorder());
				stopButton.setHorizontalAlignment(JButton.CENTER);
				stopButton.setBackground(new Color(0xFF6347));
				stopButton.addActionListener(e -> buttonEvent = "Stop");
				return stopButton;
			}
		protected static JButton resetButton()
			{
				ImageIcon resetImageIcon = new ImageIcon("Images/PNG/resetButton.png");
				JButton resetButton = new JButton(resetImageIcon);
				resetButton.setBounds(365,11,170,78);
				resetButton.setText("Reset");
				resetButton.setFont(new Font("Arial, Helvetica, sans-serif;",Font.BOLD,24));
				resetButton.setIconTextGap(12);
				resetButton.setForeground(new Color(0xFFFFFF));
				resetButton.setFocusable(false);
				resetButton.setBorder(BorderFactory.createEtchedBorder());
				resetButton.setHorizontalAlignment(JButton.CENTER);
				resetButton.setBackground(new Color(0xFF6347));
				resetButton.addActionListener(e -> buttonEvent = "Reset");
				return resetButton;
			}		
		
		protected static JButton loopButton()
			{
				ImageIcon loopImageIcon = new ImageIcon("Images/PNG/loopButton.png");
				JButton loopButton = new JButton(loopImageIcon);
				loopButton.setBounds(543,11,170,78);
				loopButton.setText("Loop");
				loopButton.setIconTextGap(12);
				loopButton.setFont(new Font("Arial, Helvetica, sans-serif;",Font.BOLD,24));
				loopButton.setForeground(new Color(0xFFFFFF));
				loopButton.setFocusable(false);
				loopButton.setBorder(BorderFactory.createEtchedBorder());
				loopButton.setHorizontalAlignment(JButton.CENTER);
				loopButton.setBackground(new Color(0xFF6347));
				loopButton.addActionListener(e -> buttonEvent = "Loop");
				return loopButton;
			}	
								
		protected static JPanel jPanelInnerMainControls()
			{
				JPanel jPanelInnerMainControls = new JPanel();
				jPanelInnerMainControls.setBorder(BorderFactory.createLineBorder(new Color(0xFD673A),3));
				jPanelInnerMainControls.setBackground(new Color(0xB25A38));
				jPanelInnerMainControls.setBounds(11,612,724,100);
				jPanelInnerMainControls.setLayout(null);
				jPanelInnerMainControls.add(startButton());
				jPanelInnerMainControls.add(stopButton());
				jPanelInnerMainControls.add(resetButton());
				jPanelInnerMainControls.add(loopButton());
				return jPanelInnerMainControls;
			}
		
		protected static JPanel jPanelInnerMain()
			{				
				JPanel jPanelInnerMain = new JPanel();
				jPanelInnerMain.setBackground(new Color(0xB8860B));
				jPanelInnerMain.setBorder(BorderFactory.createLineBorder(new Color(0xFD673A),3));
				jPanelInnerMain.add(jPanelInnerMainControls());
				jPanelInnerMain.setLayout(new BorderLayout());
				return jPanelInnerMain;
			}
		
		protected static JPanel jPanelMain()
			{				
				JPanel jPanelMain = new JPanel();
				jPanelMain.setBounds(0,1,754,730);
				jPanelMain.setLayout(new BorderLayout());
				jPanelMain.setBorder(BorderFactory.createLineBorder(new Color(0xEEEEEE),4));
				jPanelMain.add(jPanelInnerMain());
				return jPanelMain;
			}
		
		protected static JFrame jFrame()
			{
				JFrame jFrame = new JFrame();
				jFrame.setLayout(new BorderLayout());
				jFrame.setTitle("Java Wave form Audio File Format Player");
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setIconImage(jIcon().getImage());
				jFrame.setSize(768,768);
				jFrame.add(jPanelMain());
				jFrame.setVisible(true);
				jFrame.setResizable(false);
				return jFrame;
			}

		public static void main(String[] args) 
			{
				jFrame();
				String $Path = "C:\\Users\\Table\\eclipse-workspace\\Eclipse IDE for Java Developers\\Eclipse-Workspace-Four\\javaSandboxOne\\src\\javaSandboxOneLevelOne\\Juice WRLD - Lean Wit Me (Official Music Video).wav";
				File $File = new File($Path);
				try
					{
						AudioInputStream $AudioStream = AudioSystem.getAudioInputStream($File);
						Clip $Clip = AudioSystem.getClip();
						$Clip.open($AudioStream);
						while(true)
							{
								switch(buttonEvent)
									{
										case ("Start"): $Clip.start();
											break;
										case ("Stop"): $Clip.stop();
											break;
										case ("Reset"): $Clip.setMicrosecondPosition(0);
											break;
										case ("Loop"): $Clip.loop(1);
											break;
									}
							}
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) 
						{
							e.printStackTrace();
						}
		}
	}