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
public class JetBrainsTabClass { Tab JetBrainsTab;
	public JetBrainsTabClass(Tab JetBrainsTab) { this.JetBrainsTab = JetBrainsTab; }
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane JetBrainsAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(201, 95, 134)));
	
		FileInputStream clionfile = new FileInputStream("clionButton.png");
	    Image clionicon = new Image(clionfile);
	    	Button cLion = new Button(" CLion ", new ImageView(clionicon)); cLion.setTranslateX(X); cLion.setTranslateY(Y+=25); cLion.setFont(new Font("Arial Rounded MT Bold", 24)); 
				cLion.setStyle("-fx-border-color: lawngreen; -fx-text-fill: lawngreen; -fx-border-width: 4px;	-fx-background-color: black"); 
				cLion.setMinWidth(300); 
				cLion.setMaxWidth(300);
				cLion.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\cLion.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream ideafile = new FileInputStream("ideaButton.png");
		Image ideaicon = new Image(ideafile);
			Button intelliJIDEA = new Button(" intelliJIDEA ", new ImageView(ideaicon)); intelliJIDEA.setTranslateX(X); intelliJIDEA.setTranslateY(Y+=70); intelliJIDEA.setFont(new Font("Arial Rounded MT Bold", 24));
				intelliJIDEA.setStyle("-fx-border-color: mediumvioletred; -fx-text-fill: mediumvioletred; -fx-border-width: 4px;	-fx-background-color: black"); 
				intelliJIDEA.setMinWidth(300);
				intelliJIDEA.setMaxWidth(300);
				intelliJIDEA.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\IntelliJIDEA.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream riderfile = new FileInputStream("riderButton.png");
		Image ridericon = new Image(riderfile);				
			Button rider = new Button(" Rider ", new ImageView(ridericon)); rider.setTranslateX(X); rider.setTranslateY(Y+=70); rider.setFont(new Font("Arial Rounded MT Bold", 24));
				rider.setStyle("-fx-border-color: gold; -fx-text-fill: gold; -fx-border-width: 4px;	-fx-background-color: black"); 
				rider.setMinWidth(300); 
				rider.setMaxWidth(300);
				rider.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\Rider.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream rubyfile = new FileInputStream("rubymineButton.png");
		Image rubyicon = new Image(rubyfile);			
			Button rubyMine = new Button(" RubyMine ", new ImageView(rubyicon)); rubyMine.setTranslateX(X); rubyMine.setTranslateY(Y+=70); rubyMine.setFont(new Font("Arial Rounded MT Bold", 24));
				rubyMine.setStyle("-fx-border-color: crimson; -fx-text-fill: crimson; -fx-border-width: 4px;	-fx-background-color: black"); 
				rubyMine.setMinWidth(300); 
				rubyMine.setMaxWidth(300);
				rubyMine.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\RubyMine.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream gripfile = new FileInputStream("datagripButton.png");
		Image gripicon = new Image(gripfile);	
			Button dataGrip = new Button(" DataGrip ", new ImageView(gripicon)); dataGrip.setTranslateX(X); dataGrip.setTranslateY(Y+=70); dataGrip.setFont(new Font("Arial Rounded MT Bold", 24));
				dataGrip.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: black"); 
				dataGrip.setMinWidth(300);
				dataGrip.setMaxWidth(300);
				dataGrip.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DataGrip.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream spellfile = new FileInputStream("dataspellButton.png");
		Image spellicon = new Image(spellfile);	
			Button dataSpell = new Button(" DataSpell ", new ImageView(spellicon)); dataSpell.setTranslateX(X); dataSpell.setTranslateY(Y+=70); dataSpell.setFont(new Font("Arial Rounded MT Bold", 24));
				dataSpell.setStyle("-fx-border-color: lightseagreen; -fx-text-fill: lightseagreen; -fx-border-width: 4px;	-fx-background-color: black"); 
				dataSpell.setMinWidth(300); 
				dataSpell.setMaxWidth(300);
				dataSpell.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DataSpell.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream gofile = new FileInputStream("golandButton.png");
		Image gologo = new Image(gofile);	
			Button goLand = new Button(" GoLand ", new ImageView(gologo)); goLand.setTranslateX(X); goLand.setTranslateY(Y+=70); goLand.setFont(new Font("Arial Rounded MT Bold", 24));
				goLand.setStyle("-fx-border-color: blue; -fx-text-fill: blue; -fx-border-width: 4px;	-fx-background-color: black"); 
				goLand.setMinWidth(300); 
				goLand.setMaxWidth(300);
				goLand.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\GoLand.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

		FileInputStream coverfile = new FileInputStream("dotcoverButton.png");
		Image coverlogo = new Image(coverfile);	
   	 Y = 0; Button dotCover = new Button(" DotCover ", new ImageView(coverlogo)); dotCover.setTranslateX(X+=340); dotCover.setTranslateY(Y+=25); dotCover.setFont(new Font("Arial Rounded MT Bold", 24));
 				dotCover.setStyle("-fx-border-color: orange; -fx-text-fill: orange; -fx-border-width: 4px; -fx-background-color: black");
 				dotCover.setMinWidth(300); 
 				dotCover.setMaxWidth(300);
 				dotCover.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DotCover.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

 		FileInputStream memoryfile = new FileInputStream("dotmemoryButton.png");
 		Image memoryicon = new Image(memoryfile);	
 			Button dotMemory = new Button(" DotMemory ", new ImageView(memoryicon)); dotMemory.setTranslateX(X); dotMemory.setTranslateY(Y+=70); dotMemory.setFont(new Font("Arial Rounded MT Bold", 24));
	    		dotMemory.setStyle("-fx-border-color: blueviolet; -fx-text-fill: blueviolet; -fx-border-width: 4px;	-fx-background-color: black"); 
	    		dotMemory.setMinWidth(300); 
	    		dotMemory.setMaxWidth(300);
	    		dotMemory.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DotMemory.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
	    		
	    FileInputStream peekfile = new FileInputStream("dotpeekButton.png");
	    Image peekicon = new Image(peekfile);	
	    	Button dotPeek = new Button(" Dot Peek ", new ImageView(peekicon)); dotPeek.setTranslateX(X); dotPeek.setTranslateY(Y+=70); dotPeek.setFont(new Font("Arial Rounded MT Bold", 24));
				dotPeek.setStyle("-fx-border-color: deepskyblue; -fx-text-fill: deepskyblue; -fx-border-width: 4px;	-fx-background-color: black"); 
				dotPeek.setMinWidth(300); 
				dotPeek.setMaxWidth(300);
				dotPeek.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DotPeek.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream tracefile = new FileInputStream("dottraceButton.png");
		Image traceicon = new Image(tracefile);	
			Button dotTrace = new Button(" DotTrace ", new ImageView(traceicon)); dotTrace.setTranslateX(X); dotTrace.setTranslateY(Y+=70); dotTrace.setFont(new Font("Arial Rounded MT Bold", 24));
				dotTrace.setStyle("-fx-border-color: hotpink; -fx-text-fill: hotpink; -fx-border-width: 4px;	-fx-background-color: black"); 
				dotTrace.setMinWidth(300); 
				dotTrace.setMaxWidth(300);
				dotTrace.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\DotTrace.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream phpfile = new FileInputStream("phpstormButton.png");
		Image phpicon = new Image(phpfile);					
			Button phpStorm = new Button(" PHPStorm  ", new ImageView(phpicon)); phpStorm.setTranslateX(X); phpStorm.setTranslateY(Y+=70); phpStorm.setFont(new Font("Arial Rounded MT Bold", 24));
				phpStorm.setStyle("-fx-border-color: mediumpurple; -fx-text-fill: mediumpurple; -fx-border-width: 4px;	-fx-background-color: black"); 
				phpStorm.setMinWidth(300); 
				phpStorm.setMaxWidth(300);
				phpStorm.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\phpStorm.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream pyfile = new FileInputStream("pycharmButton.png");
		Image pyicon = new Image(pyfile);	
			Button pycharm = new Button(" PyCharm ", new ImageView(pyicon)); pycharm.setTranslateX(X); pycharm.setTranslateY(Y+=70); pycharm.setFont(new Font("Arial Rounded MT Bold", 24));
				pycharm.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: black"); 
				pycharm.setMinWidth(300); 
				pycharm.setMaxWidth(300);
				pycharm.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\PyCharm.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );
				
		FileInputStream webfile = new FileInputStream("webstormButton.png");
		Image webicon = new Image(webfile);	
			Button webStorm = new Button(" WebStorm ", new ImageView(webicon)); webStorm.setTranslateX(X); webStorm.setTranslateY(Y+=70); webStorm.setFont(new Font("Arial Rounded MT Bold", 24));
				webStorm.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px; -fx-background-color: black"); 
				webStorm.setMinWidth(300); 
				webStorm.setMaxWidth(300);
				webStorm.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){ @Override
					public void handle(ActionEvent arg0) {
						File fileLocation = new File("C:\\Users\\Table\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Runas\\WebStorm.lnk");
						Desktop target = Desktop.getDesktop();
						try { target.open(fileLocation); } catch (IOException e) { e.printStackTrace();} } } );

			FileInputStream  JetBrainsBackgroundInputStream = new FileInputStream("jetbrainBackground.png");
			Image  JetBrainsBackground = new Image( JetBrainsBackgroundInputStream);
			ImageView JetBrainsBackgroundView = new ImageView(JetBrainsBackground);
			JetBrainsBackgroundView.setTranslateY(6);  JetBrainsBackgroundView.setTranslateX(6); 
			JetBrainsAnchorPane.getChildren().addAll( JetBrainsBackgroundView, cLion, intelliJIDEA, rider, rubyMine,
			dataGrip, dataSpell, goLand, dotCover, dotMemory, dotPeek, dotTrace, phpStorm, pycharm, webStorm );
			JetBrainsTab.setContent(JetBrainsAnchorPane); } }