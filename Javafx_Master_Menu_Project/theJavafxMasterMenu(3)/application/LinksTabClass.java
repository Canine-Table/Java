package application;
	import java.awt.Desktop;
import java.io.File;
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
	import java.io.IOException;
import javafx.collections.ObservableList;
	import javafx.event.ActionEvent;
import javafx.event.EventHandler;
	import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
	import javafx.scene.control.Tab;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
	import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
	import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
	import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
	import javafx.scene.text.Text;
public class LinksTabClass  {

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
textEditorsBackgroundInputStream = new FileInputStream("linksBackground.png");
	  Image textEditorsBackground = new Image(textEditorsBackgroundInputStream);
	  ImageView textEditorsBackgroundView = new ImageView(textEditorsBackground);
	  textEditorsBackgroundView.setTranslateY(6); textEditorsBackgroundView.setTranslateX(6);
	  LinksAnchorPane.getChildren().addAll(textEditorsBackgroundView, linkLabel, linkBox, 
	  algonquinLabel, algonquinBox, conversionLabel, conversionBox, adobeLabel, adobeBox, 
	  controlLabel, controlBox, imageLabel, imageBox, managementLabel, managementBox, enter, 
	  archiveLabel, archiveBox ); EventHandler<ActionEvent> actionEvent = new EventHandler<ActionEvent>(){ @Override public void handle(ActionEvent e){
		  
					if ( linkBox.getValue() != null || linkBox.getValue() != "None" ) {
						if (  linkBox.getValue() == "GitHub" ) { 
							File linkLocation = new File("GitHub.ahk");
							Desktop linktarget = Desktop.getDesktop();
							try { linktarget.open(linkLocation); } catch (IOException ek1) { ek1.printStackTrace(); } };
						
						if (  linkBox.getValue() == "Unit Converter" ) { 
							File linkLocation = new File("Unit Converter.ahk");
							Desktop linktarget = Desktop.getDesktop();
							try { linktarget.open(linkLocation); } catch (IOException ek2) { ek2.printStackTrace(); } };
						
						if (  linkBox.getValue() == "Wolframe Alpha" ) { 
							File linkLocation = new File("Wolframe Alpha.ahk");
							Desktop linktarget = Desktop.getDesktop();
							try { linktarget.open(linkLocation); } catch (IOException ek3) { ek3.printStackTrace(); } };
						
						if (  linkBox.getValue() == "RedKetchup" ) { 
							File linkLocation = new File(".ahk");
							Desktop linktarget = Desktop.getDesktop();
							try { linktarget.open(linkLocation); } catch (IOException ek4) { ek4.printStackTrace(); } };
						
						if (  linkBox.getValue() == "Font Guru" ) { 
							File linkLocation = new File("Font Guru.ahk");
							Desktop linktarget = Desktop.getDesktop();
							try { linktarget.open(linkLocation); } catch (IOException ek5) { ek5.printStackTrace(); } };
						
						if (  linkBox.getValue() == "Discord" ) { 
							File linkLocation = new File("C:\\Users\\Table\\AppData\\Local\\Discord\\app-1.0.9006\\Discord.exe");
							Desktop linktarget = Desktop.getDesktop();
							try { linktarget.open(linkLocation); } catch (IOException ek6) { ek6.printStackTrace(); } };
						
} // The end of the linkBox <ActionEvent> if statement,
					
					if ( algonquinBox.getValue() != null || algonquinBox.getValue() != "None") {
						
						if (  algonquinBox.getValue() == "Communications" ) { 
							File algonquinLocation = new File("Communications.ahk");
							Desktop algonquintarget = Desktop.getDesktop();
							try { algonquintarget.open(algonquinLocation); } catch (IOException ea1) { ea1.printStackTrace(); } };
						
						if (  algonquinBox.getValue() == "Welcome Center" ) { 
							File algonquinLocation = new File("Welcome Center.ahk");
							Desktop algonquintarget = Desktop.getDesktop();
							try { algonquintarget.open(algonquinLocation); } catch (IOException ea2) { ea2.printStackTrace(); } };

						if (  algonquinBox.getValue() == "HomePage" ) { 
							File algonquinLocation = new File("HomePage.ahk");
							Desktop algonquintarget = Desktop.getDesktop();
							try { algonquintarget.open(algonquinLocation); } catch (IOException ea3) { ea3.printStackTrace(); } };
							
						if (  algonquinBox.getValue() == "Mathematics" ) { 
							File algonquinLocation = new File("Mathematics.ahk");
							Desktop algonquintarget = Desktop.getDesktop();
							try { algonquintarget.open(algonquinLocation); } catch (IOException ea3) { ea3.printStackTrace(); } };
							
						if (  algonquinBox.getValue() == "Achieving Success" ) { 
							File algonquinLocation = new File("Achieving Success.ahk");
							Desktop algonquintarget = Desktop.getDesktop();
							try { algonquintarget.open(algonquinLocation); } catch (IOException ea4) { ea4.printStackTrace(); } };
							
						if (  algonquinBox.getValue() == "ACSIS" ) { 
							File algonquinLocation = new File("ACSIS.ahk");
							Desktop algonquintarget = Desktop.getDesktop();
							try { algonquintarget.open(algonquinLocation); } catch (IOException ea5) { ea5.printStackTrace(); } };
							
						if (  algonquinBox.getValue() == "EventBrite" ) { 
							File algonquinLocation = new File("EventBrite.ahk");
							Desktop algonquintarget = Desktop.getDesktop();
							try { algonquintarget.open(algonquinLocation); } catch (IOException ea6) { ea6.printStackTrace(); } };
							
						if (  algonquinBox.getValue() == "Library" ) { 
							File algonquinLocation = new File("Library.ahk");
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
							File conversionLocation = new File("Convertio.ahk");
							Desktop conversiontarget = Desktop.getDesktop();
							try { conversiontarget.open(conversionLocation); } catch (IOException ev7) { ev7.printStackTrace(); } };
							
						if (  conversionBox.getValue() == "I Love PDFs" ) { 
							File conversionLocation = new File("I Love PDFs.ahk");
							Desktop conversiontarget = Desktop.getDesktop();
							try { conversiontarget.open(conversionLocation); } catch (IOException ev8) { ev8.printStackTrace(); } };

} // The end of the conversionBox <ActionEvent> if statement,
					
					if ( adobeBox.getValue() != null || conversionBox.getValue() != "None" ) {
						
						if (  adobeBox.getValue() == "Experience League Community" ) {
							File adobeLocation = new File("Experience League Community.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo1) { eo1.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Lightroom" ) { 
							File adobeLocation = new File("Lightroom.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo2) { eo2.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Media Encoder" ) { 
							File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Media Encoder (Beta)\\Adobe Media Encoder (Beta).exe");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo3) { eo3.printStackTrace(); } };

						if (  adobeBox.getValue() == "Behance" ) { 
							File adobeLocation = new File("Behance.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo4) { eo4.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Character Animator" ) { 
							File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Character Animator (Beta)\\Support Files\\Character Animator (Beta).exe");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo5) { eo5.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Creative Cloud Express" ) { 
							File adobeLocation = new File("Creative Cloud Express.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo6) { eo6.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Creative Cloud" ) { 
							File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Creative Cloud\\ACC\\Creative Cloud.exe");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo7) { eo7.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Tutorials" ) { 
							File adobeLocation = new File("Tutorials.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo8) { eo8.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Acrobat" ) { 
							File adobeLocation = new File("C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo9) { eo9.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Color" ) { 
							File adobeLocation = new File("Color.ahk");
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
							File adobeLocation = new File("Fonts.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo14) { eo14.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Frame.io" ) { 
							File adobeLocation = new File("Frame io.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo15) { eo15.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Fresco" ) { 
							File adobeLocation = new File("C:\\Program Files\\WindowsApps\\Adobe.Fresco_3.9.0.1053_x64__pc75e8sa7ep4e\\Fresco.exe");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo16) { eo16.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Mixamo" ) { 
							File adobeLocation = new File("Mixamo.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo17) { eo17.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "PhotoShop Express" ) { 
							File adobeLocation = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Adobe\\Adobe Photoshop Express.lnk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo18) { eo18.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "PhotoShop" ) { 
							File adobeLocation = new File("PhotoShop.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo19) { eo19.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Portfolio" ) { 
							File adobeLocation = new File("Portfolio.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo20) { eo20.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Premiere Rush" ) { 
							File adobeLocation = new File("C:\\Program Files\\Adobe\\Adobe Premiere Rush 2.0\\Adobe Premiere Rush.exe");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo21) { eo21.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Stock" ) { 
							File adobeLocation = new File("Stock.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo22) { eo22.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Substance 3D Community Assets" ) { 
							File adobeLocation = new File("Substance 3D Community Assets.ahk");
							Desktop adobetarget = Desktop.getDesktop();
							try { adobetarget.open(adobeLocation); } catch (IOException eo23) { eo23.printStackTrace(); } };
						
						if (  adobeBox.getValue() == "Substance 3D Assets" ) { 
							File adobeLocation = new File("Substance 3D Assets.ahk");
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
							File imageLocaton = new File("backgroundremover.ahk");
							Desktop imagetarget = Desktop.getDesktop();
							try { imagetarget.open(imageLocaton); } catch (IOException ei1) { ei1.printStackTrace(); } };
							
						if (  imageBox.getValue() == "RedKetchup" ) {
							File imageLocaton = new File("redketchup.ahk");
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
							File imageLocaton = new File("pixmiller.ahk");
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
							File imageLocaton = new File("whiteremover.ahk");
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
							File controlLocation = new File("Programs and Features.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec1) { ec1.printStackTrace(); } };
						
						if (  controlBox.getValue() == "Display Settings" ) {
							File controlLocation = new File("Display Settings.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec2) { ec2.printStackTrace(); } };
													
						if (  controlBox.getValue() == "Windows Defender" ) {
							File controlLocation = new File("Windows Defender.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec3) { ec3.printStackTrace(); } };
							
						if (  controlBox.getValue() == "Flash Player Settings" ) {
							File controlLocation = new File("Flash Player Settings.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec4) { ec4.printStackTrace(); } };

						if (  controlBox.getValue() == "Device Manager" ) {
							File controlLocation = new File("Device Manager.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec5) { ec5.printStackTrace(); } };

						if (  controlBox.getValue() == "Internet Properties" ) {
							File controlLocation = new File("Internet Properties.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec6) { ec6.printStackTrace(); } };
														
						if (  controlBox.getValue() == "Game Controllers" ) {
							File controlLocation = new File("Game Controllers.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec7) { ec7.printStackTrace(); } };
								
						if (  controlBox.getValue() == "Region" ) {
							File controlLocation = new File("Region.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec8) { ec8.printStackTrace(); } };
														
						if (  controlBox.getValue() == "Mouse Properties" ) {
							File controlLocation = new File("Mouse Properties.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec9) { ec9.printStackTrace(); } };
							
						if (  controlBox.getValue() == "Mail Setup" ) {
							File controlLocation = new File("Mail Setup.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec10) { ec10.printStackTrace(); } };
														
						if (  controlBox.getValue() == "Speech Properties" ) {
							File controlLocation = new File("Speech Properties.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec11) { ec11.printStackTrace(); } };
								
						if (  controlBox.getValue() == "System Properties" ) {
							File controlLocation = new File("System Properties.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec11) { ec11.printStackTrace(); } };

						if (  controlBox.getValue() == "Location Information" ) {
							File controlLocation = new File("Location Information.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec12) { ec12.printStackTrace(); } };
													
						if (  controlBox.getValue() == "Date and Time" ) {
							File controlLocation = new File("Date and Time.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec13) { ec13.printStackTrace(); } };
															
						if (  controlBox.getValue() == "Security & Maintenance" ) {
							File controlLocation = new File("Security & Maintenance.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec14) { ec14.printStackTrace(); } };
									
						if (  controlBox.getValue() == "Remote Access" ) {
							File controlLocation = new File("Remote Access.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec15) { ec15.printStackTrace(); } };
							
						if (  controlBox.getValue() == "Windows Features" ) {
							File controlLocation = new File("Windows Features.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec16) { ec16.printStackTrace(); } };
										
						if (  controlBox.getValue() == "Mobility Settings" ) {
							File controlLocation = new File("Mobility Settings.ahk");
							Desktop controltarget = Desktop.getDesktop();
							try { controltarget.open(controlLocation); } catch (IOException ec17) { ec17.printStackTrace(); } };
						
} // The end of the controlBox <ActionEvent> if statement.
					
					if ( archiveBox.getValue() != null || archiveBox.getValue() != "None" ) {
						
						if (  archiveBox.getValue() == "Hot Symbol" ) {
							File archiveLocation = new File("Hot Symbol.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea1) { ea1.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Icon Archive" ) {
							File archiveLocation = new File("Icon Archive.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea2) { ea2.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Icon 8" ) {
							File archiveLocation = new File("Icon 8.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea3) { ea3.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Deviant Art" ) {
							File archiveLocation = new File("Deviant Art.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea4) { ea4.printStackTrace(); } };

						if (  archiveBox.getValue() == "Discord ST" ) {
							File archiveLocation = new File("Discord ST.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea5) { ea5.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Filmora" ) {
							File archiveLocation = new File("Filmora.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea6) { ea6.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Giffy" ) {
							File archiveLocation = new File("Giffy.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea7) { ea7.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Tenor" ) {
							File archiveLocation = new File("Tenor.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea8) { ea8.printStackTrace(); } };

						if (  archiveBox.getValue() == "Veed io" ) {
							File archiveLocation = new File("Veed io.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea9) { ea9.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Computer Solutions" ) {
							File archiveLocation = new File("Computer Solutions.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea10) { ea10.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Submarine Cable Map" ) {
							File archiveLocation = new File("Submarine Cable Map.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea11) { ea11.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Unix Linux Tutorial" ) {
							File archiveLocation = new File("Unix Linux Tutorial.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea12) { ea12.printStackTrace(); } };
	
						if (  archiveBox.getValue() == "Vim Adventures" ) {
							File archiveLocation = new File("Vim Adventures.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea13) { ea13.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "GNU Systems" ) {
							File archiveLocation = new File("GNU Systems.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea14) { ea14.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Linux Journey" ) {
							File archiveLocation = new File("Linux Journey.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea15) { ea15.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Linux Info Project" ) {
							File archiveLocation = new File("Linux Info Project.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea16) { ea16.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Learning Linux" ) {
							File archiveLocation = new File("Learning Linux.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea17) { ea17.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Bash Guide" ) {
							File archiveLocation = new File("Bash Guide.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea18) { ea18.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Linux" ) {
							File archiveLocation = new File("Linux.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea20) { ea20.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Windows Help" ) {
							File archiveLocation = new File("Windows Help.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea21) { ea21.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Certifications" ) {
							File archiveLocation = new File("Certifications.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea22) { ea22.printStackTrace(); } };
							
						if (  archiveBox.getValue() == "Device Manager" ) {
							File archiveLocation = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\God Mode\\Device Manager.lnk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea23) { ea23.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Command Line Reference" ) {
							File archiveLocation = new File("Command Line Reference.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea24) { ea24.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "How to Geek" ) {
							File archiveLocation = new File("How to Geek.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea25) { ea25.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "File Info" ) {
							File archiveLocation = new File("File Info.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea26) { ea26.printStackTrace(); } };

						if (  archiveBox.getValue() == "Bat 2 Exe" ) {
							File archiveLocation = new File("C:\\Program Files (x86)\\Advanced BAT to EXE Converter v4.23\\ab2econv423\\aB2Econv.exe");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea27) { ea27.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "AutoHotkey Documentation" ) {
							File archiveLocation = new File("AutoHotkey Documentation.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea28) { ea28.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Password Generator" ) {
							File archiveLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Master Menu\\Editor Menu\\Password-Generator.exe");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea29) { ea29.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "AccessEnum" ) {
							File archiveLocation = new File("AccessEnum.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea30) { ea30.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "ADExplorer" ) {
							File archiveLocation = new File("ADExplorer.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea31) { ea31.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "ADInsight" ) {
							File archiveLocation = new File("ADInsight.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea32) { ea32.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "AutoRuns" ) {
							File archiveLocation = new File("AutoRuns.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea33) { ea33.printStackTrace(); } };
	
						if (  archiveBox.getValue() == "Cache Set" ) {
							File archiveLocation = new File("Cache Set.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea34) { ea34.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Background Info" ) {
							File archiveLocation = new File("Background Info.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea35) { ea35.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Ram Map" ) {
							File archiveLocation = new File("");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea36) { ea36.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Process Explorer" ) {
							File archiveLocation = new File("Process Explorer.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea37) { ea37.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Debug View" ) {
							File archiveLocation = new File("Debug View.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea38) { ea38.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Virtual Desktops" ) {
							File archiveLocation = new File("Virtual Desktops.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea39) { ea39.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Control Panel" ) {
							File archiveLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\System Tools\\Control Panel.lnk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea40) { ea40.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Diskview" ) {
							File archiveLocation = new File("Diskview.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea41) { ea41.printStackTrace(); } };

						if (  archiveBox.getValue() == "CPU Stress" ) {
							File archiveLocation = new File("CPU Stress.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea42) { ea42.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Process Monitor" ) {
							File archiveLocation = new File("Process Monitor.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea43) { ea43.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Windows File Recovery" ) {
							File archiveLocation = new File("Windows File Recovery.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea44) { ea44.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Disk Monitor" ) {
							File archiveLocation = new File("Disk Monitor.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea45) { ea45.printStackTrace(); } };

						if (  archiveBox.getValue() == "Windows Objects" ) {
							File archiveLocation = new File("Windows Objects.ahk");
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
							File archiveLocation = new File("Accessory Center.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea49) { ea49.printStackTrace(); } };
							
						if (  archiveBox.getValue() == "Memory Diagnostics" ) {
							File archiveLocation = new File("C:\\windows\\system32\\MdSched.exe");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea50) { ea50.printStackTrace(); } };

						if (  archiveBox.getValue() == "AutoLogon" ) {
							File archiveLocation = new File("AutoLogon.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea51) { ea51.printStackTrace(); } };
						
						if (  archiveBox.getValue() == "Azure Services" ) {
							File archiveLocation = new File("Azure Services.ahk");
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
							File archiveLocation = new File("Run.ahk");
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
							File archiveLocation = new File("Connection Manage.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea62) { ea62.printStackTrace(); } };
							
						if (  archiveBox.getValue() == "TCP View" ) {
							File archiveLocation = new File("TCP View");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea63) { ea63.printStackTrace(); } };
							
						if (  archiveBox.getValue() == "Driver Bug Test Program" ) {
							File archiveLocation = new File("Driver Bug Test Program.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea64) { ea64.printStackTrace(); } };
							
						if (  archiveBox.getValue() == "Create Virtual Machine" ) {
							File archiveLocation = new File("Create Virtual Machine.ahk");
							Desktop archivetarget = Desktop.getDesktop();
							try { archivetarget.open(archiveLocation); } catch (IOException ea65) { ea65.printStackTrace(); } };
							
						if (  archiveBox.getValue() == "Virtual Machine Map" ) {
							File archiveLocation = new File("Virtual Machine Map.ahk");
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