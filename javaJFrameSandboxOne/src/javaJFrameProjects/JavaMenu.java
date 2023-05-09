package javaJFrameProjects;
	
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.GridLayout;
	import javax.swing.BorderFactory;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLayeredPane;
	import javax.swing.JPanel;

/** @author Table */
@SuppressWarnings("unused")
public class JavaMenu 
	{
		public static JavaMenu.jButtonBluePrint jButtonBluePrints = new JavaMenu.jButtonBluePrint();

		
		public static class jButtonBluePrint
			{
		
				 private JButton setButtons(JButton jButton)
					 {
						 jButton.setBorder(BorderFactory.createLineBorder(new Color(0x000000),1));
						 jButton.setFocusable(false);
						 return jButton;
					 }
			}

 		public static JPanel jPanelTab()
 			{

				JPanel jPanelTab = new JPanel();
				jPanelTab.setPreferredSize(new Dimension(0,82));
				jPanelTab.setLayout(new GridLayout(1,4,3,8));
						
				JButton jButtonOffice365 = new JButton("Office 365"/*( 0 )*/);
				jButtonBluePrints.setButtons(jButtonOffice365);
				jButtonOffice365.addActionListener(e ->
					{
					});
					
				JButton jButtonTextEditors = new JButton("Text Editors"/*( 1 )*/);
				jButtonBluePrints.setButtons(jButtonTextEditors);
				jButtonTextEditors.addActionListener(e ->
					{
					});
				
				JButton jButtonSearchEngines = new JButton("Search Engines"/*( 2 )*/);
				jButtonBluePrints.setButtons(jButtonSearchEngines);
				jButtonSearchEngines.addActionListener(e ->
					{
					});
				
				JButton jButtonEclipse = new JButton("Eclipse"/*( 3 )*/);
				jButtonBluePrints.setButtons(jButtonEclipse);
				jButtonEclipse.addActionListener(e ->
					{
					});
				
				JButton jButtonJetBrains = new JButton("Jet Brains"/*( 4 )*/);
				jButtonBluePrints.setButtons(jButtonJetBrains);
				jButtonJetBrains.addActionListener(e ->
					{
					});
				
				JButton jButtonVisualStudios = new JButton("Visual Studios"/*( 5 )*/);
				jButtonBluePrints.setButtons(jButtonVisualStudios);
				jButtonVisualStudios.addActionListener(e ->
					{
					});				
				
				JButton jButtonControlPanel = new JButton("Control Panel"/*( 6 )*/);
				jButtonBluePrints.setButtons(jButtonControlPanel);
				jButtonControlPanel.addActionListener(e ->
					{
					});
				
				JButton jButtonManagementConsole = new JButton("Management Console"/*( 7 )*/);
				jButtonBluePrints.setButtons(jButtonManagementConsole);
				jButtonManagementConsole.addActionListener(e ->
					{
					});
				
				JButton jButtonAdobe = new JButton("Adobe"/*( 8 )*/);
				jButtonBluePrints.setButtons(jButtonAdobe);
				jButtonAdobe.addActionListener(e ->
					{
						
					});

				jPanelTab.add(jButtonOffice365);
				jPanelTab.add(jButtonTextEditors);
				jPanelTab.add(jButtonSearchEngines);
				jPanelTab.add(jButtonEclipse);
				jPanelTab.add(jButtonJetBrains);
				jPanelTab.add(jButtonVisualStudios);
				jPanelTab.add(jButtonControlPanel);
				jPanelTab.add(jButtonManagementConsole);
				jPanelTab.add(jButtonAdobe);
				return jPanelTab;
			}
		public static JPanel jPanelOffice365(/*( 0 )*/)
			{
				JPanel jPanelOffice365 = new JPanel();
				jPanelOffice365.setBackground(new Color(0x344343));
				jPanelOffice365.setVisible(false);
				return jPanelOffice365;
			}
		
		public static JPanel jPanelTextEditors(/*( 1 )*/)
			{
				JPanel jPanelTextEditors = new JPanel();
				jPanelTextEditors.setBackground(new Color(0xFFFFFF));
				jPanelTextEditors.setVisible(false);
				return jPanelTextEditors;
			}
		
		public static JPanel jPanelSearchEngines(/*( 2 )*/)
			{
				JPanel jPanelSearchEngines = new JPanel();
				jPanelSearchEngines.setBackground(new Color(0xFFFFFF));
				jPanelSearchEngines.setVisible(false);
				return jPanelSearchEngines;
			}
		
		public static JPanel jPanelEclipse(/*( 3 )*/)
			{
				JPanel jPanelEclipse = new JPanel();
				jPanelEclipse.setBackground(new Color(0x9834EF));
				return jPanelEclipse;
			}
	
		public static JPanel jPanelJetBrains(/*( 4 )*/)
			{	
				JPanel jPanelJetBrains = new JPanel();
				jPanelJetBrains.setBackground(new Color(0x9834EF));
				jPanelJetBrains.setVisible(false);
				return jPanelJetBrains;
			}
		
		public static JPanel jPanelVisualStudios(/*( 5 )*/)
			{
				JPanel jPanelVisualStudios = new JPanel();
				jPanelVisualStudios.setBackground(new Color(0x9834EF));
				jPanelVisualStudios.setVisible(false);
				return jPanelVisualStudios;
			}
	
		public static JPanel jPanelControlPanel(/*( 6 )*/)
			{
				JPanel jPanelControlPanel = new JPanel();
				jPanelControlPanel.setBackground(new Color(0x9834EF));
				jPanelControlPanel.setVisible(false);
				return jPanelControlPanel;
			}
		public static JPanel jPanelManagementConsole(/*( 7 )*/)
			{
				JPanel jPanelManagementConsole = new JPanel();
				jPanelManagementConsole.setBackground(new Color(0x192832));
				jPanelManagementConsole.setVisible(false);
				return jPanelManagementConsole;
			}
		public static JPanel jPanelAdobe(/*( 8 )*/)
			{
				JPanel jPanelAdobe = new JPanel();
				jPanelAdobe.setBackground(new Color(0x9834EF));
				jPanelAdobe.setVisible(true);
				return jPanelAdobe;
			}
		public static JPanel jPanelInnerMain()
			{

				
				JPanel jPanelInnerMain = new JPanel();
				jPanelInnerMain.setLayout(new BorderLayout());
				jPanelInnerMain.setBackground(new Color(0x000000));
				jPanelInnerMain.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF00),3));
				jPanelInnerMain.add(jPanelOffice365());
				return jPanelInnerMain;
			}
		
		public static JPanel jPanelMain()
			{		
				JPanel jPanelMain = new JPanel();
				jPanelMain.setBackground(new Color(0xEEEEEE));
				jPanelMain.setLayout(new BorderLayout(3,3));
				jPanelMain.setBorder(BorderFactory.createLineBorder(new Color(0xEEEEEE),3));
				jPanelMain.add(jPanelTab(),BorderLayout.NORTH);
				jPanelMain.add(jPanelInnerMain());
				return jPanelMain;
			}
		
		public static JFrame jFrame()
			{			
				JFrame jFrame = new JFrame();
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setSize(768,768);
				jFrame.add(jPanelMain());
				jFrame.setVisible(true);
				return jFrame;
			}

		public static void main(String[] args)
			{
				jFrame();
			}
	}