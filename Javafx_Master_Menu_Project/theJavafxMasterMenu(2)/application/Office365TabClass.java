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
public class Office365TabClass { Tab officeTab;
	public Office365TabClass(Tab officeTab) { this.officeTab = officeTab; } 
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane officeAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(215, 83, 65)));
			
			FileInputStream wordfile = new FileInputStream("wordButton.png");
		    Image wordicon = new Image(wordfile);
		    	Button word = new Button(" Microsoft Word ", new ImageView(wordicon)); word.setTranslateX(X); word.setTranslateY(Y+=25); word.setFont(new Font("Arial Rounded MT Bold", 24)); 
		    		word.setStyle("-fx-border-color: dodgerblue; -fx-text-fill: dodgerblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
					word.setMinWidth(300); 
					word.setMaxWidth(300);
					word.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Word.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					

			FileInputStream powerpointfile = new FileInputStream("powerpointButton.png");
			Image powerpointicon = new Image(powerpointfile);
				Button powerPoint = new Button(" PowerPoint ", new ImageView(powerpointicon)); powerPoint.setTranslateX(X); powerPoint.setTranslateY(Y+=70); powerPoint.setFont(new Font("Arial Rounded MT Bold", 24));
					powerPoint.setStyle("-fx-border-color: gold; -fx-text-fill: gold; -fx-border-width: 4px;	-fx-background-color: orangered"); 
					powerPoint.setMinWidth(300); 
					powerPoint.setMaxWidth(300);
					powerPoint.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\PowerPoint.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream accessfile = new FileInputStream("accessButton.png");
		    Image accessicon = new Image(accessfile);
				Button access = new Button(" Access ", new ImageView(accessicon)); access.setTranslateX(X); access.setTranslateY(Y+=70); access.setFont(new Font("Arial Rounded MT Bold", 24));
					access.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
					access.setMinWidth(300); 
					access.setMaxWidth(300);
					access.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Access.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream excelfile = new FileInputStream("excelButton.png");
		    Image excelicon = new Image(excelfile);
				Button excel = new Button(" Excel ", new ImageView(excelicon)); excel.setTranslateX(X); excel.setTranslateY(Y+=70); excel.setFont(new Font("Arial Rounded MT Bold", 24));
					excel.setStyle("-fx-border-color: greenyellow; -fx-text-fill: greenyellow; -fx-border-width: 4px;	-fx-background-color: darkgreen"); 
					excel.setMinWidth(300); 
					excel.setMaxWidth(300);
					excel.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Excel.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream onenotefile = new FileInputStream("onenoteButton.png");
		    Image onenoteicon = new Image(onenotefile);
				Button oneNote = new Button(" OneNote ", new ImageView(onenoteicon)); oneNote.setTranslateX(X); oneNote.setTranslateY(Y+=70); oneNote.setFont(new Font("Arial Rounded MT Bold", 24));
					oneNote.setStyle("-fx-border-color: fuchsia; -fx-text-fill: fuchsia; -fx-border-width: 4px;	-fx-background-color: purple"); 
					oneNote.setMinWidth(300); 
					oneNote.setMaxWidth(300);
					oneNote.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\OneNote.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream publisherfile = new FileInputStream("publisherButton.png");
		    Image publishericon = new Image(publisherfile);
				Button publisher = new Button(" Publisher ", new ImageView(publishericon)); publisher.setTranslateX(X); publisher.setTranslateY(Y+=70); publisher.setFont(new Font("Arial Rounded MT Bold", 24));
					publisher.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
					publisher.setMinWidth(300); 
					publisher.setMaxWidth(300);
					publisher.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Publisher.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream outlookfile = new FileInputStream("outlookButton.png");
		    Image outlookicon = new Image(outlookfile);
				Button outlook = new Button(" Outlook ", new ImageView(outlookicon)); outlook.setTranslateX(X); outlook.setTranslateY(Y+=70); outlook.setFont(new Font("Arial Rounded MT Bold", 24));
					outlook.setStyle("-fx-border-color: lavender; -fx-text-fill: lavender; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
					outlook.setMinWidth(300); 
					outlook.setMaxWidth(300);
					outlook.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Outlook.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream teamsfile = new FileInputStream("teamsButton.png");
		    Image teamsicon = new Image(teamsfile);
	   	 Y = 0; Button teams = new Button(" Microsoft Teams ", new ImageView(teamsicon)); teams.setTranslateX(X+=340); teams.setTranslateY(Y+=25); teams.setFont(new Font("Arial Rounded MT Bold", 24));
	   	 			teams.setStyle("-fx-border-color: thistle; -fx-text-fill: thistle; -fx-border-width: 4px; -fx-background-color: blueviolet");
	   	 			teams.setMinWidth(300); 
	   	 			teams.setMaxWidth(300);
	   	 			teams.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Teams.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
	   	 			
	  		FileInputStream infopathfile = new FileInputStream("infopathButton.png");
	 		Image infopathicon = new Image(infopathfile);
	 			Button infoPath = new Button(" InfoPath ", new ImageView(infopathicon)); infoPath.setTranslateX(X); infoPath.setTranslateY(Y+=70); infoPath.setFont(new Font("Arial Rounded MT Bold", 24));
	 			infoPath.setStyle("-fx-border-color: plum; -fx-text-fill: plum; -fx-border-width: 4px;	-fx-background-color: indigo"); 
		    		infoPath.setMinWidth(300); 
		    		infoPath.setMaxWidth(300);
		    		infoPath.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\InfoPath.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
		    		
			FileInputStream onedrivefile = new FileInputStream("onedriveButton.png");
		    Image onedriveicon = new Image(onedrivefile);
		    	Button oneDrive = new Button(" OneDrive ", new ImageView(onedriveicon)); oneDrive.setTranslateX(X); oneDrive.setTranslateY(Y+=70); oneDrive.setFont(new Font("Arial Rounded MT Bold", 24));
		    		oneDrive.setStyle("-fx-border-color: aliceblue; -fx-text-fill: aliceblue; -fx-border-width: 4px;	-fx-background-color: cornflowerblue"); 
		    		oneDrive.setMinWidth(300); 
		    		oneDrive.setMaxWidth(300);
		    		oneDrive.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\OneDrive.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
		    		
			FileInputStream bifile = new FileInputStream("biButton.png");
		    Image biicon = new Image(bifile);
				Button powerBI = new Button(" Power BI ", new ImageView(biicon)); powerBI.setTranslateX(X); powerBI.setTranslateY(Y+=70); powerBI.setFont(new Font("Arial Rounded MT Bold", 24));
					powerBI.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: darkkhaki"); 
					powerBI.setMinWidth(300); 
					powerBI.setMaxWidth(300);
					powerBI.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Power BI Desktop.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream swayfile = new FileInputStream("swayButton.png");
		    Image swayicon = new Image(swayfile);
				Button sway = new Button(" Sway  ", new ImageView(swayicon)); sway.setTranslateX(X); sway.setTranslateY(Y+=70); sway.setFont(new Font("Arial Rounded MT Bold", 24));
					sway.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px;	-fx-background-color: teal"); 
					sway.setMinWidth(300); 
					sway.setMaxWidth(300);
					sway.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Sway.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream appfile = new FileInputStream("appButton.png");
		    Image appicon = new Image(appfile);
				Button powerApps = new Button(" Power Apps ", new ImageView(appicon)); powerApps.setTranslateX(X); powerApps.setTranslateY(Y+=70); powerApps.setFont(new Font("Arial Rounded MT Bold", 24));
					powerApps.setStyle("-fx-border-color: pink; -fx-text-fill: pink; -fx-border-width: 4px;	-fx-background-color: mediumvioletred"); 
					powerApps.setMinWidth(300); 
					powerApps.setMaxWidth(300);
					powerApps.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Power Apps for Windows 8.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
					
			FileInputStream automatefile = new FileInputStream("automateButton.png");
		    Image automateicon = new Image(automatefile);
				Button Automate = new Button(" Automate ", new ImageView(automateicon)); Automate.setTranslateX(X); Automate.setTranslateY(Y+=70); Automate.setFont(new Font("Arial Rounded MT Bold", 24));
					Automate.setStyle("-fx-border-color: dodgerblue; -fx-text-fill: dodgerblue; -fx-border-width: 4px; -fx-background-color: mediumblue"); 
					Automate.setMinWidth(300); 
					Automate.setMaxWidth(300);
					Automate.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
						public void handle(ActionEvent arg0) {
							File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Automate.lnk");
							Desktop target = Desktop.getDesktop();
							try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

				  FileInputStream  officeBackgroundInputStream = new FileInputStream("officeBackground.png");
				  Image  officeBackground = new Image(officeBackgroundInputStream);
				  ImageView officeBackgroundView = new ImageView(officeBackground);
				  officeBackgroundView.setTranslateY(6);  officeBackgroundView.setTranslateX(6); 
				  officeAnchorPane.getChildren().addAll(officeBackgroundView, word, access, excel, 
				  sway, oneNote, Automate, powerApps, powerBI, oneDrive, infoPath, teams, publisher, 
				  powerPoint, outlook ); officeTab.setContent(officeAnchorPane); } }