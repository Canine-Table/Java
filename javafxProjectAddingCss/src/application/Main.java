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
				//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				//or
				String applicationCss = this.getClass().getResource("application.css").toExternalForm();
				//String applicationCss2 = this.getClass().getResource("application.css").toExternalForm();
				scene.getStylesheets().add(applicationCss);
				//scene.getStylesheets().add(applicationCss2);
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/trayse101/basic-filetypes-1/128/css-icon.png"));
				primaryStage.setTitle("Adding Cascading Style Sheets to JavaFX");
				primaryStage.setScene(scene);
				primaryStage.show();
			}
			
		public static void main(String[] args) 
			{
				launch(args);
			}
	}