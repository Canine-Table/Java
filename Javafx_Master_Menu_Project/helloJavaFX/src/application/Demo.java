package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {
	@Override
	public void start(Stage sudoStage) {
		try {
	TabPane sudoTabPane = new TabPane(); //creating Tabs for adding content
	VBox sudoVBox = new VBox();

	sudoVBox.getChildren().addAll(sudoTabPane);
	Tab firstTab = new Tab();
	Tab secondTab = new Tab();
	sudoTabPane.getTabs().addAll(firstTab,secondTab);
	new Office365TabClass(firstTab).open();
	sudoTabPane.prefWidthProperty().bind(sudoStage.widthProperty());
	sudoTabPane.prefHeightProperty().bind(sudoStage.heightProperty());
	AnchorPane sudoAnchorPane = new AnchorPane();
	Scene sudoScene = new Scene(sudoAnchorPane);
	sudoScene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
	sudoStage.setScene(sudoScene);
	sudoAnchorPane.getChildren().addAll(sudoTabPane);
	sudoStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}