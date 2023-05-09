package application;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.paint.Color; // Changes the Background Color of the Scene 
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Main extends Application {

	public static void main(String[] args) {
		Application.launch(args); }

	@Override
	public void start(Stage primaryStageForm) throws Exception {
		Group rootPane = new Group();
		Image icon = new Image("/icon.png");

		TabPane primaryTabPane = new TabPane(); //	Creating Tabs for Adding Content.
		rootPane.getChildren().add(primaryTabPane);
		Tab office365Tab = new Tab(" Office 365 ");
		Tab jetBrainsTab = new Tab(" Jet Brains ");
		Tab eclipseTab = new Tab(" Eclipse ");
		Tab textEditorsTab = new Tab(" Text Editors ");
		Tab visualStudiosTab = new Tab(" Visual Studios ");
		Tab browserTab = new Tab(" Search Engines ");
		Tab linksTab = new Tab(" Links Tab ");

		primaryTabPane.getTabs().addAll( office365Tab, jetBrainsTab, 
		eclipseTab, textEditorsTab, visualStudiosTab, linksTab, browserTab );
		
		// Office 365 Tab //
		AnchorPane officeBox = new AnchorPane();
			office365Tab.setContent(officeBox);
			office365Tab.setClosable(false);
		FileInputStream office365InputStream = new FileInputStream("bin/logo/officeLogo2.png");
			Image office365Icon = new Image(office365InputStream);
				ImageView office365View = new ImageView(office365Icon);
					office365Tab.setGraphic(office365View);

		// Jet Brains Tab //	
		AnchorPane jetBox = new AnchorPane();
			jetBrainsTab.setContent(jetBox);
			jetBrainsTab.setClosable(false);					
			//Image officeBackground = new Image("bin/background/k.png");
			//ImageView officeImageView = new ImageView(officeBackground);
			//jetBrainsTab.setContent( new Image(new ImageView("bin/background/k.png")));
		FileInputStream jetBrainsInputStream = new FileInputStream("bin/logo/jetLogo.png");
			Image jetBrainsIcon = new Image(jetBrainsInputStream);
				ImageView jetBrainsView = new ImageView(jetBrainsIcon);
					jetBrainsTab.setGraphic(jetBrainsView);

		// Eclipse Tab //
		AnchorPane eclipseBox = new AnchorPane();
			eclipseTab.setContent(eclipseBox);
			eclipseTab.setClosable(false);
		FileInputStream eclipseInputStream = new FileInputStream("bin/logo/eclipseLogo.png");
			Image eclipseIcon = new Image(eclipseInputStream);
				ImageView eclipseView = new ImageView(eclipseIcon);
					eclipseTab.setGraphic(eclipseView);


		// Text Editor Tab //
		AnchorPane editBox = new AnchorPane();
			textEditorsTab.setContent(editBox);
			textEditorsTab.setClosable(false);
		FileInputStream textEditorsInputStream = new FileInputStream("bin/logo/book.png");
			Image textEditorsIcon = new Image(textEditorsInputStream);
				ImageView textEditorsView = new ImageView(textEditorsIcon);
					textEditorsTab.setGraphic(textEditorsView);

		// Search Engine Tab //
		AnchorPane browserBox = new AnchorPane();
			browserTab.setContent(browserBox);
			browserTab.setClosable(false);
		FileInputStream browserInputStream = new FileInputStream("bin/logo/browser.png");
    		Image browserIcon = new Image(browserInputStream);
    			ImageView browserView = new ImageView(browserIcon);
    				browserTab.setGraphic(browserView);

    	// Visual Studios //
    	AnchorPane visualStudioBox = new AnchorPane();
			visualStudiosTab.setContent(visualStudioBox);
			visualStudiosTab.setClosable(false);
		FileInputStream visualStudiosInputStream = new FileInputStream("bin/logo/vs.png");
			Image visualStudiosIcon = new Image(visualStudiosInputStream);
				ImageView visualStudiosView = new ImageView(visualStudiosIcon);
					visualStudiosTab.setGraphic(visualStudiosView);

		// links //
		AnchorPane  linksPane = new AnchorPane();
			linksTab.setContent(linksPane);
			linksTab.setClosable(false);
			//linksTab.getChildren().add(linksPane);
		FileInputStream linksInputStream = new FileInputStream("bin/logo/linkLogo.png");
        	Image linksIcon = new Image(linksInputStream);
        		ImageView linksView = new ImageView(linksIcon);
        			linksTab.setGraphic(linksView);

		VBox vBox = new VBox(primaryTabPane); //creating VBox for adding tab pane
		rootPane.getChildren().add(vBox);
		Scene primaryFormScene = new Scene(rootPane, 691, 550, Color.BLUEVIOLET); //adding scroll pane to the scene
		rootPane.getChildren().add(primaryTabPane);
		primaryStageForm.setScene(primaryFormScene);
		primaryStageForm.setResizable(false);
		primaryStageForm.getIcons().add(icon);
		primaryStageForm.setTitle("The Javafx Master Menu");
		primaryStageForm.show();
	}
} ; 