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
	public class SearchEngineClass {
		
		Tab SearchEngineTab;
		
	public SearchEngineClass(Tab SearchEngineTab) {
		this.SearchEngineTab = SearchEngineTab; }

		public void open() throws FileNotFoundException { int Y = 0 ; int X = 30; AnchorPane SearchEngineAnchorPane = new AnchorPane(new Rectangle(700,550, Color.rgb(0, 0, 0)));	

		FileInputStream firefoxfile = new FileInputStream("bin/button/firefox.png");
		Image firefoxlogo = new Image(firefoxfile);
			Button fireFox = new Button(" FireFox ", new ImageView(firefoxlogo)); fireFox.setTranslateX(X); fireFox.setTranslateY(Y+=25); fireFox.setFont(new Font("Arial Rounded MT Bold", 24)); 
				fireFox.setStyle("-fx-border-color: navy; -fx-text-fill: navy; -fx-border-width: 4px;	-fx-background-color: lightskyblue"); 
				fireFox.setMinWidth(300); 
				fireFox.setMaxWidth(300);
				
		FileInputStream edgefile = new FileInputStream("bin/button/edge.png");
		Image edgelogo = new Image(edgefile);
			Button microsoftEdge = new Button(" Microsoft Edge ", new ImageView(edgelogo)); microsoftEdge.setTranslateX(X); microsoftEdge.setTranslateY(Y+=70); microsoftEdge.setFont(new Font("Arial Rounded MT Bold", 24));
				microsoftEdge.setStyle("-fx-border-color: white; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: MediumSeaGreen"); 
				microsoftEdge.setMinWidth(300); 
				microsoftEdge.setMaxWidth(300);
				
		FileInputStream chromefile = new FileInputStream("bin/button/chrome.png");
		Image chromelogo = new Image(chromefile);
			Button googleChrome = new Button(" Google Chrome ", new ImageView(chromelogo)); googleChrome.setTranslateX(X); googleChrome.setTranslateY(Y+=70); googleChrome.setFont(new Font("Arial Rounded MT Bold", 24));
				googleChrome.setStyle("-fx-border-color: powderblue; -fx-text-fill: powderblue; -fx-border-width: 4px;	-fx-background-color: royalblue"); 
				googleChrome.setMinWidth(300); 
				googleChrome.setMaxWidth(300);
				
		FileInputStream explorerfile = new FileInputStream("bin/button/explorer.png");
		Image explorerlogo = new Image(explorerfile);
			Button internetExplorer = new Button(" Internet Explorer ", new ImageView(explorerlogo)); internetExplorer.setTranslateX(X); internetExplorer.setTranslateY(Y+=70); internetExplorer.setFont(new Font("Arial Rounded MT Bold", 24));
				internetExplorer.setStyle("-fx-border-color: skyblue; -fx-text-fill: skyblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				internetExplorer.setMinWidth(300); 
				internetExplorer.setMaxWidth(300);
				
		FileInputStream vivaldifile = new FileInputStream("bin/button/vivaldi.png");
	    Image vivaldilogo = new Image(vivaldifile);
			Button vivaldi = new Button(" Vivaldi ", new ImageView(vivaldilogo)); vivaldi.setTranslateX(X); vivaldi.setTranslateY(Y+=70); vivaldi.setFont(new Font("Arial Rounded MT Bold", 24));
				vivaldi.setStyle("-fx-border-color: lightsteelblue; -fx-text-fill: lightsteelblue; -fx-border-width: 4px;	-fx-background-color: navy"); 
				vivaldi.setMinWidth(300); 
				vivaldi.setMaxWidth(300);
				
		FileInputStream operafile = new FileInputStream("bin/button/opera.png");
	    Image operalogo = new Image(operafile);
			Button opera = new Button(" Opera ", new ImageView(operalogo)); opera.setTranslateX(X); opera.setTranslateY(Y+=70); opera.setFont(new Font("Arial Rounded MT Bold", 24));
				opera.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
				opera.setMinWidth(300); 
				opera.setMaxWidth(300);
				
		FileInputStream yandexfile = new FileInputStream("bin/button/yandex.png");
		Image yandexlogo = new Image(yandexfile);
			Button yandex = new Button(" Yandex ", new ImageView(yandexlogo)); yandex.setTranslateX(X); yandex.setTranslateY(Y+=70); yandex.setFont(new Font("Arial Rounded MT Bold", 24));
				yandex.setStyle("-fx-border-color: silver; -fx-text-fill: silver; -fx-border-width: 4px;	-fx-background-color: darkslategray"); 
				yandex.setMinWidth(300); 
				yandex.setMaxWidth(300);

		FileInputStream operagxfile = new FileInputStream("bin/button/operagx.png");
	    Image operagxlogo = new Image(operagxfile);
	 Y = 0; Button operaGX = new Button(" Opera GX ", new ImageView(operagxlogo)); operaGX.setTranslateX(X+=340); operaGX.setTranslateY(Y+=25); operaGX.setFont(new Font("Arial Rounded MT Bold", 24));
				operaGX.setStyle("-fx-border-color: yellow; -fx-text-fill: yellow; -fx-border-width: 4px;	-fx-background-color: goldenrod"); 
				operaGX.setMinWidth(300); 
				operaGX.setMaxWidth(300);
				
		FileInputStream maxthonfile = new FileInputStream("bin/button/maxthon.png");
	    Image maxthonlogo = new Image(maxthonfile);
			Button maxthon = new Button(" Maxhon ", new ImageView(maxthonlogo)); maxthon.setTranslateX(X); maxthon.setTranslateY(Y+=70); maxthon.setFont(new Font("Arial Rounded MT Bold", 24));
	 			maxthon.setStyle("-fx-border-color: cyan; -fx-text-fill: cyan; -fx-border-width: 4px; -fx-background-color: darkcyan");
	 			maxthon.setMinWidth(300); 
	 			maxthon.setMaxWidth(300);
	 			
		FileInputStream torfile = new FileInputStream("bin/button/tor.png");
	    Image torlogo = new Image(torfile);
		    Button tor = new Button("  Tor ", new ImageView(torlogo)); tor.setTranslateX(X); tor.setTranslateY(Y+=70); tor.setFont(new Font("Arial Rounded MT Bold", 24));
		    	tor.setStyle("-fx-border-color: lightcoral; -fx-text-fill: lightcoral; -fx-border-width: 4px;	-fx-background-color: darkred"); 
		    	tor.setMinWidth(300); 
		    	tor.setMaxWidth(300);
		    	
		FileInputStream avastfile = new FileInputStream("bin/button/avast.png");
		Image avastlogo = new Image(avastfile);
			Button avastSecure = new Button(" Avast Secure ", new ImageView(avastlogo)); avastSecure.setTranslateX(X); avastSecure.setTranslateY(Y+=70); avastSecure.setFont(new Font("Arial Rounded MT Bold", 24));
				avastSecure.setStyle("-fx-border-color: palegreen; -fx-text-fill: palegreen; -fx-border-width: 4px;	-fx-background-color: seagreen"); 
				avastSecure.setMinWidth(300); 
				avastSecure.setMaxWidth(300);
				
		FileInputStream bravefile = new FileInputStream("bin/button/brave.png");
		Image bravelogo = new Image(bravefile);
			Button brave = new Button(" Brave ", new ImageView(bravelogo)); brave.setTranslateX(X); brave.setTranslateY(Y+=70); brave.setFont(new Font("Arial Rounded MT Bold", 24));
				brave.setStyle("-fx-border-color: lightyellow; -fx-text-fill: lightyellow; -fx-border-width: 4px;	-fx-background-color: darkkhaki"); 
				brave.setMinWidth(300); 
				brave.setMaxWidth(300);
				
		FileInputStream bingfile = new FileInputStream("bin/button/bing.png");
		Image binglogo = new Image(bingfile);
			Button bing = new Button(" Bing", new ImageView(binglogo)); bing.setTranslateX(X); bing.setTranslateY(Y+=70); bing.setFont(new Font("Arial Rounded MT Bold", 24));
				bing.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
				bing.setMinWidth(300); 
				bing.setMaxWidth(300);
	
		FileInputStream duckduckgofile = new FileInputStream("bin/button/duckduckgo.png");
		Image duckduckgologo = new Image(duckduckgofile);
			Button duckDuckGo = new Button(" Duck Duck Go", new ImageView(duckduckgologo)); duckDuckGo.setTranslateX(X); duckDuckGo.setTranslateY(Y+=70); duckDuckGo.setFont(new Font("Arial Rounded MT Bold", 24));
				duckDuckGo.setStyle("-fx-border-color: silver; -fx-text-fill: white; -fx-border-width: 4px;	-fx-background-color: black"); 
				duckDuckGo.setMinWidth(300); 
				duckDuckGo.setMaxWidth(300);				


				  FileInputStream SearchEngineBackgroundInputStream = new FileInputStream("bin/background/browser.png");
				  Image SearchEngineBackground = new Image(SearchEngineBackgroundInputStream);
				  ImageView SearchEngineBackgroundView = new ImageView(SearchEngineBackground);
				  SearchEngineBackgroundView.setTranslateY(6); SearchEngineBackgroundView.setTranslateX(6); 
				  SearchEngineAnchorPane.getChildren().addAll( SearchEngineBackgroundView, avastSecure, bing,
				  brave, fireFox, googleChrome, internetExplorer, maxthon, microsoftEdge, opera, operaGX, tor, 
				  vivaldi, duckDuckGo, yandex ); 

			SearchEngineTab.setContent(SearchEngineAnchorPane);
		}
	}