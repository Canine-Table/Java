package application;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** @author Table **/
@SuppressWarnings("unused")
public class Controller 
	{
	
		@FXML
		private Stage primaryStage;
		private Scene scene;
		private Parent rootNode;
		
		public void switchToSceneOne(ActionEvent evt) throws IOException
			{
				Parent rootNode = FXMLLoader.load(getClass().getResource("SceneOne.fxml"));
				String css = this.getClass().getResource("application.css").toExternalForm();
				primaryStage = (Stage)((Node)evt.getSource()).getScene().getWindow();
				primaryStage.setTitle("Scene One");
				scene = new Scene(rootNode);
				scene.getStylesheets().add(css);
				primaryStage.setScene(scene);
				primaryStage.show();
			}
	
		public void switchToSceneTwo(ActionEvent evt) throws IOException
			{
				Parent rootNode = FXMLLoader.load(getClass().getResource("SceneTwo.fxml"));
				String css = this.getClass().getResource("application.css").toExternalForm();
				primaryStage = (Stage)((Node)evt.getSource()).getScene().getWindow();
				primaryStage.setTitle("Scene Two");
				scene = new Scene(rootNode);
				scene.getStylesheets().add(css);
				primaryStage.setScene(scene);
				primaryStage.show();
			}

	}