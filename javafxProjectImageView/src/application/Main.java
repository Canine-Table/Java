package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

/** @author Table **/
public class Main extends Application 
	{
		@Override
		public void start(Stage primaryStage) throws Exception
			{
				Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/martz90/circle/48/camera-icon.png"));
				primaryStage.setTitle("Image View");
				primaryStage.setResizable(false);
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			
		public static void main(String[] args) 
			{
				launch(args);
			}
	}