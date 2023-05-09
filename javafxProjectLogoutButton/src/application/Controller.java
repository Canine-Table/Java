package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/** @author Table **/
public class Controller 
	{
		@FXML
		private Button logoutButton;
		@FXML
		private AnchorPane logoutPane;
		Stage stage;
		
		public void logout(ActionEvent evt)
			{
			
				Alert confirmationAlert = new Alert(AlertType.CONFIRMATION);
				confirmationAlert.setTitle("logout");
				confirmationAlert.setHeaderText("Click yes to confirm");
				confirmationAlert.setContentText("Click ok to logout.");
				confirmationAlert.setHeaderText("Are you sure you want to logout?");
				
				if(confirmationAlert.showAndWait().get() == ButtonType.OK) 
					{
						stage =  (Stage) logoutPane.getScene().getWindow();
						stage.close();
					}
			}
	}