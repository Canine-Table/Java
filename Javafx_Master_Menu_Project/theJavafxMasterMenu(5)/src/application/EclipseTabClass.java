package application;
	import java.awt.Desktop;
import java.io.File;
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
	import java.io.IOException;
import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
import javafx.scene.control.Button;
	import javafx.scene.control.Tab;
import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
	import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
	import javafx.scene.text.Font;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
	public class EclipseTabClass { Tab eclipseTab;
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