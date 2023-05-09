
package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws IOException {
	Parent rootNode = FXMLLoader.load(getClass().getResource("Main.fxml"));
    primaryStage.setTitle("Tabs");
    Group root = new Group();
    Scene scene = new Scene(root, 400, 250, Color.WHITE);
    TabPane tabPane = new TabPane();
    BorderPane borderPane = new BorderPane();
    for (int i = 0; i < 5; i++) {
      Tab tab = new Tab();
      tab.setGraphic(new Circle(0, 0, 10));
      HBox hbox = new HBox(rootNode);
      
      hbox.getChildren().add(new Label("Tab" + i));
      hbox.setAlignment(Pos.CENTER);
      tab.setContent(hbox);
      tabPane.getTabs().add(tab);
    }
    // bind to take available space
    borderPane.prefHeightProperty().bind(scene.heightProperty());
    borderPane.prefWidthProperty().bind(scene.widthProperty());

    borderPane.setCenter(tabPane);
    root.getChildren().add(borderPane);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}





/*
package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application 
	{
		@Override
		public void start(Stage primaryStage) throws Exception 
			{
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/tatice/cristal-intense/48/Java-icon.png"));
				Parent rootNode = FXMLLoader.load(getClass().getResource("Main.fxml"));
				Scene scene = new Scene(rootNode);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("JavaFX");
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			
		public static void main(String[] args) 
			{
				launch(args);
			}
	}
 */
