package jFrameGraphicalUserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Base64;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/** @author Table */
@SuppressWarnings({"serial","unused"})




public class Graphical_User_Interface_Main  extends JFrame implements MouseListener, KeyListener
	{
		Graphical_User_Interface_Main()
			{
				this.setTitle("Graphical User Interface");
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.getContentPane().setBackground(new Color(0xEEEEEE));
				this.setSize(1024,760);
				this.add(new jTabbedPane());
				this.setVisible(true);
			}

		private byte[] Base64Decoder(String _Icon)
			{
				byte[] decodedBase64Icon = Base64.getDecoder().decode(_Icon);
				return decodedBase64Icon;
			}
		
		private class jTabbedPane extends JTabbedPane
			{
				final ImageIcon Office365Icon = new ImageIcon(Base64Decoder("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"));
				final ImageIcon TextEditorsIcon = new ImageIcon(Base64Decoder(""));
				final ImageIcon SearchEnginesIcon = new ImageIcon(Base64Decoder(""));
				final ImageIcon JetBrainsIcon = new ImageIcon(Base64Decoder(""));
				final ImageIcon EclipseIcon = new ImageIcon(Base64Decoder(""));
				final ImageIcon VisualStudiosIcon = new ImageIcon(Base64Decoder(""));
				final ImageIcon ControlPanelIcon = new ImageIcon(Base64Decoder(""));
				final ImageIcon ManagementConsoleIcon = new ImageIcon(Base64Decoder(""));
				final ImageIcon AdobeIcon = new ImageIcon(Base64Decoder(""));
				jTabbedPane()
					{
						this.setBackground(new Color(0xFFFFFF));
						this.getAutoscrolls();
						this.setTabPlacement(LEFT);
						
						this.addTab(null,Office365Icon,jPanelOffice365(),"Office 365 Applications");
						this.addTab(null,TextEditorsIcon,jPanelTextEditors(),"Text Editors");
						this.addTab(null,SearchEnginesIcon,jPanelSearchEngines(),"Search Engines");
						this.addTab(null,JetBrainsIcon,jPanelJetBrains(),"Jet Brain Applications");
						this.addTab(null,EclipseIcon,jPanelEclipse(),"Eclipse IDE");
						this.addTab(null,VisualStudiosIcon,jPanelVisualStudios(),"e");
						this.addTab(null,ControlPanelIcon,jPanelControlPanel(),"Windows Control Panel");
						this.addTab(null,ManagementConsoleIcon,jPanelManagementConsole(),"Microsoft Management Console");
						this.addTab(null,AdobeIcon,jPanelAdobe(),"Adobe Creative Cloud");
					}

				JPanel jPanelOffice365()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
				 
				 JPanel jPanelTextEditors()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
				 
				 JPanel jPanelSearchEngines()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
				 
				 JPanel jPanelJetBrains()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
				 
				 JPanel jPanelEclipse()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
				 
				 JPanel jPanelVisualStudios()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
				 
				 JPanel jPanelControlPanel()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
				 
				 JPanel jPanelManagementConsole()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
				 
				 JPanel jPanelAdobe()
					{	
					 	JPanel jPanelOne = new JPanel();
					 	JLabel jLabel = new JLabel("Tab1");
					 	jPanelOne.add(jLabel);
						return jPanelOne;
					}
			}
		
		public static void main(String[] args) 
			{
				new Graphical_User_Interface_Main();
			}
	
		@Override
		public void keyTyped(KeyEvent e) 
			{
				
			}
	
		@Override
		public void keyPressed(KeyEvent e) 
			{
				
			}
	
		@Override
		public void keyReleased(KeyEvent e) 
			{
				
			}
	
		@Override
		public void mouseClicked(MouseEvent e) 
			{
				
			}
	
		@Override
		public void mousePressed(MouseEvent e) 
			{
				
			}
	
		@Override
		public void mouseReleased(MouseEvent e) 
			{
				
			}
	
		@Override
		public void mouseEntered(MouseEvent e) 
			{
				
			}
	
		@Override
		public void mouseExited(MouseEvent e) 
			{
				
			}
	}