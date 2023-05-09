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
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
	import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
	import javafx.scene.text.Font;
public class SearchEngineClass { Tab SearchEngineTab;
	public SearchEngineClass(Tab SearchEngineTab) { this.SearchEngineTab = SearchEngineTab; }
public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane SearchEngineAnchorPane = new AnchorPane(new Rectangle(700,550, Color.rgb(0, 0, 0)));	
DropShadow shadow = new DropShadow();
shadow.setColor(Color.DODGERBLUE);
shadow.setBlurType(BlurType.THREE_PASS_BOX);
shadow.setSpread(0.5);

		FileInputStream firefoxfile = new FileInputStream("firefoxButton.png");
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
				
		FileInputStream edgefile = new FileInputStream("edgeButton.png");
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
				
		FileInputStream chromefile = new FileInputStream("chromeButton.png");
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
				
		FileInputStream explorerfile = new FileInputStream("explorerButton.png");
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
				
		FileInputStream vivaldifile = new FileInputStream("vivaldiButton.png");
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
				
		FileInputStream operafile = new FileInputStream("operaButton.png");
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
				
		FileInputStream yandexfile = new FileInputStream("yandexButton.png");
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

		FileInputStream operagxfile = new FileInputStream("operagxButton.png");
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
				
		FileInputStream maxthonfile = new FileInputStream("maxthonButton.png");
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
	 			
		FileInputStream torfile = new FileInputStream("torButton.png");
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
		    	
		FileInputStream avastfile = new FileInputStream("avastButton.png");
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
				
		FileInputStream bravefile = new FileInputStream("braveButton.png");
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
				
		FileInputStream bingfile = new FileInputStream("bingButton.png");
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
	
		FileInputStream duckduckgofile = new FileInputStream("duckduckgoButton.png");
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


				  FileInputStream SearchEngineBackgroundInputStream = new FileInputStream("browserBackground.png");
				  Image SearchEngineBackground = new Image(SearchEngineBackgroundInputStream);
				  ImageView SearchEngineBackgroundView = new ImageView(SearchEngineBackground);
				  SearchEngineBackgroundView.setTranslateY(6); SearchEngineBackgroundView.setTranslateX(6); 
				  SearchEngineAnchorPane.getChildren().addAll( SearchEngineBackgroundView, avastSecure, bing,
				  brave, fireFox, googleChrome, internetExplorer, maxthon, microsoftEdge, opera, operaGX, tor, 
				  vivaldi, duckDuckGo, yandex ); SearchEngineTab.setContent(SearchEngineAnchorPane); } }