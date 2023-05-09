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
public class JetBrainsTabClass {

	Tab JetBrainsTab;
	
	public JetBrainsTabClass(Tab JetBrainsTab) {
		this.JetBrainsTab = JetBrainsTab;

	}

	public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane JetBrainsAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(201, 95, 134)));
	
		FileInputStream clionfile = new FileInputStream("bin/button/clion.png");
	    Image clionicon = new Image(clionfile);
	    	Button cLion = new Button(" CLion ", new ImageView(clionicon)); cLion.setTranslateX(X); cLion.setTranslateY(Y+=25); cLion.setFont(new Font("Arial Rounded MT Bold", 24)); 
				cLion.setStyle("-fx-border-color: navy; -fx-text-fill: navy; -fx-border-width: 4px;	-fx-background-color: lightskyblue"); 
				cLion.setMinWidth(300); 
				cLion.setMaxWidth(300);

		FileInputStream ideafile = new FileInputStream("bin/button/idea.png");
		Image ideaicon = new Image(ideafile);
			Button intelliJIDEA = new Button(" intelliJIDEA ", new ImageView(ideaicon)); intelliJIDEA.setTranslateX(X); intelliJIDEA.setTranslateY(Y+=70); intelliJIDEA.setFont(new Font("Arial Rounded MT Bold", 24));
				intelliJIDEA.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: MediumSeaGreen"); 
				intelliJIDEA.setMinWidth(300); 
				intelliJIDEA.setMaxWidth(300);

		FileInputStream riderfile = new FileInputStream("bin/button/Rider.png");
		Image ridericon = new Image(riderfile);				
			Button rider = new Button(" Rider ", new ImageView(ridericon)); rider.setTranslateX(X); rider.setTranslateY(Y+=70); rider.setFont(new Font("Arial Rounded MT Bold", 24));
				rider.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
				rider.setMinWidth(300); 
				rider.setMaxWidth(300);

		FileInputStream rubyfile = new FileInputStream("bin/button/rubymine.png");
		Image rubyicon = new Image(rubyfile);			
			Button rubyMine = new Button(" RubyMine ", new ImageView(rubyicon)); rubyMine.setTranslateX(X); rubyMine.setTranslateY(Y+=70); rubyMine.setFont(new Font("Arial Rounded MT Bold", 24));
				rubyMine.setStyle("-fx-border-color: skyblue; -fx-text-fill: skyblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				rubyMine.setMinWidth(300); 
				rubyMine.setMaxWidth(300);

		FileInputStream gripfile = new FileInputStream("bin/button/datagrip.png");
		Image gripicon = new Image(gripfile);	
			Button dataGrip = new Button(" DataGrip ", new ImageView(gripicon)); dataGrip.setTranslateX(X); dataGrip.setTranslateY(Y+=70); dataGrip.setFont(new Font("Arial Rounded MT Bold", 24));
				dataGrip.setStyle("-fx-border-color: lightsteelblue; -fx-text-fill: lightsteelblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				dataGrip.setMinWidth(300); 
				dataGrip.setMaxWidth(300);

		FileInputStream spellfile = new FileInputStream("bin/button/dataspell.png");
		Image spellicon = new Image(spellfile);	
			Button dataSpell = new Button(" DataSpell ", new ImageView(spellicon)); dataSpell.setTranslateX(X); dataSpell.setTranslateY(Y+=70); dataSpell.setFont(new Font("Arial Rounded MT Bold", 24));
				dataSpell.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
				dataSpell.setMinWidth(300); 
				dataSpell.setMaxWidth(300);

		FileInputStream gofile = new FileInputStream("bin/button/goland.png");
		Image gologo = new Image(gofile);	
			Button goLand = new Button(" GoLand ", new ImageView(gologo)); goLand.setTranslateX(X); goLand.setTranslateY(Y+=70); goLand.setFont(new Font("Arial Rounded MT Bold", 24));
				goLand.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: goldenrod"); 
				goLand.setMinWidth(300); 
				goLand.setMaxWidth(300);

		FileInputStream coverfile = new FileInputStream("bin/button/DotCover_Icon5.png");
		Image coverlogo = new Image(coverfile);	
   	 Y = 0; Button dotCover = new Button(" DotCover ", new ImageView(coverlogo)); dotCover.setTranslateX(X+=340); dotCover.setTranslateY(Y+=25); dotCover.setFont(new Font("Arial Rounded MT Bold", 24));
 				dotCover.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
 				dotCover.setMinWidth(300); 
 				dotCover.setMaxWidth(300);

 		FileInputStream memoryfile = new FileInputStream("bin/button/DotMemory_Icon10.png");
 		Image memoryicon = new Image(memoryfile);	
 			Button dotMemory = new Button(" DotMemory ", new ImageView(memoryicon)); dotMemory.setTranslateX(X); dotMemory.setTranslateY(Y+=70); dotMemory.setFont(new Font("Arial Rounded MT Bold", 24));
	    		dotMemory.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
	    		dotMemory.setMinWidth(300); 
	    		dotMemory.setMaxWidth(300);
	    		
	    FileInputStream peekfile = new FileInputStream("bin/button/DotPeek_Icon5.png");
	    Image peekicon = new Image(peekfile);	
	    	Button dotPeek = new Button(" Dot Peek ", new ImageView(peekicon)); dotPeek.setTranslateX(X); dotPeek.setTranslateY(Y+=70); dotPeek.setFont(new Font("Arial Rounded MT Bold", 24));
				dotPeek.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: seagreen"); 
				dotPeek.setMinWidth(300); 
				dotPeek.setMaxWidth(300);
				
		FileInputStream tracefile = new FileInputStream("bin/button/DotTrace_Icon5.png");
		Image traceicon = new Image(tracefile);	
			Button dotTrace = new Button(" DotTrace ", new ImageView(traceicon)); dotTrace.setTranslateX(X); dotTrace.setTranslateY(Y+=70); dotTrace.setFont(new Font("Arial Rounded MT Bold", 24));
				dotTrace.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: darkkhaki"); 
				dotTrace.setMinWidth(300); 
				dotTrace.setMaxWidth(300);
				
		FileInputStream phpfile = new FileInputStream("bin/button/phpstorm.png");
		Image phpicon = new Image(phpfile);					
			Button phpStorm = new Button(" PHPStorm  ", new ImageView(phpicon)); phpStorm.setTranslateX(X); phpStorm.setTranslateY(Y+=70); phpStorm.setFont(new Font("Arial Rounded MT Bold", 24));
				phpStorm.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
				phpStorm.setMinWidth(300); 
				phpStorm.setMaxWidth(300);
				
		FileInputStream pyfile = new FileInputStream("bin/button/pycharm.png");
		Image pyicon = new Image(pyfile);	
			Button pycharm = new Button(" PyCharm ", new ImageView(pyicon)); pycharm.setTranslateX(X); pycharm.setTranslateY(Y+=70); pycharm.setFont(new Font("Arial Rounded MT Bold", 24));
				pycharm.setStyle("-fx-border-color: dodgerblue; -fx-text-fill: dodgerblue; -fx-border-width: 4px;	-fx-background-color: mediumblue"); 
				pycharm.setMinWidth(300); 
				pycharm.setMaxWidth(300);
				
		FileInputStream webfile = new FileInputStream("bin/button/webstorm.png");
		Image webicon = new Image(webfile);	
			Button webStorm = new Button(" WebStorm ", new ImageView(webicon)); webStorm.setTranslateX(X); webStorm.setTranslateY(Y+=70); webStorm.setFont(new Font("Arial Rounded MT Bold", 24));
				webStorm.setStyle("-fx-border-color: Chartreuse; -fx-text-fill: Chartreuse; -fx-border-width: 4px; -fx-background-color: darkgreen"); 
				webStorm.setMinWidth(300); 
				webStorm.setMaxWidth(300);

			 FileInputStream  JetBrainsBackgroundInputStream = new FileInputStream("bin/background/jetbrains.png");
			  Image  JetBrainsBackground = new Image( JetBrainsBackgroundInputStream);
			  ImageView JetBrainsBackgroundView = new ImageView(JetBrainsBackground);
			  JetBrainsBackgroundView.setTranslateY(6);  JetBrainsBackgroundView.setTranslateX(6); 
			  JetBrainsAnchorPane.getChildren().addAll( JetBrainsBackgroundView, cLion, intelliJIDEA, rider, rubyMine,
			  dataGrip, dataSpell, goLand, dotCover, dotMemory, dotPeek, dotTrace, phpStorm, pycharm, webStorm ); 
		JetBrainsTab.setContent(JetBrainsAnchorPane);
	}
}