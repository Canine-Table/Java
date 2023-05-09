package application;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

	public class Main extends Application { public static void main(String[] args) { Application.launch(args); }

		@Override
		public void start(Stage primaryStageForm) throws Exception {
		Group rootPane = new Group();
		Image icon = new Image("icon.png");
		TabPane primaryTabPane = new TabPane();
		rootPane.getChildren().add(primaryTabPane);
		Group rootTab  = new Group();
		rootPane.getChildren().addAll(rootTab);
		rootTab.getChildren().addAll(primaryTabPane);
			
		Tab office365Tab = new Tab( " Office 365 ");
		Tab jetBrainsTab = new Tab(" Jet Brains ");
		Tab eclipseTab = new Tab(" Eclipse ");
		Tab textEditorsTab = new Tab(" Text Editors ");		
		Tab visualStudiosTab = new Tab(" Visual Studios ");		
		Tab browserTab = new Tab(" Search Engines ");
		Tab linksTab = new Tab(" Links Tab ");

		primaryTabPane.getTabs().addAll( office365Tab, jetBrainsTab, 
		browserTab, eclipseTab, textEditorsTab, visualStudiosTab, linksTab );
		primaryTabPane.prefWidthProperty().bind(primaryStageForm.widthProperty());
		primaryTabPane.prefHeightProperty().bind(primaryStageForm.heightProperty());

			// Office 365 Tab //
			office365Tab.setClosable(false);
			FileInputStream office365InputStream = new FileInputStream("bin\\tabIcon\\office.png");
			Image office365Icon = new Image(office365InputStream);
			ImageView office365View = new ImageView(office365Icon);
			office365Tab.setGraphic(office365View);
			new Office365TabClass(office365Tab).open();
			
			// Jet Brains Tab //
			jetBrainsTab.setClosable(false);
			FileInputStream jetBrainsInputStream = new FileInputStream("bin\\tabIcon\\jetbrain.png");
			Image jetBrainsIcon = new Image(jetBrainsInputStream);
			ImageView jetBrainsView = new ImageView(jetBrainsIcon);
			jetBrainsTab.setGraphic(jetBrainsView);
			new JetBrainsTabClass(jetBrainsTab).open();

			// Eclipse Tab //
			eclipseTab.setClosable(false);
			FileInputStream eclipseInputStream = new FileInputStream("bin\\tabIcon\\eclipse.png");
			Image eclipseIcon = new Image(eclipseInputStream);
			ImageView eclipseView = new ImageView(eclipseIcon);
			eclipseTab.setGraphic(eclipseView);
			new EclipseTabClass(eclipseTab).open();

			// Text Editor Tab //
			textEditorsTab.setClosable(false);
			FileInputStream textEditorsInputStream = new FileInputStream("bin\\tabIcon\\notepad.png");
			Image textEditorsIcon = new Image(textEditorsInputStream);
			ImageView textEditorsView = new ImageView(textEditorsIcon);
			textEditorsTab.setGraphic(textEditorsView);
			new TextEditorsTabClass(textEditorsTab).open();

			// Search Engine Tab //
			browserTab.setClosable(false);
			FileInputStream browserInputStream = new FileInputStream("bin\\tabIcon\\browser.png");
    		Image browserIcon = new Image(browserInputStream);
    		ImageView browserView = new ImageView(browserIcon);
    		browserTab.setGraphic(browserView);
    		new SearchEngineClass(browserTab).open();

    		// Visual Studios //
			visualStudiosTab.setClosable(false);
			FileInputStream visualStudiosInputStream = new FileInputStream("bin\\tabIcon\\visual.png");
			Image visualStudiosIcon = new Image(visualStudiosInputStream);
			ImageView visualStudiosView = new ImageView(visualStudiosIcon);
			visualStudiosTab.setGraphic(visualStudiosView);
			new VisualStudiosTabClass(visualStudiosTab).open();

			// links //
			linksTab.setClosable(false);
			FileInputStream linksInputStream = new FileInputStream("bin\\tabIcon\\links.png");
			Image linksIcon = new Image(linksInputStream);
			ImageView linksView = new ImageView(linksIcon);
			linksTab.setGraphic(linksView);
			new LinksTabClass(linksTab).open();
        			
		VBox vBox = new VBox(primaryTabPane);
		rootPane.getChildren().add(vBox);
		Scene primaryFormScene = new Scene(rootPane, 700, 550);

		primaryStageForm.setScene(primaryFormScene);
		primaryStageForm.setResizable(false);
		primaryStageForm.getIcons().add(icon);
		primaryStageForm.setTitle("The Javafx Master Menu");
		primaryStageForm.show(); } 

public class LinksTabClass extends Main {

	Tab LinksTab;

	public LinksTabClass(Tab  LinksTab) {
	this.LinksTab = LinksTab; }
	public void open() throws FileNotFoundException { 
	DropShadow shadow = new DropShadow();
	InnerShadow output = new InnerShadow();
	shadow.setColor(Color.YELLOW);
	shadow.setBlurType(BlurType.THREE_PASS_BOX);
	shadow.setSpread(0.5);
	AnchorPane LinksAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(73, 158, 157)));
	int X=15; int Y=50;
	output.setOffsetX(2.0f); output.setOffsetY(2.0f);
	Button enter = new Button("Enter");
	enter.setEffect(shadow);
	enter.setDefaultButton(true);
	enter.setMinWidth(670); enter.setMinHeight(45);
	enter.setTranslateY(462); enter.setTranslateX(15);
	enter.setStyle("-fx-font-family: Arial Rounded MT Bold; -fx-font-weight: bold;-fx-border-color: gold; -fx-text-fill: gold; -fx-border-width: 4px;  -fx-font-size: 16px; -fx-background-color: darkolivegreen");

	Text linkLabel = new Text();
	linkLabel.setEffect(output);
	linkLabel.setText("Links:");
	linkLabel.setFill(Color.GOLD);
	linkLabel.setFont(Font.font("Arial Rounded MT Bold", FontWeight.EXTRA_BOLD, 40));
	linkLabel.setTranslateX(X); linkLabel.setTranslateY(Y);
	ComboBox<String> linkBox = new ComboBox<String>();
	linkBox.setPrefWidth(540);
	linkBox.setEffect(shadow);
	linkBox.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-border-color: gold; -fx-border-width: 2px; -fx-background-color: lightsalmon;-fx-text-background-color: maroon");
	linkBox.setPromptText("None");
	ObservableList<String> linkList = linkBox.getItems();
	linkList.addAll( "None",
					 "GitHub",
					 "Unit Converter",
					 "Wolframe Alpha",
					 "Font Guru",
					 "Discord" ); linkBox.setTranslateX(145); linkBox.setTranslateY(16);
	//new Checked(linkList).a
	Text algonquinLabel = new Text();
	algonquinLabel.setEffect(output);
	algonquinLabel.setText("Algonquin:");
	algonquinLabel.setFill(Color.GOLD);
	algonquinLabel.setFont(Font.font("Arial Rounded MT Bold", FontWeight.EXTRA_BOLD, 40));
	algonquinLabel.setTranslateX(X); algonquinLabel.setTranslateY(Y+=55);
	ComboBox<String> algonquinBox = new ComboBox<String>();
	algonquinBox.setPrefWidth(450);
	algonquinBox.setEffect(shadow);
	algonquinBox.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-border-color: gold; -fx-border-width: 2px; -fx-background-color: lightsalmon;-fx-text-background-color: maroon");
	algonquinBox.setPromptText("None");
	ObservableList<String> algonquinList = algonquinBox.getItems();
	algonquinList.addAll( "None",
						  "HomePage",
						  "Mathematics",
						  "Communications",
						  "Welcome Center",
						  "Achieving Success",
						  "HomePage",
						  "ACSIS",
						  "EventBrite",
						  "Library" ); algonquinBox.setTranslateX(235); algonquinBox.setTranslateY(Y-32);

	Text conversionLabel = new Text();
	conversionLabel.setEffect(output);
	conversionLabel.setText("Conversions:");
	conversionLabel.setFill(Color.GOLD);
	conversionLabel.setFont(Font.font("Arial Rounded MT Bold", FontWeight.EXTRA_BOLD, 40));
	conversionLabel.setTranslateX(X); conversionLabel.setTranslateY(Y+=55);
	ComboBox<String> conversionBox = new ComboBox<String>();
	conversionBox.setPrefWidth(400);
	conversionBox.setEffect(shadow);
	conversionBox.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-border-color: gold; -fx-border-width: 2px; -fx-background-color: lightsalmon;-fx-text-background-color: maroon");
	conversionBox.setPromptText("None");
	ObservableList<String> conversionList = conversionBox.getItems();
	conversionList.addAll( "None",
						   "4k SlideShow Maker",
						   "4k Stogram",
						   "4k Tokkit",
						   "4k Video Downloader",
						   "4k Video to MP3 Converter",
						   "4k Youtube to MP3 Converter",
						   "I Love PDFs",
						   "Convertio" ); conversionBox.setTranslateX(285); conversionBox.setTranslateY(Y-32);

	Text adobeLabel = new Text();
	adobeLabel.setEffect(output);
	adobeLabel.setText("Adobe:");
	adobeLabel.setFill(Color.GOLD);
	adobeLabel.setFont(Font.font("Arial Rounded MT Bold", FontWeight.EXTRA_BOLD, 40));
	adobeLabel.setTranslateX(X); adobeLabel.setTranslateY(Y+=55);
	ComboBox<String> adobeBox = new ComboBox<String>();
	adobeBox.setPrefWidth(525);
	adobeBox.setEffect(shadow);
	adobeBox.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-border-color: gold; -fx-border-width: 2px; -fx-background-color: lightsalmon;-fx-text-background-color: maroon");
	adobeBox.setPromptText("None");
	ObservableList<String> adobeList = adobeBox.getItems();
	adobeList.addAll( "None",
					  "Character Animator",
					  "Create Cloud",
					  "Tutorials",
					  "Color",
					  "Aero",
					  "Behance",
					  "Bridge",
					  "Experience League Community",
					  "Fonts",
					  "Fresco",
					  "Frame.io",
					  "Lightroom",
					  "Media Encoder",
					  "Mixamo",
					  "PhotoShop Express",
					  "PhotoShop",
					  "Portfolio",
					  "Premiere Rush",
					  "Stock",
					  "Substance 3D Community Assets",
					  "Substance 3D Assets",
					  "UXB Developer Tools" ); adobeBox.setTranslateX(160); adobeBox.setTranslateY(Y-32); 

	Text managementLabel = new Text();
	managementLabel.setEffect(output);
	managementLabel.setText("Management:");
	managementLabel.setFill(Color.GOLD);
	managementLabel.setFont(Font.font("Arial Rounded MT Bold", FontWeight.EXTRA_BOLD, 40));
	managementLabel.setTranslateX(X); managementLabel.setTranslateY(Y+=55);
	ComboBox<String> managementBox = new ComboBox<String>();
	managementBox.setPrefWidth(395);
	managementBox.setEffect(shadow);
	managementBox.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-border-color: gold; -fx-border-width: 2px; -fx-background-color: lightsalmon;-fx-text-background-color: maroon");
	managementBox.setPromptText("None");
	ObservableList<String> managementList = managementBox.getItems();
	managementList.addAll( "None",
						   "Authentication Manager",
						   "Certificates This PC", 
						   "Certificates Current User", 
						   "Failover Cluster Manager", 
						   "Component Services", 
						   "Computer Management", 
						   "Device Manager", 
						   "Dev Mode Runas", 
						   "DFS Management", 
						   "Disk Management",
						   "Event Viewer", 
						   "Shared Folders", 
						   "File Server Resource Manager", 
						   "Group Policy Editor",
						   "Local Users and Groups",
						   "Performance Monitor",
						   "Printer Management",
						   "Resultant Set of Policy",
						   "Security Policy",
						   "Services",
						   "Task Scheduler",
						   "Trusted Platform Module",
						   "Hyper-V Manager",
						   "Defender Firewall Advanced Security", 
						   "Management Console" ); managementBox.setTranslateX(290); managementBox.setTranslateY(Y-32);

	Text imageLabel = new Text();
	imageLabel.setEffect(output);
	imageLabel.setText("Image:");
	imageLabel.setFill(Color.GOLD);
	imageLabel.setFont(Font.font("Arial Rounded MT Bold", FontWeight.EXTRA_BOLD, 40));
	imageLabel.setTranslateX(X); imageLabel.setTranslateY(Y+=55);
	ComboBox<String> imageBox = new ComboBox<String>();
	imageBox.setPrefWidth(525);
	imageBox.setEffect(shadow);
	imageBox.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-border-color: gold; -fx-border-width: 2px; -fx-background-color: lightsalmon;-fx-text-background-color: maroon");
	imageBox.setPromptText("None");
	ObservableList<String> imageList = imageBox.getItems();
	imageList.addAll( "None",
					  "Background Remover",
					  "RedKetchup",
					  "Gimp",
					  "LazyPaint",
					  "Paint",
					  "PixMiller",
					  "Snip & Sketch",
					  "Snipping Tool",
					  "White Remover",
					  "3D Paint" ); imageBox.setTranslateX(160); imageBox.setTranslateY(Y-32);

	Text controlLabel = new Text();
	controlLabel.setEffect(output);
	controlLabel.setText("Control Panel:");
	controlLabel.setFill(Color.GOLD);
	controlLabel.setFont(Font.font("Arial Rounded MT Bold", FontWeight.EXTRA_BOLD, 40));
	controlLabel.setTranslateX(X); controlLabel.setTranslateY(Y+=55);
	ComboBox<String> controlBox = new ComboBox<String>();
	controlBox.setPrefWidth(385);
	controlBox.setEffect(shadow);
	controlBox.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-border-color: gold; -fx-border-width: 2px; -fx-background-color: lightsalmon;-fx-text-background-color: maroon");
	controlBox.setPromptText("None");
	ObservableList<String> controlList = controlBox.getItems();
	controlList.addAll( "None",
						"Programs and Features",
						"Display Settings",
						"Windows Defender", 
						"Flash Player Settings",
						"Internet Properties",
						"Game Controllers",
						"Region",
						"Mouse Properties",
						"Mail Setup",
						"Speech Properties",
						"System Properties",
						"Location Information",
						"Date and Time",
						"Security & Maintenance",
						"Mobility Settings",
						"Windows Features",
						"Remote Access" ); controlBox.setTranslateX(300); controlBox.setTranslateY(Y-32);

	Text archiveLabel = new Text();
	archiveLabel.setEffect(output);
	archiveLabel.setText("Archives:");
	archiveLabel.setFill(Color.GOLD);
	archiveLabel.setFont(Font.font("Arial Rounded MT Bold", FontWeight.EXTRA_BOLD, 40));
	archiveLabel.setTranslateX(X); archiveLabel.setTranslateY(Y+=55);
	ComboBox<String> archiveBox = new ComboBox<String>();
	archiveBox.setPrefWidth(475);
	archiveBox.setEffect(shadow);
	archiveBox.setStyle("-fx-font-size: 18; -fx-font-weight: bold; -fx-border-color: gold; -fx-border-width: 2px; -fx-background-color: lightsalmon;-fx-text-background-color: maroon");
	archiveBox.setPromptText("None");
	ObservableList<String> archiveList = archiveBox.getItems();
	archiveList.addAll( "None",
						"Hot Symbol",
						"Icon Archive",
						"Icon 8",
						"Deviant Art",
						"Discord ST",
						"Filmora",
						"Giffy",
						"Tenor",
						"Veed io",
						"Device Manager",
						"Computer Solutions",
						"Submarine Cable Map",
						"Vim Adventures",
						"Unix Linux Tutorial",
						"GNU Systems",
						"Linux Journey",
						"Linux Info Project",
						"Learning Linux",
						"Bash Guide",
						"Linux",
						"Windows Help",
						"Certifications",
						"Command Line Reference",
						"How to Geek",
						"File Info",
						"AutoHotkey Documentation",
						"Bat 2 Exe",
						"Password Generator",
						"AccessEnum",
						"ADExplorer",
						"ADInsight",
						"AutoRuns",
						"Cache Set",
						"Background Info",
						"Ram Map",
						"Process Explorer",
						"Debug View",
						"Virtual Desktops",
						"Control Panel",
						"Diskview",
						"CPU Stress",
						"Process Monitor",
						"Windows File Recovery",
						"Disk Monitor",
						"Windows Objects",
						"File Explorer",
						"Defragment & Optimize",
						"Memory Diagnostics",
						"Accessory Center",
						"AutoLogon",
						"Azure Services",
						"ODBC Data Sources",
						"RecoveryDrive",
						"Run",
						"Server Manager",
						"System Configuration",
						"Task Manager",
						"Create Virtual Machine",
						"System Information",
						"Connection Manager",
						"TCP View",
						"Driver Bug Test Program",
						"Virtual Machine Map",
						"VMware Workstation 16 Pro",
						"Virtual Network Editor",
						"VMware Workstation 16 Player",
						"VirtualBox" ); archiveBox.setTranslateX(210); archiveBox.setTranslateY(Y-32);
	FileInputStream textEditorsBackgroundInputStream;
	textEditorsBackgroundInputStream = new FileInputStream("bin\\backgroundImage\\linksBackground.png");
		  Image textEditorsBackground = new Image(textEditorsBackgroundInputStream);
		  ImageView textEditorsBackgroundView = new ImageView(textEditorsBackground);
		  textEditorsBackgroundView.setTranslateY(6); textEditorsBackgroundView.setTranslateX(6);
		  LinksAnchorPane.getChildren().addAll(textEditorsBackgroundView, linkLabel, linkBox, 
		  algonquinLabel, algonquinBox, conversionLabel, conversionBox, adobeLabel, adobeBox, 
		  controlLabel, controlBox, imageLabel, imageBox, managementLabel, managementBox, enter, 
		  archiveLabel, archiveBox ); EventHandler<ActionEvent> actionEvent = new EventHandler<ActionEvent>(){ @Override public void handle(ActionEvent e){
			  
						if ( linkBox.getValue() != null || linkBox.getValue() != "None" ) {
							if (  linkBox.getValue() == "GitHub" ) { 
								File linkLocation = new File("bin\\autoHotKeys\\GitHub.ahk");
								Desktop linktarget = Desktop.getDesktop();
								try { linktarget.open(linkLocation); } catch (IOException ek1) { ek1.printStackTrace(); } };
								
							if (  linkBox.getValue() == "Unit Converter" ) { 
								File linkLocation = new File("bin\\autoHotKeys\\Unit Converter.ahk");
								Desktop linktarget = Desktop.getDesktop();
								try { linktarget.open(linkLocation); } catch (IOException ek2) { ek2.printStackTrace(); } };
							
							if (  linkBox.getValue() == "Wolframe Alpha" ) { 
								File linkLocation = new File("bin\\autoHotKeys\\Wolframe Alpha.ahk");
								Desktop linktarget = Desktop.getDesktop();
								try { linktarget.open(linkLocation); } catch (IOException ek3) { ek3.printStackTrace(); } };
							
							if (  linkBox.getValue() == "RedKetchup" ) { 
								File linkLocation = new File("bin\\autoHotKeys\\redketchup.ahk");
								Desktop linktarget = Desktop.getDesktop();
								try { linktarget.open(linkLocation); } catch (IOException ek4) { ek4.printStackTrace(); } };
							
							if (  linkBox.getValue() == "Font Guru" ) { 
								File linkLocation = new File("bin\\autoHotKeys\\Font Guru.ahk");
								Desktop linktarget = Desktop.getDesktop();
								try { linktarget.open(linkLocation); } catch (IOException ek5) { ek5.printStackTrace(); } };
							
							if (  linkBox.getValue() == "Discord" ) { 
								File linkLocation = new File("C:\\Users\\Table\\AppData\\Local\\Discord\\app-1.0.9006\\Discord.exe");
								Desktop linktarget = Desktop.getDesktop();
								try { linktarget.open(linkLocation); } catch (IOException ek6) { ek6.printStackTrace(); } };
							
	} // The end of the linkBox <ActionEvent> if statement,
						
						if ( algonquinBox.getValue() != null || algonquinBox.getValue() != "None") {
							
							if (  algonquinBox.getValue() == "Communications" ) { 
								File algonquinLocation = new File("bin\\autoHotKeys\\Communications.ahk");
								Desktop algonquintarget = Desktop.getDesktop();
								try { algonquintarget.open(algonquinLocation); } catch (IOException ea1) { ea1.printStackTrace(); } };
							
							if (  algonquinBox.getValue() == "Welcome Center" ) { 
								File algonquinLocation = new File("bin\\autoHotKeys\\Welcome Center.ahk");
								Desktop algonquintarget = Desktop.getDesktop();
								try { algonquintarget.open(algonquinLocation); } catch (IOException ea2) { ea2.printStackTrace(); } };

							if (  algonquinBox.getValue() == "HomePage" ) { 
								File algonquinLocation = new File("bin\\autoHotKeys\\HomePage.ahk");
								Desktop algonquintarget = Desktop.getDesktop();
								try { algonquintarget.open(algonquinLocation); } catch (IOException ea3) { ea3.printStackTrace(); } };
								
							if (  algonquinBox.getValue() == "Mathematics" ) { 
								File algonquinLocation = new File("bin\\autoHotKeys\\Mathematics.ahk");
								Desktop algonquintarget = Desktop.getDesktop();
								try { algonquintarget.open(algonquinLocation); } catch (IOException ea3) { ea3.printStackTrace(); } };
								
							if (  algonquinBox.getValue() == "Achieving Success" ) { 
								File algonquinLocation = new File("bin\\autoHotKeys\\Achieving Success.ahk");
								Desktop algonquintarget = Desktop.getDesktop();
								try { algonquintarget.open(algonquinLocation); } catch (IOException ea4) { ea4.printStackTrace(); } };
								
							if (  algonquinBox.getValue() == "ACSIS" ) { 
								File algonquinLocation = new File("bin\\autoHotKeys\\ACSIS.ahk");
								Desktop algonquintarget = Desktop.getDesktop();
								try { algonquintarget.open(algonquinLocation); } catch (IOException ea5) { ea5.printStackTrace(); } };
								
							if (  algonquinBox.getValue() == "EventBrite" ) { 
								File algonquinLocation = new File("bin\\autoHotKeys\\EventBrite.ahk");
								Desktop algonquintarget = Desktop.getDesktop();
								try { algonquintarget.open(algonquinLocation); } catch (IOException ea6) { ea6.printStackTrace(); } };
								
							if (  algonquinBox.getValue() == "Library" ) { 
								File algonquinLocation = new File("bin\\autoHotKeys\\Library.ahk");
								Desktop algonquintarget = Desktop.getDesktop();
								try { algonquintarget.open(algonquinLocation); } catch (IOException ea7) { ea7.printStackTrace(); } };
							
	} // The end of the algonquinBox <ActionEvent> if statement,					
						
						if ( conversionBox.getValue() != null || conversionBox.getValue() != "None" ) {
							
							if (  conversionBox.getValue() == "4k SlideShow Maker" ) { 
								File conversionLocation = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\4K Converters\\4K Slideshow Maker.lnk");
								Desktop conversiontarget = Desktop.getDesktop();
								try { conversiontarget.open(conversionLocation); } catch (IOException ev1) { ev1.printStackTrace(); } };
								
							if (  conversionBox.getValue() == "4k Stogram" ) { 
								File conversionLocation = new File("C:\\Program Files\\4KDownload\\4kstogram\\4kstogram.exe");
								Desktop conversiontarget = Desktop.getDesktop();
								try { conversiontarget.open(conversionLocation); } catch (IOException ev2) { ev2.printStackTrace(); } };
								
							if (  conversionBox.getValue() == "4k Tokkit" ) { 
								File conversionLocation = new File("C:\\Program Files\\4KDownload\\4ktokkit\\4ktokkit.exe");
								
								Desktop conversiontarget = Desktop.getDesktop();
								try { conversiontarget.open(conversionLocation); } catch (IOException ev3) { ev3.printStackTrace(); } };
								
							if (  conversionBox.getValue() == "4k Video Downloader" ) { 
								File conversionLocation = new File("C:\\Program Files\\4KDownload\\4kvideodownloader\\4kvideodownloader.exe");
								Desktop conversiontarget = Desktop.getDesktop();
								try { conversiontarget.open(conversionLocation); } catch (IOException ev4) { ev4.printStackTrace(); } };
								
							if (  conversionBox.getValue() == "4k Video to MP3 Converter" ) { 
								File conversionLocation = new File("C:\\Program Files\\4KDownload\\4kvideotomp3\\4kvideotomp3.exe");
								Desktop conversiontarget = Desktop.getDesktop();
								try { conversiontarget.open(conversionLocation); } catch (IOException ev5) { ev5.printStackTrace(); } };
								
							if (  conversionBox.getValue() == "4k Youtube to MP3 Converter" ) { 
								File conversionLocation = new File("C:\\Program Files\\4KDownload\\4kyoutubetomp3\\4kyoutubetomp3.exe");
								Desktop conversiontarget = Desktop.getDesktop();
								try { conversiontarget.open(conversionLocation); } catch (IOException ev6) { ev6.printStackTrace(); } };
								
							if (  conversionBox.getValue() == "Convertio" ) { 
								File conversionLocation = new File("bin\\autoHotKeys\\Convertio.ahk");
								Desktop conversiontarget = Desktop.getDesktop();
								try { conversiontarget.open(conversionLocation); } catch (IOException ev7) { ev7.printStackTrace(); } };
								
							if (  conversionBox.getValue() == "I Love PDFs" ) { 
								File conversionLocation = new File("bin\\autoHotKeys\\I Love PDFs.ahk");
								Desktop conversiontarget = Desktop.getDesktop();
								try { conversiontarget.open(conversionLocation); } catch (IOException ev8) { ev8.printStackTrace(); } };

	} // The end of the conversionBox <ActionEvent> if statement,
						
						if ( adobeBox.getValue() != null || conversionBox.getValue() != "None" ) {
							
							if (  adobeBox.getValue() == "Experience League Community" ) {
								File adobeLocation = new File("bin\\autoHotKeys\\Experience League Community.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo1) { eo1.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Lightroom" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Lightroom.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo2) { eo2.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Media Encoder" ) { 
								File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Media Encoder (Beta)\\Adobe Media Encoder (Beta).exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo3) { eo3.printStackTrace(); } };

							if (  adobeBox.getValue() == "Behance" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Behance.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo4) { eo4.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Character Animator" ) { 
								File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Character Animator (Beta)\\Support Files\\Character Animator (Beta).exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo5) { eo5.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Creative Cloud Express" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Creative Cloud Express.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo6) { eo6.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Creative Cloud" ) { 
								File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Creative Cloud\\ACC\\Creative Cloud.exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo7) { eo7.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Tutorials" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Tutorials.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo8) { eo8.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Acrobat" ) { 
								File adobeLocation = new File("C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo9) { eo9.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Color" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Color.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo10) { eo10.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Aero" ) { 
								File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Aero 2022 (Beta)\\Aero.exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo12) { eo12.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Bridge" ) {
								File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Bridge 2022\\Bridge.exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo13) { eo13.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Fonts" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Fonts.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo14) { eo14.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Frame.io" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Frame io.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo15) { eo15.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Fresco" ) { 
								File adobeLocation = new File("C:\\Program Files\\WindowsApps\\Adobe.Fresco_3.9.0.1053_x64__pc75e8sa7ep4e\\Fresco.exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo16) { eo16.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Mixamo" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Mixamo.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo17) { eo17.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "PhotoShop Express" ) { 
								File adobeLocation = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Adobe\\Adobe Photoshop Express.lnk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo18) { eo18.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "PhotoShop" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\PhotoShop.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo19) { eo19.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Portfolio" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Portfolio.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo20) { eo20.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Premiere Rush" ) { 
								File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Premiere Rush 2.0\\Adobe Premiere Rush.exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo21) { eo21.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Stock" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Stock.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo22) { eo22.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Substance 3D Community Assets" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Substance 3D Community Assets.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo23) { eo23.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "Substance 3D Assets" ) { 
								File adobeLocation = new File("bin\\autoHotKeys\\Substance 3D Assets.ahk");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo24) { eo24.printStackTrace(); } };
							
							if (  adobeBox.getValue() == "UXB Developer Tools" ) { 
								File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe UXP Developer Tool\\Adobe UXP Developer Tool.exe");
								Desktop adobetarget = Desktop.getDesktop();
								try { adobetarget.open(adobeLocation); } catch (IOException eo25) { eo25.printStackTrace(); } };
						
	} // The end of the adobeBox <ActionEvent> if statement,
					
						if ( managementBox.getValue() != null || managementBox.getValue() != "None" ) {
							
							if (  managementBox.getValue() == "Authentication Manager" ) { 
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\azman.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em1) { em1.printStackTrace(); } };

							if (  managementBox.getValue() == "Certificates This PC" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\certlm.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em2) { em2.printStackTrace(); } };
								
							if (  managementBox.getValue() == "Certificates Current User" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\certmgr.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em3) { em3.printStackTrace(); } };

							if (  managementBox.getValue() == "Failover Cluster Manager" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\FailoverClusters.SnapInHelper.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em4) { em4.printStackTrace(); } };
								
							if (  managementBox.getValue() == "Component Services" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\comexp.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em5) { em5.printStackTrace(); } };
					
							if (  managementBox.getValue() == "Computer Management" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\compmgmt.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em6) { em6.printStackTrace(); } };
				
							if (  managementBox.getValue() == "Device Manager" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\devmgmt.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em7) { em7.printStackTrace(); } };	
									
							if (  managementBox.getValue() == "Dev Mode Runas" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\DevModeRunAsUserConfig.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em8) { em8.printStackTrace(); } };
							
							if (  managementBox.getValue() == "DFS Management" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\dfsmgmt.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em9) { em9.printStackTrace(); } };

							if (  managementBox.getValue() == "Disk Management" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\diskmgmt.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em10) { em10.printStackTrace(); } };

							if (  managementBox.getValue() == "Event Viewer" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\eventvwr.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em11) { em11.printStackTrace(); } };
									
							if (  managementBox.getValue() == "Shared Folders" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\fsmgmt.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em12) { em12.printStackTrace(); } };

							if (  managementBox.getValue() == "File Server Resource Manager" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\fsrm.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em13) { em13.printStackTrace(); } };
		
							if (  managementBox.getValue() == "Group Policy Editor" ) {
								File managementLocation = new File("C:\\Windows\\System32\\gpedit.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em14) { em14.printStackTrace(); } };
						
							if (  managementBox.getValue() == "Local Users and Groups" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\lusrmgr.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em15) { em15.printStackTrace(); } };
					
							if (  managementBox.getValue() == "Performance Monitor" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\perfmon.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em16) { em16.printStackTrace(); } };	
									
							if (  managementBox.getValue() == "Printer Management" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\printmanagement.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em17) { em17.printStackTrace(); } };
								
							if (  managementBox.getValue() == "Resultant Set of Policy" ) {
								File managementLocation = new File("C:\\Windows\\System32\\rsop.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em18) { em18.printStackTrace(); } };	
		
							if (  managementBox.getValue() == "Security Policy" ) {
								File managementLocation = new File("C:\\Windows\\System32\\secpol.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em19) { em19.printStackTrace(); } };	
										
							if (  managementBox.getValue() == "Services" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\services.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em20) { em20.printStackTrace(); } };
									
							if (  managementBox.getValue() == "Task Scheduler" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\taskschd.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em21) { em21.printStackTrace(); } };

							if (  managementBox.getValue() == "Trusted Platform Module" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\tpm.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em22) { em22.printStackTrace(); } };
									
							if (  managementBox.getValue() == "Hyper-V Manager" ) {
								File managementLocation = new File("C:\\Windows\\System32\\virtmgmt.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em23) { em23.printStackTrace(); } };	
									
							if (  managementBox.getValue() == "Defender Firewall Advanced Security" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\WF.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em24) { em24.printStackTrace(); } };	
											
							if (  managementBox.getValue() == "Management Console" ) {
								File managementLocation = new File("C:\\Windows\\System32\\en-US\\WmiMgmt.msc");
								Desktop managementtarget = Desktop.getDesktop();
								try { managementtarget.open(managementLocation); } catch (IOException em25) { em25.printStackTrace(); } }; 
							
	} // The end of the managementBox <ActionEvent> if statement.
						
						if ( imageBox.getValue() != null || imageBox.getValue() != "None" ) {

							if (  imageBox.getValue() == "Background Remover" ) {
								File imageLocaton = new File("bin\\autoHotKeys\\backgroundremover.ahk");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei1) { ei1.printStackTrace(); } };
								
							if (  imageBox.getValue() == "RedKetchup" ) {
								File imageLocaton = new File("bin\\autoHotKeys\\redketchup.ahk");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei2) { ei2.printStackTrace(); } };	

							if (  imageBox.getValue() == "Gimp" ) {
								File imageLocaton = new File("C:\\Program Files\\GIMP 2\\bin\\gimp-2.10.exe");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei2) { ei2.printStackTrace(); } };	

							if (  imageBox.getValue() == "Paint" ) {
								File imageLocaton = new File("C:\\Windows\\system32\\mspaint.exe");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei3) { ei3.printStackTrace(); } };	

							if (  imageBox.getValue() == "PixMiller" ) {
								File imageLocaton = new File("bin\\autoHotKeys\\pixmiller.ahk");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei4) { ei4.printStackTrace(); } };	

							if (  imageBox.getValue() == "Snip & Sketch" ) {
								File imageLocaton = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Accessories\\Snip & Sketch.lnk");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei5) { ei5.printStackTrace(); } };	

							if (  imageBox.getValue() == "Snipping Tool" ) {
								File imageLocaton = new File("C:\\Windows\\system32\\SnippingTool.exe");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei6) { ei6.printStackTrace(); } };	

							if (  imageBox.getValue() == "White Remover" ) {
								File imageLocaton = new File("bin\\autoHotKeys\\whiteremover.ahk");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei7) { ei7.printStackTrace(); } };	

							if (  imageBox.getValue() == "3D Paint" ) {
								File imageLocaton = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Accessories\\Paint 3D.lnk");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei8) { ei8.printStackTrace(); } };	

							if (  imageBox.getValue() == "LazyPaint" ) {
								File imageLocaton = new File("C:\\Users\\Table\\AppData\\Local\\PortableApps\\LazPaintPortable\\LazPaintPortable.exe");
								Desktop imagetarget = Desktop.getDesktop();
								try { imagetarget.open(imageLocaton); } catch (IOException ei9) { ei9.printStackTrace(); } };	
														
	} // The end of the imageBox <ActionEvent> if statement.			
						
						if ( controlBox.getValue() != null || controlBox.getValue() != "None" ) {	
							
							if (  controlBox.getValue() == "Programs and Features" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Programs and Features.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec1) { ec1.printStackTrace(); } };
							
							if (  controlBox.getValue() == "Display Settings" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Display Settings.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec2) { ec2.printStackTrace(); } };
														
							if (  controlBox.getValue() == "Windows Defender" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Windows Defender.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec3) { ec3.printStackTrace(); } };
								
							if (  controlBox.getValue() == "Flash Player Settings" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Flash Player Settings.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec4) { ec4.printStackTrace(); } };

							if (  controlBox.getValue() == "Device Manager" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Device Manager.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec5) { ec5.printStackTrace(); } };

							if (  controlBox.getValue() == "Internet Properties" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Internet Properties.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec6) { ec6.printStackTrace(); } };
															
							if (  controlBox.getValue() == "Game Controllers" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Game Controllers.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec7) { ec7.printStackTrace(); } };
									
							if (  controlBox.getValue() == "Region" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Region.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec8) { ec8.printStackTrace(); } };
															
							if (  controlBox.getValue() == "Mouse Properties" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Mouse Properties.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec9) { ec9.printStackTrace(); } };
								
							if (  controlBox.getValue() == "Mail Setup" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Mail Setup.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec10) { ec10.printStackTrace(); } };
															
							if (  controlBox.getValue() == "Speech Properties" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Speech Properties.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec11) { ec11.printStackTrace(); } };
									
							if (  controlBox.getValue() == "System Properties" ) {
								File controlLocation = new File("bin\\autoHotKeys\\System Properties.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec11) { ec11.printStackTrace(); } };

							if (  controlBox.getValue() == "Location Information" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Location Information.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec12) { ec12.printStackTrace(); } };
														
							if (  controlBox.getValue() == "Date and Time" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Date and Time.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec13) { ec13.printStackTrace(); } };
																
							if (  controlBox.getValue() == "Security & Maintenance" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Security & Maintenance.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec14) { ec14.printStackTrace(); } };
										
							if (  controlBox.getValue() == "Remote Access" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Remote Access.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec15) { ec15.printStackTrace(); } };
								
							if (  controlBox.getValue() == "Windows Features" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Windows Features.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec16) { ec16.printStackTrace(); } };
											
							if (  controlBox.getValue() == "Mobility Settings" ) {
								File controlLocation = new File("bin\\autoHotKeys\\Mobility Settings.ahk");
								Desktop controltarget = Desktop.getDesktop();
								try { controltarget.open(controlLocation); } catch (IOException ec17) { ec17.printStackTrace(); } };
							
	} // The end of the controlBox <ActionEvent> if statement.
						
						if ( archiveBox.getValue() != null || archiveBox.getValue() != "None" ) {
							
							if (  archiveBox.getValue() == "Hot Symbol" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Hot Symbol.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea1) { ea1.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Icon Archive" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Icon Archive.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea2) { ea2.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Icon 8" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Icon 8.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea3) { ea3.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Deviant Art" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Deviant Art.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea4) { ea4.printStackTrace(); } };

							if (  archiveBox.getValue() == "Discord ST" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Discord ST.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea5) { ea5.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Filmora" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Filmora.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea6) { ea6.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Giffy" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Giffy.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea7) { ea7.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Tenor" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Tenor.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea8) { ea8.printStackTrace(); } };

							if (  archiveBox.getValue() == "Veed io" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Veed io.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea9) { ea9.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Computer Solutions" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Computer Solutions.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea10) { ea10.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Submarine Cable Map" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Submarine Cable Map.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea11) { ea11.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Unix Linux Tutorial" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Unix Linux Tutorial.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea12) { ea12.printStackTrace(); } };
		
							if (  archiveBox.getValue() == "Vim Adventures" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Vim Adventures.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea13) { ea13.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "GNU Systems" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\GNU Systems.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea14) { ea14.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Linux Journey" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Linux Journey.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea15) { ea15.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Linux Info Project" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Linux Info Project.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea16) { ea16.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Learning Linux" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Learning Linux.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea17) { ea17.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Bash Guide" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Bash Guide.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea18) { ea18.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Linux" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Linux.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea20) { ea20.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Windows Help" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Windows Help.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea21) { ea21.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Certifications" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Certifications.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea22) { ea22.printStackTrace(); } };
								
							if (  archiveBox.getValue() == "Device Manager" ) {
								File archiveLocation = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\God Mode\\Device Manager.lnk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea23) { ea23.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Command Line Reference" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Command Line Reference.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea24) { ea24.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "How to Geek" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\How to Geek.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea25) { ea25.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "File Info" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\File Info.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea26) { ea26.printStackTrace(); } };

							if (  archiveBox.getValue() == "Bat 2 Exe" ) {
								File archiveLocation = new File("C:\\Program Files (x86)\\Advanced BAT to EXE Converter v4.23\\ab2econv423\\aB2Econv.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea27) { ea27.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "AutoHotkey Documentation" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\AutoHotkey Documentation.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea28) { ea28.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Password Generator" ) {
								File archiveLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Master Menu\\Editor Menu\\Password-Generator.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea29) { ea29.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "AccessEnum" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\AccessEnum.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea30) { ea30.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "ADExplorer" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\ADExplorer.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea31) { ea31.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "ADInsight" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\ADInsight.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea32) { ea32.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "AutoRuns" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\AutoRuns.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea33) { ea33.printStackTrace(); } };
		
							if (  archiveBox.getValue() == "Cache Set" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Cache Set.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea34) { ea34.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Background Info" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Background Info.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea35) { ea35.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Ram Map" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Ram Map.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea36) { ea36.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Process Explorer" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Process Explorer.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea37) { ea37.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Debug View" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Debug View.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea38) { ea38.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Virtual Desktops" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Virtual Desktops.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea39) { ea39.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Control Panel" ) {
								File archiveLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\System Tools\\Control Panel.lnk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea40) { ea40.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Diskview" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Diskview.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea41) { ea41.printStackTrace(); } };

							if (  archiveBox.getValue() == "CPU Stress" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\CPU Stress.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea42) { ea42.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Process Monitor" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Process Monitor.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea43) { ea43.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Windows File Recovery" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Windows File Recovery.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea44) { ea44.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Disk Monitor" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Disk Monitor.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea45) { ea45.printStackTrace(); } };

							if (  archiveBox.getValue() == "Windows Objects" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Windows Objects.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea46) { ea46.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "File Explorer" ) {
								File archiveLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\System Tools\\File Explorer.lnk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea47) { ea47.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Defragment & Optimize" ) {
								File archiveLocation = new File("C:\\windows\\system32\\dfrgui.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea48) { ea48.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Accessory Center" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Accessory Center.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea49) { ea49.printStackTrace(); } };
								
							if (  archiveBox.getValue() == "Memory Diagnostics" ) {
								File archiveLocation = new File("C:\\windows\\system32\\MdSched.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea50) { ea50.printStackTrace(); } };

							if (  archiveBox.getValue() == "AutoLogon" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\AutoLogon.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea51) { ea51.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Azure Services" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Azure Services.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea52) { ea52.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "ODBC Data Sources" ) {
								File archiveLocation = new File("C:\\windows\\system32\\odbcad32.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea53) { ea53.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "RecoveryDrive" ) {
								File archiveLocation = new File("C:\\windows\\system32\\RecoveryDrive.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea54) { ea54.printStackTrace(); } };

							if (  archiveBox.getValue() == "Run" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Run.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea55) { ea55.printStackTrace(); } };
									
							if (  archiveBox.getValue() == "Registry Editor" ) {
								File archiveLocation = new File("C:\\windows\\regedit.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea56) { ea56.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Server Manager" ) {
								File archiveLocation = new File("C:\\Windows\\System32\\ServerManager.exe");
								Desktop archivetarget = Desktop.getDesktop(); 
								try { archivetarget.open(archiveLocation); } catch (IOException ea57) { ea57.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "System Configuration" ) {
								File archiveLocation = new File("C:\\windows\\system32\\msconfig.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea58) { ea58.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Task Manager" ) {
								File archiveLocation = new File("C:\\windows\\system32\\taskmgr.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea59) { ea59.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Create Virtual Machine" ) {
								File archiveLocation = new File("C:\\Program File\\Hyper-V\\VMCreate.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea60) { ea60.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "System Information" ) {
								File archiveLocation = new File("C:\\windows\\system32\\msinfo32.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea61) { ea61.printStackTrace(); } };
							
							if (  archiveBox.getValue() == "Connection Manager" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Connection Manage.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea62) { ea62.printStackTrace(); } };
								
							if (  archiveBox.getValue() == "TCP View" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\TCP View.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea63) { ea63.printStackTrace(); } };
								
							if (  archiveBox.getValue() == "Driver Bug Test Program" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Driver Bug Test Program.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea64) { ea64.printStackTrace(); } };
								
							if (  archiveBox.getValue() == "Create Virtual Machine" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Create Virtual Machine.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea65) { ea65.printStackTrace(); } };
								
							if (  archiveBox.getValue() == "Virtual Machine Map" ) {
								File archiveLocation = new File("bin\\autoHotKeys\\Virtual Machine Map.ahk");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea66) { ea66.printStackTrace(); } };
								
							if (  archiveBox.getValue() == "VMware Workstation 16 Pro" ) {
								File archiveLocation = new File("C:\\Program Files (x86)\\VMware\\VMware Workstation\\vmware.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea67) { ea67.printStackTrace(); } };
								
							if (  archiveBox.getValue() == "Virtual Network Editor" ) {
								File archiveLocation = new File("C:\\Program Files (x86)\\VMware\\VMware Workstation\\vmnetcfg.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea68) { ea68.printStackTrace(); } };
														
							if (  archiveBox.getValue() == "VMware Workstation 16 Player" ) {
								File archiveLocation = new File("C:\\Program Files (x86)\\VMware\\VMware Workstation\\vmplayer.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea69) { ea69.printStackTrace(); } };
									
							if (  archiveBox.getValue() == "VirtualBox" ) {
								File archiveLocation = new File("C:\\Program Files\\Oracle\\VirtualBox\\VirtualBox.exe");
								Desktop archivetarget = Desktop.getDesktop();
								try { archivetarget.open(archiveLocation); } catch (IOException ea70) { ea70.printStackTrace(); } };
				
	} /* The end of the archiveBox <ActionEvent> if statement. */ } }; enter.setOnAction(actionEvent); LinksTab.setContent(LinksAnchorPane); } }	

public class TextEditorsTabClass extends Main { Tab textEditorTab;
		public TextEditorsTabClass(Tab textEditorTab) { this.textEditorTab = textEditorTab; }
	public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane textEditorAnchorPane = new AnchorPane(new Rectangle(700,550, Color.rgb(174, 204, 156)));	
	DropShadow shadow = new DropShadow();
	shadow.setColor(Color.GREENYELLOW);
	shadow.setBlurType(BlurType.THREE_PASS_BOX);
	shadow.setSpread(0.5);

				FileInputStream notepadfile = new FileInputStream("bin\\buttonIcon\\notepadButton.png");
			    Image notepadicon = new Image(notepadfile);
				Button notePad = new Button(" NotePad ", new ImageView(notepadicon)); notePad.setTranslateX(X); notePad.setTranslateY(Y+=25); notePad.setFont(new Font("Arial Rounded MT Bold", 24)); 
					notePad.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: lightskyblue"); 
					notePad.setMinWidth(300); 
					notePad.setMaxWidth(300);
					notePad.setEffect(shadow);
					notePad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\NotePad.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream notepadppfile = new FileInputStream("bin\\buttonIcon\\notepadppButton.png");
		    Image notepadppicon = new Image(notepadppfile);
				Button notePadPlusPlus = new Button(" NotePad++ ", new ImageView(notepadppicon)); notePadPlusPlus.setTranslateX(X); notePadPlusPlus.setTranslateY(Y+=70); notePadPlusPlus.setFont(new Font("Arial Rounded MT Bold", 24));
					notePadPlusPlus.setStyle("-fx-border-color: lime; -fx-text-fill: lime; -fx-border-width: 4px;	-fx-background-color: MediumSeaGreen"); 
					notePadPlusPlus.setMinWidth(300); 
					notePadPlusPlus.setMaxWidth(300);
					notePadPlusPlus.setEffect(shadow);
					notePadPlusPlus.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\NotePad++.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream wordpadfile = new FileInputStream("bin\\buttonIcon\\wordpadButton.png");
		    Image wordpadicon = new Image(wordpadfile);
				Button wordPad = new Button(" WordPad ", new ImageView(wordpadicon)); wordPad.setTranslateX(X); wordPad.setTranslateY(Y+=70); wordPad.setFont(new Font("Arial Rounded MT Bold", 24));
					wordPad.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
					wordPad.setMinWidth(300); 
					wordPad.setMaxWidth(300);
					wordPad.setEffect(shadow);
					wordPad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\WordPad.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream notepad2file = new FileInputStream("bin\\buttonIcon\\notepad2Button.png");
			Image notepad2icon = new Image(notepad2file);
				Button notePad2 = new Button(" NotePad 2 ", new ImageView(notepad2icon)); notePad2.setTranslateX(X); notePad2.setTranslateY(Y+=70); notePad2.setFont(new Font("Arial Rounded MT Bold", 24));
					notePad2.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: indigo"); 
					notePad2.setMinWidth(300); 
					notePad2.setMaxWidth(300);
					notePad2.setEffect(shadow);
					notePad2.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\NotePad 2.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream notepad2modfile = new FileInputStream("bin\\buttonIcon\\notepad2modButton.png");
			Image notepad2modicon = new Image(notepad2modfile);
				Button notePad2Mod = new Button(" NotePad 2 Mod ", new ImageView(notepad2modicon)); notePad2Mod.setTranslateX(X); notePad2Mod.setTranslateY(Y+=70); notePad2Mod.setFont(new Font("Arial Rounded MT Bold", 24));
					notePad2Mod.setStyle("-fx-border-color: lightsteelblue; -fx-text-fill: lightsteelblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
					notePad2Mod.setMinWidth(300);
					notePad2Mod.setMaxWidth(300);
					notePad2Mod.setEffect(shadow);
					notePad2Mod.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\NotePad 2 Mod.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream sublimetextfile = new FileInputStream("bin\\buttonIcon\\sublimeButton.png");
			Image sublimetexticon = new Image(sublimetextfile);
				Button sublimeText = new Button(" Sublime Text ", new ImageView(sublimetexticon)); sublimeText.setTranslateX(X); sublimeText.setTranslateY(Y+=70); sublimeText.setFont(new Font("Arial Rounded MT Bold", 24));
					sublimeText.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
					sublimeText.setMinWidth(300); 
					sublimeText.setMaxWidth(300);
					sublimeText.setEffect(shadow);
					sublimeText.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Sublime Text.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream stickynotesfile = new FileInputStream("bin\\buttonIcon\\stickyButton.png");
			Image stickynotesicon = new Image(stickynotesfile);
				Button stickyNotes = new Button(" Sticky Notes ", new ImageView(stickynotesicon)); stickyNotes.setTranslateX(X); stickyNotes.setTranslateY(Y+=70); stickyNotes.setFont(new Font("Arial Rounded MT Bold", 24));
					stickyNotes.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: goldenrod"); 
					stickyNotes.setMinWidth(300); 
					stickyNotes.setMaxWidth(300);
					stickyNotes.setEffect(shadow);
					stickyNotes.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Sticky Notes.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream scitefile = new FileInputStream("bin\\buttonIcon\\sciteButton.png");
			Image sciteicon = new Image(scitefile);
		 Y = 0; Button scite = new Button(" SciTe ", new ImageView(sciteicon)); scite.setTranslateX(X+=340); scite.setTranslateY(Y+=25); scite.setFont(new Font("Arial Rounded MT Bold", 24));
			   		scite.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
			   		scite.setMinWidth(300); 
					scite.setMaxWidth(300);
					scite.setEffect(shadow);
					scite.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Scite.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream cherrytreefile = new FileInputStream("bin\\buttonIcon\\cherrytreeButton.png");
			Image cherrytreeicon = new Image(cherrytreefile);
			    Button cherryTree = new Button(" Cherry Tree ", new ImageView(cherrytreeicon)); cherryTree.setTranslateX(X); cherryTree.setTranslateY(Y+=70); cherryTree.setFont(new Font("Arial Rounded MT Bold", 24));
					cherryTree.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
					cherryTree.setMinWidth(300); 
					cherryTree.setMaxWidth(300);
					cherryTree.setEffect(shadow);
					cherryTree.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Cherry Tree.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream ankelpadfile = new FileInputStream("bin\\buttonIcon\\ankelpadButton.png");
			Image ankelpadicon = new Image(ankelpadfile);
				Button ankelPad = new Button(" AnkelPad ", new ImageView(ankelpadicon)); ankelPad.setTranslateX(X); ankelPad.setTranslateY(Y+=70); ankelPad.setFont(new Font("Arial Rounded MT Bold", 24));
					ankelPad.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: seagreen"); 
					ankelPad.setMinWidth(300); 
					ankelPad.setMaxWidth(300);
					ankelPad.setEffect(shadow);
					ankelPad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\AnkelPad.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream hotKeypadfile = new FileInputStream("bin\\buttonIcon\\hotkeypadButton.png");
			Image hotKeypadicon = new Image(hotKeypadfile);
				Button hotKeyPad = new Button(" HotKeyPad ", new ImageView(hotKeypadicon)); hotKeyPad.setTranslateX(X); hotKeyPad.setTranslateY(Y+=70); hotKeyPad.setFont(new Font("Arial Rounded MT Bold", 24));
					hotKeyPad.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: darkkhaki"); 
					hotKeyPad.setMinWidth(300); 
					hotKeyPad.setMaxWidth(300);
					hotKeyPad.setEffect(shadow);
					hotKeyPad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Master Menu\\Editor Menu\\Text_Editor.exe");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
		    FileInputStream blacknotepadfile = new FileInputStream("bin\\buttonIcon\\blacknotepadButton.png");
			Image blacknotepadicon = new Image(blacknotepadfile);
				Button blackNotePad = new Button(" Black Notepad ", new ImageView(blacknotepadicon)); blackNotePad.setTranslateX(X); blackNotePad.setTranslateY(Y+=70); blackNotePad.setFont(new Font("Arial Rounded MT Bold", 24));
					blackNotePad.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
					blackNotePad.setMinWidth(300); 
					blackNotePad.setMaxWidth(300);
					blackNotePad.setEffect(shadow);
					blackNotePad.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Black NotePad.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream powershellisefile = new FileInputStream("bin\\buttonIcon\\powershelliseButton.png");
			Image powershelliseicon = new Image(powershellisefile);
				Button powerShellISE = new Button(" PowerShell ISE ", new ImageView(powershelliseicon)); powerShellISE.setTranslateX(X); powerShellISE.setTranslateY(Y+=70); powerShellISE.setFont(new Font("Arial Rounded MT Bold", 24));
					powerShellISE.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: mediumblue"); 
					powerShellISE.setMinWidth(300); 
					powerShellISE.setMaxWidth(300);
					powerShellISE.setEffect(shadow);
					powerShellISE.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\powerShell ISE.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream gvimfile = new FileInputStream("bin\\buttonIcon\\vimButton.png");
			Image gvimicon = new Image(gvimfile);
				Button gVim = new Button(" gVim ", new ImageView(gvimicon)); gVim.setTranslateX(X); gVim.setTranslateY(Y+=70); gVim.setFont(new Font("Arial Rounded MT Bold", 24));
					gVim.setStyle("-fx-border-color: Chartreuse; -fx-text-fill: Chartreuse; -fx-border-width: 4px; -fx-background-color: darkgreen"); 
					gVim.setMinWidth(300); 
					gVim.setMaxWidth(300);
					gVim.setEffect(shadow);
					gVim.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\gVim.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

					  FileInputStream textEditorsBackgroundInputStream = new FileInputStream("bin\\backgroundImage\\notepadBackground.png");
					  Image textEditorsBackground = new Image(textEditorsBackgroundInputStream);
					  ImageView textEditorsBackgroundView = new ImageView(textEditorsBackground);
					  textEditorsBackgroundView.setTranslateY(6); textEditorsBackgroundView.setTranslateX(6); 
					  textEditorAnchorPane.getChildren().addAll( textEditorsBackgroundView, notePad, notePadPlusPlus,
					  wordPad, notePad2, notePad2Mod, sublimeText, stickyNotes, scite, cherryTree, ankelPad, hotKeyPad,
					  blackNotePad, powerShellISE, gVim ); textEditorTab.setContent(textEditorAnchorPane); } }	

	 
	 
	 
public class SearchEngineClass { Tab SearchEngineTab;
	public SearchEngineClass(Tab SearchEngineTab) { this.SearchEngineTab = SearchEngineTab; }
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane SearchEngineAnchorPane = new AnchorPane(new Rectangle(700,550, Color.rgb(0, 0, 0)));	
DropShadow shadow = new DropShadow();
shadow.setColor(Color.DODGERBLUE);
shadow.setBlurType(BlurType.THREE_PASS_BOX);
shadow.setSpread(0.5);

		FileInputStream firefoxfile = new FileInputStream("bin\\buttonIcon\\firefoxButton.png");
		Image firefoxlogo = new Image(firefoxfile);
			Button fireFox = new Button(" FireFox ", new ImageView(firefoxlogo)); fireFox.setTranslateX(X); fireFox.setTranslateY(Y+=25); fireFox.setFont(new Font("Arial Rounded MT Bold", 24)); 
				fireFox.setStyle("-fx-border-color: gold; -fx-text-fill: gold; -fx-border-width: 4px;	-fx-background-color: orangered"); 
				fireFox.setMinWidth(300); 
				fireFox.setMaxWidth(300);
				fireFox.setEffect(shadow);
				fireFox.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\FireFox.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream edgefile = new FileInputStream("bin\\buttonIcon\\edgeButton.png");
		Image edgelogo = new Image(edgefile);
			Button microsoftEdge = new Button(" Microsoft Edge ", new ImageView(edgelogo)); microsoftEdge.setTranslateX(X); microsoftEdge.setTranslateY(Y+=70); microsoftEdge.setFont(new Font("Arial Rounded MT Bold", 24));
				microsoftEdge.setStyle("-fx-border-color: lime; -fx-text-fill: lime; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
				microsoftEdge.setMinWidth(300); 
				microsoftEdge.setMaxWidth(300);
				microsoftEdge.setEffect(shadow);
				microsoftEdge.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Microsoft Edge.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream chromefile = new FileInputStream("bin\\buttonIcon\\chromeButton.png");
		Image chromelogo = new Image(chromefile);
			Button googleChrome = new Button(" Google Chrome ", new ImageView(chromelogo)); googleChrome.setTranslateX(X); googleChrome.setTranslateY(Y+=70); googleChrome.setFont(new Font("Arial Rounded MT Bold", 24));
				googleChrome.setStyle("-fx-border-color: mediumseagreen; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: crimson"); 
				googleChrome.setMinWidth(300); 
				googleChrome.setMaxWidth(300);
				googleChrome.setEffect(shadow);
				googleChrome.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Google Chrome.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream explorerfile = new FileInputStream("bin\\buttonIcon\\explorerButton.png");
		Image explorerlogo = new Image(explorerfile);
			Button internetExplorer = new Button(" Internet Explorer ", new ImageView(explorerlogo)); internetExplorer.setTranslateX(X); internetExplorer.setTranslateY(Y+=70); internetExplorer.setFont(new Font("Arial Rounded MT Bold", 24));
				internetExplorer.setStyle("-fx-border-color: skyblue; -fx-text-fill: skyblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				internetExplorer.setMinWidth(300); 
				internetExplorer.setMaxWidth(300);
				internetExplorer.setEffect(shadow);
				internetExplorer.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Internet Explorer.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream vivaldifile = new FileInputStream("bin\\buttonIcon\\vivaldiButton.png");
	    Image vivaldilogo = new Image(vivaldifile);
			Button vivaldi = new Button(" Vivaldi ", new ImageView(vivaldilogo)); vivaldi.setTranslateX(X); vivaldi.setTranslateY(Y+=70); vivaldi.setFont(new Font("Arial Rounded MT Bold", 24));
				vivaldi.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: firebrick"); 
				vivaldi.setMinWidth(300); 
				vivaldi.setMaxWidth(300);
				vivaldi.setEffect(shadow);
				vivaldi.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Vivaldi.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream operafile = new FileInputStream("bin\\buttonIcon\\operaButton.png");
	    Image operalogo = new Image(operafile);
			Button opera = new Button(" Opera ", new ImageView(operalogo)); opera.setTranslateX(X); opera.setTranslateY(Y+=70); opera.setFont(new Font("Arial Rounded MT Bold", 24));
				opera.setStyle("-fx-border-color: pink; -fx-text-fill: pink; -fx-border-width: 4px;	-fx-background-color: purple"); 
				opera.setMinWidth(300);
				opera.setMaxWidth(300);
				opera.setEffect(shadow);
				opera.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Opera.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream yandexfile = new FileInputStream("bin\\buttonIcon\\yandexButton.png");
		Image yandexlogo = new Image(yandexfile);
			Button yandex = new Button(" Yandex ", new ImageView(yandexlogo)); yandex.setTranslateX(X); yandex.setTranslateY(Y+=70); yandex.setFont(new Font("Arial Rounded MT Bold", 24));
				yandex.setStyle("-fx-border-color: firebrick; -fx-text-fill: firebrick; -fx-border-width: 4px;	-fx-background-color: white"); 
				yandex.setMinWidth(300); 
				yandex.setMaxWidth(300);
				yandex.setEffect(shadow);
				yandex.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Yandex.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream operagxfile = new FileInputStream("bin\\buttonIcon\\operagxButton.png");
	    Image operagxlogo = new Image(operagxfile);
	 Y = 0; Button operaGX = new Button(" Opera GX ", new ImageView(operagxlogo)); operaGX.setTranslateX(X+=340); operaGX.setTranslateY(Y+=25); operaGX.setFont(new Font("Arial Rounded MT Bold", 24));
				operaGX.setStyle("-fx-border-color: red; -fx-text-fill: red; -fx-border-width: 4px;	-fx-background-color: black"); 
				operaGX.setMinWidth(300); 
				operaGX.setMaxWidth(300);
				operaGX.setEffect(shadow);
				operaGX.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Opera GX.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream maxthonfile = new FileInputStream("bin\\buttonIcon\\maxthonButton.png");
	    Image maxthonlogo = new Image(maxthonfile);
			Button maxthon = new Button(" Maxhon ", new ImageView(maxthonlogo)); maxthon.setTranslateX(X); maxthon.setTranslateY(Y+=70); maxthon.setFont(new Font("Arial Rounded MT Bold", 24));
	 			maxthon.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: blue");
	 			maxthon.setMinWidth(300); 
	 			maxthon.setMaxWidth(300);
	 			maxthon.setEffect(shadow);
	 			maxthon.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Maxthon.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
	 			
		FileInputStream torfile = new FileInputStream("bin\\buttonIcon\\torButton.png");
	    Image torlogo = new Image(torfile);
		    Button tor = new Button("  Tor ", new ImageView(torlogo)); tor.setTranslateX(X); tor.setTranslateY(Y+=70); tor.setFont(new Font("Arial Rounded MT Bold", 24));
		    	tor.setStyle("-fx-border-color: magenta; -fx-text-fill: magenta; -fx-border-width: 4px;	-fx-background-color: blueviolet"); 
		    	tor.setMinWidth(300); 
		    	tor.setMaxWidth(300);
		    	tor.setEffect(shadow);
		    	tor.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Tor.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
		    	
		FileInputStream avastfile = new FileInputStream("bin\\buttonIcon\\avastButton.png");
		Image avastlogo = new Image(avastfile);
			Button avastSecure = new Button(" Avast Secure ", new ImageView(avastlogo)); avastSecure.setTranslateX(X); avastSecure.setTranslateY(Y+=70); avastSecure.setFont(new Font("Arial Rounded MT Bold", 24));
				avastSecure.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: seagreen"); 
				avastSecure.setMinWidth(300); 
				avastSecure.setMaxWidth(300);
				avastSecure.setEffect(shadow);
				avastSecure.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Avast Secure.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream bravefile = new FileInputStream("bin\\buttonIcon\\braveButton.png");
		Image bravelogo = new Image(bravefile);
			Button brave = new Button(" Brave ", new ImageView(bravelogo)); brave.setTranslateX(X); brave.setTranslateY(Y+=70); brave.setFont(new Font("Arial Rounded MT Bold", 24));
				brave.setStyle("-fx-border-color: red; -fx-text-fill: red; -fx-border-width: 4px;	-fx-background-color: white"); 
				brave.setMinWidth(300); 
				brave.setMaxWidth(300);		
				brave.setEffect(shadow);
				brave.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Brave.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream bingfile = new FileInputStream("bin\\buttonIcon\\bingButton.png");
		Image binglogo = new Image(bingfile);
			Button bing = new Button(" Bing", new ImageView(binglogo)); bing.setTranslateX(X); bing.setTranslateY(Y+=70); bing.setFont(new Font("Arial Rounded MT Bold", 24));
				bing.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: dodgerblue"); 
				bing.setMinWidth(300); 
				bing.setMaxWidth(300);
				bing.setEffect(shadow);
				bing.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Bing.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
	
		FileInputStream duckduckgofile = new FileInputStream("bin\\buttonIcon\\duckduckgoButton.png");
		Image duckduckgologo = new Image(duckduckgofile);
			Button duckDuckGo = new Button(" Duck Duck Go", new ImageView(duckduckgologo)); duckDuckGo.setTranslateX(X); duckDuckGo.setTranslateY(Y+=70); duckDuckGo.setFont(new Font("Arial Rounded MT Bold", 24));
				duckDuckGo.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
				duckDuckGo.setMinWidth(300); 
				duckDuckGo.setMaxWidth(300);
				duckDuckGo.setEffect(shadow);
				duckDuckGo.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DuckDuckGo.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );


				  FileInputStream SearchEngineBackgroundInputStream = new FileInputStream("bin\\backgroundImage\\browserBackground.png");
				  Image SearchEngineBackground = new Image(SearchEngineBackgroundInputStream);
				  ImageView SearchEngineBackgroundView = new ImageView(SearchEngineBackground);
				  SearchEngineBackgroundView.setTranslateY(6); SearchEngineBackgroundView.setTranslateX(6); 
				  SearchEngineAnchorPane.getChildren().addAll( SearchEngineBackgroundView, avastSecure, bing,
				  brave, fireFox, googleChrome, internetExplorer, maxthon, microsoftEdge, opera, operaGX, tor, 
				  vivaldi, duckDuckGo, yandex ); SearchEngineTab.setContent(SearchEngineAnchorPane); } }
	

public class VisualStudiosTabClass extends Main { Tab VisualStudiosTab;
public VisualStudiosTabClass(Tab  VisualStudiosTab) { this.VisualStudiosTab = VisualStudiosTab; }
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane VisualStudiosAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(121, 85, 128)));
DropShadow shadow = new DropShadow();
shadow.setColor(Color.MEDIUMPURPLE);
shadow.setBlurType(BlurType.THREE_PASS_BOX);
shadow.setSpread(0.5);

	FileInputStream cmdfile = new FileInputStream("bin\\buttonIcon\\cmdButton.png");
	Image cmdicon = new Image(cmdfile);
		Button commandPrompt = new Button(" Cmd Prompt ", new ImageView(cmdicon)); commandPrompt.setTranslateX(X); commandPrompt.setTranslateY(Y+=25); commandPrompt.setFont(new Font("Arial Rounded MT Bold", 24)); 
			commandPrompt.setStyle("-fx-border-color: pink; -fx-text-fill: pink; -fx-border-width: 4px;	-fx-background-color: black"); 
			commandPrompt.setMinWidth(300); 
			commandPrompt.setMaxWidth(300);
			commandPrompt.setEffect(shadow);
			commandPrompt.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Command Prompt.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream windowsterminalfile = new FileInputStream("bin\\buttonIcon\\terminalButton.png");
	Image windowsterminalicon = new Image(windowsterminalfile);
		Button windowsTerminal = new Button(" Terminal ", new ImageView(windowsterminalicon)); windowsTerminal.setTranslateX(X); windowsTerminal.setTranslateY(Y+=70); windowsTerminal.setFont(new Font("Arial Rounded MT Bold", 24));
			windowsTerminal.setStyle("-fx-border-color: green; -fx-text-fill: green; -fx-border-width: 4px;	-fx-background-color: black"); 
			windowsTerminal.setMinWidth(300);
			windowsTerminal.setMaxWidth(300);
			windowsTerminal.setEffect(shadow);
			windowsTerminal.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Windows Terminal.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream powershellfile = new FileInputStream("bin\\buttonIcon\\powershellButton.png");
	Image powershellicon = new Image(powershellfile);
		Button powerShell = new Button(" PowerShell ", new ImageView(powershellicon)); powerShell.setTranslateX(X); powerShell.setTranslateY(Y+=70); powerShell.setFont(new Font("Arial Rounded MT Bold", 24));
			powerShell.setStyle("-fx-border-color: pink; -fx-text-fill: pink; -fx-border-width: 4px;	-fx-background-color: purple"); 
			powerShell.setMinWidth(300); 
			powerShell.setMaxWidth(300);
			powerShell.setEffect(shadow);
			powerShell.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\PowerShell.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream powershellcorefile = new FileInputStream("bin\\buttonIcon\\powershellcoreButton.png");
	Image powershellcoreicon = new Image(powershellcorefile);
		Button powerShellCore = new Button(" PowerShell Core ", new ImageView(powershellcoreicon)); powerShellCore.setTranslateX(X); powerShellCore.setTranslateY(Y+=70); powerShellCore.setFont(new Font("Arial Rounded MT Bold", 24));
			powerShellCore.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
			powerShellCore.setMinWidth(300); 
			powerShellCore.setMaxWidth(300);
			powerShellCore.setEffect(shadow);
			powerShellCore.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\PowerShell Core.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream visualstudiosfile = new FileInputStream("bin\\buttonIcon\\vsButton.png");
	Image visualstudiosicon = new Image(visualstudiosfile);
		Button visualStudios = new Button(" Visual Studios ", new ImageView(visualstudiosicon)); visualStudios.setTranslateX(X); visualStudios.setTranslateY(Y+=70); visualStudios.setFont(new Font("Arial Rounded MT Bold", 24));
			visualStudios.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: darkviolet"); 
			visualStudios.setMinWidth(300);
			visualStudios.setMaxWidth(300);
			visualStudios.setEffect(shadow);
			visualStudios.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Visual Studios.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream visualstudiocodefile = new FileInputStream("bin\\buttonIcon\\vscodeButton.png");
	Image visualstudiocodeicon = new Image(visualstudiocodefile);
		Button visualStudioCode = new Button(" Code ", new ImageView(visualstudiocodeicon)); visualStudioCode.setTranslateX(X); visualStudioCode.setTranslateY(Y+=70); visualStudioCode.setFont(new Font("Arial Rounded MT Bold", 24));
			visualStudioCode.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
			visualStudioCode.setMinWidth(300); 
			visualStudioCode.setMaxWidth(300);
			visualStudioCode.setEffect(shadow);
			visualStudioCode.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Visual Studio Code.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream pythonfile = new FileInputStream("bin\\buttonIcon\\pythonButton.png");
	Image pythonicon = new Image(pythonfile);
		Button python = new Button(" Python ", new ImageView(pythonicon)); python.setTranslateX(X); python.setTranslateY(Y+=70); python.setFont(new Font("Arial Rounded MT Bold", 24));
			python.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: blue"); 
			python.setMinWidth(300); 
			python.setMaxWidth(300);
			python.setEffect(shadow);
			python.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Python.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream nodejsfile = new FileInputStream("bin\\buttonIcon\\nodejsButton.png");
	Image nodejsicon = new Image(nodejsfile);
Y = 0; 	Button nodeJS = new Button(" Node.js ", new ImageView(nodejsicon)); nodeJS.setTranslateX(X+=340); nodeJS.setTranslateY(Y+=25); nodeJS.setFont(new Font("Arial Rounded MT Bold", 24));
			nodeJS.setStyle("-fx-border-color: lime; -fx-text-fill: lime; -fx-border-width: 4px;	-fx-background-color: green"); 
			nodeJS.setMinWidth(300); 
			nodeJS.setMaxWidth(300);
			nodeJS.setEffect(shadow);
			nodeJS.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Node.js.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream blendfile = new FileInputStream("bin\\buttonIcon\\blendButton.png");
	Image blendicon = new Image(blendfile);
		Button blend = new Button(" Blend ", new ImageView(blendicon)); blend.setTranslateX(X); blend.setTranslateY(Y+=70); blend.setFont(new Font("Arial Rounded MT Bold", 24));
			blend.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
			blend.setMinWidth(300); 
			blend.setMaxWidth(300);
			blend.setEffect(shadow);
			blend.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Blend for Visual Studio 2022.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream unityhubfile = new FileInputStream("bin\\buttonIcon\\unityButton.png");
	Image unityhubicon = new Image(unityhubfile);
		Button unityHub = new Button(" Unity Hub ", new ImageView(unityhubicon)); unityHub.setTranslateX(X); unityHub.setTranslateY(Y+=70); unityHub.setFont(new Font("Arial Rounded MT Bold", 24));
			unityHub.setStyle("-fx-border-color: black; -fx-text-fill: black; -fx-border-width: 4px;	-fx-background-color: white"); 
			unityHub.setMinWidth(300); 
			unityHub.setMaxWidth(300);
			unityHub.setEffect(shadow);
			unityHub.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Unity Hub.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream cocosfile = new FileInputStream("bin\\buttonIcon\\cocosButton.png");
	Image cocosicon = new Image(cocosfile);
		Button cocos = new Button(" Cocos ", new ImageView(cocosicon)); cocos.setTranslateX(X); cocos.setTranslateY(Y+=70); cocos.setFont(new Font("Arial Rounded MT Bold", 24));
			cocos.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: gray"); 
			cocos.setMinWidth(300); 
			cocos.setMaxWidth(300);
			cocos.setEffect(shadow);
			cocos.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Cocos.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream epicgameslauncherfile = new FileInputStream("bin\\buttonIcon\\epicgameslauncherButton.png");
	Image epicgameslaunchericon = new Image(epicgameslauncherfile);
		Button epicGamesLauncher = new Button(" Epic Games ", new ImageView(epicgameslaunchericon)); epicGamesLauncher.setTranslateX(X); epicGamesLauncher.setTranslateY(Y+=70); epicGamesLauncher.setFont(new Font("Arial Rounded MT Bold", 24));
			epicGamesLauncher.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: brown"); 
			epicGamesLauncher.setMinWidth(300); 
			epicGamesLauncher.setMaxWidth(300);
			epicGamesLauncher.setEffect(shadow);
			epicGamesLauncher.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\EpicGamesLauncher.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream idlefile = new FileInputStream("bin\\buttonIcon\\idleButton.png");
	Image idleicon = new Image(idlefile);
		Button IDLE = new Button(" IDLE ", new ImageView(idleicon)); IDLE.setTranslateX(X); IDLE.setTranslateY(Y+=70); IDLE.setFont(new Font("Arial Rounded MT Bold", 24));
			IDLE.setStyle("-fx-border-color: blue; -fx-text-fill: blue; -fx-border-width: 4px;	-fx-background-color: yellow"); 
			IDLE.setMinWidth(300);
			IDLE.setMaxWidth(300);
			IDLE.setEffect(shadow);
			IDLE.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\IDLE.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream bashfile = new FileInputStream("bin\\buttonIcon\\bashButton.png");
	Image bashicon = new Image(bashfile);
		Button bash = new Button(" Bash Shell ", new ImageView(bashicon)); bash.setTranslateX(X); bash.setTranslateY(Y+=70); bash.setFont(new Font("Arial Rounded MT Bold", 24));
			bash.setStyle("-fx-border-color: gold; -fx-text-fill: gold; -fx-border-width: 4px;	-fx-background-color: black"); 
			bash.setMinWidth(300); 
			bash.setMaxWidth(300);
			bash.setEffect(shadow);
			bash.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Git Bash.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	  FileInputStream VisualStudiosBackgroundInputStream = new FileInputStream("bin\\backgroundImage\\vsBackground.png");
	  Image VisualStudiosBackground = new Image(VisualStudiosBackgroundInputStream);
	  ImageView VisualStudiosBackgroundView = new ImageView(VisualStudiosBackground);
	  VisualStudiosBackgroundView.setTranslateY(6); VisualStudiosBackgroundView.setTranslateX(6); 
	  VisualStudiosAnchorPane.getChildren().addAll( VisualStudiosBackgroundView, bash, blend, cocos, 
	  commandPrompt, epicGamesLauncher, IDLE, nodeJS, powerShell, powerShellCore, python, unityHub, 
	  visualStudios, visualStudioCode, windowsTerminal); VisualStudiosTab.setContent(VisualStudiosAnchorPane); } }	

public class EclipseTabClass extends Main { Tab eclipseTab;
public EclipseTabClass(Tab eclipseTab) { this.eclipseTab = eclipseTab; } 
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane eclipseAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(127, 112, 99)));
DropShadow shadow = new DropShadow();
shadow.setColor(Color.GOLD);
shadow.setBlurType(BlurType.THREE_PASS_BOX);
shadow.setSpread(0.7);
	FileInputStream eclipsecppfile = new FileInputStream("bin\\buttonIcon\\eclipsecppButton.png");
	Image eclipsecppicon = new Image(eclipsecppfile);
		Button eclipseCandCPP = new Button(" C/C++ ", new ImageView(eclipsecppicon)); eclipseCandCPP.setTranslateX(X); eclipseCandCPP.setTranslateY(Y+=25); eclipseCandCPP.setFont(new Font("Arial Rounded MT Bold", 24)); 
			eclipseCandCPP.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
			eclipseCandCPP.setMinWidth(300); 
			eclipseCandCPP.setMaxWidth(300);
			eclipseCandCPP.setEffect(shadow);
			eclipseCandCPP.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for C and C++ Developers.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
		Button eclipseCandCPPEmbbedded = new Button(" Embedded C/C++ ", new ImageView(eclipsecppicon)); eclipseCandCPPEmbbedded.setTranslateX(X); eclipseCandCPPEmbbedded.setTranslateY(Y+=100); eclipseCandCPPEmbbedded.setFont(new Font("Arial Rounded MT Bold", 24));
			eclipseCandCPPEmbbedded.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
			eclipseCandCPPEmbbedded.setMinWidth(300); 
			eclipseCandCPPEmbbedded.setMaxWidth(300);
			eclipseCandCPPEmbbedded.setEffect(shadow);
			eclipseCandCPPEmbbedded.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for Embedded C and C++ Developers.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream eclipsecppscientificcomputingfile = new FileInputStream("bin\\buttonIcon\\eclipsescienceButton.png");
	Image eclipsecppscientificcomputingicon = new Image(eclipsecppscientificcomputingfile);
		Button eclipseScientificComputing = new Button(" Scientific ", new ImageView(eclipsecppscientificcomputingicon)); eclipseScientificComputing.setTranslateX(X); eclipseScientificComputing.setTranslateY(Y+=100); eclipseScientificComputing.setFont(new Font("Arial Rounded MT Bold", 24));
			eclipseScientificComputing.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
			eclipseScientificComputing.setMinWidth(300); 
			eclipseScientificComputing.setMaxWidth(300);
			eclipseScientificComputing.setEffect(shadow);
			eclipseScientificComputing.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for Scientific Computing.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream eclipsemodelfile = new FileInputStream("bin\\buttonIcon\\eclipsemodelButton.png");
	Image eclipsemodelicon = new Image(eclipsemodelfile);
		Button eclipseModel = new Button(" Modeling Tools ", new ImageView(eclipsemodelicon)); eclipseModel.setTranslateX(X); eclipseModel.setTranslateY(Y+=100); eclipseModel.setFont(new Font("Arial Rounded MT Bold", 24));
			eclipseModel.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
			eclipseModel.setMinWidth(300); 
			eclipseModel.setMaxWidth(300);
			eclipseModel.setEffect(shadow);
			eclipseModel.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse Modeling Tools.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream eclipsephpfile = new FileInputStream("bin\\buttonIcon\\eclipsephpButton.png");
	Image eclipsephpicon = new Image(eclipsephpfile);				
		Button eclipsePHP = new Button(" PHP ", new ImageView(eclipsephpicon)); eclipsePHP.setTranslateX(X); eclipsePHP.setTranslateY(Y+=100); eclipsePHP.setFont(new Font("Arial Rounded MT Bold", 24));
			eclipsePHP.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
			eclipsePHP.setMinWidth(300); 
			eclipsePHP.setMaxWidth(300);
			eclipsePHP.setEffect(shadow);
			eclipsePHP.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for PHP Developers.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
FileInputStream eclipsefile = new FileInputStream("bin\\buttonIcon\\eclipseButton.png");
Image eclipseicon = new Image(eclipsefile);	
 Y = 0;	Button eclipseRCPansRAP = new Button(" RCP & RAP ", new ImageView(eclipseicon)); eclipseRCPansRAP.setTranslateX(X+=340); eclipseRCPansRAP.setTranslateY(Y+=25); eclipseRCPansRAP.setFont(new Font("Arial Rounded MT Bold", 24));
			eclipseRCPansRAP.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
			eclipseRCPansRAP.setMinWidth(300); 
			eclipseRCPansRAP.setMaxWidth(300);
			eclipseRCPansRAP.setEffect(shadow);
			eclipseRCPansRAP.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for RCP and RAP Developers.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
		Button eclipseJAVAandDSL = new Button(" Java & DSL ", new ImageView(eclipseicon)); eclipseJAVAandDSL.setTranslateX(X); eclipseJAVAandDSL.setTranslateY(Y+=100); eclipseJAVAandDSL.setFont(new Font("Arial Rounded MT Bold", 24));
 			eclipseJAVAandDSL.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
 			eclipseJAVAandDSL.setMinWidth(300); 
 			eclipseJAVAandDSL.setMaxWidth(300);
 			eclipseJAVAandDSL.setEffect(shadow);
 			eclipseJAVAandDSL.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for Java and DSL Developers.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
 			
		Button eclipseJAVA = new Button(" Java ", new ImageView(eclipseicon)); eclipseJAVA.setTranslateX(X); eclipseJAVA.setTranslateY(Y+=100); eclipseJAVA.setFont(new Font("Arial Rounded MT Bold", 24));
			eclipseJAVA.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px; -fx-background-color: navy");
			eclipseJAVA.setMinWidth(300); 
			eclipseJAVA.setMaxWidth(300);
			eclipseJAVA.setEffect(shadow);
			eclipseJAVA.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for Java Developers.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream eclipsewebfile = new FileInputStream("bin\\buttonIcon\\eclipsewebButton.png");
	Image eclipsewebicon = new Image(eclipsewebfile);	
	    Button eclipseJAVAandWEB = new Button(" Java and Web ", new ImageView(eclipsewebicon)); eclipseJAVAandWEB.setTranslateX(X); eclipseJAVAandWEB.setTranslateY(Y+=100); eclipseJAVAandWEB.setFont(new Font("Arial Rounded MT Bold", 24));
	    	eclipseJAVAandWEB.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
	    	eclipseJAVAandWEB.setMinWidth(300); 
	    	eclipseJAVAandWEB.setMaxWidth(300);
	    	eclipseJAVAandWEB.setEffect(shadow);
	    	eclipseJAVAandWEB.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for Enterprise Java and Web Developers.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
	  
		Button eclipseScout = new Button(" Scout ", new ImageView(eclipseicon)); eclipseScout.setTranslateX(X); eclipseScout.setTranslateY(Y+=100); eclipseScout.setFont(new Font("Arial Rounded MT Bold", 24));
			eclipseScout.setStyle("-fx-border-color: darkorange; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: navy"); 
			eclipseScout.setMinWidth(300); 
			eclipseScout.setMaxWidth(300);
			eclipseScout.setEffect(shadow);
			eclipseScout.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Eclipse IDE for Scout Developers.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream eclipseBackgroundInputStream = new FileInputStream("bin\\backgroundImage\\eclipseBackground.png");
	Image eclipseBackground = new Image(eclipseBackgroundInputStream);
	ImageView eclipseBackgroundView = new ImageView(eclipseBackground);
	eclipseBackgroundView.setTranslateY(6); eclipseBackgroundView.setTranslateX(6); 
	eclipseAnchorPane.getChildren().addAll( eclipseBackgroundView, eclipseCandCPP, eclipseCandCPPEmbbedded,
	eclipseScientificComputing, eclipseJAVA, eclipseModel, eclipsePHP, eclipseRCPansRAP, eclipseJAVAandWEB, 
	eclipseScout, eclipseJAVAandDSL ); eclipseTab.setContent(eclipseAnchorPane); } }	

public class JetBrainsTabClass extends Main { Tab JetBrainsTab;
public JetBrainsTabClass(Tab JetBrainsTab) { this.JetBrainsTab = JetBrainsTab; }
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane JetBrainsAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(201, 95, 134)));
DropShadow shadow = new DropShadow();
shadow.setColor(Color.LIGHTCYAN);
shadow.setBlurType(BlurType.THREE_PASS_BOX);
shadow.setSpread(0.5);	

	FileInputStream clionfile = new FileInputStream("bin\\buttonIcon\\clionButton.png");
    Image clionicon = new Image(clionfile);
    	Button cLion = new Button(" CLion ", new ImageView(clionicon)); cLion.setTranslateX(X); cLion.setTranslateY(Y+=25); cLion.setFont(new Font("Arial Rounded MT Bold", 24)); 
			cLion.setStyle("-fx-border-color: lawngreen; -fx-text-fill: lawngreen; -fx-border-width: 4px;	-fx-background-color: black"); 
			cLion.setMinWidth(300); 
			cLion.setMaxWidth(300);
			cLion.setEffect(shadow);
			cLion.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\cLion.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream ideafile = new FileInputStream("bin\\buttonIcon\\ideaButton.png");
	Image ideaicon = new Image(ideafile);
		Button intelliJIDEA = new Button(" intelliJIDEA ", new ImageView(ideaicon)); intelliJIDEA.setTranslateX(X); intelliJIDEA.setTranslateY(Y+=70); intelliJIDEA.setFont(new Font("Arial Rounded MT Bold", 24));
			intelliJIDEA.setStyle("-fx-border-color: mediumvioletred; -fx-text-fill: mediumvioletred; -fx-border-width: 4px;	-fx-background-color: black"); 
			intelliJIDEA.setMinWidth(300);
			intelliJIDEA.setMaxWidth(300);
			intelliJIDEA.setEffect(shadow);
			intelliJIDEA.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\IntelliJIDEA.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream riderfile = new FileInputStream("bin\\buttonIcon\\riderButton.png");
	Image ridericon = new Image(riderfile);				
		Button rider = new Button(" Rider ", new ImageView(ridericon)); rider.setTranslateX(X); rider.setTranslateY(Y+=70); rider.setFont(new Font("Arial Rounded MT Bold", 24));
			rider.setStyle("-fx-border-color: gold; -fx-text-fill: gold; -fx-border-width: 4px;	-fx-background-color: black"); 
			rider.setMinWidth(300); 
			rider.setMaxWidth(300);
			rider.setEffect(shadow);
			rider.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Rider.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream rubyfile = new FileInputStream("bin\\buttonIcon\\rubymineButton.png");
	Image rubyicon = new Image(rubyfile);			
		Button rubyMine = new Button(" RubyMine ", new ImageView(rubyicon)); rubyMine.setTranslateX(X); rubyMine.setTranslateY(Y+=70); rubyMine.setFont(new Font("Arial Rounded MT Bold", 24));
			rubyMine.setStyle("-fx-border-color: crimson; -fx-text-fill: crimson; -fx-border-width: 4px;	-fx-background-color: black"); 
			rubyMine.setMinWidth(300); 
			rubyMine.setMaxWidth(300);
			rubyMine.setEffect(shadow);
			rubyMine.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\RubyMine.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream gripfile = new FileInputStream("bin\\buttonIcon\\datagripButton.png");
	Image gripicon = new Image(gripfile);	
		Button dataGrip = new Button(" DataGrip ", new ImageView(gripicon)); dataGrip.setTranslateX(X); dataGrip.setTranslateY(Y+=70); dataGrip.setFont(new Font("Arial Rounded MT Bold", 24));
			dataGrip.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: black"); 
			dataGrip.setMinWidth(300);
			dataGrip.setMaxWidth(300);
			dataGrip.setEffect(shadow);
			dataGrip.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DataGrip.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream spellfile = new FileInputStream("bin\\buttonIcon\\dataspellButton.png");
	Image spellicon = new Image(spellfile);	
		Button dataSpell = new Button(" DataSpell ", new ImageView(spellicon)); dataSpell.setTranslateX(X); dataSpell.setTranslateY(Y+=70); dataSpell.setFont(new Font("Arial Rounded MT Bold", 24));
			dataSpell.setStyle("-fx-border-color: lightseagreen; -fx-text-fill: lightseagreen; -fx-border-width: 4px;	-fx-background-color: black"); 
			dataSpell.setMinWidth(300); 
			dataSpell.setMaxWidth(300);
			dataSpell.setEffect(shadow);
			dataSpell.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DataSpell.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream gofile = new FileInputStream("bin\\buttonIcon\\golandButton.png");
	Image gologo = new Image(gofile);	
		Button goLand = new Button(" GoLand ", new ImageView(gologo)); goLand.setTranslateX(X); goLand.setTranslateY(Y+=70); goLand.setFont(new Font("Arial Rounded MT Bold", 24));
			goLand.setStyle("-fx-border-color: blue; -fx-text-fill: blue; -fx-border-width: 4px;	-fx-background-color: black"); 
			goLand.setMinWidth(300); 
			goLand.setMaxWidth(300);
			goLand.setEffect(shadow);
			goLand.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\GoLand.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

	FileInputStream coverfile = new FileInputStream("bin\\buttonIcon\\dotcoverButton.png");
	Image coverlogo = new Image(coverfile);	
	 Y = 0; Button dotCover = new Button(" DotCover ", new ImageView(coverlogo)); dotCover.setTranslateX(X+=340); dotCover.setTranslateY(Y+=25); dotCover.setFont(new Font("Arial Rounded MT Bold", 24));
				dotCover.setStyle("-fx-border-color: orange; -fx-text-fill: orange; -fx-border-width: 4px; -fx-background-color: black");
				dotCover.setMinWidth(300); 
				dotCover.setMaxWidth(300);
				dotCover.setEffect(shadow);
				dotCover.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DotCover.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream memoryfile = new FileInputStream("bin\\buttonIcon\\dotmemoryButton.png");
		Image memoryicon = new Image(memoryfile);	
			Button dotMemory = new Button(" DotMemory ", new ImageView(memoryicon)); dotMemory.setTranslateX(X); dotMemory.setTranslateY(Y+=70); dotMemory.setFont(new Font("Arial Rounded MT Bold", 24));
    		dotMemory.setStyle("-fx-border-color: blueviolet; -fx-text-fill: blueviolet; -fx-border-width: 4px;	-fx-background-color: black"); 
    		dotMemory.setMinWidth(300); 
    		dotMemory.setMaxWidth(300);
    		dotMemory.setEffect(shadow);
    		dotMemory.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DotMemory.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
    		
    FileInputStream peekfile = new FileInputStream("bin\\buttonIcon\\dotpeekButton.png");
    Image peekicon = new Image(peekfile);	
    	Button dotPeek = new Button(" Dot Peek ", new ImageView(peekicon)); dotPeek.setTranslateX(X); dotPeek.setTranslateY(Y+=70); dotPeek.setFont(new Font("Arial Rounded MT Bold", 24));
			dotPeek.setStyle("-fx-border-color: deepskyblue; -fx-text-fill: deepskyblue; -fx-border-width: 4px;	-fx-background-color: black"); 
			dotPeek.setMinWidth(300); 
			dotPeek.setMaxWidth(300);
			dotPeek.setEffect(shadow);
			dotPeek.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DotPeek.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream tracefile = new FileInputStream("bin\\buttonIcon\\dottraceButton.png");
	Image traceicon = new Image(tracefile);	
		Button dotTrace = new Button(" DotTrace ", new ImageView(traceicon)); dotTrace.setTranslateX(X); dotTrace.setTranslateY(Y+=70); dotTrace.setFont(new Font("Arial Rounded MT Bold", 24));
			dotTrace.setStyle("-fx-border-color: hotpink; -fx-text-fill: hotpink; -fx-border-width: 4px;	-fx-background-color: black"); 
			dotTrace.setMinWidth(300); 
			dotTrace.setMaxWidth(300);
			dotTrace.setEffect(shadow);
			dotTrace.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DotTrace.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream phpfile = new FileInputStream("bin\\buttonIcon\\phpstormButton.png");
	Image phpicon = new Image(phpfile);					
		Button phpStorm = new Button(" PHPStorm  ", new ImageView(phpicon)); phpStorm.setTranslateX(X); phpStorm.setTranslateY(Y+=70); phpStorm.setFont(new Font("Arial Rounded MT Bold", 24));
			phpStorm.setStyle("-fx-border-color: mediumpurple; -fx-text-fill: mediumpurple; -fx-border-width: 4px;	-fx-background-color: black"); 
			phpStorm.setMinWidth(300); 
			phpStorm.setMaxWidth(300);
			phpStorm.setEffect(shadow);
			phpStorm.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\phpStorm.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream pyfile = new FileInputStream("bin\\buttonIcon\\pycharmButton.png");
	Image pyicon = new Image(pyfile);	
		Button pycharm = new Button(" PyCharm ", new ImageView(pyicon)); pycharm.setTranslateX(X); pycharm.setTranslateY(Y+=70); pycharm.setFont(new Font("Arial Rounded MT Bold", 24));
			pycharm.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: black"); 
			pycharm.setMinWidth(300); 
			pycharm.setMaxWidth(300);
			pycharm.setEffect(shadow);
			pycharm.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\PyCharm.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
			
	FileInputStream webfile = new FileInputStream("bin\\buttonIcon\\webstormButton.png");
	Image webicon = new Image(webfile);	
		Button webStorm = new Button(" WebStorm ", new ImageView(webicon)); webStorm.setTranslateX(X); webStorm.setTranslateY(Y+=70); webStorm.setFont(new Font("Arial Rounded MT Bold", 24));
			webStorm.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px; -fx-background-color: black"); 
			webStorm.setMinWidth(300); 
			webStorm.setMaxWidth(300);
			webStorm.setEffect(shadow);
			webStorm.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
				public void handle(ActionEvent arg0) {
					File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\WebStorm.lnk");
					Desktop target = Desktop.getDesktop();
					try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream  JetBrainsBackgroundInputStream = new FileInputStream("bin\\backgroundImage\\jetbrainBackground.png");
		Image  JetBrainsBackground = new Image( JetBrainsBackgroundInputStream);
		ImageView JetBrainsBackgroundView = new ImageView(JetBrainsBackground);
		JetBrainsBackgroundView.setTranslateY(6);  JetBrainsBackgroundView.setTranslateX(6); 
		JetBrainsAnchorPane.getChildren().addAll( JetBrainsBackgroundView, cLion, intelliJIDEA, rider, rubyMine,
		dataGrip, dataSpell, goLand, dotCover, dotMemory, dotPeek, dotTrace, phpStorm, pycharm, webStorm );
		JetBrainsTab.setContent(JetBrainsAnchorPane); } }	


public class Office365TabClass extends Main { Tab officeTab;
public Office365TabClass(Tab officeTab) { this.officeTab = officeTab; } 
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane officeAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(215, 83, 65)));
DropShadow shadow = new DropShadow();
shadow.setColor(Color.ORANGERED);
shadow.setBlurType(BlurType.THREE_PASS_BOX);
shadow.setSpread(0.5);

		FileInputStream wordfile = new FileInputStream("bin\\buttonIcon\\wordButton.png");
	    Image wordicon = new Image(wordfile);
	    	Button word = new Button(" Microsoft Word ", new ImageView(wordicon)); word.setTranslateX(X); word.setTranslateY(Y+=25); word.setFont(new Font("Arial Rounded MT Bold", 24)); 
	    		word.setStyle("-fx-border-color: dodgerblue; -fx-text-fill: dodgerblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				word.setMinWidth(300); 
				word.setMaxWidth(300);
				word.setEffect(shadow);
				word.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Word.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				

		FileInputStream powerpointfile = new FileInputStream("bin\\buttonIcon\\powerpointButton.png");
		Image powerpointicon = new Image(powerpointfile);
			Button powerPoint = new Button(" PowerPoint ", new ImageView(powerpointicon)); powerPoint.setTranslateX(X); powerPoint.setTranslateY(Y+=70); powerPoint.setFont(new Font("Arial Rounded MT Bold", 24));
				powerPoint.setStyle("-fx-border-color: gold; -fx-text-fill: gold; -fx-border-width: 4px;	-fx-background-color: orangered"); 
				powerPoint.setMinWidth(300); 
				powerPoint.setMaxWidth(300);
				powerPoint.setEffect(shadow);
				powerPoint.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\PowerPoint.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream accessfile = new FileInputStream("bin\\buttonIcon\\accessButton.png");
	    Image accessicon = new Image(accessfile);
			Button access = new Button(" Access ", new ImageView(accessicon)); access.setTranslateX(X); access.setTranslateY(Y+=70); access.setFont(new Font("Arial Rounded MT Bold", 24));
				access.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
				access.setMinWidth(300); 
				access.setMaxWidth(300);
				access.setEffect(shadow);
				access.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Access.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream excelfile = new FileInputStream("bin\\buttonIcon\\excelButton.png");
	    Image excelicon = new Image(excelfile);
			Button excel = new Button(" Excel ", new ImageView(excelicon)); excel.setTranslateX(X); excel.setTranslateY(Y+=70); excel.setFont(new Font("Arial Rounded MT Bold", 24));
				excel.setStyle("-fx-border-color: greenyellow; -fx-text-fill: greenyellow; -fx-border-width: 4px;	-fx-background-color: darkgreen"); 
				excel.setMinWidth(300); 
				excel.setMaxWidth(300);
				excel.setEffect(shadow);
				excel.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Excel.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream onenotefile = new FileInputStream("bin\\buttonIcon\\onenoteButton.png");
	    Image onenoteicon = new Image(onenotefile);
			Button oneNote = new Button(" OneNote ", new ImageView(onenoteicon)); oneNote.setTranslateX(X); oneNote.setTranslateY(Y+=70); oneNote.setFont(new Font("Arial Rounded MT Bold", 24));
				oneNote.setStyle("-fx-border-color: fuchsia; -fx-text-fill: fuchsia; -fx-border-width: 4px;	-fx-background-color: purple"); 
				oneNote.setMinWidth(300); 
				oneNote.setMaxWidth(300);
				oneNote.setEffect(shadow);
				oneNote.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\OneNote.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream publisherfile = new FileInputStream("bin\\buttonIcon\\publisherButton.png");
	    Image publishericon = new Image(publisherfile);
			Button publisher = new Button(" Publisher ", new ImageView(publishericon)); publisher.setTranslateX(X); publisher.setTranslateY(Y+=70); publisher.setFont(new Font("Arial Rounded MT Bold", 24));
				publisher.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
				publisher.setMinWidth(300); 
				publisher.setMaxWidth(300);
				publisher.setEffect(shadow);
				publisher.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Publisher.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream outlookfile = new FileInputStream("bin\\buttonIcon\\outlookButton.png");
	    Image outlookicon = new Image(outlookfile);
			Button outlook = new Button(" Outlook ", new ImageView(outlookicon)); outlook.setTranslateX(X); outlook.setTranslateY(Y+=70); outlook.setFont(new Font("Arial Rounded MT Bold", 24));
				outlook.setStyle("-fx-border-color: lavender; -fx-text-fill: lavender; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
				outlook.setMinWidth(300); 
				outlook.setMaxWidth(300);
				outlook.setEffect(shadow);
				outlook.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Outlook.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream teamsfile = new FileInputStream("bin\\buttonIcon\\teamsButton.png");
	    Image teamsicon = new Image(teamsfile);
   	 Y = 0; Button teams = new Button(" Microsoft Teams ", new ImageView(teamsicon)); teams.setTranslateX(X+=340); teams.setTranslateY(Y+=25); teams.setFont(new Font("Arial Rounded MT Bold", 24));
   	 			teams.setStyle("-fx-border-color: thistle; -fx-text-fill: thistle; -fx-border-width: 4px; -fx-background-color: blueviolet");
   	 			teams.setMinWidth(300); 
   	 			teams.setMaxWidth(300);
   	 			teams.setEffect(shadow);
   	 			teams.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Teams.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
   	 			
  		FileInputStream infopathfile = new FileInputStream("bin\\buttonIcon\\infopathButton.png");
 		Image infopathicon = new Image(infopathfile);
 			Button infoPath = new Button(" InfoPath ", new ImageView(infopathicon)); infoPath.setTranslateX(X); infoPath.setTranslateY(Y+=70); infoPath.setFont(new Font("Arial Rounded MT Bold", 24));
 				infoPath.setStyle("-fx-border-color: plum; -fx-text-fill: plum; -fx-border-width: 4px;	-fx-background-color: indigo"); 
	    		infoPath.setMinWidth(300); 
	    		infoPath.setMaxWidth(300);
	    		infoPath.setEffect(shadow);
	    		infoPath.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\InfoPath.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
	    		
		FileInputStream onedrivefile = new FileInputStream("bin\\buttonIcon\\onedriveButton.png");
	    Image onedriveicon = new Image(onedrivefile);
	    	Button oneDrive = new Button(" OneDrive ", new ImageView(onedriveicon)); oneDrive.setTranslateX(X); oneDrive.setTranslateY(Y+=70); oneDrive.setFont(new Font("Arial Rounded MT Bold", 24));
	    		oneDrive.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: cornflowerblue"); 
	    		oneDrive.setMinWidth(300); 
	    		oneDrive.setMaxWidth(300);
	    		oneDrive.setEffect(shadow);
	    		oneDrive.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\OneDrive.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
	    		
		FileInputStream bifile = new FileInputStream("bin\\buttonIcon\\biButton.png");
	    Image biicon = new Image(bifile);
			Button powerBI = new Button(" Power BI ", new ImageView(biicon)); powerBI.setTranslateX(X); powerBI.setTranslateY(Y+=70); powerBI.setFont(new Font("Arial Rounded MT Bold", 24));
				powerBI.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: darkkhaki"); 
				powerBI.setMinWidth(300); 
				powerBI.setMaxWidth(300);
				powerBI.setEffect(shadow);
				powerBI.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Power BI Desktop.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream swayfile = new FileInputStream("bin\\buttonIcon\\swayButton.png");
	    Image swayicon = new Image(swayfile);
			Button sway = new Button(" Sway  ", new ImageView(swayicon)); sway.setTranslateX(X); sway.setTranslateY(Y+=70); sway.setFont(new Font("Arial Rounded MT Bold", 24));
				sway.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px;	-fx-background-color: teal"); 
				sway.setMinWidth(300); 
				sway.setMaxWidth(300);
				sway.setEffect(shadow);
				sway.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Sway.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream appfile = new FileInputStream("bin\\buttonIcon\\appButton.png");
	    Image appicon = new Image(appfile);
			Button powerApps = new Button(" Power Apps ", new ImageView(appicon)); powerApps.setTranslateX(X); powerApps.setTranslateY(Y+=70); powerApps.setFont(new Font("Arial Rounded MT Bold", 24));
				powerApps.setStyle("-fx-border-color: pink; -fx-text-fill: pink; -fx-border-width: 4px;	-fx-background-color: mediumvioletred"); 
				powerApps.setMinWidth(300); 
				powerApps.setMaxWidth(300);
				powerApps.setEffect(shadow);
				powerApps.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Power Apps for Windows 8.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream automatefile = new FileInputStream("bin\\buttonIcon\\automateButton.png");
	    Image automateicon = new Image(automatefile);
			Button Automate = new Button(" Automate ", new ImageView(automateicon)); Automate.setTranslateX(X); Automate.setTranslateY(Y+=70); Automate.setFont(new Font("Arial Rounded MT Bold", 24));
				Automate.setStyle("-fx-border-color: dodgerblue; -fx-text-fill: dodgerblue; -fx-border-width: 4px; -fx-background-color: mediumblue"); 
				Automate.setMinWidth(300); 
				Automate.setMaxWidth(300);
				Automate.setEffect(shadow);
				Automate.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Automate.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

			  FileInputStream  officeBackgroundInputStream = new FileInputStream("bin\\backgroundImage\\officeBackground.png");
			  Image  officeBackground = new Image(officeBackgroundInputStream);
			  ImageView officeBackgroundView = new ImageView(officeBackground);
			  officeBackgroundView.setTranslateY(6);  officeBackgroundView.setTranslateX(6); 
			  officeAnchorPane.getChildren().addAll(officeBackgroundView, word, access, excel, 
			  sway, oneNote, Automate, powerApps, powerBI, oneDrive, infoPath, teams, publisher, 
			  powerPoint, outlook ); officeTab.setContent(officeAnchorPane); } }	
	
public class Run  {
	public static void Main(String[] args) {
		Main.main(args); }
	}	
}
	
	
	
	
	
	