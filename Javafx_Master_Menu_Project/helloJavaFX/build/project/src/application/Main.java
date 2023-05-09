package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.paint.Color; // Changes the Background Color of the Scene 
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
public class Main extends Application {

	public static void main(String[] args) {
		Application.launch(args); 
	}
	@Override
	public void start(Stage primaryStageForm) throws Exception {
		Group rootPane = new Group();
		Image icon = new Image("/icon.png");

		TabPane primaryTabPane = new TabPane(); //creating Tabs for adding content
		rootPane.getChildren().add(primaryTabPane);
		Tab office365Tab = new Tab(" Office 365 ");
		Tab jetBrainsTab = new Tab(" Jet Brains ");
		Tab eclipse = new Tab(" Eclipse ");
		Tab textEditorsTab = new Tab(" Text Editors ");
		Tab visualStudiosTab = new Tab(" Visual Studios ");
		Tab browser = new Tab(" Search Engines ");
		Tab linksTab = new Tab(" Links Tab ");

		primaryTabPane.getTabs().add(office365Tab);
		office365Tab.setClosable(false);
		VBox officeBox = new VBox();
		linksTab.setContent(officeBox);

		primaryTabPane.getTabs().add(jetBrainsTab);
		VBox jetBox = new VBox();
		jetBrainsTab.setContent(jetBox);
		jetBrainsTab.setClosable(false);

		primaryTabPane.getTabs().add(eclipse);
		VBox eclipseBox = new VBox();
		eclipse.setContent(eclipseBox);
		eclipse.setClosable(false);

		primaryTabPane.getTabs().add(textEditorsTab);
		VBox editBox = new VBox();
		textEditorsTab.setContent(editBox);
		textEditorsTab.setClosable(false);

		primaryTabPane.getTabs().add(browser);
		VBox browserBox = new VBox();
		browser.setContent(browserBox);
		browser.setClosable(false);

		primaryTabPane.getTabs().add(visualStudiosTab);
		VBox visualStudioBox = new VBox();
		visualStudiosTab.setContent(visualStudioBox);
		visualStudiosTab.setClosable(false);

		primaryTabPane.getTabs().add(linksTab);
		VBox linksBox = new VBox();
		linksTab.setContent(linksBox);
		linksTab.setClosable(false);

		VBox vBox = new VBox(primaryTabPane); //creating VBox for adding tab pane
		rootPane.getChildren().add(vBox);
		Scene primaryFormScene = new Scene(rootPane, 550, 550, Color.BLUEVIOLET); //adding scroll pane to the scene

		rootPane.getChildren().add(primaryTabPane);
		primaryStageForm.setScene(primaryFormScene);
		primaryStageForm.setResizable(false);
		primaryStageForm.getIcons().add(icon);
		primaryStageForm.setTitle("The Javafx Master Menu");
		primaryStageForm.show();
	}
}