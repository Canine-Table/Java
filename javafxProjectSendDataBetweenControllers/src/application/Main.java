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
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/everaldo/crystal-clear/48/App-password-icon.png"));
				String css = this.getClass().getResource("application.css").toExternalForm();
				Parent rootNode = FXMLLoader.load(getClass().getResource("SceneOne.fxml"));
				primaryStage.setTitle("Login Page");
				primaryStage.setResizable(false);
				Scene scene = new Scene(rootNode);
				scene.getStylesheets().add(css);
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			
		public static void main(String[] args) 
			{
				launch(args);
			}
		
	}