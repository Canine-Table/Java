package application;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.Side;
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
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HelloJavaFX extends Application {

	public static void main(String[] args) {
		Application.launch(args); 
	}
	@Override
	public void start(Stage primaryStageForm) throws Exception {
		Group rootPane = new Group();
		Image icon = new Image("bin/logo/icon.png");
		var primaryTabPane = new TabPane(); //creating Tabs for adding content
		//rootPane.getChildren().add(primaryTabPane);
		Group rootTab  = new Group();
			rootPane.getChildren().addAll(rootTab);
			rootTab.getChildren().addAll(primaryTabPane);
			
		var office365Tab = new Tab( " Office 365 ");
		var jetBrainsTab = new Tab(" Jet Brains ");
		var eclipseTab = new Tab(" Eclipse ");
		var textEditorsTab = new Tab(" Text Editors ");		
		var visualStudiosTab = new Tab(" Visual Studios ");		
		var browserTab = new Tab(" Search Engines ");
		var linksTab = new Tab(" Links Tab ");

		primaryTabPane.getTabs().addAll( office365Tab, jetBrainsTab, 
		browserTab, eclipseTab, textEditorsTab, visualStudiosTab, linksTab );
		primaryTabPane.prefWidthProperty().bind(primaryStageForm.widthProperty());
		primaryTabPane.prefHeightProperty().bind(primaryStageForm.heightProperty());

	// Office 365 Tab //
	office365Tab.setClosable(false);
	FileInputStream office365InputStream = new FileInputStream("bin/logo/office.png");
	Image office365Icon = new Image(office365InputStream);
	ImageView office365View = new ImageView(office365Icon);
	office365Tab.setGraphic(office365View);
	new Office365TabClass(office365Tab).open();

	// Jet Brains Tab //
	jetBrainsTab.setClosable(false);
	FileInputStream jetBrainsInputStream = new FileInputStream("bin/logo/jetbrain.png");
	Image jetBrainsIcon = new Image(jetBrainsInputStream);
	ImageView jetBrainsView = new ImageView(jetBrainsIcon);
	jetBrainsTab.setGraphic(jetBrainsView);
	new JetBrainsTabClass(jetBrainsTab).open();

			// Eclipse Tab //
	eclipseTab.setClosable(false);
	FileInputStream eclipseInputStream = new FileInputStream("bin/logo/eclipse.png");
	Image eclipseIcon = new Image(eclipseInputStream);
	ImageView eclipseView = new ImageView(eclipseIcon);
	eclipseTab.setGraphic(eclipseView);
	new EclipseTabClass(eclipseTab).open();

	// Text Editor Tab //
	textEditorsTab.setClosable(false);
	FileInputStream textEditorsInputStream = new FileInputStream("bin/logo/notpad.png");
	Image textEditorsIcon = new Image(textEditorsInputStream);
	ImageView textEditorsView = new ImageView(textEditorsIcon);
	textEditorsTab.setGraphic(textEditorsView);
	new TextEditorsTabClass(textEditorsTab).open();

	// Search Engine Tab //
	browserTab.setClosable(false);
	FileInputStream browserInputStream = new FileInputStream("bin/logo/browser.png");
    Image browserIcon = new Image(browserInputStream);
    ImageView browserView = new ImageView(browserIcon);
    browserTab.setGraphic(browserView);
    new SearchEngineClass(browserTab).open();

    // Visual Studios //
	visualStudiosTab.setClosable(false);
	FileInputStream visualStudiosInputStream = new FileInputStream("bin/logo/vs.png");
	Image visualStudiosIcon = new Image(visualStudiosInputStream);
	ImageView visualStudiosView = new ImageView(visualStudiosIcon);
	visualStudiosTab.setGraphic(visualStudiosView);
	new VisualStudiosTabClass(visualStudiosTab).open();

	// links //
	linksTab.setClosable(false);
	FileInputStream linksInputStream = new FileInputStream("bin/logo/links.png");
    Image linksIcon = new Image(linksInputStream);
    ImageView linksView = new ImageView(linksIcon);
    linksTab.setGraphic(linksView);
    new LinksTabClass(linksTab).open();
        			
		VBox vBox = new VBox(primaryTabPane);
		rootPane.getChildren().add(vBox);
		Scene primaryFormScene = new Scene(rootPane, 700, 550);

		primaryStageForm.setScene(primaryFormScene);
		primaryStageForm.setResizable(false);
		primaryStageForm.getIcons().add(icon);
		primaryStageForm.setTitle("The Javafx Master Menu");
		primaryStageForm.show();
	}
}