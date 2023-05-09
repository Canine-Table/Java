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
				primaryStage.getIcons().add(new Image("C:\\Users\\Table\\eclipse-workspace\\Eclipse IDE for Java Developers\\Eclipse-Workspace-JavaFX\\javafxProjectCheckBoxes\\src\\application\\on.png"));
				primaryStage.setTitle("JavaFX Check Boxes");
				Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
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