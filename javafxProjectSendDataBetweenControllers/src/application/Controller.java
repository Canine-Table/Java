package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/** @author Table **/
@SuppressWarnings("unused")
public class Controller 
	{
		@FXML
		private TextField usernameField;
		@FXML
		private PasswordField passwordField;
		private Stage primaryStage;
		private Scene scene;
		private Parent rootNode;
		
		public void login(ActionEvent evt) throws IOException
			{				
				String username = usernameField.getText();
				String password = passwordField.getText();
				String css = this.getClass().getResource("application.css").toExternalForm();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneTwo.fxml"));
				rootNode = loader.load();
				ControllerTwo sceneTwo = loader.getController();
				sceneTwo.displayUsername(username);
				sceneTwo.displayPassword(password);
				primaryStage = (Stage)((Node)evt.getSource()).getScene().getWindow();
				primaryStage.setTitle("Welcome"+ username);
				primaryStage.setResizable(true);
				scene = new Scene(rootNode);
				scene.getStylesheets().add(css);
				primaryStage.setScene(scene);
				primaryStage.show();
			}
	}