package application;
	
import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.shape.Circle;

/** @author Table **/
public class Main extends Application 
	{

		@Override
		public void start(Stage primaryStage) throws IOException
			{
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/tatice/cristal-intense/48/Java-icon.png"));
				Parent rootNode = FXMLLoader.load(getClass().getResource("Main.fxml"));
				Scene scene = new Scene(rootNode);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setMinHeight(437.00);
				primaryStage.setMinWidth(437.00);
				primaryStage.setTitle("JavaFX");
				primaryStage.setScene(scene);
				primaryStage.show();
				File file = new File(".");
				System.out.println(file.getAbsolutePath());
			}
			
		public static void main(String[] args)
			{
				launch(args);
			}
	}