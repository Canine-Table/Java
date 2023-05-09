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
				FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/tatice/cristal-intense/48/Java-icon.png"));
				primaryStage.setTitle("Key Listeners");
				Parent root = loader.load();
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			
		public static void main(String[] args) 
			{
				launch(args);
			}
	}