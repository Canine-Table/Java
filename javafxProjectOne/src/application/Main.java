package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

	   @Override
	    public void start(Stage stage) throws Exception {
	       Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	       root.setLayoutX(-0);
	        Scene scene = new Scene(root, 824, 600);
	        stage.setTitle("FXML Menu");
	        stage.setMinHeight(650);
	        stage.setMaxHeight(650);
	        stage.setMinWidth(824);
	        stage.setMaxWidth(824);
	        stage.setScene(scene);
	        stage.show();
	}

	
	   
	public static void main(String[] args) 
	{
		launch(args);
	}
	
}

