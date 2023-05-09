package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

/** @author Table **/
public class Main extends Application 
	{
		@Override
		public void start(Stage primaryStage) throws Exception 
			{
			
				BorderPane border = new BorderPane();
				TabPane tabPane = new TabPane();
				border.getChildren().add(tabPane);
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/tatice/cristal-intense/48/Java-icon.png"));
				Parent rootNode = FXMLLoader.load(getClass().getResource("Main.fxml"));

				Tab t1 = new Tab("1");
				Tab t2 = new Tab("2");
				Tab t3 = new Tab("3");
				Tab t4 = new Tab("4");
				t4.setContent(rootNode);
				Tab t5 = new Tab("5");
				Tab t6 = new Tab("6");
				tabPane.getTabs().addAll(t1,t2,t3,t4,t5,t6);
				Scene scene = new Scene(border);
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