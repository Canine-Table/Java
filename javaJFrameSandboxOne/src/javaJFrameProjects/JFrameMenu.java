package javaJFrameProjects;

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.GridLayout;
	import javax.swing.BorderFactory;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

/** @author Table */
@SuppressWarnings("all")
public class JFrameMenu 
	{
		public static JFrameMenu.jButtonBluePrint jButtonBluePrints = new JFrameMenu.jButtonBluePrint();
		public static JPanel jPanelOffice365;
		public static JPanel jPanelTextEditors;
		public static JPanel jPanelAdobe;
		public static JPanel jPanelSearchEngines;
		public static JPanel jPanelManagementConsole;
		public static JPanel jPanelVisualStudios;
		public static JPanel jPanelJetBrains;
		public static JPanel jPanelControlPanel;
		public static JPanel jPanelEclipse;
		public static String[] thisTab = {
				/*( 0 )*/"Office365",
				/*( 1 )*/"TextEditors",
				/*( 2 )*/"SearchEngines",
				/*( 3 )*/"Eclipse",		
				/*( 4 )*/"JetBrains",
				/*( 5 )*/"VisualStudios",
				/*( 6 )*/"ControlPanel",
				/*( 7 )*/"ManagementConsole",
				/*( 8 )*/"Adobe"
			};
		public static String currentActive = thisTab[0];
		public static String nextActive = "";
		public static boolean start = true;
		protected static class jButtonBluePrint
			{
	 
				 private JButton setButtons(JButton jButton)
					 {
						 jButton.setBorder(BorderFactory.createLineBorder(new Color(0x000000),1));
						 return jButton;
					 }
			}

		public static void jActiveState()
		 	{
			
				switch(currentActive)
					{
						case ("Office365"): jPanelOffice365.setVisible(false); break;
						case ("TextEditors"): jPanelTextEditors.setVisible(false); break;
						case ("SearchEngines"): jPanelSearchEngines.setVisible(false); break;
						case ("Eclipse"): jPanelEclipse.setVisible(false); break;
						case ("JetBrains"): jPanelJetBrains.setVisible(false); break;
						case ("VisualStudios"): jPanelVisualStudios.setVisible(false); break;
						case ("ControlPanel"): jPanelControlPanel.setVisible(false); break;
						case ("ManagementConsole"):	jPanelManagementConsole.setVisible(false); break;
						case ("Adobe"): jPanelAdobe.setVisible(false); break;
					}
				switch(nextActive)
					{
						case ("Office365"): jPanelOffice365.setVisible(true); break;
						case ("TextEditors"): jPanelTextEditors.setVisible(true); break;
						case ("SearchEngines"): jPanelSearchEngines.setVisible(true); break;
						case ("Eclipse"): jPanelEclipse.setVisible(true); break;
						case ("JetBrains"): jPanelJetBrains.setVisible(true); break;
						case ("VisualStudios"): jPanelVisualStudios.setVisible(true); break;
						case ("ControlPanel"): jPanelControlPanel.setVisible(true); break;
						case ("ManagementConsole"):	jPanelManagementConsole.setVisible(true); break;
						case ("Adobe"): jPanelAdobe.setVisible(true); break;
					}
				
		 	}

		public static JPanel jPanelTab()
			{

				JButton jButtonOffice365 = new JButton("Office 365"/*( 0 )*/);
				jButtonBluePrints.setButtons(jButtonOffice365);
				jButtonOffice365.addActionListener(e ->
					{
						jPanelOffice365();
					});
					
				JButton jButtonTextEditors = new JButton("Text Editors"/*( 1 )*/);
				jButtonBluePrints.setButtons(jButtonTextEditors);
				jButtonTextEditors.addActionListener(e ->
					{
						jPanelTextEditors();
					});
				
				JButton jButtonSearchEngines = new JButton("Search Engines"/*( 2 )*/);
				jButtonBluePrints.setButtons(jButtonSearchEngines);
				jButtonSearchEngines.addActionListener(e ->
					{
						jPanelSearchEngines();
					});
				
				JButton jButtonEclipse = new JButton("Eclipse"/*( 3 )*/);
				jButtonBluePrints.setButtons(jButtonEclipse);
				jButtonEclipse.addActionListener(e ->
					{
						jPanelEclipse();
					});
				
				JButton jButtonJetBrains = new JButton("Jet Brains"/*( 4 )*/);
				jButtonBluePrints.setButtons(jButtonJetBrains);
				jButtonJetBrains.addActionListener(e ->
					{
						jPanelJetBrains();
					});
				
				JButton jButtonVisualStudios = new JButton("Visual Studios"/*( 5 )*/);
				jButtonBluePrints.setButtons(jButtonVisualStudios);
				jButtonVisualStudios.addActionListener(e ->
					{
						jPanelVisualStudios();
					});				
				
				JButton jButtonControlPanel = new JButton("Control Panel"/*( 6 )*/);
				jButtonBluePrints.setButtons(jButtonControlPanel);
				jButtonControlPanel.addActionListener(e ->
					{
						jPanelControlPanel();
					});
				
				JButton jButtonManagementConsole = new JButton("Management Console"/*( 7 )*/);
				jButtonBluePrints.setButtons(jButtonManagementConsole);
				jButtonManagementConsole.addActionListener(e ->
					{
						jPanelManagementConsole();
					});
				
				JButton jButtonAdobe = new JButton("Adobe"/*( 8 )*/);
				jButtonBluePrints.setButtons(jButtonAdobe);
				jButtonAdobe.addActionListener(e ->
					{
						jPanelAdobe();
					});
				
				JPanel jPanelTab = new JPanel();
				jPanelTab.setPreferredSize(new Dimension(128,128));
				jPanelTab.setLayout(new GridLayout(1,4,3,8));
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
				jPanelOffice365 = new JPanel();
				jPanelOffice365.setBackground(new Color(0x344343));
				nextActive = thisTab[0];
				jActiveState();
				currentActive = thisTab[0];
				return jPanelOffice365;
			}
		
		public static JPanel jPanelTextEditors(/*( 1 )*/)
			{
				jPanelTextEditors = new JPanel();
				jPanelTextEditors.setBackground(new Color(0xFFFFFF));
				nextActive = thisTab[1];
				jActiveState();
				currentActive = thisTab[1];
				return jPanelTextEditors;
			}
		
		public static JPanel jPanelSearchEngines(/*( 2 )*/)
			{
				jPanelSearchEngines = new JPanel();
				jPanelSearchEngines.setBackground(new Color(0xFFFFFF));
				nextActive = thisTab[2];
				jActiveState();
				currentActive = thisTab[2];
				return jPanelSearchEngines;
			}
		
		public static JPanel jPanelEclipse(/*( 3 )*/)
			{
				jPanelEclipse = new JPanel();
				jPanelEclipse.setBackground(new Color(0x9834EF));
				nextActive = thisTab[3];
				jActiveState();
				currentActive = thisTab[3];
				return jPanelEclipse;
			}

		public static JPanel jPanelJetBrains(/*( 4 )*/)
			{	
				jPanelJetBrains = new JPanel();
				jPanelJetBrains.setBackground(new Color(0x9834EF));
				nextActive = thisTab[4];
				jActiveState();
				currentActive = "";
				return jPanelJetBrains;
			}
		
		public static JPanel jPanelVisualStudios(/*( 5 )*/)
			{
				jPanelVisualStudios = new JPanel();
				jPanelVisualStudios.setBackground(new Color(0x9834EF));
				nextActive = "VisualStudios";
				jActiveState();
				currentActive = "VisualStudios";
				return jPanelVisualStudios;
			}

		public static JPanel jPanelControlPanel(/*( 6 )*/)
			{
				jPanelControlPanel = new JPanel();
				jPanelControlPanel.setBackground(new Color(0x9834EF));
				nextActive = "ControlPanel";
				jActiveState();
				currentActive = "ControlPanel";
				return jPanelControlPanel;
			}
		public static JPanel jPanelManagementConsole(/*( 7 )*/)
			{
				jPanelManagementConsole = new JPanel();
				jPanelManagementConsole.setBackground(new Color(0x192832));
				nextActive = "ManagementConsole";
				jActiveState();
				currentActive = "ManagementConsole";
				return jPanelManagementConsole;
			}
		public static JPanel jPanelAdobe(/*( 8 )*/)
			{
				jPanelAdobe = new JPanel();
				jPanelAdobe.setBackground(new Color(0x9834EF));
				nextActive = "Adobe";
				jActiveState();
				currentActive = "Adobe";
				return jPanelAdobe;
			}

		public static JPanel jPanelInnerMain()
			{
				JPanel jPanelInnerMain = new JPanel();
				jPanelInnerMain.setLayout(new BorderLayout());
				jPanelInnerMain.setBackground(new Color(0x000000));
				jPanelInnerMain.setBorder(BorderFactory.createLineBorder(new Color(0xFFFFFF00),3));
				jPanelInnerMain.add(jPanelOffice365());
				jPanelInnerMain.add(jPanelSearchEngines());
				jPanelInnerMain.add(jPanelAdobe());
				jPanelInnerMain.add(jPanelJetBrains());
				jPanelInnerMain.add(jPanelEclipse());
				jPanelInnerMain.add(jPanelControlPanel());
				jPanelInnerMain.add(jPanelManagementConsole());
				jPanelInnerMain.add(jPanelVisualStudios());
				jPanelInnerMain.add(jPanelTextEditors());
				jPanelInnerMain.setVisible(true);
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
				jPanelMain.setVisible(true);
				return jPanelMain;
			}
	
		public static JFrame jFrame()
			{			
				JFrame jFrame = new JFrame();
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jFrame.setSize(512,512);
				jFrame.add(jPanelMain());
				jFrame.setVisible(true);
				return jFrame;
			}
	
		public static void main(String[] args)
			{

				jFrame();
				if(start == true)
					{
						nextActive = thisTab[1];
						nextActive = thisTab[1];
						start = false;
					}
				jActiveState();

			}
	}