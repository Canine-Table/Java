package application;
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
	import javafx.scene.control.Button;
import javafx.scene.control.Tab;
	import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
	import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
	import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
	public class Office365TabClass {
	
		Tab officeTab;
	
	public Office365TabClass(Tab officeTab) {
		this.officeTab = officeTab;

	}
		public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane officeAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(215, 83, 65)));
			
			FileInputStream wordfile = new FileInputStream("bin/button/word.png");
		    Image wordicon = new Image(wordfile);
		    	Button word = new Button(" Microsoft Word ", new ImageView(wordicon)); word.setTranslateX(X); word.setTranslateY(Y+=25); word.setFont(new Font("Arial Rounded MT Bold", 24)); 
		    		word.setStyle("-fx-border-color: lightskyblue; -fx-text-fill: lightskyblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
					word.setMinWidth(300); 
					word.setMaxWidth(300);
			FileInputStream powerpointfile = new FileInputStream("bin/button/powerpoint.png");
			Image powerpointicon = new Image(powerpointfile);
				Button powerPoint = new Button(" PowerPoint ", new ImageView(powerpointicon)); powerPoint.setTranslateX(X); powerPoint.setTranslateY(Y+=70); powerPoint.setFont(new Font("Arial Rounded MT Bold", 24));
					powerPoint.setStyle("-fx-border-color: orange; -fx-text-fill: orange; -fx-border-width: 4px;	-fx-background-color: darkorange"); 
					powerPoint.setMinWidth(300); 
					powerPoint.setMaxWidth(300);
			FileInputStream accessfile = new FileInputStream("bin/button/access.png");
		    Image accessicon = new Image(accessfile);
				Button access = new Button(" Access ", new ImageView(accessicon)); access.setTranslateX(X); access.setTranslateY(Y+=70); access.setFont(new Font("Arial Rounded MT Bold", 24));
					access.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
					access.setMinWidth(300); 
					access.setMaxWidth(300);
			FileInputStream excelfile = new FileInputStream("bin/button/excel.png");
		    Image excelicon = new Image(excelfile);
				Button excel = new Button(" Excel ", new ImageView(excelicon)); excel.setTranslateX(X); excel.setTranslateY(Y+=70); excel.setFont(new Font("Arial Rounded MT Bold", 24));
					excel.setStyle("-fx-border-color: skyblue; -fx-text-fill: skyblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
					excel.setMinWidth(300); 
					excel.setMaxWidth(300);
			FileInputStream onenotefile = new FileInputStream("bin/button/onenote.png");
		    Image onenoteicon = new Image(onenotefile);
				Button oneNote = new Button(" OneNote ", new ImageView(onenoteicon)); oneNote.setTranslateX(X); oneNote.setTranslateY(Y+=70); oneNote.setFont(new Font("Arial Rounded MT Bold", 24));
					oneNote.setStyle("-fx-border-color: lightsteelblue; -fx-text-fill: lightsteelblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
					oneNote.setMinWidth(300); 
					oneNote.setMaxWidth(300);
			FileInputStream publisherfile = new FileInputStream("bin/button/publisher.png");
		    Image publishericon = new Image(publisherfile);
				Button publisher = new Button(" Publisher ", new ImageView(publishericon)); publisher.setTranslateX(X); publisher.setTranslateY(Y+=70); publisher.setFont(new Font("Arial Rounded MT Bold", 24));
					publisher.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
					publisher.setMinWidth(300); 
					publisher.setMaxWidth(300);
			FileInputStream outlookfile = new FileInputStream("bin/button/outlook.png");
		    Image outlookicon = new Image(outlookfile);
				Button outlook = new Button(" Outlook ", new ImageView(outlookicon)); outlook.setTranslateX(X); outlook.setTranslateY(Y+=70); outlook.setFont(new Font("Arial Rounded MT Bold", 24));
					outlook.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: goldenrod"); 
					outlook.setMinWidth(300); 
					outlook.setMaxWidth(300);
			FileInputStream teamsfile = new FileInputStream("bin/button/teams.png");
		    Image teamsicon = new Image(teamsfile);
	   	 Y = 0; Button teams = new Button(" Microsoft Teams ", new ImageView(teamsicon)); teams.setTranslateX(X+=340); teams.setTranslateY(Y+=25); teams.setFont(new Font("Arial Rounded MT Bold", 24));
	   	 			teams.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
	   	 			teams.setMinWidth(300); 
	   	 			teams.setMaxWidth(300);
	  		FileInputStream infopathfile = new FileInputStream("bin/button/infopath.png");
	 		Image infopathicon = new Image(infopathfile);
	 			Button infoPath = new Button(" InfoPath ", new ImageView(infopathicon)); infoPath.setTranslateX(X); infoPath.setTranslateY(Y+=70); infoPath.setFont(new Font("Arial Rounded MT Bold", 24));
	 			infoPath.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
		    		infoPath.setMinWidth(300); 
		    		infoPath.setMaxWidth(300);
			FileInputStream onedrivefile = new FileInputStream("bin/button/onedrive.png");
		    Image onedriveicon = new Image(onedrivefile);
		    	Button oneDrive = new Button(" OneDrive ", new ImageView(onedriveicon)); oneDrive.setTranslateX(X); oneDrive.setTranslateY(Y+=70); oneDrive.setFont(new Font("Arial Rounded MT Bold", 24));
		    		oneDrive.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: seagreen"); 
		    		oneDrive.setMinWidth(300); 
		    		oneDrive.setMaxWidth(300);
			FileInputStream bifile = new FileInputStream("bin/button/bi.png");
		    Image biicon = new Image(bifile);
				Button powerBI = new Button(" Power BI ", new ImageView(biicon)); powerBI.setTranslateX(X); powerBI.setTranslateY(Y+=70); powerBI.setFont(new Font("Arial Rounded MT Bold", 24));
					powerBI.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: darkkhaki"); 
					powerBI.setMinWidth(300); 
					powerBI.setMaxWidth(300);
			FileInputStream swayfile = new FileInputStream("bin/button/sway.png");
		    Image swayicon = new Image(swayfile);
				Button sway = new Button(" Sway  ", new ImageView(swayicon)); sway.setTranslateX(X); sway.setTranslateY(Y+=70); sway.setFont(new Font("Arial Rounded MT Bold", 24));
					sway.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
					sway.setMinWidth(300); 
					sway.setMaxWidth(300);
			FileInputStream appfile = new FileInputStream("bin/button/app.png");
		    Image appicon = new Image(appfile);
				Button powerApps = new Button(" Power Apps ", new ImageView(appicon)); powerApps.setTranslateX(X); powerApps.setTranslateY(Y+=70); powerApps.setFont(new Font("Arial Rounded MT Bold", 24));
					powerApps.setStyle("-fx-border-color: dodgerblue; -fx-text-fill: dodgerblue; -fx-border-width: 4px;	-fx-background-color: mediumblue"); 
					powerApps.setMinWidth(300); 
					powerApps.setMaxWidth(300);
			FileInputStream automatefile = new FileInputStream("bin/button/automate.png");
		    Image automateicon = new Image(automatefile);
				Button Automate = new Button(" Automate ", new ImageView(automateicon)); Automate.setTranslateX(X); Automate.setTranslateY(Y+=70); Automate.setFont(new Font("Arial Rounded MT Bold", 24));
					Automate.setStyle("-fx-border-color: Chartreuse; -fx-text-fill: Chartreuse; -fx-border-width: 4px; -fx-background-color: darkgreen"); 
					Automate.setMinWidth(300); 
					Automate.setMaxWidth(300);

				  FileInputStream  officeBackgroundInputStream = new FileInputStream("bin/background/office.png");
				  Image  officeBackground = new Image(officeBackgroundInputStream);
				  ImageView officeBackgroundView = new ImageView(officeBackground);
				  officeBackgroundView.setTranslateY(6);  officeBackgroundView.setTranslateX(6); 
				  officeAnchorPane.getChildren().addAll(officeBackgroundView, word, access, excel, sway, oneNote,
				  Automate, powerApps, powerBI,	oneDrive, infoPath, teams, publisher, powerPoint, outlook ); 
		officeTab.setContent(officeAnchorPane);
	}
}