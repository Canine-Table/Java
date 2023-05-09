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
public class EclipseTabClass {

	Tab eclipseTab;

public EclipseTabClass(Tab eclipseTab) {
this.eclipseTab = eclipseTab;

}

public void open() throws FileNotFoundException { 
	int Y = 0 ; int X = 30;
	AnchorPane eclipseAnchorPane = new AnchorPane(new Rectangle(700, 522, Color.rgb(127, 112, 99)));
	
		FileInputStream eclipsecppfile = new FileInputStream("eclipsecppButton.png");
		Image eclipsecppicon = new Image(eclipsecppfile);
			Button eclipseCandCPP = new Button(" C/C++ ", new ImageView(eclipsecppicon)); eclipseCandCPP.setTranslateX(X); eclipseCandCPP.setTranslateY(Y+=25); eclipseCandCPP.setFont(new Font("Arial Rounded MT Bold", 24)); 
				eclipseCandCPP.setStyle("-fx-border-color: navy; -fx-text-fill: navy; -fx-border-width: 4px;	-fx-background-color: lightskyblue"); 
				eclipseCandCPP.setMinWidth(300); 
				eclipseCandCPP.setMaxWidth(300);
			Button eclipseCandCPPEmbbedded = new Button(" Embedded C/C++ ", new ImageView(eclipsecppicon)); eclipseCandCPPEmbbedded.setTranslateX(X); eclipseCandCPPEmbbedded.setTranslateY(Y+=100); eclipseCandCPPEmbbedded.setFont(new Font("Arial Rounded MT Bold", 24));
				eclipseCandCPPEmbbedded.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: MediumSeaGreen"); 
				eclipseCandCPPEmbbedded.setMinWidth(300); 
				eclipseCandCPPEmbbedded.setMaxWidth(300);
				
		FileInputStream eclipsecppscientificcomputingfile = new FileInputStream("eclipsescienceButton.png");
		Image eclipsecppscientificcomputingicon = new Image(eclipsecppscientificcomputingfile);
			Button eclipseScientificComputing = new Button(" Scientific ", new ImageView(eclipsecppscientificcomputingicon)); eclipseScientificComputing.setTranslateX(X); eclipseScientificComputing.setTranslateY(Y+=100); eclipseScientificComputing.setFont(new Font("Arial Rounded MT Bold", 24));
				eclipseScientificComputing.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
				eclipseScientificComputing.setMinWidth(300); 
				eclipseScientificComputing.setMaxWidth(300);

		FileInputStream eclipsemodelfile = new FileInputStream("eclipsemodelButton.png");
		Image eclipsemodelicon = new Image(eclipsemodelfile);
			Button eclipseModel = new Button(" Modeling Tools ", new ImageView(eclipsemodelicon)); eclipseModel.setTranslateX(X); eclipseModel.setTranslateY(Y+=100); eclipseModel.setFont(new Font("Arial Rounded MT Bold", 24));
				eclipseModel.setStyle("-fx-border-color: skyblue; -fx-text-fill: skyblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				eclipseModel.setMinWidth(300); 
				eclipseModel.setMaxWidth(300);
				
		FileInputStream eclipsephpfile = new FileInputStream("eclipsephpButton.png");
		Image eclipsephpicon = new Image(eclipsephpfile);				
			Button eclipsePHP = new Button(" PHP ", new ImageView(eclipsephpicon)); eclipsePHP.setTranslateX(X); eclipsePHP.setTranslateY(Y+=100); eclipsePHP.setFont(new Font("Arial Rounded MT Bold", 24));
				eclipsePHP.setStyle("-fx-border-color: lightsteelblue; -fx-text-fill: lightsteelblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				eclipsePHP.setMinWidth(300); 
				eclipsePHP.setMaxWidth(300);
				
	FileInputStream eclipsefile = new FileInputStream("eclipseButton.png");
	Image eclipseicon = new Image(eclipsefile);	
	 Y = 0;	Button eclipseRCPansRAP = new Button(" RCP & RAP ", new ImageView(eclipseicon)); eclipseRCPansRAP.setTranslateX(X+=340); eclipseRCPansRAP.setTranslateY(Y+=25); eclipseRCPansRAP.setFont(new Font("Arial Rounded MT Bold", 24));
				eclipseRCPansRAP.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
				eclipseRCPansRAP.setMinWidth(300); 
				eclipseRCPansRAP.setMaxWidth(300);
				
			Button eclipseJAVAandDSL = new Button(" Java & DSL ", new ImageView(eclipseicon)); eclipseJAVAandDSL.setTranslateX(X); eclipseJAVAandDSL.setTranslateY(Y+=100); eclipseJAVAandDSL.setFont(new Font("Arial Rounded MT Bold", 24));
	 			eclipseJAVAandDSL.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: goldenrod"); 
	 			eclipseJAVAandDSL.setMinWidth(300); 
	 			eclipseJAVAandDSL.setMaxWidth(300);
	 			
			Button eclipseJAVA = new Button(" Java ", new ImageView(eclipseicon)); eclipseJAVA.setTranslateX(X); eclipseJAVA.setTranslateY(Y+=100); eclipseJAVA.setFont(new Font("Arial Rounded MT Bold", 24));
				eclipseJAVA.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
				eclipseJAVA.setMinWidth(300); 
				eclipseJAVA.setMaxWidth(300);
				
		FileInputStream eclipsewebfile = new FileInputStream("eclipsewebButton.png");
		Image eclipsewebicon = new Image(eclipsewebfile);	
		    Button eclipseJAVAandWEB = new Button(" Java and Web ", new ImageView(eclipsewebicon)); eclipseJAVAandWEB.setTranslateX(X); eclipseJAVAandWEB.setTranslateY(Y+=100); eclipseJAVAandWEB.setFont(new Font("Arial Rounded MT Bold", 24));
		    	eclipseJAVAandWEB.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
		    	eclipseJAVAandWEB.setMinWidth(300); 
		    	eclipseJAVAandWEB.setMaxWidth(300);
		  
			Button eclipseScout = new Button(" IDE For Scout ", new ImageView(eclipseicon)); eclipseScout.setTranslateX(X); eclipseScout.setTranslateY(Y+=100); eclipseScout.setFont(new Font("Arial Rounded MT Bold", 24));
				eclipseScout.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: seagreen"); 
				eclipseScout.setMinWidth(300); 
				eclipseScout.setMaxWidth(300);

		FileInputStream eclipseBackgroundInputStream = new FileInputStream("eclipseBackground.png");
		Image eclipseBackground = new Image(eclipseBackgroundInputStream);
		ImageView eclipseBackgroundView = new ImageView(eclipseBackground);
		eclipseBackgroundView.setTranslateY(6); eclipseBackgroundView.setTranslateX(6); 
		eclipseAnchorPane.getChildren().addAll( eclipseBackgroundView, eclipseCandCPP, eclipseCandCPPEmbbedded, eclipseJAVAandDSL,
				eclipseScientificComputing, eclipseJAVA, eclipseModel, eclipsePHP, eclipseRCPansRAP, eclipseJAVAandWEB, eclipseScout); 
	eclipseTab.setContent(eclipseAnchorPane);
	
	}
}