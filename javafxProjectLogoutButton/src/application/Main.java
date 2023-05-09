package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;

/** @author Table **/
public class Main extends Application 
	{
	
	public void logout(Stage stage)
		{
		
			Alert confirmationAlert = new Alert(AlertType.CONFIRMATION);
			confirmationAlert.setTitle("logout");
			confirmationAlert.setHeaderText("Click yes to confirm");
			confirmationAlert.setContentText("Click ok to logout.");
			confirmationAlert.setHeaderText("Are you sure you want to logout?");
			
			if(confirmationAlert.showAndWait().get() == ButtonType.OK) 
				{
					stage =  (Stage) stage.getScene().getWindow();
					stage.close();
				}
		}
	
		@Override
		public void start(Stage primaryStage) throws Exception
			{
				primaryStage.getIcons().add(new Image("https://icons.iconarchive.com/icons/iconarchive/home-eco-friendly/48/Home-Pool-Eco-Friendly-icon.png"));
				String css = this.getClass().getResource("application.css").toExternalForm();
				Parent rootNode = FXMLLoader.load(getClass().getResource("Main.fxml"));
				primaryStage.setOnCloseRequest(evt -> 
					{
						evt.consume();
						logout(primaryStage);
					});
				primaryStage.setTitle("Switching Scenes");
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